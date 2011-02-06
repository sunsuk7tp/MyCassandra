package org.apache.cassandra.db;

import java.sql.*;
import java.io.IOException;
import java.util.List;

import org.apache.cassandra.db.filter.*;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoURI;

public class MongoInstance extends DBInstance {

	DBCollection coll;
	public static final String PREFIX = "_";
	
	public static final String KEY = "k";
	public static final String VALUE = "v";

	public MongoInstance(String ksName, String cfName) {
		this.ksName = PREFIX + ksName;
		this.cfName = PREFIX + cfName;
		
		DB conn = new MongoConfigure().connect(ksName);
		coll = conn.getCollection(this.cfName);
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
		return doInsert(rowKey, mergeColumnFamily(cf, newcf));
	}

	int insert(String rowKey, ColumnFamily cf) {
		return doInsert(rowKey, cf.toBytes());
	}

	public ColumnFamily get(String rowKey, QueryFilter filter) throws SQLException, IOException {
        return bytes2ColumnFamily(doSelect(rowKey));
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

