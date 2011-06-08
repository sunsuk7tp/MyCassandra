package org.apache.cassandra.db;

import java.security.*;
import java.sql.*;

public class DBTest {
	
	public final static String RANDOM_ALGORITHM = "SHA1PRNG";
	public final static int    RANDOM_LENGTH    = 16;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//DBInstance dbi = new MySQLInstance("usertable","data");
		PreparedStatement pstInsert = new MySQLConfigure().connect("usertable").prepareStatement("INSERT INTO usertable (Row_Key, ColumnFamily) VALUES (?,?)");
		
		for(int i = 0; i < 100; i++) {
			String Row_Key = String.valueOf(i);
			byte[] CF = getRandom();
			//int is = dbi.insert(Row_Key, CF);
			pstInsert.setString(1, Row_Key);
			pstInsert.setBytes(2, CF);
			
			int is = pstInsert.executeUpdate();
			if(is < 0) return;
		}
		/*
		ResultSet rs = dbi.Select(dbTable, null, null);
		while(rs.next()) {
			int id = rs.getInt(1);
			String Row_Key = rs.getString(2);
			String Val = rs.getString(3);
			System.out.println(id+": "+Row_Key+"/"+Val);
		}*/
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
