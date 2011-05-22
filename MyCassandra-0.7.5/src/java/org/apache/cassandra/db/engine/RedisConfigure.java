package org.apache.cassandra.db.engine;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.jredis.JRedis;
import org.jredis.ri.alphazero.JRedisClient;

public class RedisConfigure
{
    public JRedis connect()
    {
        String dbHost = DatabaseDescriptor.getDBHost();
        int dbPort = new Integer(DatabaseDescriptor.getDBPort());
        
        return new JRedisClient(dbHost, dbPort, "jredis", 0);
    }
}