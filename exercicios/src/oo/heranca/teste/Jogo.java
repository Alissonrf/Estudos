package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		Heroi heroi = new Heroi();
		Monstro monstro = new Monstro();
		
		monstro.x = 10;
		monstro.y = 9;
		heroi.x = 10;
		heroi.y = 10;
		
		heroi.atacar(monstro);
		heroi.atacar(monstro);

		System.out.println("Monstro tem "+monstro.vida + " de vida");
		System.out.println("Heroi tem "+heroi.vida + " de vida");
	}
}
