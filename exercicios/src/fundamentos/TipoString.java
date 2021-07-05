package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá Boa noite".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "@@@");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Alisson";
		var sobrenome = "Flores";
		var idade = 18;
		var salario = 3200.7777;
		
		System.out.println("\n\nNome: " + nome +"\nSobrenome: "+ sobrenome +"\nTem "+ 
		idade +" Anos \nRecebe " + salario +"R$ \n\n");
		
		System.out.printf("O senhor %s %s tem %d e recebe R$%.2f \n\n", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d e recebe R$%.2f", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}
}
