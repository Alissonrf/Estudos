package oo.composicao.projeto3;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Alisson");
		Aluno aluno2 = new Aluno("Andre");
		Aluno aluno3 = new Aluno("Jonas");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("JavaScript");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno1);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso " +curso1.nome);
			System.out.println("Meu nome é: " + aluno.nome);
		}
		System.out.println();
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso "+curso2.nome );
			System.out.println("Meu nome é: " + aluno.nome);
		}
		System.out.println();
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " +curso3.nome);
			System.out.println("Meu nome é: " + aluno.nome);
		}
		System.out.println();
		System.out.println(aluno1.cursos.get(0).alunos);
	}
}
