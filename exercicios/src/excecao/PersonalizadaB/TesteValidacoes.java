package excecao.PersonalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Alisson", 6);
		
		try {
			Validar.aluno(a1);
		} catch (StringVaziaException | NumeroForaDoIntervaloException e) {
			System.out.println(e.getMessage());
		}
		// Posso colocar as exceções em catchs diferentes por elas terem o mesmo tratamento,
		// Mas assim economizo linhas de codigo.
		// Poderia ter usado (catch RunTimeException) mas assim eu trato as exeções especificas.
		System.out.println("FIM");
		
	}
}
