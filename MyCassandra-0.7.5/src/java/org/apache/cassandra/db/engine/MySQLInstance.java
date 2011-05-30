package org.apache.cassandra.db.engine;

import java.sql.*;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import java.nio.ByteBuffer;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

public class MySQLInstance extends DBInstance
{

    Connection conn;
    PreparedStatement pstInsert, pstUpdate, pstDelete;

    int debug = 0;

    int multiMax = 100;
    int multiCount = 0;
    String bsql;
    private final String PREFIX = "_";
    private final String KEY = "rkey";
    private final String VALUE = "cf";
    private final String SYSTEM = "system";
    private final String SETPR = "set_row";
    private final String GETPR = "get_row";

    private String insertSt, setSt, getSt, rangeSt, deleteSt, truncateSt, createSt, getPr, setPr;

    public MySQLInstance(String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = PREFIX + cfName;

        /* define crud sql statements */
        insertSt = "INSERT INTO " + this.cfName + " (" + KEY +", " + VALUE +") VALUES (?,?) ON DUPLICATE KEY UPDATE " + VALUE + " = ?"; 
        setSt = !this.ksName.equals(SYSTEM) ? "CALL " + SETPR + this.cfName + "(?,?)" : "UPDATE " + this.cfName + " SET " + VALUE  +" = ? WHERE " + KEY + " = ?";
        getSt = !this.ksName.equals(SYSTEM) ? "CALL " + GETPR + this.cfName + "(?)" : "SELECT " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " = ?";
        rangeSt = "SELECT " + KEY + ", " + VALUE + " FROM " + this.cfName + "WHERE " + KEY + " >= ? AND " + KEY + " < ? LIMIT = ?";
        deleteSt = "DELETE FROM " + this.cfName + " WHERE " + KEY + " = ?";
        truncateSt = "TRUNCATE TABLE " + this.cfName;
        createSt = "CREATE Table "+ this.cfName + "(" +"`" + KEY + "` VARCHAR(?) NOT NULL," + "`" + VALUE + "` VARBINARY(?)," + "PRIMARY KEY (`" + KEY + "`)" + ") ENGINE = ?";
        setPr = "CREATE PROCEDURE " + SETPR + this.cfName + "(IN cfval VARBINARY(?),IN id VARCHAR(?)) BEGIN UPDATE " + this.cfName + " SET " + VALUE + " = cfval WHERE " + KEY + " = id; END";
        getPr = "CREATE PROCEDURE " + GETPR + this.cfName + "(IN id VARCHAR(?)) BEGIN SELECT " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " = id; END";

        createDB();
        conn = new MySQLConfigure().connect(this.ksName);
        /*
         *try {
             conn.setAutoCommit(false);
        } catch(SQLException e) {
             System.out.println(e);
        }
        */

        try
        {
            pstInsert = conn.prepareStatement(insertSt);
            pstUpdate = conn.prepareStatement(setSt);
        }
        catch (SQLException e)
        {
            System.err.println("[MyCassandra] db prepare state error "+ e);
        }
    }

    public int insert(String rowKey, ColumnFamily cf)
    {
        try
        {
            return doInsert(rowKey, cf.toBytes());
        }
        catch (SQLException e)
        {
            System.err.println("[MyCassandra] db insertion error: "+ e);
            return -1;
        }
    }

    public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf)
    {
        try
        {
            return doUpdate(rowKey, mergeColumnFamily(cf, newcf));
        }
        catch (SQLException e)
        {
            System.err.println("[MyCassandra] db update error: " + e);
            return -1;
        }
    }

    public byte[] select(String rowKey)
    {
        try
        {
            PreparedStatement pstSelect = conn.prepareStatement(getSt);
            pstSelect.setString(1, rowKey);
            ResultSet rs = pstSelect.executeQuery();
            byte[] b = null;
            if (rs != null)
                while (rs.next())
                    b = rs.getBytes(1);
            System.out.println(ksName+"/"+cfName+"#"+rowKey+"#"+b);
            rs.close();
            pstSelect.close();
            return b;
        }
        catch (SQLException e)
        {
            System.err.println("[MyCassandra] db select error: " + e);
            return null;
        }
    }

    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults)
    {
        Map<ByteBuffer, ColumnFamily> rowMap = new HashMap<ByteBuffer, ColumnFamily>();
        try
        {
            PreparedStatement pstRange = conn.prepareStatement(rangeSt);
            pstRange.setObject(1, startWith);
            pstRange.setObject(2, stopAt);
            pstRange.setInt(3, maxResults);
            ResultSet rs = pstRange.executeQuery();
            if (rs != null)
                while (rs.next())
                {
                    rowMap.put(ByteBuffer.wrap(rs.getBytes(1)), bytes2ColumnFamily(rs.getBytes(2)));
                }
            rs.close();
            pstRange.close();
            return rowMap;
        }
        catch (SQLException e)
        {
            System.err.println("[MyCassandra] db get range slice error: " + e);
        }
        catch (IOException e)
        {
            System.err.println("[MyCassandr] db get range slice error: " + e);
        }
        return null;
    }

    public synchronized int delete(String rowKey)
    {
        try
        {
            PreparedStatement pstDelete = conn.prepareStatement(deleteSt);
            pstDelete.setString(1, rowKey);
            int res = pstDelete.executeUpdate();
            pstDelete.close();
            return res;
        }
        catch (SQLException e)
        {
            System.err.println("[MyCassandra] db row deletion error: " + e);
            return -1;
        }
    }

    public synchronized int truncate()
    {
        try
        {
            Statement stmt = conn.createStatement();
            return stmt.executeUpdate(truncateSt);
        }
        catch (SQLException e)
        {
            System.err.println("[MyCassandra] db truncation error: " + e);
            return -1;
        }
    }

    public synchronized int createDB()
    {
        try
        {
          Statement stmt = new MySQLConfigure().connect("").createStatement();
          ResultSet rs = stmt.executeQuery("SHOW DATABASES");
          while (rs.next())
              if (rs.getString(1).equals(ksName))
                  return 0;
          return stmt.executeUpdate("CREATE DATABASE " + ksName);
        }
        catch (SQLException e) 
        {
            System.err.println("[MyCassandra] db database creation error: "+ e);
            return -1;
        }
    }

    // Init MySQL Table for Keyspaces
    public synchronized int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType)
    {
        try {
            Statement stmt = conn.createStatement();
            
            if (debug > 0)
                stmt.executeUpdate(truncateSt);
            
            ResultSet rs = stmt.executeQuery("SHOW TABLES");
            while (rs.next()) 
                if (rs.getString(1).equals(cfName))
                    return 0;

            PreparedStatement pst = conn.prepareStatement(createSt);
            pst.setInt(1, rowKeySize);
            pst.setInt(2, columnFamilySize);
            pst.setString(3, storageEngineType);
            
            return pst.executeUpdate();
        }
        catch (SQLException e) 
        {
            System.err.println("[MyCassandra] db table creation error: "+ e);
            return -1;
        }
    }

    public synchronized int createProcedure(int rowKeySize, int columnFamilySize)
    {
        try {
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("SHOW PROCEDURE STATUS");
            while (rs.next())
                if (rs.getString(1).equals(ksName) && ( rs.getString(2).equals(GETPR + cfName) || rs.getString(2).equals(SETPR + cfName)))
                    return 0;
            PreparedStatement gst = conn.prepareStatement(getPr);
            PreparedStatement sst = conn.prepareStatement(setPr);
            

            gst.setInt(1, rowKeySize);
            sst.setInt(1, columnFamilySize);
            sst.setInt(2, rowKeySize);
            
            return gst.executeUpdate() * sst.executeUpdate();
        }
        catch (SQLException e)
        {
            System.err.println("[MyCassandra] db procedure creation error: " + e);
            return -1;
        }
    }
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

    private synchronized int doInsert(String rowKey, byte[] cfValue) throws SQLException
    {
        pstInsert.setString(1, rowKey);
        pstInsert.setBytes(2, cfValue);
        pstInsert.setBytes(3, cfValue);
        return pstInsert.executeUpdate();
    }

    private synchronized int doUpdate(String rowKey, byte[] cfValue) throws SQLException
    {
        pstUpdate.setBytes(1, cfValue);
        pstUpdate.setString(2, rowKey);
        return pstUpdate.executeUpdate();
    }
}
