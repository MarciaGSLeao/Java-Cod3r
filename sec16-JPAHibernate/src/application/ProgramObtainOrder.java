package application;

import infra.DAO;
import model.oneToMany.Items;
import model.oneToMany.Orders;

public class ProgramObtainOrder {
	
	public static void main(String[] args) {
		
		DAO<Orders> dao = new DAO<>(Orders.class);
		
		Orders order = dao.getById(1);
		
		for(Items item : order.getItems()) {
			System.out.printf("%s - %s = R$ %.2f", item.getQuantity(),item.getProduct().getName(), item.getTotalPriceByItem());
		}
		
		dao.close();
	}

}
