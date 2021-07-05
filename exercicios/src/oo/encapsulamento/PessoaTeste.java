package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Alisson", "Flores", 30);
		
		p1.setIdade(-20);
		System.out.println("Ola meu nome é " + p1.getNomeComplet() + " e tenho " + p1.getIdade() + " Anos");

		p1.setIdade(18);
		System.out.println("Ola meu nome é " +p1.getNomeComplet() + " e tenho " + p1.getIdade() + " Anos");
	
		
	}
}
