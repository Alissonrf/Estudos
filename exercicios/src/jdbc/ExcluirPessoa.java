package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o codigo a ser deletado: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaDeConexao.getConexao();
		String sql = "DELETE FROM pessoas where codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!");			
		}else {
			System.out.println("Codigo invalido!");
		}
		
		conexao.close();
		entrada.close();
	}
}
