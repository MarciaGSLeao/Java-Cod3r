package exercises;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchingData01 {

	public static void main(String[] args) throws SQLException {

		Connection connection = ConnectionFactory.getConnectionMySQL();
		String sql = """
						SELECT * FROM pessoas;
				     """;
		PreparedStatement stmt = connection.prepareStatement(sql);
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
		
	}
}
