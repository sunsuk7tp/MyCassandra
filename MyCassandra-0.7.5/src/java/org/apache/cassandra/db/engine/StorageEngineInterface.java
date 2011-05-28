package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

public interface StorageEngineInterface
{
    public int put(String rowKey, ColumnFamily cf, boolean isDelete); /* put cf in a row specified rowKey. if isDelete is true, overwrite*/
    public ColumnFamily get(String rowKey); /* get a column family specified rowKey */
    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults); /* range query: from startWith to stopAt limit maxResults*/
    public int delete(String rowKey); /* delete a row specified rowKey */
    public int truncate(); /* column family (table) truncation*/
}
