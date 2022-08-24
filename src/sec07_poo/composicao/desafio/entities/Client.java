package sec07_poo.composicao.desafio.entities;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String name;
	private List<PurchaseOrder> purchaseOrders = new ArrayList<PurchaseOrder>();
	
	public Client() {}
	public Client(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<PurchaseOrder> getPurchaseOrders() {
		return purchaseOrders;
	}
	public void addPurchaseOrders(PurchaseOrder purchaseOrder) {
		purchaseOrders.add((PurchaseOrder) purchaseOrder);
	}
	
	public double getTotalValueOfClient() {
		double total = 0;
		
			for (PurchaseOrder purchaseOrder: purchaseOrders ) {
					total += purchaseOrder.getTotalValue();
		    }
			
		return total;
	}

}
