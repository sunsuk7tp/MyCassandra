package org.apache.cassandra.db;

import java.sql.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.cassandra.db.filter.*;

public class HSMySQLInstance extends DBInstance
{	
	HandlerSocket hs;
	private final String PREFIX = "";
	private final String ID = "1";
	private final String KEY = "Row_Key"; 	
	private final String VALUE = "ColumnFamily";

	int debug = 0;
	
	public HSMySQLInstance(String ksName, String cfName)
	{
		this.ksName = ksName;
		this.cfName = PREFIX + cfName;
		try
		{
			hs = new HSMySQLConfigure().connect();
			hs.command().openIndex(ID, this.ksName, this.cfName, "PRIMARY", KEY+","+VALUE);
			hs.execute();
		}
		catch (IOException e)
		{
			System.err.println("can't open hs.");
		}
	}
	
	public int put(String rowKey, ColumnFamily cf) throws SQLException, IOException
	{
		/*ColumnFamily oldcf = get(rowKey, null);
		if(oldcf != null)
		{
			return update(rowKey, cf, oldcf);
		}
		else
		{*/
			return insert(rowKey, cf);
		//}
	}
	
	public int insert(String rowKey, ColumnFamily cf) throws SQLException, IOException
	{
		try
		{
			return doInsert(rowKey, cf.toBytes());
		}
		catch (IOException e)
		{
			System.err.println("can't insert: " + e);
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
			System.out.println("db update error: "+ e);
			return -1;
		}
		catch (IOException e)
		{
			System.out.println("db update error: "+ e);
			return -1;
		}
	}
	
	public byte[] select(String rowKey) throws SQLException, IOException
	{
		hs.command().find(ID, rowKey);
		List<HandlerSocketResult> res = hs.execute();
		return null;
		//return res.size == 0 ? null : return res.get(0).getMessages();
	}
	
	public int delete(String table, String columnName, String columnValue) throws SQLException
	{
		return 0;
	}
	
	// Init MySQL Table for Keyspaces
	/*public int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType) throws SQLException
	{
		try
		{
			Statement stmt = conn.createStatement();
			
			if(debug > 0)
			{
				stmt.executeUpdate("TRUNCATE TABLE "+table);
			}
			
			ResultSet rs = stmt.executeQuery("SHOW TABLES");
			while(rs.next())
			{
				if(rs.getString(1).equals(table))
				{
					return 0;
				}
			}
			
			String sPrepareSQL = "CREATE Table "+table + "(" +
				//"`ID` INT NOT NULL AUTO_INCREMENT," + 
				"`Row_Key` VARCHAR(?) NOT NULL," +
				"`ColumnFamily` VARBINARY(?)," +
				"PRIMARY KEY (`Row_Key`)" +
			")";// PARTITION BY KEY(`Row_Key`) PARTITIONS 2;";
			
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			pst.setInt(1,rowKeySize);
			pst.setInt(2,columnFamilySize);
			
			return pst.executeUpdate();
		}
		catch (SQLException e)
		{
			System.out.println("db connection error "+ e);
			return -1;
		}
	}*/
	
	synchronized int doInsert(String rowKey, byte[] cfValue) throws IOException
	{
		hs.command().insert(ID, rowKey, cfValue);
		List<HandlerSocketResult> res = hs.execute();
		return res.get(0).getStatus();
	}
	
	synchronized int doUpdate(String rowKey, byte[] cfValue) throws SQLException, IOException
	{
		hs.command().findModifyUpdate(ID, rowKey, "=", "1", "0", cfValue);
		List<HandlerSocketResult> res = hs.execute();
		return res.get(0).getStatus();
	}
}
