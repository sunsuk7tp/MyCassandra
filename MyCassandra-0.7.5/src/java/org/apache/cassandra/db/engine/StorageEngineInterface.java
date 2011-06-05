package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

public interface StorageEngineInterface
{
    /* 
     * put cf in a row specified rowKey. 
     * This method include insert, update and delete to a rowKey
     * */
    public int put(DecoratedKey key, ColumnFamily cf);
    /* 
     * get a column family specified rowKey
     * */
    public ColumnFamily get(DecoratedKey key);
    /* 
     * range query: from startWith to stopAt limit maxResults.
     * */
    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults); 
    /* 
     * truncate table.
     * */
    public int truncate();
    /*
    * drop table.
    * */
    public int dropTable();
    /*
     * drop database.
    * */
    public int dropDB();
}
