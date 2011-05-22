package org.apache.cassandra.db;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.cassandra.db.filter.QueryFilter;

import org.jredis.JRedis;
import org.jredis.RedisException;

public class RedisInstance extends DBInstance
{
    JRedis conn;
    
    final String KEYSEPARATOR = ":";

    public RedisInstance(String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = cfName;
        conn = new RedisConfigure().connect();
    }

    synchronized public int insert(String rowKey, ColumnFamily cf) throws SQLException, IOException
    {
        try
        {
            conn.set(makeRowKey(rowKey), cf.toBytes());
            return 1;
        }
        catch (RedisException e)
        {
            System.err.println("db connection error: "+ e);
            return -1;
        }
    }

    public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf) throws SQLException, IOException
    {
        cf.addAll(newcf);
        return insert(rowKey, cf);
    }

    public byte[] select(String rowKey) throws SQLException, IOException
    {
        try
        {
            return conn.get(makeRowKey(rowKey));
        }
        catch (RedisException e)
        {
            System.err.println("db get error: "+ e);
            return null;
        }
    }

    synchronized public int delete(String rowKey) throws SQLException
    {
        try
        {
            conn.del(makeRowKey(rowKey));
            return 1;
        }
        catch (RedisException e)
        {
            System.err.println("db deletion error: "+ e);
        }
        return -1;
    }

    public int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType)
    {
        return 0;
    }

    public int createProcedure(int rowKeySize, int columnFanukySize)
    {
        return 0;
    }

    public String makeRowKey(String rowKey)
    {
        return ksName+KEYSEPARATOR+cfName+KEYSEPARATOR+rowKey;
    }
}
