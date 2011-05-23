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
        String dbUser = DatabaseDescriptor.getDBUser();
        String dbPass = DatabaseDescriptor.getDBPass();
        try
        {
            Mongo mongo = new Mongo(dbHost, dbPort);
            DB db = mongo.getDB(dbInstance);
            if (dbUser != null && dbPass != null)
                if (!db.authenticate(dbUser, dbPass.toCharArray()))
                    throws new Exception("authentication error!!");
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

