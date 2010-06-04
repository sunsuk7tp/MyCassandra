package org.apache.cassandra.db;

import java.sql.*;
import java.io.IOException;

import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.db.filter.*;

public class DBInstance {
	
	Connection conn;
	String instanceName;
	int debug = 1;
	
	public DBInstance(String dbInstance) {
		instanceName = dbInstance;
		conn = new DBConfigure().connect(dbInstance);
	}
	
	int insertOrUpdate(String table, String rowKey, ColumnFamily cf) throws SQLException, IOException{
		if(rowSearch(table, rowKey) > 0) {
			return update(table, rowKey, cf);
		} else {
			return insert(table, rowKey, cf);
		}
	}
	
	int insert(String table, String rowKey, ColumnFamily cf) throws SQLException {
		if(debug > 0) System.out.print("SQLInsert: ");
		try {
			/*String tPrepareSQL = "SELECT COUNT(*) FROM  information_schema.tables WHERE table_name = ? AND table_schema = ?";
			PreparedStatement tst = conn.prepareStatement(tPrepareSQL);
			
			tst.setString(1,table);
			tst.setString(2, instanceName);
			ResultSet rs = tst.executeQuery();

			while(rs.next()) {
				if(rs.getInt(1) < 1) {
					create(table);
				}
			}*/
			
			DataOutputBuffer buffer = new DataOutputBuffer();
	        ColumnFamily.serializer().serialize(cf, buffer);
	        int cfLength = buffer.getLength();
	        assert cfLength > 0;
	        byte[] cfValue = buffer.getData();
			
			String sPrepareSQL = "INSERT INTO "+table+" (Row_Key, CF_Length, ColumnFamily) VALUES (?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			pst.setString(1, rowKey);
			pst.setInt(2, cfLength);
			pst.setBytes(3, cfValue);
			
			int result = pst.executeUpdate();
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
	
	int update(String table, String rowKey, ColumnFamily newcf) throws SQLException, IOException {
		if(debug > 0) System.out.print("SQLUpdate: ");
		try {
			ColumnFamily cf = select(table, rowKey, null);
			cf.addAll(newcf);
			
			String sPrepareSQL = "UPDATE "+table+" SET CF_Length = ?, ColumnFamily = ? Where Row_Key = ?";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			DataOutputBuffer outputBuffer = new DataOutputBuffer();
	        ColumnFamily.serializer().serialize(cf, outputBuffer);
	        int cfLength = outputBuffer.getLength();
	        assert cfLength > 0;
	        byte[] cfValue = outputBuffer.getData();
			
			pst.setInt(1, cfLength);
			pst.setBytes(2, cfValue);
			pst.setString(3, rowKey);
			conn.setAutoCommit(false);
			int result = pst.executeUpdate();
			conn.commit();
			if(debug > 0) { 
				if(result > 0) {
					System.out.println(cf.toString());
				} else {
					System.out.println("can't update");
				}
			}
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error: "+ e);
			return -1;
		}
	}
	
	int delete(String table, String columnName, String columnValue) throws SQLException {
		try {
			String sPrepareSQL = "DELETE FROM "+table+" Where "+columnName+" = ?";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			
			pst.setString(1, columnValue);
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}
	
	ColumnFamily select(String table, String rowKey, QueryFilter filter) throws SQLException, IOException {
		if(debug > 0) System.out.print("SQLSelect: ");
		try {
			String sPrepareSQL = "SELECT ColumnFamily FROM "+table+" WHERE Row_Key = ?";
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			pst.setString(1, rowKey);
			ResultSet rs = pst.executeQuery();
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
	
	int rowSearch(String table, String rowKey) throws SQLException {
		int id = -1;
		
		try {
			String sPrepareSQL = "SELECT id FROM "+table+" Where Row_Key = ?";
			
			PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
			pst.setString(1, rowKey);
			
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
	
	// transaction method
	void beginTransaction() throws SQLException {
	    String sql = "BEGIN;";
	    Statement statement = conn.createStatement ();
	    statement.executeUpdate(sql);
	    statement.close();
	}
}
