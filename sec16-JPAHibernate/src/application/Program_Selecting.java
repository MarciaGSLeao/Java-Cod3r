package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.User;

// OBTENDO USUÁRIO...
public class Program_Selecting {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySQL_curso_java_cod3r");
		EntityManager em = emf.createEntityManager();
		
		User user = em.find(User.class, 4);
		System.out.println(user.getName());
		
		em.close();
		emf.close();
	
	}
	
}
