package org.apache.cassandra.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.cassandra.config.DatabaseDescriptor;

public class RedisConfigure {
	public Connection connect() {
		String dbHost = DatabaseDescriptor.getSQLHost();
		String dbPort = DatabaseDescriptor.getSQLPort();
		
		try {
			Class.forName("br.com.svvs.jdbc.redis.RedisDriver");
			return DriverManager.getConnection("jdbc:redis://"+dbHost+":"+dbPort+"/0");
		} catch (ClassNotFoundException e) {
			System.err.println("Cannot read JDBC Driver. "+ e);
		} catch (SQLException e) {
			System.err.println("DB connection Error. "+ e);
		}
		
		return null;
	}
}