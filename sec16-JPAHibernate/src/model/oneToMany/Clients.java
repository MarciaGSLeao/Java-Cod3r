package model.oneToMany;

public class Clients {
	
	private int id;
	private String name;
	
	public Clients() {
	}

	public Clients(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

}
