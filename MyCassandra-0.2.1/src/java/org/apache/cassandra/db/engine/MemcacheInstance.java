package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;

public class MemcacheInstance extends DBSchemalessInstance
{
    MemcachedClient cli;

    private static final String KEYSEPARATOR = ":";
    private static final int timeout = 5;

    public MemcacheInstance (String ksName, String cfName)
    {
        super("Memcached", ksName, cfName);

        try {
            cli = new MemcachedClient(new InetSocketAddress(host, port));
        } catch (IOException e) {
            super.errorMsg(String.format("memcached connection failed, %s, %s", host, port), e);
            System.exit(1);
        }
    }

    @Override
    public int insert(String rowKey, ColumnFamily cf)
    {
        return doInsert(makeRowKey(rowKey),cf.toBytes());
    }

    @Override
    public int update(String rowKey, ColumnFamily newcf)
    {
        return doUpdate(makeRowKey(rowKey), newcf.toBytes());
    }

    @Override
    public byte[] select(String rowKey) {
        return (byte[]) cli.get(makeRowKey(rowKey));
    }

    @Override
    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith,
            DecoratedKey stopAt, int maxResults) {
        // RangeSlice is not supported in memcached.
        return null;
    }

    @Override
    public int truncate() {
        // not implemented
        return 0;
    }

    @Override
    public int dropTable() {
        // not implemented
        return 0;
    }

    @Override
    public int dropDB() {
    	// not implemented
        return 0;
    }

    @Override
    public int delete(String rowKey) {
        return doDelete(makeRowKey(rowKey));
    }

    synchronized private int doUpdate(String rowKey, byte[] cfValue)
    {
        OperationFuture<Boolean> f = cli.replace(rowKey, -1, cfValue);
        try
        {
            boolean isUpdate = f.get(timeout, TimeUnit.SECONDS);
            return isUpdate ? 1 : -1;
        }
        catch (Exception e)
        {
            f.cancel(false);
            return -1;
        }
    }

    synchronized private int doInsert(String rowKey,  byte[] cfValue)
    {
        OperationFuture<Boolean> f = cli.add(rowKey, -1, cfValue);
        try
        {
            boolean isInsert = f.get(timeout, TimeUnit.SECONDS);
            return isInsert ? 1 : -1;
        }
        catch (Exception e)
        {
            f.cancel(false);
            return -1;
        }
    }

    synchronized private int doDelete(String rowKey)
    {
        OperationFuture<Boolean> f = cli.delete(rowKey);
        try
        {
            boolean isDelete = f.get(timeout, TimeUnit.SECONDS);
            return isDelete ? 1 : -1;
        }
        catch (Exception e)
        {
            f.cancel(false);
            return -1;
        }
    }

    private String makeRowKey(String rowKey)
    {
        return ksName + KEYSEPARATOR + cfName + KEYSEPARATOR + rowKey;
    }
}
