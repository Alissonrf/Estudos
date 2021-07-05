package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;
	
	public boolean atacar(Jogador oponente) {
		
		int deltaX =  Math.abs(x - oponente.x);
		int deltaY =  Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}else if(deltaY == 0 && deltaX == 1) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	public boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE && y <99) {
			y++;
		}else if(direcao == Direcao.SUL && y > 0){
			y--;
		}else if(direcao == Direcao.LESTE && x < 99){
			x++;
		}else if(direcao == Direcao.OESTE && x > 0){
			x--;
		}else {
		}
		
		return true;
	}
}
