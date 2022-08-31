package sec07_poo.heranca.desafio1;

public class Onix extends Car{
	
	public void speedUp() {
		super.setCurrentSpeed(getCurrentSpeed() + 8);
	}
	public void brake() {
		while (getCurrentSpeed() > 0) {
			super.setCurrentSpeed(getCurrentSpeed() - 8);
			if(getCurrentSpeed() < 0) {
				setCurrentSpeed(0);
			}
		}
	}

}
