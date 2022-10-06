package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {
		
		Consumer<String> printStrings = System.out::print;
		Consumer<Integer> printNumbers = System.out::println;
		
		// 1ª FORMA => CRIANDO UMA STREAM A PARTIR DO MÉTODO ESTÁTICO OF.
		Stream<String> langs = Stream.of("Python, ","Java, ", "JS, ", "Go\n");
		langs.forEach(printStrings);
		
		// 2ª FORMA => CRIANDO UMA STREAM A PARTIR DE UM ARRAY USANDO O MÉTODO ESTÁTICO OF.
		String[] othersLangs = {"Lisp ", "Perl ", "C++ \n"};
		Stream.of(othersLangs).forEach(printStrings);
		
		// 3ª FORMA => A PARTIR DA CLASSE ARRAYS.
		Arrays.stream(othersLangs).forEach(printStrings);
		Arrays.stream(othersLangs, 1, 2).forEach(printStrings);
		
		List<String> othersLangs2 = Arrays.asList("PHP ", "Kotlin ", "Julia ");
		othersLangs2.stream().forEach(printStrings);
		othersLangs2.parallelStream().forEach(printStrings);
		
		// GERANDO STREAM DE FORMA INFINITA...
		// Stream.generate(() -> "a".forEach.(print);
		Stream.iterate(0, n -> n + 10).forEach(printNumbers);;
		
		
		
	}
}
