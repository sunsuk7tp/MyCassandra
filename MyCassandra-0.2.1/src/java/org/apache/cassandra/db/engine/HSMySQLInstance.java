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

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.nio.ByteBuffer;

import org.handlersocket.*;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

public class HSMySQLInstance extends DBSchemafulInstance
{
    HandlerSocket hs;
    Connection conn;

    private final String PREFIX = "_";
    private final String ID = "1";
    private final String KEY = "rkey";
    private final String VALUE = "cf";
    private final String SYSTEM = "system";
    private final String RANGEPR = "range_get_row";

    private String rangeSt, truncateSt, dropTableSt, dropDBSt, rangePr;

    int debug = 0;

    public HSMySQLInstance(String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = PREFIX + cfName;
        setConfiguration();
        setStatementDefinition();
        createDB();
        
        try
        {
            hs = new HandlerSocket();
            hs.open(host, port);
            hs.command().openIndex(ID, this.ksName, this.cfName, "PRIMARY", KEY + "," + VALUE);
            hs.execute();
        }
        catch (IOException e)
        {
            errorMsg("can't open hs", e);
        }
    }
    
    private void setStatementDefinition()
    {
        /* define statements */
        rangeSt = !this.ksName.equals(SYSTEM) ? "CALL " + RANGEPR + this.cfName + "(?,?,?)" : "SELECT " + KEY + ", " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " >= ? AND " + KEY + " < ? LIMIT ?";
        truncateSt = "TRUNCATE TABLE " + this.cfName;
        dropTableSt = "DROP TABLE" + this.cfName;
        dropDBSt = "DROP DATABASE" + this.ksName;
        rangePr = "CREATE PROCEDURE " + RANGEPR + this.cfName + "(IN begin VARCHAR(?),IN end VARCHAR(?),IN limitNum INT) BEGIN SET SQL_SELECT_LIMIT = limitNum; SELECT " + KEY + "," + VALUE + " FROM " + this.cfName + " WHERE " +  KEY + " >= begin AND " + KEY + "< end; END";
    }

    public int insert(String rowKey, ColumnFamily cf)
    {
        try
        {
            return doInsert(rowKey, cf.toBytes());
        }
        catch (IOException e)
        {
            return errorMsg("db insertion error", e);
        }
    }

    public int update(String rowKey, ColumnFamily newcf)
    {
        try
        {
            return doUpdate(rowKey, newcf.toBytes());
        }
        catch (IOException e)
        {
            return errorMsg("db update error", e);
        }
    }

    public byte[] select(String rowKey)
    {
       try
       {
           hs.command().find(ID, rowKey);
           List<HandlerSocketResult> res = hs.execute();
           return res.isEmpty() ? null : res.get(0).getMessages();
       }
       catch (IOException e)
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
            pstRange.setString(1, new String(startWith.getTokenBytes()));
            pstRange.setString(2, new String(stopAt.getTokenBytes()));
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

    public synchronized int delete(String rowKey)
    {
        try
        {
            hs.command().findModifyDelete(ID, rowKey, "=", "1", "0");
            List<HandlerSocketResult> Results =  hs.execute();
            return SUCCESS;
        }
        catch (IOException e)
        {
            return errorMsg("db deletion error", e);
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

    // Init MySQL Table for Keyspaces
    public synchronized int create(int rowKeySize, int columnFamilySize, String storageSize, String storageEngine)
    {
        try {
            Statement stmt = conn.createStatement();
            
            if (debug > 0)
                stmt.executeUpdate(truncateSt);
            
            ResultSet rs = stmt.executeQuery("SHOW TABLES");
            while (rs.next()) 
                if (rs.getString(1).equals(cfName))
                    return 0;

            return 1;
        }
        catch (SQLException e) 
        {
            errorMsg("db table creation error", e);
            return -1;
        }
    }

    public int createProcedure(int rowKeySize, int columnFamilySize)
    {
        try {
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("SHOW PROCEDURE STATUS");
            while (rs.next())
                if (rs.getString(1).equals(ksName))
                    return SUCCESS;
            PreparedStatement rst = conn.prepareStatement(rangePr);
            
            rst.setInt(1, rowKeySize);
            rst.setInt(2, rowKeySize);
            
            return rst.executeUpdate();
        }
        catch (SQLException e)
        {
            return errorMsg("db procedure creation error", e);
        }
    }

    public synchronized int createDB()
    {
        try
        {
          Statement stmt = new MySQLConfigure().connect("", host, port, user, pass).createStatement();
          ResultSet rs = stmt.executeQuery("SHOW DATABASES");
          while (rs.next())
              if (rs.getString(1).equals(ksName))
                  return 1;
          return stmt.executeUpdate("CREATE DATABASE " + ksName);
        }
        catch (SQLException e) 
        {
            return errorMsg("db database creation error", e);
        }
    }

    private int doInsert(String rowKey, byte[] cfValue) throws IOException
    {
        //hs.command().insert(ID, rowKey, cfValue);
        //List<HandlerSocketResult> res = hs.execute();
        //return res.get(0).getStatus();
        return doUpdate(rowKey, cfValue);
    }

    private synchronized int doUpdate(String rowKey, byte[] cfValue) throws IOException
    {
        hs.command().findModifyUpdate(ID, rowKey, "=", "1", "0", cfValue);
        List<HandlerSocketResult> res = hs.execute();
        return res.get(0).getStatus();
    }
}
