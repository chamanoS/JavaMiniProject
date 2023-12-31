package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler extends Config {
	Connection dbConnection;
	
	public Connection getDbConnection() throws ClassNotFoundException, SQLException{
		String connectionString = "jdbc:mysql://"+ dbHost + ":" + dbPort + "/" + dbName;
		
		dbConnection = DriverManager.getConnection(connectionString,dbUser,dbPassword);
		
		return dbConnection;
	}

}
