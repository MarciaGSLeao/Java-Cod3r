package sec08_lambdas.application;

import sec08_lambdas.entities.Multiply;
import sec08_lambdas.entities.Sum;
import sec08_lambdas.intefaces.Calc;

public class Program1 {
	
	public static void main(String[] args) {
		
		// Instanciando um objeto de uma classe que implementa
		// um método abstrato (método sem corpo) de uma interface
		// (classe que possui apenas métodos sem corpo).
		Calc sum = new Sum();
		Calc multiply = new Multiply();
		
		System.out.println(sum.calculate(1, 2));
		System.out.println(multiply.calculate(1, 2));
		
	}
	

}
