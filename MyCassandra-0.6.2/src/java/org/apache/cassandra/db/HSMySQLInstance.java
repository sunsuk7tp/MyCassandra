package org.apache.cassandra.db;

import java.sql.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.db.filter.*;

public class HSMySQLInstance implements DBInstance {
	
	HandlerSocket hs;
	String db, table;
	private final String PREFIX = "";
	private final String ID = "1";
	private final String KEY = "Row_Key"; 	
	private final String VALUE = "ColumnFamily";

	int debug = 0;
	
	public HSMySQLInstance(String dbInstance, String cfName) {
		db = PREFIX + dbInstance;
		table = PREFIX + cfName;
		try {
			hs = new HSMySQLConfigure().connect();
			hs.command().openIndex(ID, db, table, "PRIMARY", KEY+","+VALUE);
			hs.execute();
		} catch (IOException e) {
			System.err.println("can't open hs.");
		}
	}
	
	public int insertOrUpdate(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		/*ColumnFamily oldcf = select(rowKey, null);
		if(oldcf != null) {
			return update(rowKey, cf, oldcf);
		} else {*/
			return insert(rowKey, cf);
		//}
	}

	
	int insert(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		if(debug > 0) System.out.print("SQLInsert: ");
		DataOutputBuffer buffer = new DataOutputBuffer();
		ColumnFamily.serializer().serialize(cf, buffer);
		int cfLength = buffer.getLength();
		assert cfLength > 0;
		byte[] cfValue = buffer.getData();
		try {	
			int result = doInsert(rowKey, cfValue);
			if(debug > 0) { 
				if(result > 0) {
					System.out.println(cf.toString());
				} else {
					System.out.println("can't insert");
				}
			}
			return result;
		} catch (IOException e) {
			System.err.println("can't insert: " + e);
			return -1;
		}
	}
	
	int update(String rowKey, ColumnFamily newcf, ColumnFamily cf) throws SQLException, IOException {
		try {
			cf.addAll(newcf);
			
			DataOutputBuffer outputBuffer = new DataOutputBuffer();
			ColumnFamily.serializer().serialize(cf, outputBuffer);
			//int cfLength = outputBuffer.getLength();
			//assert cfLength > 0;
			//byte[] cfValue = outputBuffer.getData();
			
			return doUpdate(rowKey, outputBuffer.getData());
		} catch (SQLException e) {
			System.out.println("db update error: "+ e);
			return -1;
		} catch (IOException e) {
			System.out.println("db update error: "+ e);
			return -1;
		}
	}
	
	public int delete(String table, String columnName, String columnValue) throws SQLException {
		return 0;
	}
	
	public ColumnFamily select(String rowKey, QueryFilter filter) throws SQLException, IOException {
		//if(debug > 0) System.out.print("SQLSelect: ");
		try {
			//long start = System.currentTimeMillis();
			byte[] b = doSelect(rowKey);
			//System.out.println(System.currentTimeMillis() - start);
			
			if(b != null) {
				return new ColumnFamilySerializer().deserialize(new DataInputBuffer(b, 0, b.length));
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("db select error "+ e);
			return null;
		} catch (IOException e) {
			System.out.println("db select error "+ e);
			return null;
		}	
	}
	
	// Init MySQL Table for Keyspaces
	/*public int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType) throws SQLException {
		
		try {
			Statement stmt = conn.createStatement();
			
			if(debug > 0) {
				stmt.executeUpdate("TRUNCATE TABLE "+table);
			}
			
			ResultSet rs = stmt.executeQuery("SHOW TABLES");
			while(rs.next()) {
				if(rs.getString(1).equals(table)) {
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
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}*/
	
	synchronized int doInsert(String rowKey, byte[] cfValue) throws IOException {
		hs.command().insert(ID, rowKey, cfValue);
		List<HandlerSocketResult> res = hs.execute();
		return res.get(0).getStatus();
	}
	
	byte[] doSelect(String rowKey) throws SQLException, IOException {
		hs.command().find(ID, rowKey);
		List<HandlerSocketResult> res = hs.execute();
		return null;
		/*if(res.size() == 0) return null;
		else {
			return res.get(0).getMessages();
		}*/
	}

	synchronized int doUpdate(String rowKey, byte[] cfValue) throws SQLException, IOException {
		hs.command().findModifyUpdate(ID, rowKey, "=", "1", "0", cfValue);
		List<HandlerSocketResult> res = hs.execute();
		return res.get(0).getStatus();
	}
}
