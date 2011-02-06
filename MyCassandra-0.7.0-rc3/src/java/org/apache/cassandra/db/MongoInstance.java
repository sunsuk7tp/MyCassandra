package org.apache.cassandra.db;

import java.sql.*;
import java.io.IOException;

import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.db.filter.*;

import java.util.List;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoURI;

public class MongoInstance implements StorageEngineInterface {

	DBCollection coll;
	String instanceName, table;
	public static final String PREFIX = "_";
	
	public static final String KEY = "k";
	public static final String VALUE = "v";

	public MongoInstance(String dbInstance, String cfName) {
		instanceName = PREFIX+dbInstance;
		DB conn = new MongoConfigure().connect(instanceName);
		table = PREFIX+cfName;
		coll = conn.getCollection(table);
		coll.ensureIndex(new BasicDBObject(KEY, 1).append("unique", true));
	}

	public int put(String rowKey, ColumnFamily cf) throws SQLException, IOException {
		ColumnFamily oldcf = get(rowKey, null);
		if (oldcf != null) {
			return update(rowKey, cf, oldcf);
		} else {
			return insert(rowKey, cf);
		}
	}

	int update(String rowKey, ColumnFamily newcf, ColumnFamily cf) {
		cf.addAll(newcf);
		DataOutputBuffer outputBuffer = new DataOutputBuffer();
		ColumnFamily.serializer().serialize(cf, outputBuffer);
		return doInsert(rowKey, outputBuffer.getData());
	}

	int insert(String rowKey, ColumnFamily cf) {
		DataOutputBuffer buf = new DataOutputBuffer();
		ColumnFamily.serializer().serialize(cf, buf);
		byte[] cfValue = buf.getData();

		return doInsert(rowKey, cfValue);
	}

	public ColumnFamily get(String rowKey, QueryFilter filter) throws SQLException, IOException {
		byte[] b = doSelect(rowKey);
		if (b != null) {
			return new ColumnFamilySerializer().deserialize(new DataInputBuffer(b,0,b.length));
		} else {
			return null;
		}
	}

	byte[] doSelect(String rowKey) {
		BasicDBObject query = new BasicDBObject();
		query.put(KEY, rowKey);
		
		DBCursor cur = coll.find(query);
		if (cur.hasNext()){
			return (byte[])cur.next().get(VALUE);
		} else {
			return null;
		}
	}

	synchronized int doInsert(String rowKey, byte[] cfValue) {
		DBObject doc = new BasicDBObject();
		doc.put(KEY, rowKey);
		doc.put(VALUE, cfValue);
		coll.insert(doc);
		return 1;
	}

	public int delete(String table, String columnName, String columnValue) throws SQLException {
		return 0;
 	}
}

