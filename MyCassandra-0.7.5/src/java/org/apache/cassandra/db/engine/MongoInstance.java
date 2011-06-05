package org.apache.cassandra.db.engine;

import java.sql.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoURI;

public class MongoInstance extends DBSchemalessInstance
{

    DB conn;
    DBCollection coll;
    public static final String PREFIX = "_";

    public static final String KEY = "k";
    public static final String VALUE = "v";

    public MongoInstance(String ksName, String cfName)
    {
        this.ksName = PREFIX + ksName;
        this.cfName = cfName;

        conn = new MongoConfigure().connect(this.ksName);
        coll = conn.getCollection(this.cfName);
        coll.createIndex(new BasicDBObject(KEY,1).append("unique", true));
    }

    public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf)
    {
        return doUpdate(rowKey, mergeColumnFamily(cf, newcf));
    }

    public int insert(String rowKey, ColumnFamily cf)
    {
        return doInsert(rowKey, cf.toBytes());
    }

    public byte[] select(String rowKey)
    {
        BasicDBObject query = new BasicDBObject();
        query.put(KEY, rowKey);

        DBCursor cur = coll.find(query);
        return cur.hasNext() ? (byte[])cur.next().get(VALUE) : null;
    }

    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults)
    {
        return null;
    }

    public int truncate()
    {
        return dropTable();
    }

    public synchronized int dropTable()
    {
        coll.drop();
        return 1;
    }

    public synchronized int dropDB()
    {
        conn.dropDatabase();
        return 1;
    }
    
    public synchronized int delete(String rowKey)
    {
        DBObject doc = new BasicDBObject();
        doc.put(KEY, rowKey);
        coll.remove(doc);
        return 1;
    }

    private synchronized int doUpdate(String rowKey, byte[] cfValue)
    {
        DBObject olddoc = new BasicDBObject();
        DBObject newdoc = new BasicDBObject();
        olddoc.put(KEY, rowKey);
        newdoc.put(VALUE, cfValue);
        coll.update(olddoc, newdoc);
        return 1;
    }

    private synchronized int doInsert(String rowKey, byte[] cfValue)
    {
        DBObject doc = new BasicDBObject();
        doc.put(KEY, rowKey);
        doc.put(VALUE, cfValue);
        coll.insert(doc);
        return 1;
    }
}
