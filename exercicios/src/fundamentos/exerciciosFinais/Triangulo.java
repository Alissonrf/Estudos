package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// Criar um programa que leia o valor da base e da altura de 
		// um tri�ngulo e calcule a �rea.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a base do triangulo em cm");
		double base = entrada.nextDouble();
		
		System.out.println("Digite a altura do triangulo em cm");
		double altura = entrada.nextDouble();
		
		
		double area = (base * altura) / 2;
		
		System.out.printf("A area do triangulo � igual a %.2f cm�", area);
		entrada.close();
	}
}
