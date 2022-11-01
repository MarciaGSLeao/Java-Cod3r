package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.entities.Users;

// OBTENDO USUÁRIOS ...
public class ProgramSelectingUsers {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySQL_curso_java_cod3r");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Users u";
		
		TypedQuery<Users> query = em.createQuery(jpql, Users.class);
		query.setMaxResults(5);
		
		List<Users> usersList = query.getResultList();
		
		for(Users user : usersList) {
			System.out.println("ID: " + user.getId()
					+ "; Nome: " + user.getName()
					+ "; E-mail: " + user.getEmail());
		}
		
		em.close();
		emf.close();
	
	}
	
}
