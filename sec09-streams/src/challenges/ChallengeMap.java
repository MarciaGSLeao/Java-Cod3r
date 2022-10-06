package challenges;

import java.util.Arrays;
import java.util.List;

public class ChallengeMap {

	public static void main(String[] args) {
		
//		Consumer<Integer> printNumbers = System.out::println;
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		
		/* DESCRIÇÃO DO DESAFIO
		 * 1. Número para string bináris... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para o inteiro... "011" => 3
		 */
		
		numbers.stream()
		       .map(Integer::toBinaryString)
		       .map(string -> Utilities.inverterString(string))
		       .map(string -> Integer.parseInt(string, 2))
		       .forEach(System.out::println);;
	
	}

}
