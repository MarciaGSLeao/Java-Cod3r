package sec08_lambdas.intefaces;

import java.util.function.BinaryOperator;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(6.8, 8.0));
	}

}
