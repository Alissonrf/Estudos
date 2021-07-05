package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contador = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Digite a nota do aluno:");
			nota = entrada.nextDouble();
			//verificar se a nota é valida
			if (nota < 0 || nota > 10) 
				System.out.println("nota invalida");
			else{
				total += nota;
				contador += 1;
			}
		}
		//calcular a média
		double media = total/contador;
		System.out.printf("A média da turma é igual a: %.2f ", media );
		
		entrada.close();
	}
}