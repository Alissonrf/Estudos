package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ingelore");
		lista.add(u1);
		
		lista.add(new Usuario("Alisson"));
		lista.add(new Usuario("Joao"));
		lista.add(new Usuario("Joao"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Andersson"));
		
		System.out.println(lista.get(3));
		System.out.println("");
		
		System.out.println(lista.remove(new Usuario("Alisson"))); // true or false
		System.out.println(">>>" + lista.remove(1)); //Mostra quem foi removido
		System.out.println("Tem? " + lista.contains(new Usuario("Andersson")));
		System.out.println("Tem? " + lista.contains(u1));
		System.out.println("");
		
		for(Usuario u : lista) {
			System.out.println(u);
		}
	}
}
