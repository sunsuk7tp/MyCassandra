package org.apache.cassandra.db.engine;

import java.sql.*;

public class MySQLConfigure
{
    public Connection connect(String database, String host, int port, String user, String pass)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://"+host+":"+port+"/"+database+"?useUnicode=true&characterEncoding=UTF8", user, pass);
        }
        catch (ClassNotFoundException e)
        {
            System.err.println("Cannot read JDBC Driver. "+ e);
            System.exit(1);
        }
        catch (SQLException e)
        {
            System.err.println("DB connection Error. [host:" + host + " port: " + port + " user:" + user + "]" + e);
            System.exit(1);
        }
        return null;
    }
}
