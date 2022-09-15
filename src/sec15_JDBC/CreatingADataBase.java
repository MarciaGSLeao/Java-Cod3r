package sec15_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingADataBase {
	
	public static void main(String[] args) throws SQLException {
		
		// STRING DE CONEXÃO
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String password = "123456";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println("Conexão efetuada com sucesso!");
		
		// O OBJETO stmt É O RESPONSÁVEL PARA CRIAR A DECLARAÇÃO SQL A SER EXECUTADA.
		Statement stmt = connection.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS java_cod3r;");
		System.out.println("Banco de Dados criado com sucesso!");
		
		connection.close();
		
	}

}
