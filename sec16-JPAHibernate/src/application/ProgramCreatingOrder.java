package application;

import infra.DAO;
import model.entities.Products;
import model.oneToMany.Orders;
import model.oneToMany.Items;

public class ProgramCreatingOrder {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Orders order = new Orders();
		Products product = new Products("Notebook", 6899.900);
		Items item = new Items(order, product, 6.0);
		
		dao.openTransaction()
 		   .insert(product)
		   .insert(order)
		   .insert(item)
		   .closeTransaction()
		   .close();

	}

}
