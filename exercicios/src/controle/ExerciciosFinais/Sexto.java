package controle.ExerciciosFinais;

import java.util.Scanner;

public class Sexto {

//	6. Jogo da adivinha��o: Tentar adivinhar um n�mero entre 0 - 100. 
//	Armazene um numero aleat�rio em uma vari�vel. O Jogador tem 10 tentativas 
//	para adivinhar o n�mero gerado. Ao final de cada tentativa, imprima a 
//	quantidadede tentativas restantes,e imprima se o n�mero inserido � maior ou 
//	menor do que o n�mero armazenado.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroAleatorio = 73;
		for (int contador = 10; contador >= 0; contador -= 1) {
			System.out.println("Digite um numero:");
			int tentativa = entrada.nextInt();
			if (tentativa == numeroAleatorio) {
				System.out.println("Parabensss!! voce acertou!");
				break;
			} else if (tentativa != numeroAleatorio && tentativa > numeroAleatorio) {
				System.out.println("errouuuu, muito alto!");
			} else if (tentativa != numeroAleatorio && tentativa < numeroAleatorio) {
				System.out.println("errouuuu, muito baixo!");
			}
			System.out.printf("voce possui mais %d tentativas", contador);
		}
		entrada.close();
	}
}