package org.apache.cassandra.db.engine;

import java.io.IOException;
import java.sql.*;

import org.apache.cassandra.db.ColumnFamily;

public interface StorageEngineInterface
{
    int put(String rowKey, ColumnFamily cf, boolean isDelete) throws SQLException, IOException;

    ColumnFamily get(String rowKey) throws SQLException, IOException;

    int delete(String rowKey) throws SQLException;
}
