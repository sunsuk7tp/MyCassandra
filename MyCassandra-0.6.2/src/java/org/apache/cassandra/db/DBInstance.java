package org.apache.cassandra.db;

import java.io.IOException;
import java.sql.*;

import org.apache.cassandra.db.filter.QueryFilter;

public interface DBInstance {
	
	int insertOrUpdate(String rowKey, ColumnFamily cf) throws SQLException, IOException;
	
	ColumnFamily select(String rowKey, QueryFilter filter) throws SQLException, IOException;
	
	int delete(String table, String columnName, String columnValue) throws SQLException;
}
