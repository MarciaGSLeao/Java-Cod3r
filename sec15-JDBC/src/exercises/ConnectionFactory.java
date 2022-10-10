package exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnectionMySQL() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/curso_java_cod3r?verifyServerCertificate=false&useSSL=true";
			String user = "root";
			String password = "123456";
			
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
