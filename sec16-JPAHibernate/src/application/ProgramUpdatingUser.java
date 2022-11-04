package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Users;

// ALTERAR USUÁRIO...
public class ProgramUpdatingUser {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mySQL_curso_java_cod3r");
		EntityManager em = emf.createEntityManager();
		
		Users user = em.find(Users.class, 1);
		System.out.println("REGISTRO = " + user.getId() + " -> " + user.getName() + " -> " + user.getEmail());
		user.setName("Vinicius");
		user.setEmail("vinicius@gmail.com");
		
		em.getTransaction().begin();
		em.detach(user);// o método 'detach' passa o objeto referenciado entre parênteses para um estado "não-gerenciado", 
						// o que significa que se alguma alteração for feita, só trará efeito se o método 'merge' for chamado posteriormente.
		em.merge(user); // o método 'merge' é o responsável por realizar a atualização do campo no banco de dados.
		                // Mesmo que ele não seja explicitamente citado no código fonte, e houver um contexto transacional
		                // ainda assim, a atualização do campo ocorrerá pois o objeto se encontrará em um estado gerenciado.
		em.getTransaction().commit();
		System.out.println("REGISTRO ATUALIZADO = " + user.getId() + " -> " + user.getName() + " -> " + user.getEmail());
		
		em.close();
		emf.close();
		
	}
}
