package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Computador gamer",4300.5);
		
		
		var p2 = new Produto();
		p2.nome = "Celular Razer";
		p2.preco = 1500.99;
		Produto.desconto = 0.5;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média do carrinho é igual a: R$%.2f", mediaCarrinho);
	}
}
