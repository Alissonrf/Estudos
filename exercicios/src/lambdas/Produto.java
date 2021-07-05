package lambdas;

public class Produto extends Object{
	// TODA CLASSE HERDA DE OBJECT ELA É A MAE DE TODAS!!!

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		return nome + " Tem preço: "+ (preco * (1 - desconto));
	}
	
	
}
