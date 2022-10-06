package challenges;

import java.util.ArrayList;
import java.util.List;

public class ChallengeFilter {
	
	public static void main(String[] args) {
		
		/* DESCRIÇÃO DO DESAFIO
		 * CRIAR UM CONTEXTO EM QUE SERÁ NECESSÁRIO FILTRAR DUAS SITUAÇÕES E POSTERIORMENTE
		 * EXIBA O RESULTADO DA ANÁLISE:
		 */
		
		/*
		 * Minha solução será analisar um contexto em que existem produtos com desconto e frete grátis,
		 * para exibir em uma interface para o usuário.
		 */
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("Notebook Lenovo 16GB RAM, SSD 256GB, Intel 7, Tela 17,1'", 4000.99, 0.08, true));
		products.add(new Product("Notebook Dell Inspiron 15 3000 Intel Core i5 - 8GB 256GB SSD 15,6” Full HD Windows 11", 3599.10, 0.1, true));
		products.add(new Product("LEGO Classic - Peças Criativas", 69.99, 0.1, false));
		products.add(new Product("LEGO Classic - Caixa Grande de Peças Criativas - 790 Peças", 319.99, 0.25, true));
		products.add(new Product("Micro-ondas Consul Espelhado - 20L - Cinza 127V - Cm020", 627.71, 0.14, false));
		products.add(new Product("Smart TV 50\" UHD Samsung 4k 50AU7700 Processador Crystal 4k Tela Sem Limites Visual Livre de Cabos Alexa Built In", 2526.99, 0.05, false));
	
		products.stream()
		        .filter(Utilities.freeFreightWithDiscountMoreThan20)
		        .map(product -> product.getName() + " - R$ " + String.format("%.2f", product.getPrice()*(1 - product.getDiscount())))
		        .forEachOrdered(System.out::println);
	
	}

}
