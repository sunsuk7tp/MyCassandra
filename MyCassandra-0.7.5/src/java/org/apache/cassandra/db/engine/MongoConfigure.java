package org.apache.cassandra.db.engine;

import org.apache.cassandra.config.DatabaseDescriptor;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoURI;

public class MongoConfigure
{
    public DB connect(String dbInstance)
    {
        String dbHost = DatabaseDescriptor.getDBHost();
        int dbPort = new Integer(DatabaseDescriptor.getDBPort());
        try
        {
            Mongo mongo = new Mongo(dbHost, dbPort);
            return mongo.getDB(dbInstance);
        }
        catch (Exception e)
        {
            System.err.println("can't connect MongoDB");
            System.exit(1);
        }
        return null;
    }
}

