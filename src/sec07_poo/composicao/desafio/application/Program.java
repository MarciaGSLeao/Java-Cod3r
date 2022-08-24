package sec07_poo.composicao.desafio.application;

import sec07_poo.composicao.desafio.entities.Client;
import sec07_poo.composicao.desafio.entities.Product;
import sec07_poo.composicao.desafio.entities.PurchaseOrder;

public class Program {

	public static void main(String[] args) {
		
		Client cliente1 = new Client("MARIA HELENA");
		PurchaseOrder order1 = new PurchaseOrder();
		PurchaseOrder order2 = new PurchaseOrder();
		cliente1.addPurchaseOrders(order1);
		cliente1.addPurchaseOrders(order2);
		order1.addItem(10, new Product("Caderno", 10.50));
		order1.addItem(2, new Product("Livro Fundamentos de Java", 255.90));
		order1.addItem(2, new Product("Mochila", 109.90));
		order2.addItem(8, new Product("Lápis", 3.55));
		order2.addItem(2, new Product("Canetas", 5.90));
		order2.addItem(2, new Product("Borrachas", 4.30));
		
		System.out.printf("TOTAL DO PEDIDO 1 = R$ %.2f%n", order1.getTotalValue());
		System.out.printf("TOTAL DO PEDIDO 2 = R$ %.2f%n", order2.getTotalValue());
		System.out.printf("TOTAL DE VENDA DOS PEDIDOS DA CLIENTE %s = R$ %.2f%n%n", cliente1.getName() , cliente1.getTotalValueOfClient());
		
		Client cliente2 = new Client("CARLOS EDUARDO");
		PurchaseOrder order3 = new PurchaseOrder();
		cliente2.addPurchaseOrders(order3);
		order3.addItem(5, new Product("Caderno", 10.50));
		order3.addItem(1, new Product("Livro Fundamentos de Java", 255.90));
		order3.addItem(1, new Product("Mochila", 109.90));
		order3.addItem(4, new Product("Lápis", 3.55));
		order3.addItem(1, new Product("Canetas", 5.90));
		order3.addItem(1, new Product("Borrachas", 4.30));
		
		System.out.printf("TOTAL DO PEDIDO 3 = R$ %.2f%n", order3.getTotalValue());
		System.out.printf("TOTAL DE VENDA DOS PEDIDOS DO CLIENTE %s = R$ %.2f", cliente2.getName(), cliente2.getTotalValueOfClient());
		
	}
}
