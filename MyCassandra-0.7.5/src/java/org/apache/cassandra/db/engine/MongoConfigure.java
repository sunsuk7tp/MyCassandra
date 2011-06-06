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
    public DB connect(String dbName, String host, int port, String user, String pass)
    {
        try
        {
            Mongo mongo = new Mongo(host, port);
            DB db = mongo.getDB(dbName);
            if (user != null && pass != null)
                if (!db.authenticate(user, pass.toCharArray()))
                    throw new Exception("authentication error!!");
            return db;
        }
        catch (Exception e)
        {
            System.err.println("can't connect MongoDB [host: " + host + " port:" + port + " user:" + user + "]");
            System.exit(1);
        }
        return null;
    }
}

