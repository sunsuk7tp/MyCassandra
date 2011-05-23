package org.apache.cassandra.db.engine;
import java.sql.*;

import org.apache.cassandra.config.DatabaseDescriptor;

public class MySQLConfigure
{
    public Connection connect(String dbInstance)
    {
        String dbHost = DatabaseDescriptor.getDBHost() != null ? DatabaseDescriptor.getDBHost() : "localhost";
        String dbPort = DatabaseDescriptor.getDBPort() != null ? DatabaseDescriptor.getDBPort() : "3306";
        String dbUser = DatabaseDescriptor.getDBUser() != null ? DatabaseDescriptor.getDBUser() : "root";
        String dbPass = DatabaseDescriptor.getDBPass();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbInstance+"?useUnicode=true&characterEncoding=UTF8", dbUser, dbPass);
        }
        catch (ClassNotFoundException e)
        {
            System.err.println("Cannot read JDBC Driver. "+ e);
            System.exit(1);
        }
        catch (SQLException e)
        {
            System.err.println("DB connection Error. "+ e);
            System.exit(1);
        }
        return null;
    }
}