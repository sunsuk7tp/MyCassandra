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

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.nio.ByteBuffer;

import org.handlersocket.*;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

public class HSMySQLInstance extends DBSchemafulInstance
{
    HandlerSocket hs;

    private final String PREFIX = "";
    private final String ID = "1";
    private final String KEY = "rkey";
    private final String VALUE = "cf";

    int debug = 0;

    public HSMySQLInstance(String ksName, String cfName)
    {
        this.ksName = ksName;
        this.cfName = PREFIX + cfName;
        setConfiguration();
        try
        {
            hs = new HandlerSocket();
            hs.open(host, port);
            hs.command().openIndex(ID, this.ksName, this.cfName, "PRIMARY", KEY + "," + VALUE);
            hs.execute();
        }
        catch (IOException e)
        {
            errorMsg("can't open hs", e);
        }
    }

    public int insert(String rowKey, ColumnFamily cf)
    {
        try
        {
            return doInsert(rowKey, cf.toBytes());
        }
        catch (IOException e)
        {
            errorMsg("db insertion error", e);
            return -1;
        }
    }

    public int update(String rowKey, ColumnFamily newcf, ColumnFamily cf)
    {
        try
        {
            return doUpdate(rowKey, mergeColumnFamily(cf, newcf));
        }
        catch (IOException e)
        {
            errorMsg("db update error", e);
            return -1;
        }
    }

    public byte[] select(String rowKey)
    {
       try
       {
           hs.command().find(ID, rowKey);
           List<HandlerSocketResult> res = hs.execute();
           return res.isEmpty() ? null : res.get(0).getMessages();
       }
       catch (IOException e)
       {
           errorMsg("db select error", e);
           return null;
       }
    }

    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults)
    {
        return null;
    }

    public synchronized int delete(String rowKey)
    {
        try
        {
            hs.command().findModifyDelete(ID, rowKey, "=", "1", "0");
            List<HandlerSocketResult> Results =  hs.execute();
            return 1;
        }
        catch (IOException e)
        {
            errorMsg("db deletion error", e);
            return -1;
        }
    }

    public synchronized int truncate()
    {
        return -1;
    }

    public synchronized int dropTable()
    {
        return -1;
    }
    
    public synchronized int dropDB()
    {
        return -1;
    }

    public synchronized int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType)
    {
        return 0;
    }

    public int createProcedure(int rowKeySize, int columnFanukySize)
    {
        return 0;
    }

    // Init MySQL Table for Keyspaces
    /*public int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngineType) throws SQLException
    {
        try
        {
            Statement stmt = conn.createStatement();
            
            if(debug > 0)
            {
                stmt.executeUpdate("TRUNCATE TABLE "+table);
            }
            
            ResultSet rs = stmt.executeQuery("SHOW TABLES");
            while(rs.next())
            {
                if(rs.getString(1).equals(table))
                {
                    return 0;
                }
            }
            
            String sPrepareSQL = "CREATE Table "+table + "(" +
                //"`ID` INT NOT NULL AUTO_INCREMENT," + 
                "`` VARCHAR(?) NOT NULL," +
                "`cf` VARBINARY(?)," +
                "PRIMARY KEY (`" + KEY + "`)" +
            ")";// PARTITION BY KEY(`" + KEY + "`);";
            
            PreparedStatement pst = conn.prepareStatement(sPrepareSQL);
            pst.setInt(1,rowKeySize);
            pst.setInt(2,columnFamilySize);
            
            return pst.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println("db connection error "+ e);
            return -1;
        }
    }*/

    private synchronized int doInsert(String rowKey, byte[] cfValue) throws IOException
    {
        hs.command().insert(ID, rowKey, cfValue);
        List<HandlerSocketResult> res = hs.execute();
        return res.get(0).getStatus();
    }

    private synchronized int doUpdate(String rowKey, byte[] cfValue) throws IOException
    {
        hs.command().findModifyUpdate(ID, rowKey, "=", "1", "0", cfValue);
        List<HandlerSocketResult> res = hs.execute();
        return res.get(0).getStatus();
    }
}
