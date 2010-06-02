package org.apache.cassandra.db;

import java.sql.*;
import java.io.IOException;

import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;

public class DBInstance {
	Connection conn;
	
	public DBInstance(String dbInstance) {
		conn = new DBConfigure().connect(dbInstance);
	}
	
	int insertOrUpdate(String Table, String Row_key, ColumnFamily cf) throws SQLException, IOException{
		int id;
		if((id = rowSearch(Table, Row_key)) > 0) {
			return update(Table, id, cf);
		} else {
			return insert(Table, Row_key, cf);
		}
	}
	
	int insert(String Table, String Row_key, ColumnFamily cf) throws SQLException {
		try {
			DataOutputBuffer buffer = new DataOutputBuffer();
	        ColumnFamily.serializer().serialize(cf, buffer);
	        int CFLength = buffer.getLength();
	        assert CFLength > 0;
	        byte[] CFValue = buffer.getData();
			
			String sPrepareSQL = "INSERT INTO "+Table+" (Row_Key, CF_Length, ColumnFamily) VALUES (?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			pst.setString(1, Row_key);
			pst.setInt(2, CFLength);
			pst.setBytes(3, CFValue);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}
	
	int update(String Table, int PrimaryID, ColumnFamily newcf) throws SQLException, IOException {
		try {
			
			String gPrepareSQL = "SELECT ColumnFamily from "+Table+" Where id = ?";
			PreparedStatement gst = conn.prepareStatement(gPrepareSQL);
			gst.setInt(1, PrimaryID);
			ResultSet rs = gst.executeQuery();
			byte[] b = null;
			while(rs.next()) {
				b = rs.getBytes(1);
			}
			DataInputBuffer inputBuffer = new DataInputBuffer(b, 0, b.length);
			
			ColumnFamily cf = new ColumnFamilySerializer().deserialize(inputBuffer);
			cf.addAll(newcf);
			
			String sPrepareSQL = "UPDATE "+Table+" SET CF_Length = ?, ColumnFamily = ? Where id = ?";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			DataOutputBuffer outputBuffer = new DataOutputBuffer();
	        ColumnFamily.serializer().serialize(cf, outputBuffer);
	        int CFLength = outputBuffer.getLength();
	        assert CFLength > 0;
	        byte[] CFValue = outputBuffer.getData();
			
			pst.setInt(1, CFLength);
			pst.setBytes(2, CFValue);
			pst.setInt(3, PrimaryID);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error: "+ e);
			return -1;
		}
	}
	
	int delete(String Table, String columnName, String columnValue) throws SQLException {
		try {
			String sPrepareSQL = "DELETE FROM "+Table+" Where "+columnName+" = ?";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			pst.setString(1, columnValue);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}
	
	ResultSet select(String Table, String columnName, String columnValue) throws SQLException {
		try {
			String sPrepareSQL = "SELECT * FROM "+Table;
			if(columnName != null) sPrepareSQL += " Where "+columnName+" = ?";
			
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			if(columnName != null) pst.setString(1, columnValue);
			
			return pst.executeQuery();
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return null;
		}		
	}
	
	int rowSearch(String Table, String Row_Key) throws SQLException {
		int id = -1;
		
		try {
			String sPrepareSQL = "SELECT id FROM "+Table+" Where Row_Key = ?";
			
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			pst.setString(1, Row_Key);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				id = rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
		}
		
		return id;
	}
	
	int create(String tableName) throws SQLException {
		try {
			String sPrepareSQL = "CREATE Table "+tableName + "(" +
				"`id` int(11) NOT NULL AUTO_INCREMENT," +
				"`Row_Key` text NOT NULL," +
				"`CF_Length` int NOT NULL," +
				"`ColumnFamily` VARBINARY(65276)," +
				"PRIMARY KEY (`id`)"+
			")";
			
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}
	
	byte[] escape(byte[] val) {
		
		return val;
	}
}
