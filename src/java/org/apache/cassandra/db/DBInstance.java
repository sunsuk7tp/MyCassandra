package org.apache.cassandra.db;

import java.sql.*;

public class DBInstance {
	Connection conn;
	
	public DBInstance(String dbInstance) {
		conn = new DBConfigure().connect(dbInstance);
	}
	
	int Insert(String Table, String Row_key, int CFLength, byte[] ColumnFamily) throws SQLException {
		try {
			String sPrepareSQL = "INSERT INTO "+Table+" (Row_Key, CF_Length, ColumnFamily) VALUES (?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			pst.setString(1, Row_key);
			pst.setInt(2, CFLength);
			pst.setBytes(3, ColumnFamily);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}
	
	int Update(String Table, String Row_key, int CFLength, byte[] ColumnFamily) throws SQLException {
		try {
			String sPrepareSQL = "UPDATE "+Table+" SET CFLength = CFLength + ?, ColumnFamily = ColumnFamily + ? Where Row_key = ?";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			pst.setInt(1, CFLength);
			pst.setBytes(2, ColumnFamily);
			pst.setString(3, Row_key);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}
	
	int Delete(String Table, String columnName, String columnValue) throws SQLException {
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
	
	ResultSet Select(String Table, String columnName, String columnValue) throws SQLException {
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
}
