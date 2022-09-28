package entities;

import exercicios.Calc;

public class Multiply implements Calc{

	@Override
	public double execute(double a, double b) {
		return a * b;
	}

}
