package oo.heranca.desafio;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	
	// VOCE NAO É O OBRGIADO A IMPLEMENTAR ESSE METODO POIS MUDOU O ESCOPO DELE PARA DEFAULT
	default int velocidadeAr() {
		return 1;
	}
	
}
