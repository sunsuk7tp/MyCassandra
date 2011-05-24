package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.sql.*;

import org.apache.cassandra.db.ColumnFamily;

public interface StorageEngineInterface
{
    int put(String rowKey, ColumnFamily cf, boolean isDelete); /* put cf in a row specified rowKey. if isDelete is true, overwrite*/
    ColumnFamily get(String rowKey); /* get a column family specified rowKey */
    int delete(String rowKey); /* delete a row specified rowKey */
    int truncate(); /* column family (table) truncation*/
}
