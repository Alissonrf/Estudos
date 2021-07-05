package classe.DesafioModulo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa alisson = new Pessoa("Alisson", 70);
		Comida c1 = new Comida("Feijão", 0.500);
		//Comida c2 = new Comida("Arroz", 0.200);
		Comida c3 = new Comida("Bife", 1);
		
		System.out.println(alisson.apresentar());
		alisson.comer(c1);
		alisson.comer(c3);
		System.out.println("Agora peso: " +alisson.peso +"kgs");
		
	}
}
