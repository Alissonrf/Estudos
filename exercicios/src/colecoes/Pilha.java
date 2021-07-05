package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Don Queixote");
		livros.push("O Hobbit");
		
		//System.out.println(livros.remove());// retorna quem foi removido
		//System.out.println(livros.size());
		
		System.out.println(livros.element());
		System.out.println(livros.peek());
		System.out.println("");
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
	}
}
