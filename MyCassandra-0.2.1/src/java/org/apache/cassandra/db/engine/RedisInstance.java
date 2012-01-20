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

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.DecoratedKey;
import org.apache.cassandra.db.ColumnFamily;

import redis.clients.jedis.BinaryJedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

public class RedisInstance extends DBSchemalessInstance
{
    private static final String engineName = "Redis";
    BinaryJedis conn;

    private static final String KEYSEPARATOR = ":";
    private static final int timeout = 300;

    public RedisInstance(String ksName, String cfName, int dbIndex)
    {
        super(engineName, ksName, cfName);

        conn = new BinaryJedis(host, port, timeout);
        if(!auth()) System.exit(1);
    }

    public RedisInstance(String ksName, String cfName)
    {
        super(engineName, ksName, cfName);

        conn = new BinaryJedis(host, port, timeout);
        if(!auth()) System.exit(1);
    }

    public boolean auth()
    {
        if(pass == null) pass = "redis"; // dummy pass
        String status = conn.auth(pass);
        return status.equals("OK") ? true : false;
    }

    @Override
    public int insert(String rowKey, ColumnFamily cf)
    {
        return doInsert(makeRowKey(rowKey), cf.toBytes());
    }

    @Override
    public int update(String rowKey, ColumnFamily newcf)
    {
        return doInsert(makeRowKey(rowKey), newcf.toBytes());
    }

    /* XXX Redis is not multithreaded on the current new version.
     * If you do not use 'synchronized', it happens much connection timeout exceptions.
     * If you want not to use 'synchronized' for performance with concurrent processing,
     * you should create a instance by an operation and adjust the max file discriptor on your environments.
     */
    @Override
    synchronized public byte[] select(String rowKey)
    {
       try {
          return conn.get(makeRowKey(rowKey));
       }
       catch (JedisConnectionException e)
       {
          conn = new BinaryJedis(host, port, timeout);
          return conn.get(makeRowKey(rowKey));
       }
    }

    @Override
    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults)
    {
        return null;
    }

    @Override
    synchronized public int truncate()
    {
        return FAILURE;
    }

    @Override
    synchronized public int dropTable()
    {
        return FAILURE;
    }

    @Override
    synchronized public int dropDB()
    {
        conn.flushDB();
        return SUCCESS;
    }

    @Override
    synchronized public int delete(String rowKey)
    {
        conn.del(makeRowKey(rowKey));
        return SUCCESS;
    }

    synchronized private int doInsert(byte[] rowKey, byte[] cfValue)
    {
        conn.set(rowKey, cfValue);
        return SUCCESS;
    }

    private byte[] makeRowKey(String rowKey)
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
