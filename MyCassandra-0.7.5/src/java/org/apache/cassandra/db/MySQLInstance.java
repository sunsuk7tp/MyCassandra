package org.apache.cassandra.db;

import java.sql.*;
import java.io.IOException;

import org.apache.cassandra.db.filter.*;

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

    private String insertSt, setSt, getSt, deleteSt, createSt, getPr, setPr;

    public MySQLInstance (String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = PREFIX + cfName;

        /* define crud sql statements */
        insertSt = "INSERT INTO " + this.cfName + " (" + KEY +", " + VALUE +") VALUES (?,?) ON DUPLICATE KEY UPDATE " + KEY + " = ?"; 
        setSt = !this.ksName.equals(SYSTEM) ? "CALL set_row(?,?)" : "UPDATE " + this.cfName + " SET " + VALUE  +" = ? WHERE " + KEY + " = ?";
        getSt = !this.ksName.equals(SYSTEM) ? "CALL get_row(?)" : "SELECT " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " = ?";
        deleteSt = "DELETE FROM " + this.cfName + " WHERE " + KEY + " = ?";
        createSt = "CREATE Table "+ this.cfName + "(" +"`" + KEY + "` VARCHAR(?) NOT NULL," + "`" + VALUE + "` VARBINARY(?)," + "PRIMARY KEY (`" + KEY + "`)" + ") ENGINE = ?";
        setPr = "CREATE PROCEDURE set_row(IN cfval VARBINARY(?),IN id VARCHAR(?)) BEGIN UPDATE " + this.cfName + " SET " + VALUE + " = cfval WHERE " + KEY + " = id; END";
        getPr = "CREATE PROCEDURE get_row(IN id VARCHAR(?)) BEGIN SELECT " + VALUE + " FROM " + this.cfName + " WHERE " + KEY + " = id; END";

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
            System.err.println("db insertion error "+ e);
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
        PreparedStatement pstSelect = conn.prepareStatement(getSt);
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

    public synchronized int createDB()
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
    public synchronized int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType)
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
    
    public synchronized int createProcedure(int rowKeySize, int columnFamilySize)
    {
        try {
            Statement stmt = conn.createStatement();
            
            ResultSet rs = stmt.executeQuery("SHOW PROCEDURE STATUS");
            while (rs.next())
                if (rs.getString(1).equals(ksName) && ( rs.getString(2).equals(GETPR) || rs.getString(2).equals(SETPR)))
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
            System.err.println("db procedure creation error " + e);
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
