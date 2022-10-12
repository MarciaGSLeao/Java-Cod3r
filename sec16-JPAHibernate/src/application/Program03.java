package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.entities.User;

// OBTENDO USUÁRIOS ...
public class Program03 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sec16-JPAHibernate");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from User u";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		query.setMaxResults(2);
		
		List<User> usersList = query.getResultList();
		
		for(User user : usersList) {
			System.out.println("ID: " + user.getId()
					+ "; E-mail: " + user.getEmail());
		}
		
		em.close();
		emf.close();
	
	}
	
}
