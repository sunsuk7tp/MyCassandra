package org.apache.cassandra.db;
import java.sql.*;

import org.apache.cassandra.config.DatabaseDescriptor;

public class MySQLConfigure {
	public Connection connect(String dbInstance) {
		String dbHost = DatabaseDescriptor.getSQLHost();
		String dbPort = DatabaseDescriptor.getSQLPort();
		String dbUser = DatabaseDescriptor.getSQLUser();
		String dbPass = DatabaseDescriptor.getSQLPass();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(
				"jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbInstance, dbUser, dbPass);
		} catch (ClassNotFoundException e) {
			System.err.println("Cannot read JDBC Driver. "+ e);
		} catch (SQLException e) {
			System.err.println("DB connection Error. "+ e);
		}
		
		return null;
	}
}
