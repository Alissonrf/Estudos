package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		
		// System.out.println(esposa.segredo); // PRIVATE APENAS A CLASSE ANA CONSEGUE VER
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}
