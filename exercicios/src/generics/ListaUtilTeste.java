package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("PHP", "C#", "Java", "JS");
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		// NAO USANDO METODOS GENERICOS
		// POR CONTA DISSO TENDO QUE ESPECIFICAR O TIPO
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);
		Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero1);
		
		// USANDO METODOS GENERICOS 
		System.out.println();
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		Integer ultimoNumero2 =  ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNumero2);
		
		
	}
}
