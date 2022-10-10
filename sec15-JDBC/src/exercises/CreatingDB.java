package exercises;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingDB {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnectionMySQL();
		Statement stmt = connection.createStatement();
		
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java_cod3r");
		System.out.println("Banco de dados criado com sucesso!");
		
		connection.close();
	 
	}

}
