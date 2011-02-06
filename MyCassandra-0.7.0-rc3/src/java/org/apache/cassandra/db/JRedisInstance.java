package org.apache.cassandra.db;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.cassandra.db.filter.QueryFilter;

import org.jredis.JRedis;
import org.jredis.RedisException;

public class JRedisInstance extends DBInstance {

	JRedis conn;
	
	final String KEYSEPARATOR = ":";
	
	public JRedisInstance(String ksName, String cfName) {
		this.ksName = ksName;
		this.cfName = cfName;
		conn = new JRedisConfigure().connect();
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
			conn.set(makeRowKey(rowKey), cf.toBytes());
			return 1;
		} catch (RedisException e) {
			System.err.println("db connection error: "+ e);
			return -1;
		}
	}

	synchronized public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf) throws SQLException, IOException {
		cf.addAll(newcf);
		return insert(rowKey, cf);
	}

	public ColumnFamily get(String rowKey, QueryFilter filter) throws SQLException, IOException {
		try {
			return bytes2ColumnFamily(conn.get(makeRowKey(rowKey)));
		} catch (RedisException e) {
			System.err.println("db get error: "+ e);
			return null;
		}
	}
	
	public int delete(String table, String columnName, String columnValue) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String makeRowKey(String rowKey) {
		return ksName+KEYSEPARATOR+cfName+KEYSEPARATOR+rowKey;
	}
}
