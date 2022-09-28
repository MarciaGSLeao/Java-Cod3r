package sec08_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import sec08_lambdas.entities.Product;

public class Consumidor {
	
	public static void main(String[] args) {
		
		// A interface funcional COnsumer não traz retorno (void).
		Consumer<Product> printName = 
		p -> System.out.println(p.getName() + "!");
		
		Product prod1 = new Product("Secador de Cabelo", 159.90, 0.05);
		Product prod2 = new Product("Escova para Cabelo", 29.90, 0.05);
		Product prod3 = new Product("Creme Depilatório", 18.90, 0.05);
		Product prod4 = new Product("Hidratante Facial", 25.70, 0.05);
		Product prod5 = new Product("Protetor Labial", 9.90, 0.05);
		
		List<Product> listProduct = Arrays.asList(prod1, prod2, prod3, prod4, prod5);
		
		listProduct.forEach(printName);
		System.out.println();
		listProduct.forEach(p -> System.out.printf("R$ %.2f%n", p.getPrice()));
		System.out.println();
		listProduct.forEach(System.out::println);
		
		
		
	}
	
	
}
