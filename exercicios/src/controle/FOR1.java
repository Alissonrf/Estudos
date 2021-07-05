package controle;

public class FOR1 {

	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 20; contador +=2) {
			System.out.printf("i = %d\n", contador);
		}
		
		int x = 0;
		for(;x <= 10;) {
			System.out.println("x =" + x);
			x++;
		}
		
		// LAÇO INFINITO!!!
	//	for(;;){
	//		System.out.println("fim");	
	}
}
