package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.User;

// ALTERAR USUÁRIO...
public class Program04 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sec16-JPAHibernate");
		EntityManager em = emf.createEntityManager();
		
		User user = em.find(User.class, 5L);
//		System.out.println(user.getId() + " -> " + user.getName() + " -> " + user.getEmail());
		user.setName("Vinny");
		user.setEmail("vinny@gmail.com");
		
		em.getTransaction().begin();
		em.detach(user);
		em.merge(user); // o método 'merge' é o responsável por realizar a atualização do campo no banco de dados.
		                // Mesmo que ele não seja explicitamente citado no código fonte, e houver um contexto transacional
		                // ainda assim, a atualização do campo ocorrerá pois o objeto se encontrará em um estado gerenciado.
		em.getTransaction().commit();
		System.out.println(user.getId() + " -> " + user.getName() + " -> " + user.getEmail());
		
		em.close();
		emf.close();
		
	}
}
