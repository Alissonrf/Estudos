package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(1); // int -> Integer
		conjunto.add("Teste");
		conjunto.add("x");
		conjunto.add(true); // boolean -> Boolean 
		
		System.out.println("Tamanho é " + conjunto.size()); 
		
		conjunto.add("teste");
		conjunto.add("Teste"); // Quando ja existe ele ignora
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("x"));
		System.out.println(conjunto.remove(false));
		System.out.println("\nTamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains(1));
		System.out.println("");
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(3);
		nums.add(2);
		
		System.out.println(nums);
		System.out.println(conjunto);
		System.out.println("");
		
		// conjunto.add(nums); // União de dois conjuntos
		
		conjunto.retainAll(nums); // Interseção entre dois conjuntos
		
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
