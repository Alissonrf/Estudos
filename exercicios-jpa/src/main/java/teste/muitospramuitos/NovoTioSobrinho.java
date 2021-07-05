package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tio1 = new Tio("Alisson");	
		Tio tio2 = new Tio("Andre");	
		
		Sobrinho sobrinho1 = new Sobrinho("Luca");
		Sobrinho sobrinho2 = new Sobrinho("Nathan");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluirT(tio1)
			.incluirT(tio2)
			.incluirT(sobrinho1)
			.incluirT(sobrinho2)
			.fecharT()
			.fechar();
	}		
}
