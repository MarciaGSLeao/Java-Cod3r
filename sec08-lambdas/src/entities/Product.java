package entities;

public class Product {
		
	private String name;
	private Double price;
	private Double discount;
	
	public Product(String name, Double price, Double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		double finalPrice = price * (1 - discount);
		return name + " custa R$ " + finalPrice + ".";
	}
	
	
}
