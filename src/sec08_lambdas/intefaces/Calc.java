package sec08_lambdas.intefaces;

@FunctionalInterface 
public interface Calc {
	// Uma interface funcional é uma inteface que permite
	// apenas a criação de um único método.
	
	public abstract double calculate(double a, double b);
	
	// O uso de um método default em uma interface 
	// não inviabiliza a natureza de uma @FunctionalInterface.
	// Ex:
	
	public default String hello() {
		return "Hello!";
	}
	
	// O uso de um método estático (static) em uma interface 
	// também não inviabiliza a natureza de uma @FunctionalInterface.
	// Ex:
		
	public static String hi() {
		return "Hi!";
	}

}
