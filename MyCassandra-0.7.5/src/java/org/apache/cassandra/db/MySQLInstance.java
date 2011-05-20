package org.apache.cassandra.db;

import java.sql.*;
import java.io.IOException;

import org.apache.cassandra.db.filter.*;

public class MySQLInstance extends DBInstance
{
    
    Connection conn;
    PreparedStatement pstInsert, pstUpdate, pstMultiInsert;
    
    int debug = 0;
    
    int multiMax = 100;
    int multiCount = 0;
    String bsql;
    private final String PREFIX = "_";
    private final String KEY = "rkey";
    private final String VALUE = "cf";
    private final String SYSTEM = "system";
    
    private String insertSt, updateSt, selectSt, deleteSt, createSt, setSt, getSt;

    public MySQLInstance (String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = PREFIX + cfName;
        
        /* define crud sql statements */
        insertSt = "INSERT INTO " + this.cfName + " (" + KEY +", " + VALUE +") VALUES (?,?) ON DUPLICATE KEY UPDATE " + KEY + " = ?"; 
        updateSt = "UPDATE " + this.cfName + " SET " + VALUE  +" = ? WHERE " + KEY + " = ?";
        selectSt = "SELECT " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " = ?";
        deleteSt = "DELETE FROM " + this.cfName + " WHERE " + KEY + " = ?";
        createSt = "CREATE Table "+ this.cfName + "(" +"`" + KEY + "` VARCHAR(?) NOT NULL," + "`" + VALUE + "` VARBINARY(?)," + "PRIMARY KEY (`" + KEY + "`)" + ") ENGINE = ?";
        setSt = "CALL set_row(?,?)";
        getSt = "CALL get_row(?)";

        createDB();
        conn = new MySQLConfigure().connect(this.ksName);
        /*try {
             conn.setAutoCommit(false);
        } catch(SQLException e) {
             System.out.println(e);
    	  }*/
        
        try
        {
            pstInsert = conn.prepareStatement(insertSt);
            pstUpdate = this.ksName.equals(SYSTEM) ? conn.prepareStatement(updateSt) : conn.prepareStatement(setSt);
        }
        catch (SQLException e)
        {
        	System.err.println("db prepare state error "+ e);
        }
    }
    
    public int insert(String rowKey, ColumnFamily cf) throws SQLException, IOException
    {
        try
        {
            return doInsert(rowKey, cf.toBytes());
        }
        catch (SQLException e)
        {
            System.err.println("db insert error "+ e);
            return -1;
        }
    }
    
    public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf) throws SQLException, IOException
    {
        try
        {
            return doUpdate(rowKey, mergeColumnFamily(cf, newcf));
        }
        catch (SQLException e)
        {
        	System.err.println("db update error: "+ e);
            return -1;
        }
    }
    
    public byte[] select(String rowKey) throws SQLException, IOException
    {
        PreparedStatement pstSelect = ksName.equals(SYSTEM) ? conn.prepareStatement(selectSt) : conn.prepareStatement(getSt);
        pstSelect.setString(1, rowKey);
        ResultSet rs = pstSelect.executeQuery();
        byte[] b = null;
        if (rs != null)
        	while (rs.next())
        		b = rs.getBytes(1);
        rs.close();
        pstSelect.close();
        return b;
    }
    
    public synchronized int delete(String rowKey) throws SQLException
    {
        PreparedStatement pstDelete = conn.prepareStatement(deleteSt);
        try {
            pstDelete.setString(1, rowKey);
            return pstDelete.executeUpdate();
        }
        finally
        {
            pstDelete.close();
        }
    }

    public int createDB()
    {
    	try {
          Statement stmt = new MySQLConfigure().connect("").createStatement();
          ResultSet rs = stmt.executeQuery("SHOW DATABASES");
          while (rs.next())
              if (rs.getString(1).equals(ksName))
                  return 0;
          return stmt.executeUpdate("CREATE DATABASE " + ksName);
     	}
        catch (SQLException e) 
        {
        	System.err.println("db database creation error "+ e);
            return -1;
        }
    }

    // Init MySQL Table for Keyspaces
    public int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType)
    {
        try {
            Statement stmt = conn.createStatement();
            
            if (debug > 0)
                stmt.executeUpdate("TRUNCATE TABLE " + cfName);
            
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
        	System.err.println("db table creation error "+ e);
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
    
    synchronized int doInsert(String rowKey, byte[] cfValue) throws SQLException
    {
        pstInsert.setString(1, rowKey);
        pstInsert.setBytes(2, cfValue);
        pstInsert.setBytes(3, cfValue);
        return pstInsert.executeUpdate();
    }
    
    synchronized int doUpdate(String rowKey, byte[] cfValue) throws SQLException
    {
        pstUpdate.setBytes(1, cfValue);
        pstUpdate.setString(2, rowKey);
        return pstUpdate.executeUpdate();
    }
}
