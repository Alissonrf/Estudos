package generics;

public class CaixaApenasNumeroTeste {

	public static void main(String[] args) {
		
		CaixaApenasNumero<Number> caixaA = new CaixaApenasNumero<>();
		caixaA.guardar(3);
		System.out.println(caixaA.abrir());
	}
}
