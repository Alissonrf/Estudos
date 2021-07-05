package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste extends Carro{


	protected CarroTeste(int velocidadeMaxima) {
		super(velocidadeMaxima);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(315);
		Carro civic = new Civic(200);
		
		civic.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.ligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.desligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari);
		System.out.println(civic);
		
		System.out.println(ferrari.velocidadeAr());
	}
}
