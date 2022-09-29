package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class UsingConsumer {
	
	public static void main(String[] args) {
		
		Consumer<Product> printNameAndPrice = 
				product -> System.out.println(product.getName() + " custa R$ " + product.getPrice());
	
		Product p1 = new Product("Caneta", 12.00, 0.1);
		Product p2 = new Product("Lápis", 2.00, 0.1);
		Product p3 = new Product("Borracha", 1.50, 0.1);
		Product p4 = new Product("Corretivo", 3.80, 0.1);
		Product p5 = new Product("Apontador", 3.20, 0.1);
		
		List<Product> productsList = Arrays.asList(p1, p2, p3, p4, p5);
		
		productsList.forEach(printNameAndPrice);
	
	}

}
