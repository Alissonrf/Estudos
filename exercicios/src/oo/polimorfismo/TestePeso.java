package oo.polimorfismo;

public class TestePeso {

	public static void main(String[] args) {
		
		Pessoa Alisson = new Pessoa("Alisson", 90.0);
		
		Arroz arroz = new Arroz(0.3);
		Feijao feijao = new Feijao(0.25);
		Sorvete sorvete = new Sorvete(0.9);
		Comida arrozao = new Arroz(2);
		
		Alisson.comer(arroz);
		Alisson.comer(feijao);
		Alisson.comer(sorvete);
		Alisson.comer(arrozao);
		
		System.out.println(Alisson.getPeso());
		
		
	}
}
