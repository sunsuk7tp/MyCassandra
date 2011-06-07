package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.HashMap;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

import redis.clients.jedis.BinaryJedis;

public class RedisInstance extends DBSchemalessInstance
{
    BinaryJedis conn;
    
    //override. default configuration
    int port = 6379;

    final String KEYSEPARATOR = ":";

    public RedisInstance(String ksName, String cfName, int dbIndex)
    {
        this.ksName = ksName;
        this.cfName = cfName;
        setConfiguration();
        conn = new BinaryJedis(host, port);
        if(!auth()) System.exit(1);
    }

    public RedisInstance(String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = cfName;
        setConfiguration();
        conn = new BinaryJedis(host, port);
        if(!auth()) System.exit(1);
    }

    public boolean auth()
    {
        String status = conn.auth(pass);
        return status.equals("OK") ? true : false;
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
            return conn.get(makeRowKey(rowKey));
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
        conn.flushDB();
        return 1;
    }

    synchronized public int delete(String rowKey)
    {
        conn.del(makeRowKey(rowKey));
        return 1;
    }

    private synchronized int doInsert(byte[] rowKey, byte[] cfValue)
    {
        conn.set(rowKey, cfValue);
        return 1;
    }

    public byte[] makeRowKey(String rowKey)
    {
        try
        {
            byte[] key = (ksName + KEYSEPARATOR + cfName + KEYSEPARATOR + rowKey).getBytes("UTF-8");
            return key;
        }
        catch (UnsupportedEncodingException e)
        {
            errorMsg("makeRowKey encoding error", e);
            return null;
        }
    }
}
