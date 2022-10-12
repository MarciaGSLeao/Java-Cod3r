package exercises;

import java.sql.Connection;
import java.sql.SQLException;

public class DAO {

	private Connection connection;
	
	private Connection getConnection() {
		try {
			if (connection != null && !connection.isClosed()) {
				return connection;
			}
		} catch (SQLException e) {

		}
		
		connection = ConnectionFactory.getConnectionMySQL();
		return connection;
	}
	
}
