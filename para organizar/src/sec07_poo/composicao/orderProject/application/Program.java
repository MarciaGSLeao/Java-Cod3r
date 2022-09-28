package sec07_poo.composicao.orderProject.application;

import sec07_poo.composicao.orderProject.entities.Client;
import sec07_poo.composicao.orderProject.entities.Order;
import sec07_poo.composicao.orderProject.entities.OrderItems;

public class Program {

	public static void main(String[] args) {

		Order c1 = new Order(1, new Client("12345678900", "FELIPE GAMELEIRA DE SOUZA LEÃO"));
		//Order c2 = new Order(2, new Client("98765432100", "MÁRCIA ARAÚJO GAMELEIRA DE SOUZA LEÃO"));
		
		c1.addItems(new OrderItems("caneta", 10, 5.50));
		c1.addItems(new OrderItems("lápis", 10, 1.20));
		
		System.out.println(c1);
		System.out.println(c1.totalValue());
		System.out.println("Total de Itens: " + c1.getItems().size());
		
	}

}
