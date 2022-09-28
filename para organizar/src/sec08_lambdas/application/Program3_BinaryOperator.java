package sec08_lambdas.application;

import java.util.function.BinaryOperator;

public class Program3_BinaryOperator {
	
	public static void main(String[] args) {
		
		// DENTRO DO CAMPO DO GENERICS <> NÃO É POSSÍVEL REPASSAR UM TIPO PRIMITIVO DO JAVA,
		// COMO AS CLASSES int E double, POR EXEMPLO. 
		BinaryOperator<Double> sum = (x, y) -> {return x + y;};
		BinaryOperator<Double> multiply = (x, y) -> x * y;
		
		System.out.println("SOMA = " + sum.apply(10.0, 5.0));
		System.out.println("MULTIPLICAÇÃO = " + multiply.apply(10.0, 5.0));
		
		BinaryOperator<Integer> sumInt = (x, y) -> {return x + y;};
		BinaryOperator<Integer> multiplyInt = (x, y) -> x * y;
		
		System.out.println("SOMA = " + sumInt.apply(10, 5));
		System.out.println("MULTIPLICAÇÃO = " + multiplyInt.apply(10, 5));
		
	}

}
