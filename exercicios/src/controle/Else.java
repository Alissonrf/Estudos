package controle;

import java.util.Scanner;

public class Else {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um numero");
		double num1 = entrada.nextDouble();
		
		if(num1 % 2 == 0) {
			System.out.println("o numero é par!!!");
		}else {
			System.out.println("o numero é impar!!!");
		}
		
		entrada.close();
		
	}
}
