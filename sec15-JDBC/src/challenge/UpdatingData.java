package challenge;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import exercises.ConnectionFactory;
import exercises.People;

public class UpdatingData {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o código da pessoa: ");
		int cod = sc.nextInt();
		
		String sqlSelect = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		Connection conn = ConnectionFactory.getConnectionMySQL();
				
		PreparedStatement stmt = conn.prepareStatement(sqlSelect);
		stmt.setInt(1, cod);
		ResultSet result = stmt.executeQuery();
		
		if(result.next()) {
			People person = new People(result.getInt("codigo"), result.getString("nome"));
			System.out.println("O nome atual é : " + person.getName());
			sc.nextLine();
			
			System.out.print("Informe o novo nome: ");
			String newName = sc.nextLine();
			
			stmt.close();
			stmt = conn.prepareStatement(sqlUpdate);
			stmt.setString(1, newName);
			stmt.setInt(2, cod);
			stmt.execute();
			System.out.println("Nome alterado com sucesso!");
		}else {
			System.out.println("O código informado não corresponde a um código válido.");
		}
		
		conn.close();
		sc.close();
	}

}
