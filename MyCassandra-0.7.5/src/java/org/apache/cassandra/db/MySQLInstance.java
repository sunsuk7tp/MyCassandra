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
    private String insertSt, updateSt, selectSt, deleteSt, setSt, getSt;

    public MySQLInstance(String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = PREFIX + cfName;
        insertSt = "INSERT INTO " + this.cfName + " (" + KEY +", " + VALUE +") VALUES (?,?) ON DUPLICATE KEY UPDATE " + KEY + " = ?"; 
        updateSt = "UPDATE " + this.cfName + " SET " + VALUE  +" = ? WHERE " + KEY + " = ?";
        selectSt = "SELECT " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " = ?";
        deleteSt = "DELETE FROM " + this.cfName + " WHERE " + KEY + " = ?";
        setSt = "CALL set_row(?,?)";
        getSt = "CALL get_row(?)";

        conn = new MySQLConfigure().connect(ksName);
        /*try {
             conn.setAutoCommit(false);
        } catch(SQLException e) {
             System.out.println(e);
    	  }*/
        
        try
        {
            pstInsert = conn.prepareStatement(insertSt);
            if(ksName.equals("system"))
            {
                pstUpdate = conn.prepareStatement(updateSt);
            }
            else
            {
                pstUpdate = conn.prepareStatement(setSt);
            }
            /*bsql = "INSERT INTO "+ this.cfName + " (" + KEY + ", " + VALUE +") VALUES";
            for(int i=0; i< multiMax; i++)
            {
                bsql += " (?, ?)";
                if(i < multiMax - 1)
                {
                    bsql += ",";
                }
            }
                
            pstMultiInsert = conn.prepareStatement(bsql);*/
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
            // return doMultipleInsert(rowKey, cfValue);
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
        //Connection conn1 = new MySQLConfigure().connect(ksName);
        PreparedStatement pstSelect;
        if(ksName.equals("system"))
        {
            pstSelect = conn.prepareStatement(selectSt);
        }
        else
        {
            pstSelect = conn.prepareStatement(getSt);
        }
        pstSelect.setString(1, rowKey);
        ResultSet rs = pstSelect.executeQuery();
        byte[] b = null;
        if(rs != null)
        {
        	while(rs.next())
        	{
        		b = rs.getBytes(1);
        	}
        }
        rs.close();
        pstSelect.close();
        //conn1.close();
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
    
    // Init MySQL Table for Keyspaces
    public int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType)
    {
        try {
            Statement stmt = conn.createStatement();
            
            if(debug > 0)
            {
                stmt.executeUpdate("TRUNCATE TABLE " + cfName);
            }
            
            ResultSet rs = stmt.executeQuery("SHOW TABLES");
            while(rs.next()) 
            {
                if(rs.getString(1).equals(cfName)) {
                    return 0;
                }
            }
            
            String sPrepareSQL = "CREATE Table "+ cfName + "(" +
                "`" + KEY + "` VARCHAR(?) NOT NULL," +
                "`" + VALUE + "` VARBINARY(?)," +
                "PRIMARY KEY (`" + KEY + "`)" +
            ") ENGINE = " + storageEngineType;
            
            PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
            pst.setInt(1, rowKeySize);
            pst.setInt(2, columnFamilySize);
            
            return pst.executeUpdate();
        }
        catch (SQLException e) 
        {
        	System.err.println("db connection error "+ e);
            return -1;
        }
    }
    /*
    int doMultipleInsert(String rowKey, byte[] cfValue) throws SQLException {
        if(multiCount < multiMax) {
            pstMultiInsert.setString(2*multiCount+1, rowKey);
            pstMultiInsert.setBytes(2*multiCount+2, cfValue);
            multiCount++;
        }
        if(multiCount == multiMax) {
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
