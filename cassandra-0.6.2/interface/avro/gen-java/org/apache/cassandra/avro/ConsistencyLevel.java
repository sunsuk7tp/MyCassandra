package org.apache.cassandra.avro;

@SuppressWarnings("all")
public enum ConsistencyLevel { 
  ZERO, ONE, QUORUM, DCQUORUM, DCQUORUMSYNC, ALL
}
