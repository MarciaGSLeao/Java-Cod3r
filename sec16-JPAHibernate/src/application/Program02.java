package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.User;

// OBTENDO USUÁRIO...
public class Program02 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sec16-JPAHibernate");
		EntityManager em = emf.createEntityManager();
		
		User user = em.find(User.class, 1L);
		System.out.println(user.getName());
		
		em.close();
		emf.close();
	
	}
	
}
