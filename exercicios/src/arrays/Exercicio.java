package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAluno = new double[4];
		System.out.println(Arrays.toString(notasAluno));
		
		notasAluno[0] = 7.9;
		notasAluno[1] = 9.9;
		notasAluno[2] = 6.1;
		notasAluno[3] = 10;
		
		System.out.println(Arrays.toString(notasAluno));
		System.out.println(notasAluno.length - 1);
		System.err.println(notasAluno[0]);
		System.err.println(notasAluno[1]);
		System.err.println(notasAluno[2]);
		
		// SE PRINTAR (notasAluno) O resultado fica incompreensivel!!!
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAluno.length; i++) {
			totalAlunoA += notasAluno[i];
		}
		System.out.println(totalAlunoA / notasAluno.length);
		
		double totalAlunoB = 0;
		
		double[] notasAlunoB = {10, 4.5, 9.8, 8.9};
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
