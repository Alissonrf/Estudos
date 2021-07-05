package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Alisson".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Alisson")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
	}
}
