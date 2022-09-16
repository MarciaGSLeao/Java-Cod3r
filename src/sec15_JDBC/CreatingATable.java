package sec15_JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingATable {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnectionMySQL();
		
		Statement stmtSql = connection.createStatement();
		
		String queryCreateTable = "CREATE TABLE IF NOT EXISTS pessoas ("
					+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
					+ "nome VARCHAR(80) NOT NULL"
					+ ")";
				
		stmtSql.execute(queryCreateTable);
		System.out.println("Tabela criada com sucesso!");
	}

}
