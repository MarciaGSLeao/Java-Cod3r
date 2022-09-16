package sec15_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingData {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome: ");
		String name = sc.nextLine();
		
		Connection connection = ConnectionFactory.getConnectionMySQL();
		
		String query = "INSERT INTO pessoas (nome) VALUES (?)";
		
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, name);
		stmt.execute();
		
		System.out.println("Pessoa incluída com sucesso!!!");
		
		sc.close();
	}

}
