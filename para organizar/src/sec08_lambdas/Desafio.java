package sec08_lambdas;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

import sec08_lambdas.entities.Product;

public class Desafio {
	
	public static void main(String[] args) {
		
		/* CRIAR UM PRODUTO E...
		 * 1. A partir do produto calcular o preco real com desconto;
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234,56 
		 */
		
		Product product = new Product("Notebook Dell", 5234.89, 0.05);
		
		BiFunction<Double, Double, Double> finalPrice = (price, discount) -> price * (1 - discount);
		UnaryOperator<Double> cityTax = value -> value >= 2500 ? value * 0.085 : 0.0;
		UnaryOperator<Double> freight = value -> value >= 3000 ? 100.0 : 50.0;
				
		System.out.printf("PREÇO COM DESCONTO: R$ %.2f%n", finalPrice.apply(product.getPrice(), product.getDiscount()));
		System.out.printf("IMPOSTO MUNICIPAL: R$ %.2f%n", finalPrice.andThen(cityTax).apply(product.getPrice(), product.getDiscount()));
		System.out.printf("FRETE: R$ %.2f%n", finalPrice.andThen(freight).apply(product.getPrice(), product.getDiscount()));
				
	}
	
}
