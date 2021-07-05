package oo.composicao.projeto1;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		c1.desligar();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.motor.giro());
		
		c1.acelerar();
		System.out.println(c1.motor.giro());
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		// FALTOU UM DOS PILARES DA OO (ENCAPSULAMENTO)!!!
		// NAO ERA PRA PODER FAZER ISSO
		//c1.motor.fatorInjecao = -90;
		
		System.out.println(c1.motor.giro());
	}
	
}
