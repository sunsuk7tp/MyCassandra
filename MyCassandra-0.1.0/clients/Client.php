<?php

$GLOBALS['THRIFT_ROOT'] = '/usr/share/php/Thrift';
require_once $GLOBALS['THRIFT_ROOT'].'/packages/cassandra/Cassandra.php';
require_once $GLOBALS['THRIFT_ROOT'].'/packages/cassandra/cassandra_types.php';
require_once $GLOBALS['THRIFT_ROOT'].'/transport/TSocket.php';
require_once $GLOBALS['THRIFT_ROOT'].'/protocol/TBinaryProtocol.php';
require_once $GLOBALS['THRIFT_ROOT'].'/transport/TFramedTransport.php';
require_once $GLOBALS['THRIFT_ROOT'].'/transport/TBufferedTransport.php';

try {
  // Make a connection to the Thrift interface to Cassandra
  $socket = new TSocket('127.0.0.1', 9160);
  $transport = new TBufferedTransport($socket, 1024, 1024);
  $protocol = new TBinaryProtocolAccelerated($transport);
  $client = new CassandraClient($protocol);
  $transport->open();


  /* Insert some data into the Standard1 column family from the default config */

  // Keyspace specified in storage=conf.xml
  $keyspace = 'Keyspace1';

  // reference to specific User id
  $keyUserId = "1";

  // Constructing the column path that we are adding information into.
  $columnPath = new cassandra_ColumnPath();
  $columnPath->column_family = 'Standard1';
  $columnPath->super_column = null;
  $columnPath->column = 'email';

  // Timestamp for update
  $timestamp = time();

  // We want the consistency level to be ZERO which means async operations on 1 node
  $consistency_level = cassandra_ConsistencyLevel::ZERO;

  // Add the value to be written to the table, User Key, and path.
  $value = "foobar@example.com";
  $client->insert($keyspace, $keyUserId, $columnPath, $value, $timestamp, $consistency_level);

  // Add a new column path to be altered.
  $columnPath->column = 'age';
  //Get a current timestamp
  $timestamp = time();
  // Update the value to be inserted for the updated column Path
  $value = "24";
  $client->insert($keyspace, $keyUserId, $columnPath, $value, $timestamp, $consistency_level);

  /*
   * use batch_insert to insert a supercolumn and its children using the standard config
   * builds the structure
   *
   * Super1 : {
   *    KeyName : {
   *       SuperColumnName : {
   *            foo : fooey value
   *            bar : bar like thing
   *       }
   *    }
   * }
   */

  // build columns to insert
  $column1 = new cassandra_Column();
  $column1->name = 'foo';
  $column1->value = 'fooey value';
  $column1->timestamp = time();

  $column2 = new cassandra_Column();
  $column2->name = 'bar';
  $column2->value = 'bar like thing';
  $column2->timestamp = time();

  // build super column containing the columns
  $super_column = new cassandra_SuperColumn();
  $super_column->name = 'SuperColumnName';
  $super_column->columns = array($column1, $column2);

  // create columnorsupercolumn holder class that batch_insert uses
  $c_or_sc = new cassandra_ColumnOrSuperColumn();
  $c_or_sc->super_column = $super_column;

  // create the mutation (a map of ColumnFamily names to lists ColumnsOrSuperColumns objects
  $mutation['Super1'] = array($c_or_sc);

  $client->batch_insert($keyspace, 'KeyName', $mutation, $consistency_level);

  /* Query for data */

  // Specify what Column Family to query against.
  $columnParent = new cassandra_ColumnParent();
  $columnParent->column_family = "Standard1";
  $columnParent->super_column = NULL;


  $sliceRange = new cassandra_SliceRange();
  $sliceRange->start = "";
  $sliceRange->finish = "";
  $predicate = new cassandra_SlicePredicate();
  list() = $predicate->column_names;
  $predicate->slice_range = $sliceRange;

  // We want the consistency level to be ONE which means to only wait for 1 node
  $consistency_level = cassandra_ConsistencyLevel::ONE;

  // Issue the Query
  $keyUserId = 1;
  $result = $client->get_slice($keyspace, $keyUserId, $columnParent, $predicate, $consistency_level);


  print_r($result);
  $transport->close();



} catch (TException $tx) {
   print 'TException: '.$tx->why. ' Error: '.$tx->getMessage() . "\n";
}

?>
