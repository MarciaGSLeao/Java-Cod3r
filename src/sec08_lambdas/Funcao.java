package sec08_lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar =
				number -> number %2 == 0 ? "Par" : "Ímpar";
		System.out.println(parOuImpar.apply(5));	
		
		Function<String, String> resultado =
				valor -> "O resultado é " + valor;
				
		String resultadoFinal = parOuImpar
				.andThen(resultado)
				.apply(32);
		System.out.println(resultadoFinal);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
