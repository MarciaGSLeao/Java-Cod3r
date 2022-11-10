package model.oneToMany;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private Date date;
	
	@ManyToOne
	private Clients client;
	
	// esse é o valor default de fetch (...ToMany -> LAZY)
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private List<Items> items;
	
	public Orders() {

	}
	
	public Orders(Clients client) {
		super();
		this.date = new Date();
		this.setClient(client);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Clients getClient() {
		return client;
	}
	
	public void setClient(Clients client) {
		this.client = client;
		
//		if(client != null && this.price == null) {
//			this.setPrice(product.getPrice());
//		}
	}
	
	public List<Items> getItems() {
		return items;
	}

	public void addItems(Items item) {
		items.add(item);
	}
}
