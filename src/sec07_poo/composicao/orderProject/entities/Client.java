package sec07_poo.composicao.orderProject.entities;

//import java.util.ArrayList;
//import java.util.List;

public class Client {
	
	private String cpf;
	private String nome;
	
	//private List<Order> orders = new ArrayList<Order>();
	
	public Client() {
	}

	public Client(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "[" + cpf + "; " + nome + "]";
	}
	
}
