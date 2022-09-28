package sec09_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Map_Challenge {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays
				.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		/*
		 * 1. Número para String Binária
		 * 2. Inverter a String
		 * 3. Binario para inteiro
		 */
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binaryToInteger =
				s -> Integer.parseInt(s, 2);
				
		numbers.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binaryToInteger)
			.forEach(System.out::println);
	}

}
