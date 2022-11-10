package application;

import infra.DAO;
import model.oneToOne.ClientsSeat;
import model.oneToOne.Seats;

public class ProgramClientSeat1 {
	
	public static void main(String[] args) {
		
		Seats seat = new Seats("4C");
		ClientsSeat client = new ClientsSeat("Rubens Gameleira", seat);
		
		DAO<Object> dao = new DAO<>();
		dao.openTransaction()
		   .insert(seat)
		   .insert(client)
		   .closeTransaction()
		   .close();
	}

}
