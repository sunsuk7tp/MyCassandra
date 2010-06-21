package org.apache.cassandra.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.cassandra.db.filter.QueryFilter;
import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;

public class RedisInstance implements DBInstance {

	Connection conn;
	String instanceName, table;
	Statement stSearch, stUpdate, stDelete;
	PreparedStatement pstInsert, pstSelect;
	
	final String KEYSEPARATOR = ":";
	
	int debug = 0;
	
	public RedisInstance(String dbInstance, String cfName) {
		instanceName = dbInstance;
		conn = new RedisConfigure().connect(dbInstance);
		table = cfName;
		
		try {
			pstInsert = conn.prepareStatement("SET ? ?");
			pstSelect = conn.prepareStatement("GET ?");
			stSearch = conn.createStatement();
			stDelete = conn.createStatement();
		} catch (SQLException e) {
			System.out.println("db prepare state error "+ e);
		}
	}

	public int insertOrUpdate(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		if(rowSearch(rowKey) > 0) {
			return update(rowKey, cf);
		} else {
			return insert(rowKey, cf);
		}
	}

	public int insert(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		try {
			DataOutputBuffer buffer = new DataOutputBuffer();
	        ColumnFamily.serializer().serialize(cf, buffer);
	        int cfLength = buffer.getLength();
	        assert cfLength > 0;
	        byte[] cfValue = buffer.getData();
			
	        pstInsert.setString(1, table+KEYSEPARATOR+rowKey);
	        pstInsert.setObject(2, cf);
	        boolean result = pstInsert.execute();
	        return result ? 1 : -1; 
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
			return -1;
		}
	}

	public int update(String rowKey, ColumnFamily newcf) throws SQLException, IOException {
		if(debug > 0) System.out.print("SQLUpdate: ");
		try {
			ColumnFamily cf = select(rowKey, null);
			cf.addAll(newcf);
			return insert(rowKey,cf);
		} catch (SQLException e) {
			System.out.println("db connection error: "+ e);
			return -1;
		}
	}

	public ColumnFamily select(String rowKey, QueryFilter filter) throws SQLException, IOException {
		try {
			pstSelect.setString(1, table+KEYSEPARATOR+rowKey);
			ResultSet rs = pstSelect.executeQuery();
			
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
	
	public int delete(String table, String columnName, String columnValue) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	synchronized int rowSearch(String rowKey) throws SQLException {
		try {	
			return stSearch.executeUpdate("EXISTS "+table+KEYSEPARATOR+rowKey);
		} catch (SQLException e) {
			System.out.println("db connection error "+ e);
		}
		
		return -1;
	}
}
