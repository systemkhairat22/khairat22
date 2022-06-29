package databaseConnection;

import java.sql.*;

public class ConnectionManager {

    // Database details
        //String username = "postgres";
        //String password = "system";
        //String dbUrl = "jdbc:postgresql://localhost:5432/khairatserver";

        private ConnectionManager() {

        }

        // Connection reference
        private static Connection connection = getConnection();

        // Static reference (Because Connection is static)
        private static ConnectionManager instance = null;

        // Get instance of ConnectionManager method
        public static ConnectionManager getInstance(){
            if (instance == null)
                instance = new ConnectionManager();

            return instance;
        }

        // Get Connection method
        public static  Connection getConnection() {

            try {
                Class.forName("org.postgresql.Driver");
                connection =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/khairatserver", "postgres", "system");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                    e.printStackTrace();
            }

            return connection;
        }
}
