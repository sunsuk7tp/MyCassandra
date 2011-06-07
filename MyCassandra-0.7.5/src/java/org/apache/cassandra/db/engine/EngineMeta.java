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
    // mysql default setting
    public static final int defaultRowKeySize = 64;
    public static final int defaultColumnFamilySize = 30 * 1024;
    public static final String defaultColumnFamilyType = BINARY;
    public static final String defaultStorageEngine = "InnoDB";
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
    public static StorageEngine getEngine(int storageType, String tableName, String cfName, int maxKeySize, int maxCFSize, String storageSize, String storageEngine, boolean isLong)
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
                if(isLong) dbi.create(maxKeySize, maxCFSize, BLOB, "MyISAM");
                else dbi.create(maxKeySize, maxCFSize, storageSize, storageEngine);
                dbi.createProcedure(maxKeySize, maxCFSize);
                engine = dbi;
                break;
            case RANGEMYSQL:
                RangeMySQLInstance rdbi = new RangeMySQLInstance(tableName, cfName);
                if(isLong) rdbi.create(maxKeySize, maxCFSize, BLOB, "MyISAM");
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
