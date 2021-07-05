package generics;

public class CaixaIntegerTeste {

	public static void main(String[] args) {
		CaixaInteger caixaA = new CaixaInteger();
		caixaA.guardar(3);
		System.out.println(caixaA.abrir());
	}
}
