package sec15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnectionMySQL() {
		
		try {
			final String url = "jdbc:mysql://localhost:3306/java_cod3r?verifyServerCertificate=false&useSSL=true";
			final String user = "root";
			final String password = "123456";
		
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
