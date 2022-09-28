package sec07_poo.composicao.desafio.entities;

public class Item {
	
	private int quantity;
	private Product product;
	
	public Item() {
	}

	public Item(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double getSubTotal() {
		return (double) quantity * product.getPrice();
	}
}
