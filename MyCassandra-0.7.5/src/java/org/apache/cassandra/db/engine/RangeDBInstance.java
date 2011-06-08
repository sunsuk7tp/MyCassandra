package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.config.EngineInfo;
import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.ColumnFamilySerializer;
import org.apache.cassandra.db.DecoratedKey;

public abstract class RangeDBInstance implements StorageEngine
{
    private static final Logger logger = LoggerFactory.getLogger(RangeDBInstance.class);
    String ksName;
    String cfName;

    // default configuration
    String host = "localhost";
    int port;
    String user;
    String pass;

    public int put(DecoratedKey key, ColumnFamily cf)
    {
        String rowKey = key.getTxtKey();
        if (cf.isMarkedForDelete())
        {
            return delete(rowKey);
        }
        else
        {
            Set<ByteBuffer> cNames = cf.getRemovedColumnNames();
            ColumnFamily cfOld = get(rowKey);
            String token = key.getTokenString();
            if (cNames != null && !cNames.isEmpty())
            {
                for (Object cName : cNames.toArray())
                {
                    cfOld.remove((ByteBuffer) cName);
                }
                return insert(rowKey, token, cfOld);
            }
            else
            {
                return cfOld != null ? update(rowKey, cfOld, cf) : insert(rowKey, token, cf);
            }
        }
    }

    public ColumnFamily get(DecoratedKey key)
    {
        return get(key.getTxtKey());
    }

    public ColumnFamily get(String key)
    {
        try
        {
            return bytes2ColumnFamily(select(key));
        }
        catch (IOException e)
        {
            errorMsg("db get error", e);
            return null;
        }
    }

    public abstract Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults);
    public abstract int truncate();
    public abstract int dropTable();
    public abstract int dropDB();

    public abstract int delete(String rowKey);
    public abstract int insert(String rowKey, String token, ColumnFamily cf);
    public abstract int update(String rowKey, ColumnFamily newcf, ColumnFamily cf);
    public abstract byte[] select(String rowKey);

    public byte[] mergeColumnFamily(ColumnFamily cf, ColumnFamily newcf)
    {
        cf.addAll(newcf);
        return cf.toBytes();
    }

    public ColumnFamily bytes2ColumnFamily(byte[] b) throws IOException
    {
        return b != null ? new ColumnFamilySerializer().deserialize(new DataInputBuffer(b, 0, b.length)) : null;
    }

    public void setConfiguration()
    {
        EngineInfo einfo = DatabaseDescriptor.getEngineInfo();
        if (einfo.host != null)
            host = einfo.host;
        if (einfo.port > 0)
            port = einfo.port;
        if (einfo.user != null)
            user = einfo.user;
        if (einfo.pass != null)
            pass = einfo.pass;
    }

    public void errorMsg(String msg, Exception e)
    {
        logger.info("[MyCassandra (" + " Keyspace:" + ksName + "/ CF: " + cfName + ")] " + msg + ": " + e);
    }
}
