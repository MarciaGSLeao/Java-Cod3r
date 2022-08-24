package sec07_poo.heranca;

public class Jogador {
	
	int x;
	int y;

	public boolean andar(String direcao) {
		if("sul".equalsIgnoreCase(direcao)) {
			y++;
		}
		
		return true;
	}
}
