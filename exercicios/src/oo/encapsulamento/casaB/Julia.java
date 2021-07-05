package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	
	void testeAcessos() {
		Ana sogra = new Ana();
		
		// System.out.println(esposa.segredo); // NAO ACESSA PRIVATE APENAS A ANA CONSEGUE VER
		// System.out.println(sogra.facoDentroDeCasa); // NAO ACESSA OS DEFAULTS POIS NAO ESTA NA MESMA CLASSE
		// System.out.println(sogra.formaDeFalar); NAO ACESSA OS PROTECTED PQ NAO FOI HERDADO
		System.out.println(sogra.todosSabem);
	}
}
