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

import com.mongodb.DB;
import com.mongodb.Mongo;

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
