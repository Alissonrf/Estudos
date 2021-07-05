package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e add adcionam elemento na fila!!
		
		// Diferença é o comportamento ocorre quando a fila esta cheia!!!
		
		fila.add("Pedro"); //Retorna false
		fila.offer("Leo"); // lança uma exceção (erro)
		fila.add("Ana");
		fila.offer("Joao");
		fila.add("Alisson");
		fila.offer("Alisson");
		
		// Peek e elemente -> Obter proximo elemento da fila sem remover
		
		// Diferença é o comportamento ocorre quando a fila esta vazia!!!
		
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Retorna uma exceção (erro)
		System.out.println(fila.element());
		
		// Pool e remove -> obter o proximo elemento da fila e remove
		// Diferença é o comportamento ocorre quando a fila esta vazia!!!
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		// System.out.println(fila.remove()); // Lança uma exceção (erro)
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		//...
	}
}
