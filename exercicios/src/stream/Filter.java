package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alisson", 10);
		Aluno a2 = new Aluno("Jonas", 2.3);
		Aluno a3 = new Aluno("Andre", 1.9);
		Aluno a4 = new Aluno("Pedro", 8.5);
		Aluno a5 = new Aluno("Luca", 4.7);
		Aluno a6 = new Aluno("Ana", 8.1);
		Aluno a7 = new Aluno("Gui", 7.3);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = 
				a -> "Parabens " + a.nome + " Você foi aprovado!";
	
		alunos.stream()
			.filter(aprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}
}
