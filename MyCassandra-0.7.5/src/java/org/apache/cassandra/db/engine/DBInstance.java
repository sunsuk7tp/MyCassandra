package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.ColumnFamilySerializer;

public abstract class DBInstance implements StorageEngineInterface
{
    String ksName, cfName;

    public ColumnFamily get(String rowKey) throws SQLException, IOException
    {
        try
        {
            return bytes2ColumnFamily(select(rowKey));
        }
        catch (SQLException e)
        {
            System.err.println("db get error "+ e);
            return null;
        }
    }

    public int put(String rowKey, ColumnFamily cf, boolean isDelete) throws SQLException, IOException
    {
        ColumnFamily oldcf = isDelete ? null : get(rowKey);
        return oldcf != null ? update(rowKey, cf, oldcf) : insert(rowKey, cf);
    }

    public abstract int delete(String rowKey) throws SQLException;
    public abstract int truncate();
    public abstract int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType);
    public abstract int createProcedure(int rowKeySize, int columnFamilySize);
    public abstract int insert(String rowKey, ColumnFamily cf) throws SQLException, IOException;
    public abstract int update(String rowKey, ColumnFamily newcf, ColumnFamily cf) throws SQLException, IOException;
    public abstract byte[] select(String rowKey) throws SQLException, IOException;

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
