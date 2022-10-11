package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.User;

public class MainProgram {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sec16-JPAHibernate");
		EntityManager em = emf.createEntityManager();
		
		User newUser1 = new User("Vinny", "vinny@gmail.com");
//		User newUser2 = new User("Felipe", "felipe@gmail.com");
//		User newUser3 = new User("João", "joao@gmail.com");
//		User newUser4 = new User("Helena", "helena@gmail.com");
		
		em.getTransaction().begin();
		em.persist(newUser1);
//		em.persist(newUser2);
//		em.persist(newUser3);
//		em.persist(newUser4);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
