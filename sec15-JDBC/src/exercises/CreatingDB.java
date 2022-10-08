package exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingDB {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		String user = "root";
		String password = "123456";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement stmt = connection.createStatement();
		
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java_cod3r");
		System.out.println("Banco de dados criado com sucesso!");
		
		connection.close();
	
	}

}
