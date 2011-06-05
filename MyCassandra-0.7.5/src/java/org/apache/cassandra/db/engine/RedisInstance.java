package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.HashMap;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

import org.jredis.JRedis;
import org.jredis.RedisException;

public class RedisInstance extends DBSchemalessInstance
{
    JRedis conn;
    
    final String KEYSEPARATOR = ":";

    public RedisInstance(String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = cfName;
        conn = new RedisConfigure().connect(0);
    }
    
    public RedisInstance(String ksName, String cfName, int dbIndex)
    {
        this.ksName = ksName;
        this.cfName = cfName;
        conn = new RedisConfigure().connect(dbIndex);
    }

    public int insert(String rowKey, ColumnFamily cf)
    {
        return doInsert(makeRowKey(rowKey), cf.toBytes());
    }

    public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf)
    {
        cf.addAll(newcf);
        return doInsert(makeRowKey(rowKey), cf.toBytes());
    }

    public byte[] select(String rowKey)
    {
        try
        {
            return conn.get(makeRowKey(rowKey));
        }
        catch (RedisException e)
        {
           errorMsg("db get error", e);
            return null;
        }
    }

    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults)
    {
        return null;
    }
    
    synchronized public int truncate()
    {
        return -1;
    }

    synchronized public int dropTable()
    {
        return -1;
    }

    synchronized public int dropDB()
    {
        try
        {
            conn.flushdb();
            return 1;
        }
        catch (RedisException e)
        {
            errorMsg("db drop error", e);
            return -1;
        }
    }

    synchronized public int delete(String rowKey)
    {
        try
        {
            conn.del(makeRowKey(rowKey));
            return 1;
        }
        catch (RedisException e)
        {
            errorMsg("db deletion error", e);
            return -1;
        }
    }

    private synchronized int doInsert(String rowKey, byte[] cfValue)
    {
        try
        {
            conn.set(rowKey, cfValue);
            return 1;
        }
        catch (RedisException e)
        {
            errorMsg("db insertion/update error", e);
            return -1;
        }
    }

    public String makeRowKey(String rowKey)
    {
        return ksName + KEYSEPARATOR + cfName + KEYSEPARATOR + rowKey;
    }
}
