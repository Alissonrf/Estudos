package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class Elevados {

	public static void main(String[] args) {
		// Criar um programa que leia um valor 
		// e apresente os resultados ao quadrado e ao cubo do valor.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		double num = entrada.nextDouble();
		
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("Elevado ao quadrado é igual a : %.2f\n"
				+ " e ao cubo é igual a: %.2f", quadrado, cubo);
		
		entrada.close();
	}
}
