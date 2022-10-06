package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingMap {
// O MAP AUXILIA NA TRANSFORMAÇÃO DOS DADOS A PARTIR DE UMA STREAM DE DADOS EM UM NOVO
// CONJUNTO DE DADOS, OBEDECENDO A UMA REGRA ESPECÍFICA ATRIBUÍDA A UMA FUNÇÃO.

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;

		List<String> names = Arrays.asList(" Márcia", " Rubens", " Jonas", " Felipe");
	
//		names.stream().map(Utilities.toUpper).forEach(print);
//		names.stream().map(Utilities.firstLetter).forEach(print);
		names.stream()
//		     .map(Utilities.firstLetter)
		     .map(Utilities::punctuation)
		     .forEach(print);;
		     
	}

}
