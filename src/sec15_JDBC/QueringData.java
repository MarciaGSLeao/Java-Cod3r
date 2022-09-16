package sec15_JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QueringData {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnectionMySQL();
		
		Statement stmt = connection.createStatement();

		String query = "SELECT * FROM pessoas;";
		
		ResultSet result = stmt.executeQuery(query);
		
		List<People> listPeople = new ArrayList<>();
		
		while(result.next()) {
			int cod = result.getInt("codigo");
			String name = result.getString("nome");
			listPeople.add(new People(cod, name));
		}
		
		for(People p : listPeople) {
			System.out.println(p.getCod() + " - " + p.getName());
		}
		
		stmt.close();
		connection.close();
		
	}

}
