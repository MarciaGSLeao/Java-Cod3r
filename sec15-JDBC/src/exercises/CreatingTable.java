package exercises;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnectionMySQL();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL"
				+ ");";
		
		Statement stmt = connection.createStatement();
		
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!");
		
		connection.close();
	
	}
}
