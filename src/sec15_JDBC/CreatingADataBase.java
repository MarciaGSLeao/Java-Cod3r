package sec15_JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingADataBase {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnectionMySQL();
		System.out.println("Conexão efetuada com sucesso!");
		
		// O OBJETO stmt É O RESPONSÁVEL PARA CRIAR A DECLARAÇÃO SQL A SER EXECUTADA.
		Statement stmtSql = connection.createStatement();
		stmtSql.execute("CREATE DATABASE IF NOT EXISTS java_cod3r;");
		System.out.println("Banco de Dados criado com sucesso!");
		
		// connection.close();
		
	}

}
