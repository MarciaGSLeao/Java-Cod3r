package sec07_poo.heranca.desafio1;

public class Tracker extends Car implements Sportive{
	
	public void speedUp() {
		super.setCurrentSpeed(getCurrentSpeed() + 10);
	}
	public void brake() {
		while (getCurrentSpeed() > 0) {
			super.setCurrentSpeed(getCurrentSpeed() - 10);
			if(getCurrentSpeed() < 0) {
				setCurrentSpeed(0);
			}
		}
	}
	
	@Override
	public void turnOnTurbo() {
	}
	@Override
	public void turnOffTurbo() {
	}

}
