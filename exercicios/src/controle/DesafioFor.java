package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
//		String valor = "";
//		for(int i = 1; 1 < 5; i++) {
//			System.out.println(valor);
//			valor += "#";
//		}
		
		//DESAFIO FAZER O MESMO FOR MAS SEM USAR VALORES NUMERICOS!!!!
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			
			System.out.println(v);
		}
	}
}
