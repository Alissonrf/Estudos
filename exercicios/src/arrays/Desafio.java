package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas voce quer informar? ");
		int numeroNotas = entrada.nextInt();
		
		double[] notas = new double[numeroNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d ", i + 1);
			double nota = entrada.nextDouble();
			notas[i] = nota;
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / numeroNotas;
		System.out.println(media);

		entrada.close();
	}
}
