package application;

import java.util.List;

import infra.DAO;
import model.entities.Products;

public class ProgramSelectingProducts {
	
	public static void main(String[] args) {
		
		DAO<Products> dao = new DAO<>(Products.class);
		
		List<Products> productList = dao.getAll(5, 0);
		
		for(Products product : productList) {
			System.out.println(product.getName());
		}
	}

}
