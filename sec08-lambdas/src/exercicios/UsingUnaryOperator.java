package exercicios;

import java.util.function.UnaryOperator;

public class UsingUnaryOperator {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		System.out.println("andThen: " + maisDois
						  .andThen(vezesDois)
						  .andThen(aoQuadrado)
						  .apply(2));
		
		System.out.println("compose: " + maisDois
						  .compose(vezesDois)
						  .compose(aoQuadrado)
						  .apply(2));
		
	}

}
