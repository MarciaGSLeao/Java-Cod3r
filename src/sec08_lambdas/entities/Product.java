package sec08_lambdas.entities;

public class Product {
	
	private final String name;
	private final double price;
	private final double discount;
	
	public Product(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}
	
	public String toString() {
		return name + ": R$ " + price;
	}
	
}
