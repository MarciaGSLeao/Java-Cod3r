package application;

import infra.DAO;
import model.entities.Products;
import model.oneToMany.Orders;
import model.oneToMany.Clients;
import model.oneToMany.Items;

public class ProgramCreatingOrder {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
/*		
		Orders order = new Orders();
		Products product = new Products("Monitor 24'", 1599.90);
		Items item = new Items(order, product, 2.0);
		
		dao.openTransaction()
 		   .insert(product)
		   .insert(order)
		   .insert(item)
		   .closeTransaction()
		   .close();
*/
		Clients client = new Clients("Maria Raquel");
		Orders order = new Orders(client);
		Products product = new Products("Headphone wi-fi", 259.00);
		Items item = new Items(order, product, 2.0);
		
		dao.openTransaction()
		   .insert(client)
 		   .insert(product)
		   .insert(order)
		   .insert(item)
		   .closeTransaction()
		   .close();
		
	}

}
