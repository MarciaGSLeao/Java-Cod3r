package exercises;

public class People {
	
	private Integer cod;
	private String name;
	
	public People() {
	}

	public People(Integer cod, String name) {
		this.cod = cod;
		this.name = name;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
