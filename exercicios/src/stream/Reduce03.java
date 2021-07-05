package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {

	public static void main(String[] args) {
			Aluno a1 = new Aluno("Alisson", 8.0);
			Aluno a2 = new Aluno("Juca", 3.0);
			Aluno a3 = new Aluno("Gui", 9.0);
			Aluno a4 = new Aluno("Bia", 7.0);
			
			List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
			
			Predicate<Aluno> aprovado = a -> a.nota >= 7;
			Function<Aluno, Double> apenasNota = a -> a.nota;
			BiFunction<Media, Double, Media> calcularNota = 
					(media, nota) -> media.adcionar(nota);
			BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.mediaFinal(m1, m2);
			
			Media media = alunos.stream()
							.filter(aprovado)
							.map(apenasNota)
							// .reduce( VALOR INICIAL, FUNÇAO ACUMULADORA, FUNÇAO COMBINADORA);
							.reduce(new Media(), calcularNota, combinarMedia);
			System.out.println("A média da turma é: " + media.getValor());
			
	}
}
