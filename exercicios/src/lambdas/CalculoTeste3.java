package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// Existem diversos metodos prontos onde nao preciso criar como fiz na Interface Calculo
		// S� preciso importalos da biblioteca Java.util
		// BinaryOperator � um m�todo do java.util
		// Ele s� aceita tipo classe logo -> Double, Integer... e n�o double, int
		
		BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
		System.out.println(calculo.apply(2.0, 3.0));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y; };		
		System.out.println(calculo2.apply(2, 3));
		
		calculo2 = (x, y) -> x * y;
		System.out.println(calculo2.apply(2, 3));
	}
}
