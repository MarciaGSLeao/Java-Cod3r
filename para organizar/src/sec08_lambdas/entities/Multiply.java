package sec08_lambdas.entities;

import sec08_lambdas.intefaces.Calc;

public class Multiply implements Calc{

	@Override
	public double calculate(double a, double b) {
		return a * b;
	}
	
	

}
