/*                                                                                                                                                                                 
 * Copyright 2011 Shunsuke Nakamura, and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
            System.err.println("Cannot load JDBC Driver. "+ e);
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
