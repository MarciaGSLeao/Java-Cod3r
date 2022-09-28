package sec15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	
	public static void main(String[] args) throws SQLException {
		
		// CRIANDO A STRING DE CONEXÃO AO SGBD MYSQL
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String password = "123456";
		
		// ESTABELECENDO A CONEXÃO
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println("Conexão efetuada com sucesso!");
		connection.close();
	
	}

}
