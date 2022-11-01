package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Users;

// INSERINDO DADOS...
public class ProgramInserting {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySQL_curso_java_cod3r");
		EntityManager em = emf.createEntityManager();
		
		Users newUser1 = new Users("Vinny", "vinny@gmail.com");
		Users newUser2 = new Users("Felipe", "felipe@gmail.com");
		Users newUser3 = new Users("João", "joao@gmail.com");
		Users newUser4 = new Users("Helena", "helena@gmail.com");
		
		em.getTransaction().begin();
		em.persist(newUser1);
		em.persist(newUser2);
		em.persist(newUser3);
		em.persist(newUser4);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
