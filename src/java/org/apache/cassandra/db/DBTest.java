package org.apache.cassandra.db;

import java.security.*;
import java.sql.*;

public class DBTest {
	
	public final static String RANDOM_ALGORITHM = "SHA1PRNG";
	public final static int    RANDOM_LENGTH    = 16;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbTable = "cassandra_table";
		DBInstance dbi = new DBInstance();
		
		for(int i = 0; i < 100; i++) {
			String Row_Key = String.valueOf(i);
			String CF = new String(getRandom());
			int is = dbi.Insert(dbTable, Row_Key, CF);
			if(is < 0) return;
		}
		
		ResultSet rs = dbi.Select(dbTable, null, null);
		while(rs.next()) {
			int id = rs.getInt(1);
			String Row_Key = rs.getString(2);
			String Val = rs.getString(3);
			System.out.println(id+": "+Row_Key+"/"+Val);
		}
	}
	
	public static byte[] getRandom() {

	    try {
	        SecureRandom random = SecureRandom.getInstance(RANDOM_ALGORITHM);
	        byte seed[]         = random.generateSeed(RANDOM_LENGTH);
	        byte b[]            = new byte[RANDOM_LENGTH];

	        random.setSeed(seed);
	        random.nextBytes(b);
	        
	        return b;
	    }catch(Exception e) {
	        e.printStackTrace();      
	        return null;
	    }
	}
}
