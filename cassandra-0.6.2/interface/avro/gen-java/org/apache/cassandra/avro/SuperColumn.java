package org.apache.cassandra.avro;

@SuppressWarnings("all")
public class SuperColumn extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"SuperColumn\",\"namespace\":\"org.apache.cassandra.avro\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"columns\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Column\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"value\",\"type\":\"bytes\"},{\"name\":\"timestamp\",\"type\":\"long\"}]}}}]}");
  public java.nio.ByteBuffer name;
  public org.apache.avro.generic.GenericArray<org.apache.cassandra.avro.Column> columns;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return columns;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  @SuppressWarnings(value="unchecked")
  public void set(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.nio.ByteBuffer)value$; break;
    case 1: columns = (org.apache.avro.generic.GenericArray<org.apache.cassandra.avro.Column>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
