package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Users;

// EXCLUINDO UM REGISTRO...
public class Program05 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sec16-JPAHibernate");
		EntityManager em = emf.createEntityManager();
		
		Users user = em.find(Users.class, 8L);
		System.out.println("USUÁRIO ENCONTRADO!\nNOME =>  " + user.getName());
		
		if(user != null) {
			em.getTransaction().begin();
			em.remove(user);
			em.getTransaction().commit();
		}
		
		System.out.println("Usuário " + user.getName() + " excluído com sucesso!");
		
		
		em.close();
		emf.close();
		
	}
}
