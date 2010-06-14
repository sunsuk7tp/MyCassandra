package org.apache.cassandra.avro;

@SuppressWarnings("all")
public class ColumnOrSuperColumn extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"ColumnOrSuperColumn\",\"namespace\":\"org.apache.cassandra.avro\",\"fields\":[{\"name\":\"column\",\"type\":[{\"type\":\"record\",\"name\":\"Column\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"value\",\"type\":\"bytes\"},{\"name\":\"timestamp\",\"type\":\"long\"}]},\"null\"]},{\"name\":\"super_column\",\"type\":[{\"type\":\"record\",\"name\":\"SuperColumn\",\"fields\":[{\"name\":\"name\",\"type\":\"bytes\"},{\"name\":\"columns\",\"type\":{\"type\":\"array\",\"items\":\"Column\"}}]},\"null\"]}]}");
  public org.apache.cassandra.avro.Column column;
  public org.apache.cassandra.avro.SuperColumn super_column;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return column;
    case 1: return super_column;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  @SuppressWarnings(value="unchecked")
  public void set(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: column = (org.apache.cassandra.avro.Column)value$; break;
    case 1: super_column = (org.apache.cassandra.avro.SuperColumn)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
