package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<Object>();
		
		Produto produto = new Produto("MouseGamer", 99.52);
		Produto produto2 = new Produto("TecladoGamer", 390.34);
		Produto produto3 = new Produto("MousepadGamer", 159.22);
		Produto produto4 = new Produto("HeadSetGamer", 700.37);
		
		Pedido pedido = new Pedido();
		
		ItemPedido item = new ItemPedido(pedido, produto, 1);
		ItemPedido item2 = new ItemPedido(pedido, produto2, 2);
		ItemPedido item3 = new ItemPedido(pedido, produto3, 3);
		ItemPedido item4 = new ItemPedido(pedido, produto4, 4);
		
		dao.abrirT()
			.incluirT(produto)
			.incluirT(produto2)
			.incluirT(produto3)
			.incluirT(produto4)
			.incluirT(pedido)
			.incluirT(item)
			.incluirT(item2)
			.incluirT(item3)
			.incluirT(item4)
			.fecharT()
			.fechar();
	}
}
