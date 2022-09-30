package exercicios;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class UsiingBinaryOperator {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = 
				(nota1, nota2) -> (nota1 + nota2) / 2;
				
		BiFunction<Double, Double, String> resultado = 
				(nota1, nota2) -> ((nota1 + nota2) / 2) >= 7 ? "Aprovado" : "Reprovado";
				
		System.out.println(media.apply(8.5, 9.7));
		System.out.println(resultado.apply(8.5, 9.7));
				
	}
	
}
