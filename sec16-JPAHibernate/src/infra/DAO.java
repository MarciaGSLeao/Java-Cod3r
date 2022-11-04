package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("mySQL_curso_java_cod3r");
		}catch (Exception e) {
			// logar -> log4j
		}
	}
	
	public DAO() {
		this(null);
	}

	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> openTransaction(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> closeTransaction(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> insert(E entity){
		em.persist(entity);
		return this;
	}
	
	public DAO<E> insertAtomic(E entity){
		return this.openTransaction().insert(entity).closeTransaction();
	}
	
	public List<E> obtainAll(int quantityRegister, int offset){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		// Toda consulta em jqpl precisa de um alias.. nesse caso é o 'e'.
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(quantityRegister);
		query.setFirstResult(offset);
		return query.getResultList();
	}
	
	public void close() {
		em.close();
	}
	
}
