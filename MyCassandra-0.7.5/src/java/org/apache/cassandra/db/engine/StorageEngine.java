package org.apache.cassandra.db.engine;

import java.util.Map;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.DecoratedKey;
import org.apache.cassandra.db.ColumnFamily;

/**
 * Storage Engine operations for MyCassandra.
 * MyCassandra calls Keyspace Database or Db and ColumnFamily Table after MySQL.
 */
public interface StorageEngine
{
    /** 
     * Puts cf in a row specified by a key. 
     * Includes INSERT, UPDATE and DELETE operations to a row.
     * With DELETE, cf.isMarkedForDelte() is true or cf.getRemovedColumnNames() is not null.
     * 
     * @param key a row key
     * @param cf a ColumnFamily value
     */
    public int put(DecoratedKey key, ColumnFamily cf);

    /** 
     * Gets a column family specified by a key
     * 
     * @param key a row key
     */
    public ColumnFamily get(DecoratedKey key);

    /** 
     * Range query from startWith to stopAt limit maxResults.
     * 
     * @param startWith range start key
     * @param stopAt range end key (This key is not included)
     */
    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults); 

    /** 
     * Truncate table.
     */
    public int truncate();

    /**
     * Drop tables.
     */
    public int dropTable();

    /**
     * Drop database.
     */
    public int dropDB();
}
