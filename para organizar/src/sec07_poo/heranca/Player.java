package sec07_poo.heranca;

public class Player {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public boolean atack(Player oponnet) {
		
		
		
		return true;
	}
	
	public boolean walkTo(Direction direction) {
		if(direction == Direction.NORTE) {
			y--;
		}else if(direction == Direction.SUL) {
			y++;
		}else if(direction == Direction.LESTE) {
			x++;
		}else if(direction == Direction.OESTE) {
			x--;
		}
		
		return true;
	}
	

}
