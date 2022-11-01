package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Users;

// OBTENDO USUÁRIO...
public class ProgramSelectingUser {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySQL_curso_java_cod3r");
		EntityManager em = emf.createEntityManager();
		
		Users user = em.find(Users.class, 4);
		System.out.println(user.getName());
		
		em.close();
		emf.close();
	
	}
	
}
