package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar";
		
		System.out.println(parOuImpar.apply(33));
		
		Function<String, String> Resultado = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		// andThen == E entao.... 
		// Ou seja estou chamando o metodo parOuImpar de 32 e entao chamo a função Resultado
		// O apply ta sendo aplicado na primeira função!!! (parOuImpar)
		
		String ResultadoFinal = parOuImpar.andThen(Resultado).andThen(empolgado).apply(32);
		
		System.out.println(ResultadoFinal);
	}
}
