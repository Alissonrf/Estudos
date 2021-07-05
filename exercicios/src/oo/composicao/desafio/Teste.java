package oo.composicao.desafio;

public class Teste {

	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1 , 100);
		compra1.adicionarItem("PC", 2000, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Lapis", 2 , 10);
		compra2.adicionarItem("PC", 1000, 1);
		
		Cliente cliente = new Cliente("Alisson Reinaldo Flores");
		
		cliente.compras.add(compra1); // adicionar assim ou
		cliente.adicionarCompra(compra2); //assim 
		
		System.out.println(cliente.ObterValorTotal());
		
		
	}
}
