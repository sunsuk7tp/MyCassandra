#!/usr/bin/perl -w

use strict;
use warnings;

# Change for your environment
use lib '/Users/sunsuk7tp/workspace/Cassandra_MySQL/interface/gen-perl/';
use Cassandra::Cassandra;
use Cassandra::Constants;
use Cassandra::Types;

use Thrift;
use Thrift::BinaryProtocol;
use Thrift::Socket;
use Thrift::BufferedTransport;

use Data::Dumper;

# localhost and 9160 are default in storage conf for rpc listener
my $socket = new Thrift::Socket('localhost', 9160);
my $transport = new Thrift::BufferedTransport($socket,1024,1024);
my $protocol = new Thrift::BinaryProtocol($transport);
my $client = new Cassandra::CassandraClient($protocol);

eval {
   $transport->open();
   # See http://wiki.apache.org/cassandra/DataModel or http://wiki.apache.org/cassandra/ClientExamples#PHP for more explanations
   my $keyspace = 'Keyspace1';
   my $row_key = 'firsttest';

   # See http://wiki.apache.org/cassandra/API#ConsistencyLevel
   my $consistency_level = Cassandra::ConsistencyLevel::ONE;

   # Authentication only available in 0.6
   my $auth_request = new Cassandra::AuthenticationRequest();
   $auth_request->{credentials} = { username => 'user', password => 'password' };
   $client->login($keyspace, $auth_request);

   my $column_path = new Cassandra::ColumnPath();
   $column_path->{column_family} = 'Standard1';
   $column_path->{super_column} = undef;
   $column_path->{column} = 'email';

   my $timestamp = time;

   my $value = 'foobar@example.com';
   $client->insert($keyspace, $row_key, $column_path, $value, $timestamp, $consistency_level);

   $column_path->{column} = 'age';
   $timestamp = time;
   $value = "24";
   $client->insert($keyspace, $row_key, $column_path, $value, $timestamp, $consistency_level);

   my $column1 = new Cassandra::Column();
   $column1->{name} = 'foo';
   $column1->{value} = 'fooey value';
   $column1->{timestamp} = time;

   my $column2 = new Cassandra::Column();
   $column2->{name} = 'bar';
   $column2->{value} = 'bar like thing';
   $column2->{timestamp} = time;

   my $super_column = new Cassandra::SuperColumn();
   $super_column->{name} = 'SuperColumnName';
   $super_column->{columns} = [$column1, $column2];

   my $c_or_sc = new Cassandra::ColumnOrSuperColumn();
   $c_or_sc->{super_column} = $super_column;

   my $mutation = { Super1 => [$c_or_sc] };
   $client->batch_insert($keyspace, 'KeyName', $mutation, $consistency_level);

   my $column_parent = new Cassandra::ColumnParent();
   $column_parent->{column_family} = "Standard1";
   $column_parent->{super_column} = undef;

   my $slice_range = new Cassandra::SliceRange();
   $slice_range->{start} = "";
   $slice_range->{finish} = "";

   my $predicate = new Cassandra::SlicePredicate();
   my @list = $predicate->{column_names};
   $predicate->{slice_range} = $slice_range;

   my $result = $client->get_slice($keyspace, $row_key, $column_parent, $predicate, $consistency_level);

   # Removal available after 0.6
   $client->remove($keyspace, $row_key, $column_path, $timestamp, $consistency_level);
   my $result_after = $client->get_slice($keyspace, $row_key, $column_parent, $predicate, $consistency_level);

   # To get a range of all the keys within that column_parent
   $predicate = new Cassandra::SlicePredicate();
   $predicate->{slice_range} = new Cassandra::SliceRange( {start => '', finish => '' } );

   my $paged_result = $client->get_range_slice($keyspace, $column_parent, $predicate, '', '', 10, $consistency_level);

   print Dumper($result, $result_after, $paged_result);

   # All of these require 0.6 see http://wiki.apache.org/cassandra/API for more information
   print Dumper($client->describe_keyspaces);
   print Dumper($client->describe_keyspace('Keyspace1'));
   print Dumper($client->describe_cluster_name);
   print Dumper($client->describe_version);

   $transport->close();
}; if($@){
   warn(Dumper($@));
}

1;
