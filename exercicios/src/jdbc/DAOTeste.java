package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
		System.out.println(dao.incluir(sql, "Pedro Luiz"));
		System.out.println(dao.incluir(sql, "Luiz Pedro"));
		System.out.println(dao.incluir(sql, "Pedro Pedro"));
		
		dao.close();
	}
}
