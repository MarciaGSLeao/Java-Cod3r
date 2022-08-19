package sec07_poo.composicao.carProject.entities;

public class Motors {

	private double injectionFactor = 1;
	private boolean turnOn = false;
	
	public Motors() {
	}
	
	public Motors(double injectionFactor, boolean turnOn) {
		this.injectionFactor = injectionFactor;
		this.turnOn = turnOn;
	}

	public double getInjectionFactor() {
		return injectionFactor;
	}

	public void setInjectionFactor(double injectionFactor) {
		this.injectionFactor = injectionFactor;
	}

	public boolean isTurnOn() {
		return turnOn;
	}

	public boolean getTurnOn() {
		return turnOn;
	}
	
	public void setTurnOn(boolean turnOn) {
		this.turnOn = turnOn;
	}

	public int giros() {
		if (!turnOn) {
			return 0;
		}else{
			return (int) Math.round(injectionFactor * 3000);
		}
	}
}
