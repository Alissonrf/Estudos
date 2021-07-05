package controle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média do aluno:");
		double media = entrada.nextDouble();
		
		
		if(media >=7) {
			System.out.println("Aprovado!!!");
			System.out.println("Parabens!!!");
		}
		if(media < 7 && media >=4.5)
			System.out.println("Em Recuperação!!!");
		
		if(media < 4.5)
			System.out.println("Reprovado!!!");
		
		entrada.close();
		
	}
}
