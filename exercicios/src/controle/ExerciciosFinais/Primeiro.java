package controle.ExerciciosFinais;

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
//		1. Criar um programa que receba um n�mero e verifique se ele est�
//		entre 0 e 10 e � par;		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero");
		int numero = entrada.nextInt();
		
		if(numero <= 10 && numero >= 0 && numero % 2 == 0) {
			System.out.println("O numero esta entre 0 e 10 e � par!!");
		}else {
			System.out.println("O numero nao esta entre 0 e 10 ou nao � par!!!");
		}
		

		entrada.close();
	}
}
