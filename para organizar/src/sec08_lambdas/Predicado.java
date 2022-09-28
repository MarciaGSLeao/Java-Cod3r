package sec08_lambdas;

import java.util.function.Predicate;

import sec08_lambdas.entities.Product;

public class Predicado {
	
	public static void main(String[] args) {
		
		// O PREDICATE RECEBE UM TIPO COMO PRAMETRO  E DEVOLVE UM VALOR BOOLEANO.
		Predicate<Product> isCaro = 
				prod -> (prod.getPrice() >= 750);
				
		Product product = new Product("Smartphone Moto X", 1499.99, 0.1);
		
		System.out.println(isCaro.test(product));
		
		Predicate<Integer> isPair = number -> number %2 == 0;
		Predicate<Integer> hasThreeNumbers = 
				number -> number >= 100 && number <= 999;
				
		System.out.println(isPair.test(22));
		System.out.println(hasThreeNumbers.test(553));
		System.out.println(hasThreeNumbers.and(isPair).test(110));
		
	}

}
