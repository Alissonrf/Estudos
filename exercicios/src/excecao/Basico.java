package excecao;

public class Basico {

	public static void main(String[] args) {
		
		
		try {
			System.out.println(7/0);
		} catch (Exception e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());;
		}
		
		try {
			Aluno a1 = null;
			imprimirNomeDoAluno(a1);
		} catch (Exception e) {
			System.out.println("Occoreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim!");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
