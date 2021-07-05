package oo.composicao.projeto1;

public class Motor {

	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giro() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
