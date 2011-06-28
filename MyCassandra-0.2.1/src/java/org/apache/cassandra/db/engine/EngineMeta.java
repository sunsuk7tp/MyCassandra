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

import org.apache.cassandra.config.EngineInfo;

import java.util.Map;
import java.util.HashMap;

public class EngineMeta
{
    // A write-optimize SE is a smaller number, and a read-optimized SE is a bigger number.
    public static final int BIGTABLE = 1;
    public static final int REDIS = 2;
    public static final int MYSQL = 3;
    public static final int RANGEMYSQL = 4;
    public static final int HSMYSQL = 5;
    public static final int MONGODB = 6;
    public static final int KYOTOCABINET = 7;

    // label name specified in cassandra.yaml 
    public static final String[] storageLabels = {"Bigtable", "Redis", "MySQL", "RangeMySQL", "HSMySQL", "MongoDB", "KyotoCabinet"};
    public static final Map<Integer, EngineInfo> enginesInfo = new HashMap<Integer, EngineInfo>(storageLabels.length);

    public static Map<String, Integer> engineKSMap = new HashMap<String, Integer>();
    
    // schema used se number
    public static final int[] schemaUsedTypes = {MYSQL, RANGEMYSQL, HSMYSQL};
    public static final int[] needSetupTypes = {KYOTOCABINET};

    // for mysql's column family data type params
    public static final String BINARY = "VARBINARY";
    public static final String BLOB = "LONGBLOB";

    // schema default setting
    public static final int defaultRowKeySize = 64;
    public static final int defaultColumnFamilySize = 30 * 1024;
    public static final String defaultColumnFamilyType = BINARY;

    // mysql
    public static final String defaultMySQLEngine = "InnoDB";
    public static final String SYSTEM_MYSQL_ENGINE = "MyISAM";

    // kyoto cabinet
    public static final String defaultKCDBClass = "HashDB";

    // default se type (SystemTable and not specified Keyspace)
    private int defaultStorageType;

    // se map
    public static final Map<String, Integer> storageKSMap = new HashMap<String, Integer>();

    public void setStorageType(int storageType)
    {
        this.defaultStorageType = storageType;
    }

    public int getStorageType()
    {
        return defaultStorageType;
    }

    public int getStorageType(String label)
    {
        if (label == null) return defaultStorageType;
        for (int i = 0; i < storageLabels.length; i++)
            if (label.equals(storageLabels[i]))
                return i+1;
        return defaultStorageType;
    }

    public static String getStorageLabel(int storageType)
    {
        return storageType <= 0 || storageType > storageLabels.length ? storageLabels[defaultStorageType - 1] : storageLabels[storageType - 1];
    }

    public String getStorageLabel()
    {
        return getStorageLabel(defaultStorageType);
    }

    public EngineInfo getEngineInfo(int storageType)
    {
        return storageType > 0 ? enginesInfo.get(storageType) : enginesInfo.get(this.defaultStorageType);
    }

    public boolean isBigtable()
    {
        return isBigtable(null);
    }

    public boolean isBigtable(String ksName)
    {
        return getStorageTypeForKS(ksName) == BIGTABLE ? true : false;
    }

    // schema used storage engine (MySQL, PostgreSQL, ...)
    public boolean isSchemaUsed()
    {
        return isSchemaUsed(null);
    }

    public boolean isSchemaUsed(String ksName)
    {
        int storageType = getStorageTypeForKS(ksName);
        for (int schemaUsedType : schemaUsedTypes)
            if (storageType == schemaUsedType) return true;
        return false;
    }

    public boolean isNeedSetup(String ksName)
    {
        int storageType = getStorageTypeForKS(ksName);
        for (int needSetupType : needSetupTypes)
            if (storageType == needSetupType) return true;
        return false;
    }

    public static EngineMeta getEngineMeta(String label)
    {
        EngineMeta emeta = new EngineMeta();
        for (int i = 0; i < storageLabels.length; i++)
            if (label.equals(storageLabels[i]))
            {
                emeta.setStorageType(i+1);
                return emeta;
            }
        return emeta;
    }

    public void setStorageTypeForKS(String ksName, String label)
    {
        int storageType = getStorageType(label);
        if (storageType > 0)
            storageKSMap.put(ksName, storageType);
        //else
            // throw new ConfigurationException("Wrong storage engine name");
    }

    public int getStorageTypeForKS(String ksName)
    {
        if(ksName == null)
            return getStorageType();
        return storageKSMap.containsKey(ksName) ? storageKSMap.get(ksName) : getStorageType();
       
    }

    // init setup and return the instance specified in storageType
    public static StorageEngine getEngine(int storageType, String tableName, String cfName, int maxKeySize, int maxCFSize, String storageSize, String mysqlEngine, String kcDBClass, boolean isSystem)
    {
        StorageEngine engine = null;
        switch (storageType)
        {
            case BIGTABLE:
                break;
            case REDIS:
                engine = new RedisInstance(tableName, cfName);
                break;
            case MYSQL:
            default:
                DBSchemafulInstance dbi = new MySQLInstance(tableName, cfName);
                if(isSystem) dbi.create(maxKeySize, maxCFSize, BLOB, SYSTEM_MYSQL_ENGINE);
                else dbi.create(maxKeySize, maxCFSize, storageSize, mysqlEngine);
                dbi.createProcedure(maxKeySize, maxCFSize);
                engine = dbi;
                break;
            case RANGEMYSQL:
                RangeMySQLInstance rdbi = new RangeMySQLInstance(tableName, cfName);
                if(isSystem) rdbi.create(maxKeySize, maxCFSize, BLOB, SYSTEM_MYSQL_ENGINE);
                else rdbi.create(maxKeySize, maxCFSize, storageSize, mysqlEngine);
                rdbi.createProcedure(maxKeySize, maxCFSize);
                engine = rdbi;
                break;
            case HSMYSQL:
                DBSchemafulInstance hdbi = new HSMySQLInstance(tableName, cfName);
                if(isSystem) hdbi.create(maxKeySize, maxCFSize, BLOB, SYSTEM_MYSQL_ENGINE);
                else hdbi.create(maxKeySize, maxCFSize, storageSize, mysqlEngine);
                hdbi.createProcedure(maxKeySize, maxCFSize);
                engine = hdbi;
                break;
            case MONGODB:
                engine = new MongoInstance(tableName, cfName);
                break;
            case KYOTOCABINET:
                engine = kcDBClass != null 
                                   ? new KyotoCabinetInstance(tableName, cfName, kcDBClass)
                                   : new KyotoCabinetInstance(tableName, cfName);
                break;
        }

        return engine;
    }
}
