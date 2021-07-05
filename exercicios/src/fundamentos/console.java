package fundamentos;

import java.util.Scanner;

public class console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia");
		
		System.out.println("\nBom");
		System.out.println("Dia");
		
		System.out.printf("Megasena %d %d %d %d %d %d %n%n", 1, 2, 3, 4, 5, 6);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome:");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
	}
}
