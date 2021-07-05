package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		Assento assento = new Assento("4J");
		Cliente cliente = new Cliente("Eduardo", assento);
		
		DAO<Cliente> dao = new DAO<Cliente>();
		
		dao.incluirAtomico(cliente);
	}
}
