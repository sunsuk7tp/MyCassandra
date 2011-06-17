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
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.nio.ByteBuffer;

import com.g414.haildb.*;
import com.g414.haildb.ColumnType;
import com.g414.haildb.Database;
import com.g414.haildb.TableBuilder;
import com.g414.haildb.Transaction;
import com.g414.haildb.Transaction.TransactionLevel;
import com.g414.haildb.Transaction.TransactionState;
import com.g414.haildb.tpl.DatabaseTemplate;
import com.g414.haildb.tpl.DatabaseTemplate.TransactionCallback;

import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

public class HailDBInstance extends DBSchemafulInstance
{
    private Database db;
    private DatabaseTemplate dt;
    private TableDef tdef;
    
    private final String PREFIX = "_";
    private final String KEY = "rkey";
    private final String VALUE = "cf";
    private final String SEPARATOR = "/";

    private final String SYSTEM = "system";

    private final String VARBINARY = "VARBINARY";
    private final String MEDIUMBLOB = "MEDIUMBLOB";
    private final String LONGBLOB = "LONGBLOB";

    public HailDBInstance(String ksName, String cfName)
    {
        engineName = "HailDB";
        this.ksName = ksName;
        this.cfName = PREFIX + cfName;

        setConfiguration();

        DatabaseConfiguration config = new DatabaseConfiguration();
        config.setDataHomeDir(dir + "/");
        db = new Database(config);
        dt = new DatabaseTemplate(db);
        createDB();
    }

    public int createProcedure(int rowKeySize, int columnFamilySize)
    {
        return -1;
    }
    
    public int insert(final String rowKey, final ColumnFamily cf)
    {
        try
        {
            dt.inTransaction(TransactionLevel.REPEATABLE_READ,
                new TransactionCallback<Void>()
                {
                    @Override
                    public Void inTransaction(Transaction txn)
                    {
                        Map<String, Object> map = new LinkedHashMap<String, Object>();
                        map.put(rowKey, cf.toBytes());
                        dt.insert(txn, tdef, map);

                        return null;
                    }
                }
            );
            return 1;
        }
        catch (Exception e)
        {
            return -1;
        }
    }

    public int update(final String rowKey, final ColumnFamily newcf)
    {
        try
        {
            dt.inTransaction(TransactionLevel.REPEATABLE_READ,
                new TransactionCallback<Void>()
                {
                    @Override
                    public Void inTransaction(Transaction txn)
                    {
                        Map<String, Object> map = new LinkedHashMap<String, Object>();
                        map.put(rowKey, newcf.toBytes());
                        dt.update(txn, tdef, map);

                        return null;
                    }
                 }
            );
            return 1;
        }
        catch (Exception e)
        {
            return -1;
        }
    }

    public byte[] select(final String rowKey)
    {
        final byte[] res;
        Transaction txn = db.beginTransaction(TransactionLevel.REPEATABLE_READ);
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put(rowKey, 0L);
        Map<String, Object> resMap = dt.load(txn, tdef, map);
        txn.commit();
        return resMap.containsKey(rowKey) ? (byte[])resMap.get(rowKey) : null;
        /*dt.inTransaction(TransactionLevel.REPEATABLE_READ,
            new TransactionCallback<Void>()
            {
                @Override
                public Void inTransaction(Transaction txn)
                {
                    Map<String, Object> map = new LinkedHashMap<String, Object>();
                    map.put(rowKey, 0L);
                    Map<String, Object> resMap = dt.load(txn, tdef, map);

                    res = (byte[])resMap.get(rowKey);
                    return null;
                }
            }
        );*/
    }

    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith, DecoratedKey stopAt, int maxResults)
    {
        return null;
    }

    public int delete(final String rowKey)
    {
        try {
            dt.inTransaction(TransactionLevel.REPEATABLE_READ,
                new TransactionCallback<Void>()
                {
                    @Override
                    public Void inTransaction(Transaction txn)
                    {
                        Map<String, Object> map = new LinkedHashMap<String, Object>();
                        map.put(rowKey, 0L);
                        dt.delete(txn, tdef, map);

                        return null;
                    }
                }
            );
            return 1;
        }
        catch (Exception e)
        {
            return -1;
        }
    }

    public synchronized int truncate()
    {
        db.truncateTable(tdef);
        return 1;
    }

    public synchronized int dropTable()
    {
        db.dropTable(tdef);
        return 1;
    }

    public synchronized int dropDB()
    {
        db.dropDatabase(ksName);
        return 1;
    }

    public synchronized int createDB()
    {
        db.createDatabase(ksName);
        return 1;
    }

    private void setup(int rowKeySize, int columnFamilySize, String columnFamilyType)
    {
        TableBuilder tb = new TableBuilder(ksName + SEPARATOR + cfName);
        tb.addColumn(KEY, ColumnType.VARCHAR, rowKeySize);
        if (columnFamilyType.equals(VARBINARY) && columnFamilySize < 64*1024-1)
        {
            tb.addColumn(VALUE, ColumnType.VARBINARY, columnFamilySize);
        }
        else
        {
            tb.addColumn(VALUE, ColumnType.BLOB, columnFamilySize);
        }
        tb.addIndex("PRIMARY", KEY, 0, true, true);
        tdef = tb.build();
    }

    // Init MySQL Table for Keyspaces
    public synchronized int create(int rowKeySize, int columnFamilySize, String columnFamilyType, String storageEngine)
    {
        setup(rowKeySize, columnFamilySize, columnFamilyType);
        if(!db.tableExists(tdef))
        {
            db.createTable(tdef);
            return 1;
        }
        else return -1;
    }
}
