package model.oneToMany;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private Date date;
	
	// esse é o valor default de fetch (...ToMany -> LAZY)
	@OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
	private List<Items> itemsList;
	
	public Orders() {
		this(new Date());
	}
	
	public Orders(Date date) {
		super();
		this.date = date;
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
	
//	public Clients getClient() {
//		return client;
//	}
//
//	public void setClient(Clients client) {
//		this.client = client;
//	}
//
	public List<Items> getItemsList() {
		return itemsList;
	}

	
}
