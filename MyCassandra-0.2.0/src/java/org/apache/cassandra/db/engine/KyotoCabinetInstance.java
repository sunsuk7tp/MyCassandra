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

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.HashMap;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;

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

    public KyotoCabinetInstance(String ksName, String cfName)
    {
        engineName = "KyotoCabinet";
        this.ksName = ksName;
        this.cfName = cfName;

        setConfiguration();

        db = new DB();
        String dbClass = DatabaseDescriptor.getStorageDBClass(engineName);
        dbFormat = getFileFormatForDBClass(dbClass);
        String dbFile = DatabaseDescriptor.getStoragePath(engineName) + "/" + this.ksName + "-" + this.cfName + "." + dbFormat;
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
    public int update(String rowKey, ColumnFamily newcf)
    {
        return doUpdate(makeRowKey(rowKey), newcf.toBytes());
    }
    
    @Override
    public int insert(String rowKey, ColumnFamily cf)
    {
        return doInsert(makeRowKey(rowKey), cf.toBytes());
    }

    @Override
    public byte[] select(String rowKey)
    {
        return db.get(makeRowKey(rowKey));
    }
    
    @Override
    public synchronized int delete(String rowKey)
    {
        return db.remove(makeRowKey(rowKey)) ? 1 : -1;
    }

    @Override
    public int dropDB() {
        return -1;
    }

    @Override
    public int dropTable() {
        return db.clear() ? 1 : -1;
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
        return db.append(rowKey, cfValue) ? 1 : -1;
    }
    
    private synchronized int doUpdate(byte[] rowKey, byte[] cfValue)
    {
        return db.replace(rowKey, cfValue) ? 1 : -1;
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
