package org.apache.cassandra.db;

import java.sql.*;
import java.io.IOException;

import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.db.filter.*;

public class DBInstance {
	
	Connection conn;
	String instanceName, table;
	PreparedStatement pstInsert, pstSelect, pstSearch, pstUpdate, pstDelete;
	
	int debug = 0;
	
	public DBInstance(String dbInstance, String cfName) {
		instanceName = dbInstance;
		conn = new DBConfigure().connect(dbInstance);
		table = cfName;
		
		try {
			pstInsert = conn.prepareStatement("INSERT INTO "+table+" (Row_Key, ColumnFamily) VALUES (?,?)");
			pstSelect = conn.prepareStatement("SELECT ColumnFamily FROM "+table+" WHERE Row_Key = ?");
			pstSearch = conn.prepareStatement("SELECT COUNT(Row_Key) FROM "+table+" Where Row_Key = ?");
			pstUpdate = conn.prepareStatement("UPDATE "+table+" SET ColumnFamily = ? Where Row_Key = ?");
			pstDelete = conn.prepareStatement("DELETE FROM "+table+" Where Row_Key = ?");
		} catch (SQLException e) {
			System.out.println("db prepare state error "+ e);
		}
	}
	
	int insertOrUpdate(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		if(rowSearch(rowKey) > 0) {
			return update(rowKey, cf);
		} else {
			return insert(rowKey, cf);
		}
	}
	
	int insert(String rowKey, ColumnFamily cf) throws SQLException {
		if(debug > 0) System.out.print("SQLInsert: ");
		try {
			DataOutputBuffer buffer = new DataOutputBuffer();
	        ColumnFamily.serializer().serialize(cf, buffer);
	        int cfLength = buffer.getLength();
	        assert cfLength > 0;
	        byte[] cfValue = buffer.getData();
			
			int result = doInsert(rowKey,cfValue);
			
			if(debug > 0) { 
				if(result > 0) {
					System.out.println(cf.toString());
				} else {
					System.out.println("can't insert");
				}
			}
			return result;
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}
	
	int update(String rowKey, ColumnFamily newcf) throws SQLException, IOException {
		if(debug > 0) System.out.print("SQLUpdate: ");
		try {
			ColumnFamily cf = select(rowKey, null);
			cf.addAll(newcf);
			
			DataOutputBuffer outputBuffer = new DataOutputBuffer();
	        ColumnFamily.serializer().serialize(cf, outputBuffer);
	        int cfLength = outputBuffer.getLength();
	        assert cfLength > 0;
	        byte[] cfValue = outputBuffer.getData();
			
	        int result = doUpdate(rowKey, cfValue);
			if(debug > 0) { 
				if(result > 0) {
					System.out.println(cf.toString());
				} else {
					System.out.println("can't update");
				}
			}
			
			return result;
		} catch (SQLException e) {
			System.out.println("db connection error: "+ e);
			return -1;
		}
	}
	
	int delete(String table, String columnName, String columnValue) throws SQLException {
		try {
			pstDelete.setString(1, columnValue);			
			return pstDelete.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}
	
	ColumnFamily select(String rowKey, QueryFilter filter) throws SQLException, IOException {
		if(debug > 0) System.out.print("SQLSelect: ");
		try {
			ResultSet rs = doSelect(rowKey);
			
			byte[] b = null;
			while(rs.next()) {
				b = rs.getBytes(1);
			}
			
			if(b != null) {
				DataInputBuffer inputBuffer = new DataInputBuffer(b, 0, b.length);
				
				ColumnFamily cf = new ColumnFamilySerializer().deserialize(inputBuffer);
				
				if(debug > 0) System.out.println(cf.toString());
				return cf;
			} else {
				if(debug > 0) System.out.println("cant't select");
				return null;
			}
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return null;
		}		
	}
	
	synchronized int rowSearch(String rowKey) throws SQLException {
		int count = -1;
		
		try {		
			ResultSet rs = doSearch(rowKey);			
			while(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
		}
		
		return count;
	}
	
	// Init MySQL Table for Keyspaces
	public int create(String tableName, int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType) throws SQLException {
		
		try {
			Statement stmt = conn.createStatement();			
			
			if(debug > 0) {
				stmt.executeUpdate("TRUNCATE TABLE "+tableName);
			}
			
			ResultSet rs = stmt.executeQuery("SHOW TABLES");
			while(rs.next()) {
				if(rs.getString(1).equals(tableName)) {
					return 0;
				}
			}
			
			String sPrepareSQL = "CREATE Table "+tableName + "(" +
				//"`ID` INT NOT NULL AUTO_INCREMENT," + 
				"`Row_Key` VARCHAR(?) NOT NULL," +
				"`ColumnFamily` VARBINARY(?)," +
				"PRIMARY KEY (`Row_Key`)" +
			") ENGINE = ?";
			
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			pst.setInt(1,rowKeySize);
			pst.setInt(2,columnFamilySize);
			pst.setString(3, storageEngineType);			
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}
	
	synchronized int doInsert(String rowKey, byte[] cfValue) throws SQLException {
		pstInsert.setString(1, rowKey);
		pstInsert.setBytes(2, cfValue);
		
		return pstInsert.executeUpdate();
	}
	
	ResultSet doSelect(String rowKey) throws SQLException {
		pstSelect.setString(1, rowKey);

		return pstSelect.executeQuery();
	}

	ResultSet doSearch(String rowKey) throws SQLException {
		pstSearch.setString(1, rowKey);

		return pstSearch.executeQuery();
	}
	
	synchronized int doUpdate(String rowKey, byte[] cfValue) throws SQLException {
		pstUpdate.setBytes(1, cfValue);
		pstUpdate.setString(2, rowKey);

		return pstUpdate.executeUpdate();
	}
}
