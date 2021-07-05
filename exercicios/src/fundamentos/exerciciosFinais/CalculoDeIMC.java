package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class CalculoDeIMC {

	public static void main(String[] args) {
		// Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a sua altura em cm:");
		double altura = entrada.nextDouble();
		
		System.out.print("Digite o seu peso em kg:");
		double peso = entrada.nextDouble();
		
		//double altura2 = Math.pow(altura, 2);
		
		double imc = peso / altura;
		
		System.out.println(imc);
		
		
		entrada.close();
	}
}
