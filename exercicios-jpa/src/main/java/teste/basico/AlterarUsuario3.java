package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		// buscar usuario pelo ID 1
		Usuario usuario = em.find(Usuario.class, 1L);
		// detach é o desassociador do objeto gerenciado
		// agora é necessario o merge para alterar o objeto no banco de dados!!
		em.detach(usuario);
		// Atualizar suas credencias
		usuario.setNome("André");

		// merge é responsavel pelo update
		em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
