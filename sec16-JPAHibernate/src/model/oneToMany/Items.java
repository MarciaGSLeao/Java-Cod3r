package model.oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import model.entities.Products;

@Entity
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@ManyToOne
	private Orders order;
	
	// esse é o valor default de fetch (...ToOne -> EAGER)
	@ManyToOne(fetch = FetchType.EAGER)
	private Products product;
	
	@Column(nullable = false)
	private Double quantity;
	
	@Column(nullable = false)
	private Double price;
	
	public Items() {	
	}

	public Items(Orders order, Products product, Double quantity) {
		super();
		this.setOrder(order);
		this.setProduct(product);
		this.setQuantity(quantity);
	}
	
	public int getId() {
		return Id;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
		
		if(product != null && this.price == null) {
			this.setPrice(product.getPrice());
		}
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getUnityPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotalPriceByItem() {
		return this.quantity * this.price;
	}
}
