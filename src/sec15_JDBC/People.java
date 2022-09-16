package sec15_JDBC;

public class People {
	
	private int cod;
	private String name;
	
	public People(int code, String name) {
		this.cod = code;
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
