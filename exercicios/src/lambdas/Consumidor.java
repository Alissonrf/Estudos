package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Computador", 2500, 0.89);
		Produto p2 = new Produto("Nootebok", 1500, 0.02);
		Produto p3 = new Produto("Mouse", 250, 0.3);
		Produto p4 = new Produto("Teclado", 300, 0.13);
		Produto p5 = new Produto("MousePad", 98, 0.18);
	
		imprimirNome.accept(p1);
		
		System.out.println();
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
