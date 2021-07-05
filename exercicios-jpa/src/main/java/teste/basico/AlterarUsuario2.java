package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// buscar usuario pelo ID 1
		Usuario usuario = em.find(Usuario.class, 1L);

		// Atualizar suas credencias
		usuario.setNome("André");

		
		// MESMO SEM CHAMAR O MERGE O OBJETO CONTINUA SENDO GERENCIADO
		// POR CONTA DISSO ELE É ALTERADO NO BANCO DE DADOS MESMO SEM O MERGE!!!
		// merge é responsavel pelo update
		//em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}

