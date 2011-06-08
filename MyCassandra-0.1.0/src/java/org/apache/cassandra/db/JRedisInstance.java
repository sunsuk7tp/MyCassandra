package org.apache.cassandra.db;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.cassandra.db.filter.QueryFilter;
import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.jredis.JRedis;
import org.jredis.RedisException;

public class JRedisInstance implements DBInstance {

	JRedis conn;
	String instanceName, table;
	
	final String KEYSEPARATOR = ":";
	
	int debug = 0;
	
	public JRedisInstance(String dbInstance, String cfName) {
		instanceName = dbInstance;
		conn = new JRedisConfigure().connect();
		table = cfName;
	}

	public int insertOrUpdate(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		if(rowSearch(rowKey) > 0) {
			return update(rowKey, cf);
		} else {
			return insert(rowKey, cf);
		}
	}

	public int insert(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		DataOutputBuffer buffer = new DataOutputBuffer();
		ColumnFamily.serializer().serialize(cf, buffer);
		int cfLength = buffer.getLength();
		assert cfLength > 0;
		byte[] cfValue = buffer.getData();
			
		try {
			String key = instanceName+KEYSEPARATOR+table+KEYSEPARATOR+rowKey;
			conn.set(key, cfValue);
			return 1;
		} catch (RedisException e) {
			System.err.println("db connection error: "+ e);
			return -1;
		}
	}

	public int update(String rowKey, ColumnFamily newcf) throws SQLException, IOException {
		if(debug > 0) System.out.print("SQLUpdate: ");
		ColumnFamily cf = select(rowKey, null);
		cf.addAll(newcf);
		return insert(rowKey,cf);
	}

	public ColumnFamily select(String rowKey, QueryFilter filter) throws SQLException, IOException {
		try {
			String key = instanceName+KEYSEPARATOR+table+KEYSEPARATOR+rowKey;
			byte[] b = conn.get(key);
			
			if(b != null) {
				DataInputBuffer inputBuffer = new DataInputBuffer(b, 0, b.length);
				
				ColumnFamily cf = new ColumnFamilySerializer().deserialize(inputBuffer);
				
				if(debug > 0) System.out.println(cf.toString());
				return cf;
			} else {
				if(debug > 0) System.out.println("cant't select");
				return null;
			}
		} catch (RedisException e) {
			System.err.println("db select error: "+ e);
			return null;
		}
	}
	
	public int delete(String table, String columnName, String columnValue) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	synchronized int rowSearch(String rowKey) {
		
		try {
			if(conn.exists(rowKey)) {
				return 1;
			} else {
				return -1;
			}
		} catch (RedisException e) {
			System.err.println("db can't lookup key "+e);
			return -1;
		}
	}

}
