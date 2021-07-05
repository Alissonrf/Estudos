package lambdas;

public class CaculoTeste1 {

	public static void main(String[] args) {
		
		Calculo soma = new Somar();
		System.out.println(soma.executar(3, 2));
		
		Calculo multiplicacao = new Multiplicar();
		System.out.println(multiplicacao.executar(3, 2));
		
	
	
	}
}
