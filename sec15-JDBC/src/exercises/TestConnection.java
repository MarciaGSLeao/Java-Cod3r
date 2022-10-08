package exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		String user = "root";
		String password = "123456";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
		connection.close();
		System.out.println("Conexão efetuada com sucess!");
	
	}
	
}
