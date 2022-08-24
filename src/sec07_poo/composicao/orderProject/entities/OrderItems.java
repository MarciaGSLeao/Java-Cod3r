package sec07_poo.composicao.orderProject.entities;

public class OrderItems {
	
	private String name;
	private int quantity;
	private double price;
	
	public OrderItems() {
	}

	public OrderItems(String name, int quantity, double price) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	
	// CRIAR UM MÉETODO QUE CALCULE O SUBTOTAL DE CADA ITEM DE PEDIDO;
	public double subTotal(int quantity, double price) {
		return quantity * price;
	}

	@Override
	public String toString() {
		return name + ", " 
			   + quantity + ", "
			   + price;
	}

}
