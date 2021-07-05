package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		// QUANDO VOCE NAO PASSA NENHUM METODO ESPECIFICO É NECESSARIO COLOCAR OS () NO LAMBDA
		
		Supplier<List<String>> umLista = 
				() -> Arrays.asList("Alisson", "Ingelore", "Jonas", "Andre");
		
		System.out.println(umLista.get());
	}
}
