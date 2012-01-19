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

import java.util.Map;
import java.nio.ByteBuffer;

import org.apache.cassandra.db.DecoratedKey;
import org.apache.cassandra.db.ColumnFamily;

/**
 * Storage Engine operations for MyCassandra.
 * MyCassandra calls Keyspace Database or db and ColumnFamily Table after MySQL.
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
