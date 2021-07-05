package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Alisson", "Andre", "Ingelore", "jonas");
		
		System.out.println("Forma tradicional...");
		for(String nome : aprovados){
			System.out.println(nome);
		}
		
		System.out.println("\nLambdas#01");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod Reference1...");
		aprovados.forEach(System.out::println);
		
		// Agora utilizando o metodo que eu criei
		// o Method Reference é pouco flexivel então um jeito de modificalo é assim!!!
		
		System.out.println("\nLambdas#02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference2...");
		aprovados.forEach(Foreach::meuImprimir);
	}

	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}

}
