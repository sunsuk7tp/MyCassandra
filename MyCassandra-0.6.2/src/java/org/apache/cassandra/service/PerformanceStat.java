package org.apache.cassandra.service;

import java.net.InetAddress;
import java.util.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.cassandra.utils.LatencyTracker;

public class PerformanceStat
{
	public final int WRITE = 1;
	public final int READ = 2;
	
	private int threshold;
	private Map<InetAddress, LatencyTracker> writeStatlist;
	private Map<InetAddress, LatencyTracker> readStatlist;
	
	public PerformanceStat(int threshold)
	{
		this.threshold = threshold;
		this.readStatlist = new HashMap<InetAddress, LatencyTracker>();
		this.writeStatlist = new HashMap<InetAddress, LatencyTracker>();
	}
	
	public Map<InetAddress, LatencyTracker> getStatlist(int queryType)
	{
		return queryType == WRITE ? writeStatlist : readStatlist;
	}
	
	public void setStat(int queryType, InetAddress address, long response)
	{
		Map<InetAddress, LatencyTracker> statlist = getStatlist(queryType);
		if (Math.random() < threshold)
		{
			LatencyTracker stats = (statlist.containsKey(address) ? statlist.get(address) : new LatencyTracker());
			stats.addNano(response);
			statlist.put(address, stats);
		}
	}
	
	public double getStat(int queryType, InetAddress address)
	{
		Map<InetAddress, LatencyTracker> statlist = (queryType == WRITE ? writeStatlist : readStatlist);
		return statlist.containsKey(address) ? statlist.get(address).getRecentLatencyMicros() : -1;
	}
	
	public List<InetAddress> sortByResponse(int queryType, List<InetAddress> addresses)
	{
		if (queryType == WRITE) {
			Collections.sort(addresses, new Comparator<InetAddress>()
				{
				public int compare(InetAddress a1, InetAddress a2)
				{
					return getStat(WRITE, a1) > getStat(WRITE, a2) ? 1 : -1;
				}
			});
		} else {
			Collections.sort(addresses, new Comparator<InetAddress>()
				{
				public int compare(InetAddress a1, InetAddress a2)
				{
					return getStat(READ, a1) > getStat(READ, a2) ? 1 : -1;
				}
			});
		}
		return addresses;
	}
}
