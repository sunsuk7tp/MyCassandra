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
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.HashMap;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;
import org.apache.cassandra.io.util.FileUtils;

import kyotocabinet.*;

public class KyotoCabinetInstance extends DBSchemalessInstance {

    DB db;
    String defaultDBFormat = "kch";
    String dbFormat;
    Map<String, String> dbClassFormatMap = new HashMap() {
        {
            put("ProtoHashDB", "kcph");
            put("ProtoTreeDB", "kcpt");
            put("StashDB", "kcs");
            put("CacheDB", "kcc");
            put("GrassDB", "kcg");
            put("HashDB", "kch");
            put("TreeDB", "kct");
            put("DirDB", "kcd");
            put("ForestDB", "kcf");
        }
    };

    final String KEYSEPARATOR = ":";

    public KyotoCabinetInstance(String ksName, String cfName, String dbClass)
    {
        setup(ksName, cfName, dbClass);
    }

    public KyotoCabinetInstance(String ksName, String cfName)
    {
        setup(ksName, cfName, null);
    }

    private void setup(String ksName, String cfName, String dbClass)
    {
        engineName = "KyotoCabinet";
        this.ksName = ksName;
        this.cfName = cfName;
        setConfiguration();

        db = new DB();
        dbFormat = dbClass != null ? getFileFormatForDBClass(dbClass) : getFileFormatForDBClass(this.kcclass);
        try {
            FileUtils.createDirectory(kcdir);
        } catch (IOException e) {
            System.err.println("DB connection error" + db.error());
            System.exit(1);
        }
        String dbFile = kcdir + "/" + this.ksName + "-" + this.cfName + "." + dbFormat;
        if(!db.open(dbFile, DB.OWRITER | DB.OCREATE | DB.OTRYLOCK))
        {
            System.err.println("DB connection Error: " + db.error());
            System.exit(1);
        }
    }

    private String getFileFormatForDBClass(String dbClass)
    {
        return dbClassFormatMap.containsKey(dbClass) ? dbClassFormatMap.get(dbClass) : defaultDBFormat;
    }

    @Override
    public int update(byte[] rowKey, ColumnFamily newcf)
    {
        return doUpdate(rowKey, newcf.toBytes());
    }
    
    @Override
    public int insert(byte[] rowKey, ColumnFamily cf)
    {
        return doInsert(rowKey, cf.toBytes());
    }

    @Override
    public byte[] select(byte[] rowKey)
    {
        return db.get(rowKey);
    }
    
    @Override
    public synchronized int delete(byte[] rowKey)
    {
        return db.remove(rowKey) ? SUCCESS : FAILURE;
    }

    @Override
    public int dropDB() {
        return FAILURE;
    }

    @Override
    public int dropTable() {
        return db.clear() ? SUCCESS : FAILURE;
    }

    @Override
    public Map<ByteBuffer, ColumnFamily> getRangeSlice(DecoratedKey startWith,
            DecoratedKey stopAt, int maxResults) {
        return null;
    }

    @Override
    public int truncate() {
        return dropTable();
    }
    
    private synchronized int doInsert(byte[] rowKey, byte[] cfValue)
    {
        return db.append(rowKey, cfValue) ? SUCCESS : FAILURE;
    }
    
    private synchronized int doUpdate(byte[] rowKey, byte[] cfValue)
    {
        return db.replace(rowKey, cfValue) ? SUCCESS : FAILURE;
    }

    public byte[] makeRowKey(String rowKey)
    {
        try
        {
            return rowKey.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
            errorMsg("makeRowKey encoding error", e);
            return null;
        }
    }
}
