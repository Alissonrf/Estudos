package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		//Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		//porteiro.registrarObservador(namorada);
		
		// Não preciso instanciar uma namorada
		// Posso substituir por um lambda ja que a interface é funcional
		
		porteiro.registrarObservador(e -> {
			System.out.println("Supresa!!! via lambda");
			System.out.println("Ocorreu em: " + e.getMomento());
		});
		porteiro.monitorar();
	}
}
