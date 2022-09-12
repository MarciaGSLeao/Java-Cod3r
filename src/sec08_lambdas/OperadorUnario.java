package sec08_lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int res1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(2);
		System.out.println(res1);
		
		int res2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(2);
		System.out.println(res2);
	}

}