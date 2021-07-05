package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrdenado {

	public static void main(String[] args) {
		
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Alisson");
		listaAprovados.add("Lucas");
		listaAprovados.add("Matheus");
		listaAprovados.add("Paulo");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato); 
		}
		
		
	}
}
