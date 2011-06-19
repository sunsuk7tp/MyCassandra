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

public class RedisInstance extends DBSchemalessInstance
{
    BinaryJedis conn;

    final String KEYSEPARATOR = ":";

    public RedisInstance(String ksName, String cfName, int dbIndex)
    {
        engineName = "Redis";
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
        if(pass == null) pass = "redis"; // dummy pass
        String status = conn.auth(pass);
        return status.equals("OK") ? true : false;
    }

    public int insert(String rowKey, ColumnFamily cf)
    {
        return doInsert(makeRowKey(rowKey), cf.toBytes());
    }

    public int update(String rowKey, ColumnFamily newcf)
    {
        return doInsert(makeRowKey(rowKey), newcf.toBytes());
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
        return FAILURE;
    }

    synchronized public int dropTable()
    {
        return FAILURE;
    }

    public synchronized int dropDB()
    {
        conn.flushDB();
        return SUCCESS;
    }

    public synchronized int delete(String rowKey)
    {
        conn.del(makeRowKey(rowKey));
        return SUCCESS;
    }

    private synchronized int doInsert(byte[] rowKey, byte[] cfValue)
    {
        conn.set(rowKey, cfValue);
        return SUCCESS;
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
