package org.apache.cassandra.db.engine;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.jredis.JRedis;
import org.jredis.ri.alphazero.JRedisClient;
public class RedisConfigure
{
    public JRedis connect(int dbIndex)
    {
        String dbHost = DatabaseDescriptor.getDBHost();
        int dbPort = new Integer(DatabaseDescriptor.getDBPort());
        String dbPass = DatabaseDescriptor.getDBPass();

        return new JRedisClient(dbHost, dbPort, dbPass, dbIndex);
    }
}