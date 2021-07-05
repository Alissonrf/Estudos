package modelo.consulta;

import infra.DAO;

public class ObterMediaDosFilmes {

	public static void main(String[] args) {
		
		DAO<NotaFilme> dao = new DAO<>();
		
		NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");
		
		System.out.println(nota.getMedia());
		
		dao.fechar();
		
	}
}
