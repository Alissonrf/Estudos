package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		
		// 1. Apartir do produto calcular o preço real (preço * desconto)
		// 2. Imposto municipal: >= 2500(8.5%) < 2500 (Isento)
		// 3. Frete >= 3000 (100)/ < 3000 (50)
		// 4. Arredondar: Deixar duas casas decimais
		// 5. Formatar R$ 1234,56
		
		Function<Produto, Double> precoReal = 
				p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete =
				preco -> preco >= 3000 ? preco + 100 : preco;
//		UnaryOperator<Double> arredondar =
//				preco -> Double.parseDouble(String.format("%.2f", preco));		
		Function<Double, String> formatar = 
				valor -> ("R$" + valor).replace(".", ",");
		
		Produto produto1 = new Produto("Alisson", 30000, 0.2);
		
		String preco = precoReal
				.andThen(impostoMunicipal)
				.andThen(frete)
//				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto1);
		
		System.out.println("O preço final é: " +preco);
		
	}
}
