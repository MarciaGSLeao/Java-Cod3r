package exercises;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingData {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = ConnectionFactory.getConnectionMySQL();
		Scanner sc = new Scanner(System.in);
		String sql = "INSERT INTO pessoas (nome) VALUES(?)";

		System.out.print("Informe o nome: ");
		String name = sc.nextLine();
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, name);
		stmt.execute(); // O COMANDO ACIMA APENAS FAZ UM SET NA STRING DO PREPARED STATEMENT DO PARAÂMTERO. AQUI HÁ DE FATO A EXECUÇÃO.
		System.out.println("Dado inserido com sucesso!");
		
		//System.out.println("Conexão criada com sucesso!");
		//connection.close();
		
		sc.close();
		
	}

}
