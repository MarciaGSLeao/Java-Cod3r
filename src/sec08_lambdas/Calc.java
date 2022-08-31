package sec08_lambdas;

//	Uma interface funcional permite a criação de apenas um método.

@FunctionalInterface
public interface Calc {
	
	public abstract double execute(double a, double b);

//	A interface funcional permite a criação de métodos adicionais se for o caso
//	de método 'default' ou método 'static'.
	public default String printDefault() {
		return "Hello, I'm a default method!";
	}
	
	public static String printHi() {
		return "Hi, I'm a static method! So, I can just be called by a class.";
	}
}
