package db;

import db.mysql.MySQLConnection;

public class DBConnectionFactory {
	private static final String DEFAULT_DB = "mysql";
	
	// Create a DBConnection based on given db type.
		public static DBConnection getDBConnection(String db) {
			switch (db) {
			case "mysql":
				return new MySQLConnection();
			case "mongodb":
				//return MongoDBConnection.getInstance();
				return null;
			// You may try other dbs and add them here.
			default:
				throw new IllegalArgumentException("Invalid db " + db);
			}

	}
		public static DBConnection getDBConnection() {
			return getDBConnection(DEFAULT_DB);
		}

}
