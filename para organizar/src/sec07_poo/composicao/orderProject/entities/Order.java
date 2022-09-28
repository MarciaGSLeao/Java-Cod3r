package sec07_poo.composicao.orderProject.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int idOrder;
	private Client client;
	
	private List<OrderItems> itemsList = new ArrayList<OrderItems>();
	
	public Order() {
	}

	public Order(int idOrder, Client client) {
		this.idOrder = idOrder;
		this.client = client;
	}

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItems> getItems() {
		return itemsList;
	}
	
	// CRIAR MÉTODO PARA ADICIONAR UM ITEM...
	public void addItems(OrderItems item) {
		itemsList.add(item);
	}
	
	// CRIAR MÉTODO PARA REMOVER UM ITEM...
	public void removeItems(OrderItems item) {
		itemsList.remove(item);
	}
	
	// CRIAR UM MÉTODO QUE CALCULE O VALOR TOTAL DO PEDIDO;
	public double totalValue() {
		double total = 0;
		
		for(OrderItems item: itemsList) {
			total += item.subTotal(item.getQuantity(), item.getPrice());
			//total += item.getPrice() * item.getQuantity();
			
		}
		
		return total;
	}
	

	// SOBRESCREVER O MÉTODO .TOSTRING();
	@Override
	public String toString() {
		return "{id=" + idOrder 
				+ ",\n client=" + client 
				+ ",\n items=" + itemsList 
				+ ",\n totalPedido=" + totalValue()
				+ "}";
	}
	
	
}
