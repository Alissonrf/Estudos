package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Dragon Ball Brolly", 10.0);
		Filme filmeB = new Filme("Dragon Ball Batalha dos Deuses", 9.99);
		
		Ator atorA = new Ator("Goku");
		Ator atorB = new Ator("Bills");
		
		
		filmeA.adcionarAtor(atorA);
		filmeA.adcionarAtor(atorB);
		
		filmeB.adcionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		
		dao.incluirAtomico(filmeA);
	}
}
