package org.apache.cassandra.db;
import java.io.IOException;

import org.apache.cassandra.config.DatabaseDescriptor;

public class HSMySQLConfigure {
	public HandlerSocket connect() throws IOException {
		String dbHost = DatabaseDescriptor.getSQLHost();
		int dbPort = new Integer(DatabaseDescriptor.getSQLPort());
		//String dbUser = DatabaseDescriptor.getSQLUser();
		//String dbPass = DatabaseDescriptor.getSQLPass();
	
		HandlerSocket hs = new HandlerSocket();
		hs.open(dbHost, dbPort);
			
		return hs;
	}
}
