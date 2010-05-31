package org.apache.cassandra.db;
import java.sql.*;

public class DBConfigure {
	public Connection connect() {
		String dbHost = "localhost";
		String dbPort = "3306";
		String dbInstance = "cassandra_db";
		String dbUser = "cassandra_user";
		String dbPass = "QRgJVwH5";
		
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
