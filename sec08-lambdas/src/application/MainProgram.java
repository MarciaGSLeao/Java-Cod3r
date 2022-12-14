package application;

import entities.Multiply;
import entities.Sum;
import exercicios.Calc;

public class MainProgram {
	
	public static void main(String[] args) {
		
		Calc sum = new Sum();
		Calc multiply = new Multiply();
		
		System.out.println("SOMA = " + sum.execute(2, 3));
		System.out.println("MULTIPLICAÇÃO = " + multiply.execute(2, 3));
		
		// USANDO LAMBDAS.
		Calc sum1 = (x, y) -> {
			return x + y;
		};
		System.out.println("\nSOMA = " + sum1.execute(2, 3));
		
		Calc multiply1 = (x, y) -> x * y;
		System.out.println("MULTIPLICAÇÃO = " + multiply1.execute(2, 3));
	
	}

}
