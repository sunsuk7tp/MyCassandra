# MyCassandra

> Cassandra = Dynamo + Bigtable    
> **MyCassandra = Dynamo + MySQL (or Bigtable or Redis or MongoDB or etc...)**  

MyCassandra is a **modular** NoSQL.  
MyCassandra is the project branched from Cassandra.  

MyCassandra has an exchangeable **Storage Engine** component like MySQL.    
With MyCassandra, you can exchange Cassandra's storage like Bigtable (commitlog, memtable, sstable) with MySQL, Redis and others.  
This means that you can select one or more Storage Engine for according to the followings:

- I/O pattern of applications and the persistence.   
- persistent or in-memory cache
- your skills for a data store

Also with MyCassandra, you can apply any data store which do not support distributed model for the cloud to the decentralized archetecture of Cassandra.    
# Release Note
- [2011.06.??] MyCassandra-0.2.1
    - It will support the following functions:
        - secondary index
- [2011.06.13] MyCassandra-0.2.0    
    - It is based on Cassandra-0.7.5.    
    - It supports the following functions:
        - the basic CRUD method for MySQL, Redis and MongoDB
        - range query for only MySQL
        - dynamic add or update keyspace/columnfamily
        - select a storage engine by a keyspace
- [2011.06.13] MyCassandra-0.1.0    
    - It is based on Cassandra-0.6.2.    
    - It is a experimental version.    

# Use example of MyCassandra

- decentralized NoSQL cluster using your favorite storage engine (MySQL, Redis, MongoDB, ...)

- read/write optimized NoSQL which select or combine different storage engines

# MyCassandra Storage Engine
In default, you can select that.

- Bigtable (the original Cassandra)   
- MySQL   
- Redis   
- MongoDB   

For example, if you want to use MySQL, 
## 1) add several statements at {$config_file}
{$config_file} is cassandra.yaml (MyCassandra-0.2) or conf/storage-conf.xml (MyCassandra-0.1).    
A user for MyCassandra needs to hava all privileges to create MySQL's database and table.    
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
    <Engine>
        <Name>MySQL</Name>
        <Host>localhost</Host> # mysql host
        <Port>3306</Port> # mysql port
        <User>cassandra_user</User> # mysql connection user
        <Pass>cA33anDra</Pass> # user password
    </Engine>

## 2) You define the database schema at {$config_file}.

Example, if you want to make "mykeyspace" keyspace and "mycf1","mycf2","mycf3" column families in that.   
If you use MySQL storage engine, you must specify several schema parameters.   

- rowkey_size/RowKeySize: key size (byte)    
- columnfamily_size/ColumnFamilySize: columnFamily object size (byte)   
- columnfamily_type/ColumnFamilyType: columnfamily type (MySQL data type).  
    - With 'VARBINARY', the max columnFamily size is 65535 bytes, and with 'LONGBLOB', 4 GB.   
    - It depends on data type constraints of MySQL (VARBINARY or LONGBLOB or the others).   
- mysql_engine/MySQLEngine: 'InnoDB', 'MyISAM', etc. MySQL storage engine itself.  

### @ MyCassandra-0.2
    keyspaces:
        - name: myks
        :
          column_families:
              - name: mycf1
                rowkey_size: 16
                columnfamily_size: 2048
                columnfamily_type: VARBINARY
                mysql_engine: InnoDB
                :
               - name: mycf2
                rowkey_size: 32
                columnfamily_size: 4096
                columnfamily_type: VARBINARY          
                mysql_engine: MyISAM
                :
               - name: mycf3
                rowkey_size: 64
                columnfamily_size:
                columnfamily_type: LONGBLOB
                mysql_engine: MyISAM

### @ MyCassandra-0.1
    <Keyspaces>
      <Keyspace Name="myks">
        <ColumnFamily Name="mycf1" RowKeySize="16" ColumnFamilySize="2048" ColumnFamilyType="VARBINARY" MySQLEngine="InnoDB" />
        <ColumnFamily Name="mycf2" RowKeySize="32" ColumnFamilySize="4096" ColumnFamilyType="VARBINARY" MySQLEngine="MyISAM" />
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
    $ ./bin/cassandra-cli -h localhost -p 9160
    > create keyspace myks with storage_engine = MySQL;
    > use keyspace;
    > create column family mycf1 with rowkey_size = 64 and columnfamily_size = 2048 and columnfamily_type = BINARY and mysql_engine = InnoDB;

- If you do not specify 'storage_engine' when creating a keyspace, MyCassandra uses default storage engine.    
- If you do not specify each parameters when creating a column family, MyCassandra uses default parameters specified by system.    

# License
                                                                                                                                                                                 
Copyright 2011 Shunsuke Nakamura, and contributors.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and limitations under the License.

# Detail
If you know more about MyCassandra, please look [https://github.com/sunsuk7tp/MyCassandra/wiki](https://github.com/sunsuk7tp/MyCassandra/wiki "wiki"). 

# Contact
If you have something, please contact me!!

- Issue Reports: [https://github.com/sunsuk7tp/MyCassandra/issues](https://github.com/sunsuk7tp/MyCassandra/issues "github-issues")

- Google Group: [http://groups.google.com/group/my-cassandra/](http://groups.google.com/group/my-cassandra/ "http://groups.google.com/group/my-cassandra/")

- E-mail: sunsuk7tp at gmail.com

- Twitter: [@sunsuk7tp](http://twitter.com/sunsuk7tp "@sunsuk7tp"), [@_MyCassandra](http://twitter.com/_MyCassandra "@_MyCassandra"), [@MyCassandraJP](http://twitter.com/MyCassandraJP "@MyCassandraJP"),
