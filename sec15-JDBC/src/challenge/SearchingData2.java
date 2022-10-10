package challenge;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercises.ConnectionFactory;
import exercises.People;

public class SearchingData2 {

	// BUSCA DE REGISTROS A PARTIR DE UMA PARTE DO NOME.
	
	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnectionMySQL();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome ou parte do nome que deseja buscar: ");
		String partOfName = sc.nextLine();
		
		String sql = """
						SELECT * FROM pessoas WHERE nome LIKE ?;
				     """;
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, "%" + partOfName + "%");
		
		ResultSet resultQuery = stmt.executeQuery();
		List<People> listPeople = new ArrayList<>();
		
		while(resultQuery.next()) {
			Integer cod = resultQuery.getInt("codigo");
			String name = resultQuery.getString("nome");
			listPeople.add(new People(cod, name));
		}
		
		for(People person : listPeople) {
			System.out.println(person.getCod() + " -> " + person.getName());
		}

		stmt.close();
		//connection.close();
		sc.close();
	}
}
