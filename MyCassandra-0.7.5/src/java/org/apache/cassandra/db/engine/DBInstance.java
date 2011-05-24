package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.nio.ByteBuffer;

import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.ColumnFamilySerializer;

public abstract class DBInstance implements StorageEngineInterface
{
    String ksName, cfName;


    public int put(String rowKey, ColumnFamily cf, boolean isDelete)
    {
        ColumnFamily oldcf = isDelete ? null : get(rowKey);
        return oldcf != null ? update(rowKey, cf, oldcf) : insert(rowKey, cf);
    }

    public ColumnFamily get(String rowKey)
    {
        try
        {
            return bytes2ColumnFamily(select(rowKey));
        }
        catch (IOException e)
        {
            System.err.println("[MyCassandra] db get error: " + e);
            return null;
        }
    }

    public abstract Map<ByteBuffer, ColumnFamily> getRangeSlice(String startWith, String stopAt, int maxResults);
    
    public abstract int delete(String rowKey);
    public abstract int truncate();
    public abstract int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType);
    public abstract int createProcedure(int rowKeySize, int columnFamilySize);
    public abstract int insert(String rowKey, ColumnFamily cf);
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
}
