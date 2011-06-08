#!/usr/bin/env python # encoding: utf-8

import sys
import string
import random
from optparse import OptionParser

sys.path.append('../interface/gen-py')

from thrift import Thrift
from thrift.transport import TTransport
from thrift.transport import TSocket
from thrift.protocol.TBinaryProtocol import TBinaryProtocolAccelerated
from cassandra import Cassandra
from cassandra.ttypes import *
import time
import pprint

from timeit import Timer

alphabets = string.digits + string.letters

# default set
host = "localhost"
port = 9160
num = 100 # row num
valueLength = 10 # column length
steps = 10 # for update operation
columnFamily = "Standard1"
columnNum = 1

def setInputConfig():
	global opts, num, valueLength, steps, columnNum, host, port
	usage = u'%prog [-o:operation] [-m:host] [-p:port] [-n:num] [-v:valueLength] [-s:steps] [-c:columnNum]'
	parser = OptionParser(usage=usage)
	parser.add_option('-o', '--operation', help=u'Operation Name', dest='op')
	parser.add_option('-m', '--host', help=u'Connection Host', dest='host')
	parser.add_option('-p', '--port', help=u'Connection Port', dest='port')
	parser.add_option('-n', '--num', help=u'record Number', dest='num')
	parser.add_option('-v', '--valueLength', help=u'Column Length', dest='vl')
	parser.add_option('-s', '--steps', help=u'Loop Steps for Update Operation', dest='steps')
	parser.add_option('-c', '--columNum', help=u'Column Num', dest='columnNum')
	(opts, args) = parser.parse_args()
	
	if opts.num is not None:
		num = int(opts.num)
	if opts.vl is not None:
		valueLength = int(opts.vl)
	if opts.steps is not None:
		steps = int(opts.steps)
	if opts.columnNum is not None:
		columnNum = int(opts.columnNum)
		
	if opts.op is None:
		parser.print_help()
		quit()
		
	if opts.host is not None:
		host = opts.host	
	if opts.port is not None:
		port = int(opts.port)

def setUpInstance(host, port):
	global socket, transport, protocol, client, pp
	socket = TSocket.TSocket(host, port)
	transport = TTransport.TBufferedTransport(socket)
	protocol = TBinaryProtocol.TBinaryProtocolAccelerated(transport)
	client = Cassandra.Client(protocol)
	pp = pprint.PrettyPrinter(indent=2)

def insertGet(num, valueLength):
    try:
        transport.open()
        keyspace = "Keyspace1"
        column_path = ColumnPath(column_family="Standard1",
        column="Column")
        column_parent = ColumnParent(column_family="Standard1")
        
        t1 = time.time()
        insert(num, valueLength, keyspace, column_path)
        t2 = time.time()
        
        keys = range(0, num)
        random.shuffle(keys)
        t3 = time.time()
        select(num, keyspace, keys, column_parent)
        t4 = time.time()
        
        print 'insert ',num,' records takes ',t2 - t1, 'sec'
        print 'select ',num,' records takes ',t4 - t3, 'sec'
    except Thrift.TException, tx:
        print 'Thrift: %s' % tx.message
    finally:
        transport.close()

def updateGet(num, valueLength, steps):
	global columnFamily, columnNum;
	print steps
	try:
		transport.open()
		keyspace = "Keyspace1"
		
		column_parent = ColumnParent(column_family=columnFamily)
		
		for i in range(0, steps):
			columnId = "Column"+ str(i % columnNum)
			column_path = ColumnPath(column_family=columnFamily, column=columnId)
			insert(num, valueLength, keyspace, column_path)
			
			keys = range(0, num)
			random.shuffle(keys)
			select(num, keyspace, keys, column_parent)
	except Thrift.TException, tx:
		print 'Thrift: %s' % tx.message
	finally:
		transport.close()

def insert(num, valueLength, keyspace, column_path):
    for i in range(0, num):
        key = str(i)
    	value = getRandomString(valueLength, "+/-@=" + alphabets)
    	timestamp = time.time()
        client.insert(keyspace,
            key,
            column_path,
            value,
            timestamp,
            ConsistencyLevel.ZERO)

def select(num, keyspace, keys, column_parent):
    for i in keys:
        key = str(i)
        slice_range = SliceRange(start="", finish="")
        predicate = SlicePredicate(slice_range=slice_range)
        result = client.get_slice(keyspace,
        	key,
        	column_parent,
        	predicate,
        	ConsistencyLevel.ONE)	
        #pp.pprint(result)
        
def getRandomString(n, sets = alphabets):
	random.seed()
	return ''.join(random.choice(sets) for i in xrange(n))

if __name__ == '__main__':
	setInputConfig()
	setUpInstance(host, port)

	if opts.op == "insert":
		t1 = time.time()
		insertGet(num, valueLength)
		t2 = time.time()
		print 'insertGet ',num,' records takes ',t2 - t1, ' sec'
		exit()
	if opts.op == "update":
		t1 = time.time()
		updateGet(num, valueLength, steps)
		t2 = time.time()
		print 'updateGet ',num,' records takes ',t2 - t1, ' sec'
		exit()