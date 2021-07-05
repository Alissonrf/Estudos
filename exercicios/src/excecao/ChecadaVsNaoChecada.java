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
	
	// Exceção NÃO checada ou NÃO verificada 
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	// Exceçao CHECADA! ou VERIFICADA!
	// Quando é Exception é necessario o throws Exception 
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02");
	}
}

