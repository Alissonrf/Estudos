package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Precisam ser tratados com Surround with
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("FIM!");
	}
	
	// Exce��o N�O checada ou N�O verificada 
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	// Exce�ao CHECADA! ou VERIFICADA!
	// Quando � Exception � necessario o throws Exception 
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02");
	}
}

