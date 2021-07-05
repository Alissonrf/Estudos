package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Alisson", "Luca");
		
		System.out.println("Usando Foreach: "); 
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator: "); // Iterator = tem proximo? se sim chama o proximo
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando streams: ");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno!!! facilita a vida.
	}
}
