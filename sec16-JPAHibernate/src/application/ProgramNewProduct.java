package application;

import infra.DAO;
import model.entities.Products;

public class ProgramNewProduct {

	public static void main(String[] args) {
		
		Products product1 = new Products("Caneta", 3.55);
		Products product2 = new Products("Lápis", 1.80);
		Products product3 = new Products("Borracha", 2.77);
		Products product4 = new Products("Cadero", 18.99);
		
		DAO<Products> dao = new DAO<>(Products.class);
		
		// INSERÇÃO CHAMANDO OS MÉTODOS SEPARADAMENTE.
		dao.openTransaction().insert(product1).closeTransaction().close(); 
		
		dao.insertAtomic(product2);
		dao.insertAtomic(product3);
		dao.insertAtomic(product4);
	
	}
}
