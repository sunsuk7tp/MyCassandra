package org.apache.cassandra.avro;

@SuppressWarnings("all")
public class ColumnPath extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"ColumnPath\",\"namespace\":\"org.apache.cassandra.avro\",\"fields\":[{\"name\":\"column_family\",\"type\":\"string\"},{\"name\":\"super_column\",\"type\":[\"bytes\",\"null\"]},{\"name\":\"column\",\"type\":[\"bytes\",\"null\"]}]}");
  public org.apache.avro.util.Utf8 column_family;
  public java.nio.ByteBuffer super_column;
  public java.nio.ByteBuffer column;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return column_family;
    case 1: return super_column;
    case 2: return column;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  @SuppressWarnings(value="unchecked")
  public void set(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: column_family = (org.apache.avro.util.Utf8)value$; break;
    case 1: super_column = (java.nio.ByteBuffer)value$; break;
    case 2: column = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
