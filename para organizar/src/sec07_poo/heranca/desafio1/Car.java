package sec07_poo.heranca.desafio1;

public class Car {
	
	private int currentSpeed;
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public void speedUp() {
		currentSpeed = currentSpeed + 5;
	}
	public void brake() {
		while (this.currentSpeed > 0) {
			currentSpeed = currentSpeed - 5;
			if(currentSpeed < 0) {
				currentSpeed = 0;
			}
		}
	}

}
