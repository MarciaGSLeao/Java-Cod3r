package application;

import infra.DAO;
import model.oneToOne.ClientsSeat;

public class ProgramObtainClientSeat {
	
	public static void main(String[] args) {
		
		DAO<ClientsSeat> dao = new DAO<>(ClientsSeat.class);
		
		ClientsSeat client = dao.getById(2);
		System.out.println(client.getName() + " - " + client.getSeat().getLocalization());
	
		dao.close();
	}

}
