# MyCassandra

![MyCassandra Logo](http://cdn.f.st-hatena.com/images/fotolife/s/sunsuk7tp/20110102/20110102225851.png)

MyCassandra is a **modular** NoSQL.  
MyCassandra is the project branched from Cassandra.  

With MyCassandra, you can exchange Cassandra's storage like Bigtable (commitlog, memtable, sstable) with MySQL, Redis and others.  
The data storage component is called Storage Engine like MySQL.  
This means that you can select the Storage Engine for according to the I/O pattern of applications and the persistence.  

# Release Note
- [2011.06.??] MyCassandra-0.2.1
    - It will support the following functions:
        - secondary index
        - select a storage engine by a keyspace
- [2011.06.10] MyCassandra-0.2.0    
    - It is based on Cassandra-0.7.5.    
    - It supports the following functions:
        - the basic CRUD method for MySQL, Redis and MongoDB
        - range query for only MySQL
        - dynamic add or update keyspace/columnfamily
- [2011.06.10] MyCassandra-0.1.0    
    - It is based on Cassanadra-0.6.2.    
    - It is a experimental version.    

# Use example of MyCassandra

- decentralized any NoSQL cluster (MySQL, Redis, MongoDB, ...)

- read and write optimized NoSQL which combine different storage engines

# MyCassandra Storage Engine
In default, you can select that.

- Bigtable (the original Cassandra)   
- MySQL   
- Redis   
- MongoDB   

For example, if you want to use MySQL, 
## 1) add several statements at {$config_file}
{$config_file} is cassandra.yaml (MyCassandra-0.2) or conf/storage-conf.xml (MyCassandra-0.1).    
### @ MyCassandra-0.2
    engines: 
        - name: MySQL
          host: localhost
          port: 3306
          user: root
          pass: rootpass 
            :
    
    defaultengines: MySQL # <--- This engine is used in MyCassandra
    
### @ MyCassandra-0.1    
    <DataBase>MySQL</DataBase>
    <SQL>
        <SQLHost>localhost</SQLHost> # mysql host
        <SQLPort>3306</SQLPort> # mysql port
        <SQLUser>cassandra_user</SQLUser> # mysql connection user ("root" is easier but it is not secure.)
        <SQLPass>cA33anDra</SQLPass> # user password
    </SQL>

## 2) You define the database schema at {$config_file}.

Example, if you want to make "mykeyspace" keyspace and "mycf1","mycf2","mycf3" column families in that.   
If you use MySQL storage engine, you must specify several schema parameters.   

- rowkey_size/RowKeySize: key size (byte)    
- columnfamily_size/ColumnFamilySize: columnFamily object size (byte)   
- columnfamily_type/ColumnFamilyType: columnfamily type (MySQL data type).  
    - With 'VARBINARY', the max columnFamily size is 65535 bytes, and with 'LONGBLOB', 4 GB.   
    - It depends on data type constraints of MySQL (VARBINARY or LONGBLOB or the others).   
- storage_engine/StorageEngine: 'InnoDB', 'MyISAM', etc. MySQL storage engine itself.  

### @ MyCassandra-0.2
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

### @ MyCassandra-0.1
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
    $ mysql -u root
    mysql> GRANT ALL PRIVILEGES ON *.* TO cassandra_user IDENTIFIED BY 'cA33anDra';
    mysql> CREATE DATABASE system; # 'system' is the Cassandra's internal keyspace.
    mysql> CREATE DATABASE <keyspace_name>; # <keyspace_name> is the keyspace name defined by storage-conf.xml
    mysql> CREATE DATABASE mykeyspace;


1. You make mysql user, 'cassandra_user'.   
2. The cassandra_user needs to hava all privileges.   
3. For quickly starting, you should specify 'root'.   
4. You make database by the keyspaces.  
5. In the above example, you must make 'mykeyspace' database. (MyCassandra-0.1 only)

## 4) run.
    $ ./bin/cassandra

- You can run MyCassandra as Cassandra.

## 5) schema load. (MyCassandra-0.2)
    $ ./bin/schmatool localhost 8080 import

## 6) dynamicaly create keyspace/columnfamily (MyCassandra-0.2)
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

- Google Group: [http://groups.google.com/group/my-cassandra/](http://groups.google.com/group/my-cassandra/ "http://groups.google.com/group/my-cassandra/")

- E-mail: sunsuk7tp at gmail.com

- Twitter: [@sunsuk7tp](http://twitter.com/sunsuk7tp "@sunsuk7tp"), [@_MyCassandra](http://twitter.com/_MyCassandra "@_MyCassandra"), [@MyCassandraJP](http://twitter.com/MyCassandraJP "@MyCassandraJP"),
