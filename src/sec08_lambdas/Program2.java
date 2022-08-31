package sec08_lambdas;

import java.util.function.BinaryOperator;

public class Program2 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> somaLambda = (x, y) -> {return x + y;};
		System.out.println(somaLambda.apply(2.0, 5.0));
		
		somaLambda = (x, y) -> x + y;
		System.out.println(somaLambda.apply(2.0, 5.0));
		
		BinaryOperator<Integer> multiplicacaoLambda = (x, y) -> {return x * y;};
		System.out.println(multiplicacaoLambda.apply(2, 5));
		
		multiplicacaoLambda = (x, y) -> x * y;
		System.out.println(multiplicacaoLambda.apply(2, 5));

	}
}
