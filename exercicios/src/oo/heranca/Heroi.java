package oo.heranca;

public class Heroi extends Jogador{

	public boolean atacar(Jogador oponente) {
		// 3 ataques pois o ataque do heroi da 3x o dano normal
		boolean ataque = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque || ataque2 || ataque3;
	}
}
