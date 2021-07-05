package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class CalculoCelsiusFahrenheit {

	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius:");
		double celsius = entrada.nextDouble();
		
		final double ajuste = 9.0 / 5.0;
		double fahrenheit = (celsius * ajuste) + 32;
		System.out.printf("A temperatura em Fahrenheit é igual a: %.2f°F", fahrenheit);
		
		entrada.close();
	}
}
