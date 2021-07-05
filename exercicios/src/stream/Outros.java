package stream;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alisson", 8.1);
		Aluno a2 = new Aluno("Juca", 3.1);
		Aluno a3 = new Aluno("Gui", 9.1);
		Aluno a4 = new Aluno("Bia", 7.0);
		Aluno a5 = new Aluno("Alisson", 8.1);
		Aluno a6 = new Aluno("Juca", 3.1);
		Aluno a7 = new Aluno("Gui", 9.1);
		Aluno a8 = new Aluno("Bia", 7.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("Distinct...");
		alunos.stream()
		.distinct() // DISTINTA -> NAO PEGUE ELEMENTOS REPETIDOS PRECISA DO HASHCODE E EQUALS
		.forEach(System.out::println);
		
		System.out.println("\nSkip e Limit...");
		alunos.stream()
		.distinct()
		.skip(2) // PULE
		.limit(1) // LIMITE
		.forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7) // PEGUE ENQUANTO...
		.forEach(System.out::println);
	}
}
