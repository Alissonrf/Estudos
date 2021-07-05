package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	double ObterValorTotal() {
		double total = 0;
		
		for(Compra compraAtual: compras){
			total += compraAtual.obterValorTotal();
		}
		
		return total;
	}
}
