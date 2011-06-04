# MyCassandra

MyCassandra is the project branched from Cassandra by Shunsuke Nakamura.

With MyCassandra, you can exchange the Storage Engine from the original storage like BigTable (commitlog, memtable, sstable) to MySQL, Redis and others.

This means that you can select the Storage Engine for according to the I/O pattern of applications.

# MyCassandra Storage Engine
In default, you can select that.

- BigTable (the original Cassandra)

- MySQL

- Redis

- MongoDB

For example, if you want to use MySQL, 
## 1) add several statements at conf/cassandra.yaml (0.7~) or conf/storage-conf.xml (0.6~)

    db: MySQL
    db_host: localhost
    db_port: 3306
    db_user: root
    db_pass: rootpass 

    <DataBase>MySQL</DataBase>
    <SQL>
        <SQLHost>localhost</SQLHost> # mysql host
        <SQLPort>3306</SQLPort> # mysql port
        <SQLUser>cassandra_user</SQLUser> # mysql connection user ("root" is easier but it is not secure.)
        <SQLPass>cA33anDra</SQLPass> # user password
    </SQL>

## 2) You define the database schema at storage-conf.xml.

Example, if you want to make "mykeyspace" keyspace and "mycf1","mycf2","mycf3" column families in that.

If you use MySQL storage engine, you must specify several schema parameters.

- rowkey_size/RowKeySize: key size (byte)

- columnfamily_size/ColumnFamilySize: columnFamily object size (byte)

- columnfamily_type/ColumnFamilyType: columnfamily type (MySQL data type). 

With 'VARBINARY', the max columnFamily size is 65535 bytes, and with 'LONGBLOB', 4 GB. It depends on data type constraints of MySQL (VARBINARY or LONGBLOB or the others). 

- storage_engine/StorageEngine: 'InnoDB', 'MyISAM', etc. MySQL storage engine itself. 

### @0.7
    keyspaces:
        - name: mykeyspace
        :
          column_families:
              - name: mycf1
                rowkey_size: 16
                columnfamily_size: 2048
                columnfamily_type: VARBINARY
                storage_engine: InnoDB
                :
               - name: mycf2
                rowkey_size: 32
                columnfamily_size: 4096
                columnfamily_type: VARBINARY          
                storage_engine: MyISAM
                :
               - name: mycf3
                rowkey_size: 64
                columnfamily_size:
                columnfamily_type: LONGBLOB
                storage_engine: MyISAM

### @0.6
    <Keyspaces>
      <Keyspace Name="mykeyspace">
        <ColumnFamily Name="mycf1" RowKeySize="16" ColumnFamilySize="2048" ColumnFamilyType="VARBINARY" StorageEngine="InnoDB" />
        <ColumnFamily Name="mycf2" RowKeySize="32" ColumnFamilySize="4096" ColumnFamilyType="VARBINARY" StorageEngine="MyISAM" />
        <ReplicaPlacementStrategy>org.apache.cassandra.locator.RackAwareStrategy</ReplicaPlacementStrategy>
        <ReplicationFactor>1</ReplicationFactor>
        <EndPointSnitch>org.apache.cassandra.locator.EndPointSnitch</EndPointSnitch>
      </Keyspace>
    </Keyspaces>

- MySQL automally make table according to the above prameters.

## 3) mysql setup.
- You make mysql user, cassandra_user.

- The cassandra_user needs to hava all privileges.

- For quickly starting, you should specify 'root'.

    GRANT cassandra_user

- You make database by the keyspaces.

    mysql> CREATE DATABASE system; # 'system' is the Cassandra's internal keyspace.
    mysql> CREATE DATABASE <keyspace_name>; # <keyspace_name> is the keyspace name defined by storage-conf.xml

- In the above example, you must make database as this,

    mysql> CREATE DATABASE table;

## 4) run.
- You can run MyCassandra as Cassandra.

    $ ./bin/cassandra

## 5) schema load. (0.7~)

    $ ./bin/schmatool localhost 8080 import

## 6) dynamicaly create keyspace/columnfamily (0.7~)
    $ ./bin/cassandra-cli
    > connect localhost/9160;
    > create keyspace myksp;
    > use keyspace;
    > create column family mycf1 with max_key_size = 64 and max_cf_size = 2048 and storage_size = BINARY and storage_engine = InnoDB;

#  License

Copyright (c) 2011 Shunsuke Nakamura

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

# Contact
If you have something, please contact me!!

- E-mail: sunsuk7tp at gmail.com

- Twitter: [@sunsuk7tp](http://twitter.com/sunsuk7tp "@sunsuk7tp"), [@_MyCassandra](http://twitter.com/_MyCassandra "@_MyCassandra"), [@MyCassandraJP](http://twitter.com/MyCassandraJP "@MyCassandraJP"),
