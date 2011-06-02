package org.apache.cassandra.db.engine;

import java.io.IOException;

public class EngineMeta
{
    public static final int BIGTABLE = 1;
    public static final int REDIS = 2;
    public static final int MYSQL = 3;
    public static final int HSMYSQL = 4;
    public static final int MONGODB = 5;

    private int storageType = MYSQL;

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

    public boolean isMySQL()
    {
        return storageType == MYSQL ? true : false;
    }
}
