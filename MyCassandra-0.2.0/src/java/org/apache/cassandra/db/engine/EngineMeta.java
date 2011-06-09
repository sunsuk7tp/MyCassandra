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

    // label name specified in cassandra.yaml 
    public static final String[] storageLabels = {"Bigtable", "Redis", "MySQL", "RANGEMySQL", "HSMySQL", "MongoDB"};
    public static final Map<Integer, EngineInfo> enginesInfo = new HashMap<Integer, EngineInfo>(storageLabels.length);
    
    // schema used se number
    public static final int[] schemaUsedTypes = {MYSQL, RANGEMYSQL};

    // for mysql's column family data type params
    public static final String BINARY = "VARBINARY";
    public static final String BLOB = "LONGBLOB";

    // schema default setting
    public static final int defaultRowKeySize = 64;
    public static final int defaultColumnFamilySize = 30 * 1024;
    public static final String defaultColumnFamilyType = BINARY;
    public static final String defaultMySQLEngine = "InnoDB";
    public static final String SYSTEM_MYSQL_ENGINE = "MyISAM";

    // se number
    private int storageType;

    public void setStorageType(int storageType)
    {
        this.storageType = storageType;
    }

    public int getStorageType()
    {
        return storageType;
    }

    public int getStorageType(String label)
    {
        for (int i = 0; i < storageLabels.length; i++)
            if (label.equals(storageLabels[i]))
                return i+1;
        return -1;
    }

    public boolean isBigtable()
    {
        return storageType == BIGTABLE ? true : false;
    }

    // schema used storage engine (MySQL, PostgreSQL, ...)
    public boolean isSchemaUsed()
    {
        for (int schemaUsedType : schemaUsedTypes)
            if (storageType == schemaUsedType) return true;
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

    // init setup and return the instance specified in storageType
    public static StorageEngine getEngine(int storageType, String tableName, String cfName, int maxKeySize, int maxCFSize, String storageSize, String storageEngine, boolean isSystem)
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
                else dbi.create(maxKeySize, maxCFSize, storageSize, storageEngine);
                dbi.createProcedure(maxKeySize, maxCFSize);
                engine = dbi;
                break;
            case RANGEMYSQL:
                RangeMySQLInstance rdbi = new RangeMySQLInstance(tableName, cfName);
                if(isSystem) rdbi.create(maxKeySize, maxCFSize, BLOB, SYSTEM_MYSQL_ENGINE);
                else rdbi.create(maxKeySize, maxCFSize, storageSize, storageEngine);
                rdbi.createProcedure(maxKeySize, maxCFSize);
                engine = rdbi;
                break;
            case MONGODB:
                engine = new MongoInstance(tableName, cfName);
                break;
            case HSMYSQL:
                engine = new HSMySQLInstance(tableName, cfName);
                break;
        }
        return engine;
    }
}
