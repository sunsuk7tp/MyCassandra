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
import org.jredis.ri.alphazero.JRedisClient;

public class RedisInstance extends DBSchemalessInstance
{
    JRedis conn;
    
    //override. default configuration
    int port = 6379;

    final String KEYSEPARATOR = ":";

    public RedisInstance(String ksName, String cfName, int dbIndex)
    {
        this.ksName = ksName;
        this.cfName = cfName;
        setConfiguration();
        conn = new JRedisClient(host, port, pass, dbIndex);
    }

    public RedisInstance(String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = cfName;
        setConfiguration();
        conn = new JRedisClient(host, port, pass, 0);
    }

    public int insert(String rowKey, ColumnFamily cf)
    {
        return doInsert(makeRowKey(rowKey), cf.toBytes());
    }

    public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf)
    {
        return doInsert(makeRowKey(rowKey), mergeColumnFamily(cf, newcf));
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
