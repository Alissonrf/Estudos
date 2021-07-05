package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario:");
		String valor1 = entrada.nextLine().replace(",", ".");
		double salario1 = Double.parseDouble(valor1);
		
		System.out.print("Digite o segundo salario:");
		String valor2 = entrada.nextLine().replace(",", ".");
		double salario2 = Double.parseDouble(valor2);
		
		System.out.print("Digite o terceiro salario:");
		String valor3 = entrada.nextLine().replace(",", ".");
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2+ salario3) / 3;
		System.out.println(media);
	
		entrada.close();
	}
	
}
