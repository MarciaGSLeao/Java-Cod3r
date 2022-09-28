package exercicios;

@FunctionalInterface
// Interface funcional é uma interface que implementa apenas
// um único método. É a partir dessas interfaces que conseguimos
// implementar as expressões lambdas.

public interface Calc {
	
	public abstract double execute(double a, double b);

}
