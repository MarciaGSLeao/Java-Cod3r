package sec07_poo.composicao.desafio.entities;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {
	
	private Client cliente;
	private List<Item> items = new ArrayList<>();
	
	public PurchaseOrder() {
	}
	public PurchaseOrder(Client cliente, List<Item> items) {
		this.cliente = cliente;
		this.items = items;
	}

	public Client getCliente() {
		return cliente;
	}
	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	
	public List<Item> getItems() {
		return items;
	}
	public void addItem(int quantity, Product product) {
		this.items.add(new Item(quantity, product));
	}
	
	public double getTotalValue() {
		double total = 0.0;
		for(Item item: items) {
			total += item.getSubTotal();
		}
		return total;
	}
}
