package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		System.out.println("Tipo String...");
		Caixa<String> caixa1 = new Caixa<>();
		caixa1.guardar("Conteudo!");
		System.out.println(caixa1.abrir());
		
		System.out.println("\nTipo Double...");
		Caixa<Double> caixa2 = new Caixa<>();
		caixa2.guardar(7.2);
		System.out.println(caixa2.abrir());
		
		System.out.println("\nTipo Integer...");
		Caixa<Integer> caixa3 = new Caixa<>();
		caixa3.guardar(9);
		System.out.println(caixa3.abrir());
	}
}
