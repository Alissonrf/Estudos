package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class CalculoFahrenheitCelsius {

	public static void main(String[] args) {
		// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit:");
		double fahrenheit = entrada.nextDouble();
		
		final double ajuste = 9.0 / 5.0;
		double graus = ((fahrenheit - 32 ) / ajuste);
		System.out.printf("A temperatura em celsius é igual a %.2f°C", graus);
		
		entrada.close();
		
	}
}
