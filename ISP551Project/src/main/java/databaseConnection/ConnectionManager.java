package databaseConnection;

import java.sql.*;


public class ConnectionManager {

        private ConnectionManager() {

        }

        // Connection reference
        private Connection connection = getConnection();

        // Static reference (Because Connection is static)
        private static ConnectionManager instance = null;

        // Get instance of ConnectionManager method
        public static ConnectionManager getInstance(){
            if (instance == null)
                instance = new ConnectionManager();

            return instance;
        }

        // Get Connection method
        public Connection getConnection() {

            try {
            	Class.forName("org.postgresql.Driver").newInstance();
            } catch(InstantiationException e) {
            	e.printStackTrace();
            } catch(IllegalAccessException e) {
            	e.printStackTrace();
            } catch(ClassNotFoundException e) {
            	e.printStackTrace();
            }
            
         // Database details
            String username = "ztvgrujcixsulcpostgres";
            String password = "3506512e44dbaa9ecece046f0c61e6390f63715df57a707b69b80058cc080ffc";
            String dbUrl = "jdbc:postgresql://ec2-34-225-159-178.compute-1.amazonaws.com:5432/da3u9rm7mvf84k";
            
            try {
            	return DriverManager.getConnection(dbUrl, username, password);
            } catch (SQLException e) {
            	e.printStackTrace();
            }
            

            return connection;
        }
}
