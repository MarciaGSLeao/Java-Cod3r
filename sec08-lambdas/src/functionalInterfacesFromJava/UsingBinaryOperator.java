package functionalInterfacesFromJava;

import java.util.function.BinaryOperator;

public class UsingBinaryOperator {
	// UMA INTERFACE FUNCIONAL PERMITE CRIAR EXPRESSÕES LAMBDAS
	// E NO CASO DA INTERFACE FUNCIONAL BINARY OPERATOR, A EXPRESSÃO
	// LAMBDA RECEBERÁ DOIS ARGUMENTOS DO MESMO TIPO E RETORNARÁ
	// UM RESULTADO DO MESMO TIPO.

	public static void main(String[] args) {
		// TIPOS PRIMITIVOS NÃO SÃO ACEITOS NO GENERICS.
		BinaryOperator<Double> sum = (x, y) -> x + y;
		
		System.out.println(sum.apply(2.0, 3.0));
	}
}
