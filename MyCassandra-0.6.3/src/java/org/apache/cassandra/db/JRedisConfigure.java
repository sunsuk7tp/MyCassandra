package org.apache.cassandra.db;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.jredis.JRedis;
import org.jredis.ri.alphazero.JRedisClient;

public class JRedisConfigure {
	public JRedis connect() {
		String dbHost = DatabaseDescriptor.getSQLHost();
		int dbPort = new Integer(DatabaseDescriptor.getSQLPort());
		
		return new JRedisClient(dbHost, dbPort, "jredis", 0);
	}
}