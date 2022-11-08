package application;

import infra.DAO;
import model.oneToOne.Clients;

public class ProgramObtainClientSeat {
	
	public static void main(String[] args) {
		
		DAO<Clients> dao = new DAO<>(Clients.class);
		
		Clients client = dao.getById(2);
		System.out.println(client.getName() + " - " + client.getSeat().getLocalization());
	
		dao.close();
	}

}
