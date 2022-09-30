package challenge;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import entities.Product;

public class Challenge {
	
	public static void main(String[] args) {
		
		Product product = new Product("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto) - ok!
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$ 1234,56
		 */
		
		BinaryOperator<Double> netPrice = 
				(grossPrice, discount) -> grossPrice * (1 - discount);
		 
		UnaryOperator<Double> taxCity =
				 finalPrice -> finalPrice >= 2500.00 ? finalPrice * 0.085 : 0.0;
				 
		UnaryOperator<Double> freight =
				finalPriceF -> finalPriceF >= 3000.0 ? 100.0 : 50.0;
				
		 System.out.printf("PREÇO LÍQUIDO: R$ %.2f", netPrice.apply(product.getPrice(), product.getDiscount()));
		 System.out.printf("\nIMPOSTO MUNICIPAL: R$ %.2f", taxCity.apply(netPrice.apply(product.getPrice(), product.getDiscount())));
		 System.out.printf("\nFRETE: R$ %.2f", freight.apply(netPrice.apply(product.getPrice(), product.getDiscount())));
				 
	}

}
