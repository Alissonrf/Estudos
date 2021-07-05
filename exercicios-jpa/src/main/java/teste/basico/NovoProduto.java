package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		Produto produto = new Produto("Monitor144hz", 1200.66);
		
		DAO<Produto> dao = new DAO<Produto>(Produto.class);
		dao.incluirAtomico(produto).fechar();
		System.out.println("Id do produto é: " + produto.getId());
	}
}
