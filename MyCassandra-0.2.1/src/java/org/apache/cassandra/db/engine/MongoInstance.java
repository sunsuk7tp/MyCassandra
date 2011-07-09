/*
 * Copyright 2011 Shunsuke Nakamura, and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.cassandra.db.engine;

import java.util.Map;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.DecoratedKey;
import org.apache.cassandra.db.ColumnFamily;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.WriteResult;
import com.mongodb.DBObject;

public class MongoInstance extends DBSchemalessInstance
{

    DB conn;
    DBCollection coll;

    public static final String PREFIX = "_";
    public static final String KEY = "k";
    public static final String VALUE = "v";

    public MongoInstance(String ksName, String cfName)
    {
        engineName = "MongoDB";
        this.ksName = PREFIX + ksName;
        this.cfName = cfName;

        setConfiguration();

        conn = new MongoConfigure().connect(this.ksName, host, port, user, pass);
        coll = conn.getCollection(this.cfName);
        coll.createIndex(new BasicDBObject(KEY, 1).append("unique", true));
    }

    public int update(String rowKey, ColumnFamily newcf)
    {
        return doUpdate(rowKey, newcf.toBytes());
    }

    public int insert(String rowKey, ColumnFamily cf)
    {
        return doInsert(rowKey, cf.toBytes());
    }

    public byte[] select(String rowKey)
    {
        BasicDBObject query = new BasicDBObject();
        query.put(KEY, rowKey);

        return (byte[])coll.findOne(query).get(VALUE);
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
        return SUCCESS;
    }

    public synchronized int dropDB()
    {
        conn.dropDatabase();
        return SUCCESS;
    }
    
    public synchronized int delete(String rowKey)
    {
        DBObject doc = new BasicDBObject();
        doc.put(KEY, rowKey);
        return resResult(coll.remove(doc));
    }

    private synchronized int doUpdate(String rowKey, byte[] cfValue)
    {
        DBObject olddoc = new BasicDBObject();
        DBObject newdoc = new BasicDBObject();
        olddoc.put(KEY, rowKey);
        newdoc.put(VALUE, cfValue);
        return resResult(coll.update(olddoc, newdoc));
    }

    private synchronized int doInsert(String rowKey, byte[] cfValue)
    {
        DBObject doc = new BasicDBObject();
        doc.put(KEY, rowKey);
        doc.put(VALUE, cfValue);
        return resResult(coll.insert(doc));
    }

    private int resResult(WriteResult res)
    {
        if (res.getError() != null)
        {
            return errorMsg(res.getError(), null);
        }
        return SUCCESS;
    }
}
