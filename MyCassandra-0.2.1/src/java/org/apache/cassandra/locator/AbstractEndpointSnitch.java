/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.apache.cassandra.locator;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractEndpointSnitch implements IEndpointSnitch
{
    private static final Logger logger = LoggerFactory.getLogger(AbstractEndpointSnitch.class);
    
    public abstract List<InetAddress> getSortedListByProximity(InetAddress address, Collection<InetAddress> unsortedAddress);
    public abstract void sortByProximity(InetAddress address, List<InetAddress> addresses);

    // queryType: 1 => write, 2 => read
    public List<InetAddress> sortByStorageType(int queryType, Map<InetAddress, Integer> map)
    {
        switch (queryType) {
            case 1: // write
            return sortByStorageTypeWrite(map);
            case 2: // read
            return sortByStorageTypeRead(map);
            default:
            return (List<InetAddress>)map.keySet();
        }
    }

    public List<InetAddress> sortByStorageTypeWrite(Map<InetAddress, Integer> map) {
        ArrayList entries = new ArrayList(map.entrySet());
        Collections.sort(entries, new Comparator<Object>()
        {
            public int compare(Object o1, Object o2)
            {
                Map.Entry e1 =(Map.Entry)o1;
                Map.Entry e2 =(Map.Entry)o2;
                int s1 = (Integer)e1.getValue();
                int s2 = (Integer)e2.getValue();
                if (s1 < s2) return -1;
                else if (s1 > s2) return 1;
                else return 0;
            }
        });
        return ArrayToAddressList(entries);
    }

    public List<InetAddress> sortByStorageTypeRead(Map<InetAddress, Integer> map) {
        ArrayList entries = new ArrayList(map.entrySet());
        Collections.sort(entries, new Comparator<Object>()
        {
            public int compare(Object o1, Object o2)
            {
                Map.Entry e1 =(Map.Entry)o1;
                Map.Entry e2 =(Map.Entry)o2;
                int s1 = (Integer)e1.getValue();
                int s2 = (Integer)e2.getValue();
                // 1 => Bigtable (write-optimized), not 1 => MySQL, Redis, ...
                if (s1 == 1 && s2 != 1)
                    return -1;
                if (s1 != 1 && s2 == 1)
                    return 1;
                else
                    return 0;
            }
        });
        return ArrayToAddressList(entries);
    }

    public List<InetAddress> ArrayToAddressList(ArrayList entries) {
        List<InetAddress> addresses = new ArrayList<InetAddress>(entries.size());
        for(int i = 0; i < entries.size(); i++)
        {
            Map.Entry me = (Map.Entry) entries.get(i);
            addresses.add((InetAddress)me.getKey());
        }
        return addresses;
    }

    public int compareEndpoints(InetAddress target, InetAddress a1, InetAddress a2)
    {
        return a1.getHostAddress().compareTo(a2.getHostAddress());
    }

    public void gossiperStarting()
    {
        //noop by default
    }
}
