package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinEMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alisson", 10);
		Aluno a2 = new Aluno("Juca", 3.1);
		Aluno a3 = new Aluno("Gui", 9.1);
		Aluno a4 = new Aluno("Bia", 7.0);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota)return 1;
			if(aluno1.nota < aluno2.nota)return -1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota)return -1; // valor invertido
			if(aluno1.nota < aluno2.nota)return 1; // valor invertido
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		// RESULTADO INVERSO POIS OS VALORES DO IF ESTÃO INVERTIDOS!!!
		System.out.println(alunos.stream().min(piorNota).get());
		System.out.println(alunos.stream().max(piorNota).get());
	}
}
