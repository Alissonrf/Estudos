package oo.composicao.projeto2;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	double getValorTotal() {
		double total = 0;
		
		for( Item Item : itens) {
			total += Item.quantidade * Item.preco;
		}
		
		return total;
	}
	
}
