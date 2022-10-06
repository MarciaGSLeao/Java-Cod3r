package challenges;

public class Product {
	
	private String name;
	private Double price;
	private Double discount;
	private boolean hasFreeFreight;
	
	public Product() {
	}
	
	public Product(String name, Double price, Double discount, boolean hasFreeFreight) {
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.hasFreeFreight = hasFreeFreight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getHasFreeFreight() {
		return hasFreeFreight;
	}

	public void setHasFreeFreight(boolean hasFreeFreight) {
		this.hasFreeFreight = hasFreeFreight;
	}

	public Double getPrice() {
		return price;
	}

	public Double getDiscount() {
		return discount;
	}
	
}
