package oo.composicao.projeto2;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		
		c1.itens.add(new Item("Feijao", 1, 9.90));
		c1.itens.add(new Item("Arroz", 1, 8.90));
		c1.itens.add(new Item("Macarrao", 1, 5.90));
		c1.itens.add(new Item("Tomate", 1, 2.90));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());
	}
}
