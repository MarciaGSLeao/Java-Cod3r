package sec07_poo.composicao.carProject.entities;

public class Cars {
	
	private Motors motor = new Motors();
	
	public Cars() {
	}
	
	public Cars(Motors motor) {
		this.motor = motor;
	}

	public Motors getMotor() {
		return motor;
	}

//	public void setMotor(Motors motor) {
//		this.motor = motor;
//	}

	public void speedUp() {
		double injectionFactor = motor.getInjectionFactor();
		motor.setInjectionFactor(injectionFactor + 0.4);
	}
	
	public void slowDown() {
		double injectionFactor = motor.getInjectionFactor();
		motor.setInjectionFactor(injectionFactor - 0.4);
		
		if (motor.giros() <= 0) {
			motor.setTurnOn(false);
		}
	}

	public void turnOn() {
		motor.setTurnOn(true);
	}
	
	public void turnOff() {
		motor.setTurnOn(false);
	}
	
	public boolean isOn() {
		return motor.getTurnOn();
	}
	
}
