package sec08_lambdas;

import java.util.function.BiFunction;

public class FuncaoBi {
	
	public static void main(String[] args) {
		
		BiFunction<Double, Double, String> resultado = 
				(n1, n2) -> (n1 + n2) / 2 >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado.apply(6.2, 7.1));
	}

}
