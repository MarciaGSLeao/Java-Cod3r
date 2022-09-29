package exercicios;

import java.util.function.Function;

public class UsingFunction {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				number -> number %2 == 0 ? "Par" : "Ímpar";
		
		Function<String, String> result =
				text -> "O resultado é " + text;
				
		System.out.println(parOuImpar.apply(30));
		String finalResult = parOuImpar
				.andThen(result)
				.apply(21);
		System.out.println(finalResult);
				
	}

}
