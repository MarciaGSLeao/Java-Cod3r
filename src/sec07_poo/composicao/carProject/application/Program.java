package sec07_poo.composicao.carProject.application;

import sec07_poo.composicao.carProject.entities.Cars;

public class Program {
	
	public static void main(String[] args) {
		
		Cars car1 = new Cars();
		
		System.out.println(car1.isOn());
		car1.turnOn();
		
		System.out.println(car1.isOn());
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		car1.speedUp();
		
		System.out.println(car1.getMotor().giros());
		
		car1.slowDown();
		car1.slowDown();
		car1.slowDown();
		car1.slowDown();
		car1.slowDown();
		car1.slowDown();
		car1.slowDown();

		System.out.println(car1.getMotor().giros());
	}
}
