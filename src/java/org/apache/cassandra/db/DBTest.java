import java.security.*;
import java.sql.*;

public class DBTest {
	
	public final static String RANDOM_ALGORITHM = "SHA1PRNG";
	public final static int    RANDOM_LENGTH    = 16;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbTable = "test_table";
		DBInstance dbi = new DBInstance();
		
		for(int i = 0; i < 100; i++) {
			String Val = new String(getRandom());
			int is = dbi.Insert(dbTable, Val);
			if(is < 0) return;
		}
		
		ResultSet rs = dbi.Select(dbTable, null, null);
		while(rs.next()) {
			int key = rs.getInt(1);
			String val = rs.getString(2);
			System.out.println(key+"#"+val);
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
