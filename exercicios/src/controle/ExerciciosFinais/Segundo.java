package controle.ExerciciosFinais;

import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
//		2. Criar um programa informa se o ano atual � um ano bissexto;
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um ano");
		int ano = entrada.nextInt();
		
		int bissexto = ano % 4;
		
		if (bissexto == 0) {
			System.out.println("O ano � bissexto!");
		}else {
			System.out.println("O ano n�o � bissexto!");
		}

		entrada.close();
	}
}
