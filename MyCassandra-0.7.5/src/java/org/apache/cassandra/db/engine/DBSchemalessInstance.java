package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import java.nio.ByteBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.ColumnFamilySerializer;
import org.apache.cassandra.db.DecoratedKey;

public abstract class DBSchemalessInstance extends DBInstance
{
    public abstract Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults);
    public abstract int truncate();
    public abstract int dropTable();
    public abstract int dropDB();

    public abstract int delete(String rowKey);
    public abstract int insert(String rowKey, ColumnFamily cf);
    public abstract int update(String rowKey, ColumnFamily newcf, ColumnFamily cf);
    public abstract byte[] select(String rowKey);
}
