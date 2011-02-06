package org.apache.cassandra.db;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.cassandra.db.filter.QueryFilter;

import org.jredis.JRedis;
import org.jredis.RedisException;

public class JRedisInstance extends DBInstance {

	JRedis conn;
	String instanceName, table;
	
	final String KEYSEPARATOR = ":";
	
	int debug = 0;
	
	public JRedisInstance(String dbInstance, String cfName) {
		instanceName = dbInstance;
		conn = new JRedisConfigure().connect();
		table = cfName;
	}

	public int put(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		ColumnFamily oldcf = get(rowKey, null);
		if(oldcf != null) {
			return update(rowKey, cf, oldcf);
		} else {
			return insert(rowKey, cf);
		}
	}

	synchronized public int insert(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		try {
			String key = instanceName+KEYSEPARATOR+table+KEYSEPARATOR+rowKey;
			conn.set(key, cf.toBytes());
			return 1;
		} catch (RedisException e) {
			System.err.println("db connection error: "+ e);
			return -1;
		}
	}

	synchronized public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf) throws SQLException, IOException {
		if(debug > 0) System.out.print("SQLUpdate: ");
		cf.addAll(newcf);
		return insert(rowKey, cf);
	}

	public ColumnFamily get(String rowKey, QueryFilter filter) throws SQLException, IOException {
		try {
			String key = instanceName+KEYSEPARATOR+table+KEYSEPARATOR+rowKey;
			byte[] b = conn.get(key);
			
			if(b != null) {
		        return bytes2ColumnFamily(b);
			} else {
				if(debug > 0) System.out.println("cant't get");
				return null;
			}
		} catch (RedisException e) {
			System.err.println("db get error: "+ e);
			return null;
		}
	}
	
	public int delete(String table, String columnName, String columnValue) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
