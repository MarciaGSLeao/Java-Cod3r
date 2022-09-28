package sec08_lambdas.application;

import sec08_lambdas.intefaces.Calc;

public class Program2 {
	
	public static void main(String[] args) {
		
		// Instanciando um objeto de uma classe com uma função lambda.
		Calc sum = (x, y) -> {
			return x + y;
		};
		Calc multiply = (x, y) -> x * y;
		
		System.out.println("SOMA = " + sum.calculate(10, 5));
		System.out.println("MULTIPLICAÇÃO = " + multiply.calculate(10, 5));
		System.out.println("DEFAULT = " + sum.hello());
		System.out.println("STATIC = " + Calc.hi());
		
	}
	

}
