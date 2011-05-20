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

public class MongoInstance extends DBInstance
{

    DBCollection coll;
    public static final String PREFIX = "_";

    public static final String KEY = "k";
    public static final String VALUE = "v";

    public MongoInstance(String ksName, String cfName)
    {
        this.ksName = PREFIX + ksName;
        this.cfName = PREFIX + cfName;

        DB conn = new MongoConfigure().connect(ksName);
        coll = conn.getCollection(this.cfName);
        coll.ensureIndex(new BasicDBObject(KEY, 1).append("unique", true));
    }
    
    public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf)  throws SQLException, IOException
    {
        return doInsert(rowKey, mergeColumnFamily(cf, newcf));
    }

    public int insert(String rowKey, ColumnFamily cf)  throws SQLException, IOException
    {
        return doInsert(rowKey, cf.toBytes());
    }

    public byte[] select(String rowKey) throws SQLException, IOException
    {
        BasicDBObject query = new BasicDBObject();
        query.put(KEY, rowKey);
        
        DBCursor cur = coll.find(query);
        if (cur.hasNext())
        {
            return (byte[])cur.next().get(VALUE);
        }
        else
        {
            return null;
        }
    }
    
    synchronized int doInsert(String rowKey, byte[] cfValue)
    {
        DBObject doc = new BasicDBObject();
        doc.put(KEY, rowKey);
        doc.put(VALUE, cfValue);
        coll.insert(doc);
        return 1;
    }

    synchronized public int delete(String rowKey)
    {
        DBObject doc = new BasicDBObject();
        doc.put(KEY, rowKey);
        coll.remove(doc);
        return 1;
    }
    
    public int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType)
    {
        return 0;
    }

    public int createProcedure(int rowKeySize, int columnFanukySize)
    {
        return 0;
    }
}
