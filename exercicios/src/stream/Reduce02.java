package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alisson", 8.1);
		Aluno a2 = new Aluno("Juca", 3.1);
		Aluno a3 = new Aluno("Gui", 9.1);
		Aluno a4 = new Aluno("Bia", 7.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somaNotas = (a,b) -> a + b;
		
		alunos.stream()
		.filter(aprovado)
		.map(apenasNota)
		.reduce(somaNotas)
		.ifPresent(System.out::println);
	}
}
