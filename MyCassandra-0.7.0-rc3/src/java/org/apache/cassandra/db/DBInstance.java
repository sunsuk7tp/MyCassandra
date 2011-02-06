package org.apache.cassandra.db;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.cassandra.io.util.DataInputBuffer;
import org.apache.cassandra.io.util.DataOutputBuffer;
import org.apache.cassandra.db.filter.*;

public abstract class DBInstance implements StorageEngineInterface {

	String ksName, cfName;
	
	public abstract int delete(String table, String columnName, String columnValue) throws SQLException;
	
	public abstract ColumnFamily get(String rowKey, QueryFilter filter) throws SQLException, IOException;

	public abstract int put(String rowKey, ColumnFamily cf) throws SQLException, IOException;
	
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
