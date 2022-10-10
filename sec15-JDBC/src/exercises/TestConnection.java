package exercises;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnectionMySQL();
		
		System.out.println("Conexão efetuada com sucesso!");
		
		connection.close();
	
	}
	
}
