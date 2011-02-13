package org.apache.cassandra.locator;
/*
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 */


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

/**
 * An endpoint snitch tells Cassandra information about network topology that it can use to route
 * requests more efficiently (with "sortByProximity").  Of the abstract methods, isOnSameRack
 * and isInSameDataCenter are always required; getLocation is only used by DatacenterShardStrategy.
 */
public abstract class AbstractEndpointSnitch implements IEndPointSnitch
{
    /**
     * Determines if 2 nodes are in the same rack in the data center.
     * @param host a specified endpoint
     * @param host2 another specified endpoint
     * @return true if on the same rack false otherwise
     * @throws UnknownHostException
     */
    abstract public boolean isOnSameRack(InetAddress host, InetAddress host2) throws UnknownHostException;

    /**
     * Determines if 2 nodes are in the same data center.
     * @param host a specified endpoint
     * @param host2 another specified endpoint
     * @return true if in the same data center false otherwise
     * @throws UnknownHostException
     */
    abstract public boolean isInSameDataCenter(InetAddress host, InetAddress host2) throws UnknownHostException;

    /**
     * Determines the name of the datacenter this endpoint lives in.
     * @param endpoint
     * @return the name of the datacenter the endpoint lives in
     */
    abstract public String getLocation(InetAddress endpoint) throws UnknownHostException;

    public List<InetAddress> getSortedListByProximity(final InetAddress address, Collection<InetAddress> unsortedAddress)
    {
        List<InetAddress> preferred = new ArrayList<InetAddress>(unsortedAddress);
        sortByProximity(address, preferred);
        return preferred;
    }

    public List<InetAddress> sortByProximity(final InetAddress address, List<InetAddress> addresses)
    {
        Collections.sort(addresses, new Comparator<InetAddress>()
        {
            public int compare(InetAddress a1, InetAddress a2)
            {
                try
                {
                    if (address.equals(a1) && !address.equals(a2))
                        return -1;
                    if (address.equals(a2) && !address.equals(a1))
                        return 1;
                    if (isOnSameRack(address, a1) && !isOnSameRack(address, a2))
                        return -1;
                    if (isOnSameRack(address, a2) && !isOnSameRack(address, a1))
                        return 1;
                    if (isInSameDataCenter(address, a1) && !isInSameDataCenter(address, a2))
                        return -1;
                    if (isInSameDataCenter(address, a2) && !isInSameDataCenter(address, a1))
                        return 1;
                    return 0;
                }
                catch (UnknownHostException e)
                {
                    throw new RuntimeException(e);
                }
            }
        });
        return addresses;
    }
    
    // queryType: 1=>write, 2=>read
/*
    public List<InetAddress> getSortedListByStorageType(int queryType, Collection<InetAddress> unsortedAddress)
    {
        List<InetAddress> preferred = new ArrayList<InetAddress>(unsortedAddress);
        sortByStorageType(queryType, preferred);
        return preferred;
    }
*/
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
                if (s1 > s2) return -1;
                else if (s1 < s2) return 1;
                else return 0;
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
}
