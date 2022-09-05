package sec08_lambdas.application;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Jonas","Rubens","Márcia","Felipe");
		
		// FORMA TRADICIONAL
		System.out.println("FOR EACH TRADICIONAL..");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		// LAMBDAS
		System.out.println("\nFOR EACH USANDO LAMBDA#01..");
		aprovados.forEach((nome) -> {System.out.println(nome);});
		
		System.out.println("\nFOR EACH USANDO LAMBDA#02..");
		aprovados.forEach(nome -> imprima(nome));
		
		// OU
		System.out.println("\nOUTRA FORMA DE ESCREVER FOR EACH USANDO LAMBDA#01..");
		aprovados.forEach(nome -> System.out.println(nome)); // SE HOUVER APENAS UMA ÚNICA SENTENÇA DE CÓDIGO NA SAÍDA, PODE SUPRIMIR AS CHAVES.
		
		System.out.println("\nOUTRA FORMA DE ESCREVER FOR EACH USANDO LAMBDA#02..");
		aprovados.forEach(nome -> imprima(nome)); // SE HOUVER APENAS UMA ÚNICA SENTENÇA DE CÓDIGO NA SAÍDA, PODE SUPRIMIR AS CHAVES.
		
		// METHOD REFERENCE
		System.out.println("\nOUTRA FORMA DE ESCREVER FOR EACH USANDO METHOD REFERENCE#01..");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nOUTRA FORMA DE ESCREVER FOR EACH CHAMANDO UM MÉTODO ESTÁTICO DA CLASSE ATUAL USANDO METHOD REFERENCE#02..");
		aprovados.forEach(ForEach::imprima);
		
	}
	
	public static void imprima(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
