/*                                                                                                                                                                                 
 * Copyright 2011 Shunsuke Nakamura, and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.cassandra.db.engine;

import java.sql.*;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

public class MySQLInstance extends DBSchemafulInstance
{

    Connection conn;
    PreparedStatement pstInsert, pstUpdate, pstDelete;

    int debug = 0;

    private final String PREFIX = "_";
    private final String KEY = "rkey";
    private final String VALUE = "cf";
    private final String SYSTEM = "system";
    private final String SETPR = "set_row";
    private final String GETPR = "get_row";
    private final String RANGEPR = "range_get_row";
    
    private final String BINARY = "BINARY";
    private final String BLOB = "BLOB";

    private String insertSt, setSt, getSt, rangeSt, deleteSt, truncateSt, dropTableSt, dropDBSt, createDBSt;

    String bsql;
 
    public MySQLInstance(String ksName, String cfName)
    {
        engineName = "MySQL";
        this.ksName = ksName;
        this.cfName = PREFIX + cfName;

        setConfiguration();
        setStatementDefinition();
        createDB();
        conn = new MySQLConfigure().connect(this.ksName, host, port, user, pass);

        try
        {
            pstInsert = conn.prepareStatement(insertSt);
            pstUpdate = conn.prepareStatement(setSt);
        }
        catch (SQLException e)
        {
            errorMsg("db prepare state error", e);
        }
    }

    private void setStatementDefinition()
    {
        /* define CRUD statements */
        insertSt = "INSERT INTO " + this.cfName + " (" + KEY +", " + VALUE +") VALUES (?,?) ON DUPLICATE KEY UPDATE " + VALUE + " = ?"; 
        setSt = "UPDATE " + this.cfName + " SET " + VALUE  +" = ? WHERE " + KEY + " = ?";
        getSt = "SELECT " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " = ?";
        rangeSt = "SELECT " + KEY + ", " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " >= ? AND " + KEY + " < ? LIMIT ?";
        deleteSt = "DELETE FROM " + this.cfName + " WHERE " + KEY + " = ?";
        truncateSt = "TRUNCATE TABLE " + this.cfName;
        dropTableSt = "DROP TABLE IF EXISTS " + this.cfName;
        dropDBSt = "DROP DATABASE IF EXISTS " + this.ksName;
        createDBSt = "CREATE DATABASE IF EXISTS " + this.ksName;
        //setPr = "CREATE PROCEDURE " + SETPR + this.cfName + "(IN cfval VARBINARY(?),IN id VARBINARY(?)) BEGIN UPDATE " + this.cfName + " SET " + VALUE + " = cfval WHERE " + KEY + " = id; END";
        //getPr = "CREATE PROCEDURE " + GETPR + this.cfName + "(IN id VARBINARY(?)) BEGIN SELECT " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " = id; END";
        //rangePr = "CREATE PROCEDURE " + RANGEPR + this.cfName + "(IN begin VARBINARY(?),IN end VARBINARY(?),IN limitNum INT) BEGIN SET SQL_SELECT_LIMIT = limitNum; SELECT " + KEY + "," + VALUE + " FROM " + this.cfName + " WHERE " +  KEY + " >= begin AND " + KEY + "< end; END";
    }

    private String getCreateSt(String statement)
    {
        String createStHeader = "CREATE TABLE IF NOT EXISTS "+ this.cfName + "(" +"`" + KEY + "` VARBINARY(?) NOT NULL," + "`" + VALUE + "` ";
        String createStFooter = ", PRIMARY KEY (`" + KEY + "`)" + ") ENGINE = ?";
        return createStHeader + statement + createStFooter;
    }

    private int NonAutoCommit()
    {
        try
        {
            conn.setAutoCommit(false);
            return SUCCESS;
        }
        catch (SQLException e)
        {
            return errorMsg("set not auto commit error", e);
        }
    }

    public int insert(byte[] rowKey, ColumnFamily cf)
    {
        try
        {
            return doInsert(rowKey, cf.toBytes());
        }
        catch (SQLException e)
        {
            return errorMsg("db insertion error", e);
        }
    }

    public int update(byte[] rowKey, ColumnFamily newcf)
    {
        try
        {
            return doUpdate(rowKey, newcf.toBytes());
        }
        catch (SQLException e)
        {
            return errorMsg("db update error" , e);
        }
    }

    public byte[] select(byte[] rowKey)
    {
        try
        {
            PreparedStatement pstSelect = conn.prepareStatement(getSt);
            pstSelect.setBytes(1, rowKey);
            ResultSet rs = pstSelect.executeQuery();
            byte[] b = null;
            if (rs != null)
                while (rs.next())
                    b = rs.getBytes(1);
            rs.close();
            pstSelect.close();
            return b;
        }
        catch (SQLException e)
        {
            errorMsg("db select error", e);
            return null;
        }
    }

    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults)
    {
        Map<ByteBuffer, ColumnFamily> rowMap = new HashMap<ByteBuffer, ColumnFamily>();
        try
        {
            PreparedStatement pstRange = conn.prepareStatement(rangeSt);
            pstRange.setBytes(1, startWith.getTokenBytes());
            pstRange.setBytes(2, stopAt.getTokenBytes());
            pstRange.setInt(3, maxResults);
            ResultSet rs = pstRange.executeQuery();
            if (rs != null)
                while (rs.next())
                    rowMap.put(ByteBuffer.wrap(rs.getBytes(1)), bytes2ColumnFamily(rs.getBytes(2)));
            rs.close();
            pstRange.close();
            return rowMap;
        }
        catch (SQLException e)
        {
            errorMsg("db get range slice error", e);
        }
        catch (IOException e)
        {
            errorMsg("db get range slice error", e);
        }
        return null;
    }

    public synchronized int delete(byte[] rowKey)
    {
        try
        {
            PreparedStatement pstDelete = conn.prepareStatement(deleteSt);
            pstDelete.setBytes(1, rowKey);
            int res = pstDelete.executeUpdate();
            pstDelete.close();
            return res;
        }
        catch (SQLException e)
        {
            return errorMsg("db row deletion error", e);
        }
    }

    public synchronized int truncate()
    {
        try
        {
            return conn.createStatement().executeUpdate(truncateSt);
        }
        catch (SQLException e)
        {
            return errorMsg("db truncation error", e);
        }
    }

    public synchronized int dropTable()
    {
        try
        {
            return conn.createStatement().executeUpdate(dropTableSt);
        }
        catch (SQLException e)
        {
            return errorMsg("db dropTable error", e);
        }
    }

    public synchronized int dropDB()
    {
        try
        {
            return conn.createStatement().executeUpdate(dropDBSt);
        }
        catch (SQLException e)
        {
            return errorMsg("db dropDB error" , e);
        }
    }

    public synchronized int createDB()
    {
        try
        {
          Statement stmt = new MySQLConfigure().connect("", host, port, user, pass).createStatement();
          return stmt.executeUpdate(createDBSt);
        }
        catch (SQLException e) 
        {
            return errorMsg("db database creation error", e);
        }
    }

    // Initialize MySQL Table for Keyspaces
    public synchronized int create(int rowKeySize, int columnFamilySize, String storageSize, String storageEngine)
    {
        try {
            
            if (debug > 0)
                conn.createStatement().executeUpdate(truncateSt);

            return getCreatePreparedSt(rowKeySize, columnFamilySize, storageSize, storageEngine).executeUpdate();
        }
        catch (SQLException e) 
        {
            return errorMsg("db table creation error", e);
        }
    }

    // Get a prepared statement for table creation.
    private PreparedStatement getCreatePreparedSt (int rowKeySize, int columnFamilySize, String storageSize, String storageEngine)
    {
        PreparedStatement pst = null;
        try {
            if (storageSize.contains(BLOB))
            {
                pst = conn.prepareStatement(getCreateSt(storageSize));
                pst.setInt(1, rowKeySize);
                pst.setString(2, storageEngine);
            }
            else
            {
                pst = conn.prepareStatement(getCreateSt(storageSize + "(?)"));
                pst.setInt(1, rowKeySize);
                pst.setInt(2, columnFamilySize);
                pst.setString(3, storageEngine);
            }
        }
        catch (SQLException e)
        {
            errorMsg("db table create statement error", e);
        }
        return pst;
    }

    /*public synchronized int createProcedure(int rowKeySize, int columnFamilySize)
    {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SHOW PROCEDURE STATUS");
            while (rs.next())
            if (rs.getString(1).equals(ksName) && ( rs.getString(2).equals(GETPR + cfName) || rs.getString(2).equals(SETPR + cfName)))
                return 0;

            PreparedStatement gst = conn.prepareStatement(getPr);
            PreparedStatement sst = conn.prepareStatement(setPr);
            PreparedStatement rst = conn.prepareStatement(rangePr);

            gst.setInt(1, rowKeySize);
            sst.setInt(1, columnFamilySize);
            sst.setInt(2, rowKeySize);
            rst.setInt(1, rowKeySize);
            rst.setInt(2, rowKeySize);
            
            return gst.executeUpdate() * sst.executeUpdate() * rst.executeUpdate();
        }
        catch (SQLException e)
        {
            return errorMsg("db procedure creation error", e);
        }
    }*/
    /*
    int doMultipleInsert(String rowKey, byte[] cfValue) throws SQLException {
        if (multiCount < multiMax) {
            pstMultiInsert.setString(2*multiCount+1, rowKey);
            pstMultiInsert.setBytes(2*multiCount+2, cfValue);
            multiCount++;
        }
        if (multiCount == multiMax) {
            multiCount = 0;
            pstMultiInsert.addBatch();
            //pstMultiInsert = conn.prepareStatement(bsql);
            return 1;
        }
        return 1;
    }
    */
    private synchronized int doInsert(byte[] rowKey, byte[] cfValue) throws SQLException
    {
        pstInsert.setBytes(1, rowKey);
        pstInsert.setBytes(2, cfValue);
        pstInsert.setBytes(3, cfValue);
        return pstInsert.executeUpdate();
    }

    private synchronized int doUpdate(byte[] rowKey, byte[] cfValue) throws SQLException
    {
        pstUpdate.setBytes(1, cfValue);
        pstUpdate.setBytes(2, rowKey);
        return pstUpdate.executeUpdate();
    }
}
