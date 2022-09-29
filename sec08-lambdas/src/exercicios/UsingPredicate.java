package exercicios;

import java.util.function.Predicate;

import entities.Product;

public class UsingPredicate {

	public static void main(String[] args) {
		
		Product product1 = new Product("Notebook", 3999.89, 0.2);
		Product product2 = new Product("Kit Teclado+Mouse Wi-fi", 299.89, 0.2);
		
		Predicate<Product> isExpensive =
				prod -> prod.getPrice() >= 1000.00;
				
		System.out.println(isExpensive.test(product1));
		System.out.println(isExpensive.test(product2));
				
	}
	
}
