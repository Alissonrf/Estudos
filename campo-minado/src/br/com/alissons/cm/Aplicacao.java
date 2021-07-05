package br.com.alissons.cm;

import br.com.alissons.cm.modelo.Tabuleiro;
import br.com.alissons.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(5,5,10);
		
		new TabuleiroConsole(tabuleiro);
	}
}
