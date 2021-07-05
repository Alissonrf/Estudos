package jdbc;

//import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {

	public static Connection getConexao() {
		try {
//			Properties prop = getProperties();
//			final String url = prop.getProperty("banco.url");
			final String url = "jdbc:mysql://localhost/curso_java ";
			final String usuario = "root";
			final String senha = "C.ronaldo@10";
			
			return DriverManager
					.getConnection(url, usuario, senha);
		} catch (SQLException  e) {
			throw new RuntimeException(e);
		}
	}
	
//	private static Properties getProperties() throws IOException {
//		Properties prop = new Properties();
//		String caminho = "/conexao.properties";
//		prop.load(FabricaDeConexao.class.getResourceAsStream(caminho));
//		return prop;
//	}
}
