package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistros {

	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);

		Connection conexao = FabricaDeConexao.getConexao();
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = 1 ";
		
//		update estados
//		set nome = 'Maranhão'
//		where sigla = 'MA'
		
		System.out.println("Qual o novo nome do usuario?");
		String novoNome = entrada.next();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, novoNome);
		stmt.execute();
		
		System.out.println("Nome do usuario atualizado");
		entrada.close();
		stmt.close();
		conexao.close();
		
	}
}
