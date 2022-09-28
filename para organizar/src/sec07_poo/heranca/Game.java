package sec07_poo.heranca;

public class Game {

	public static void main(String[] args) {
		
		Player player = new Player();
		Monster monster = new Monster();
		System.out.printf("POSIÇÃO INICIAL DO JOGADOR 1: (%d, %d)%n",
				          player.getX(), player.getY());
		player.walkTo(Direction.LESTE);
		player.walkTo(Direction.LESTE);
		player.walkTo(Direction.SUL);
		monster.walkTo(Direction.SUL);
		
		System.out.printf("POSIÇÃO DO JOGADOR: (%d, %d)%n",
				          player.getX(), player.getY());
		System.out.printf("POSIÇÃO DO MONSTRO: (%d, %d)%n",
				monster.getX(), monster.getY());
	}
}
