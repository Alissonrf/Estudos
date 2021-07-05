package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {
		
		// System.out.println(segredo); // PRIVADO APENAS A ANA CONSEGUE VER
		// System.out.println(facoDentroDeCasa); NAO ACESSA O DEFAULT PQ NAO ESTA NO MESMO PACOTE MESMO IMPORTANDO
		// System.out.println(new Ana(.formaDeFalar)); // NAO FUNCIONA ASSIM
	
		System.out.println(formaDeFalar); // NAO PRECISA INTANCIAR A ANA EU JA HERDEI OS ATRIBUTOS
		System.out.println(new Ana().todosSabem);
		System.out.println(todosSabem);
		
		
	}
}
