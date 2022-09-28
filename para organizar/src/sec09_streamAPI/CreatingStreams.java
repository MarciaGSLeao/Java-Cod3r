package sec09_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> printNum = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "JS ", "Python\n");
		langs.forEach(print);
		
		String[] moreLangs = {"Go ", "Lisp ", " Scala\n"};
		Stream.of(moreLangs).forEach(print); // 1ª FORMA DE CRIAR UMA STREAM
		Arrays.stream(moreLangs).forEach(print); // 2ª FORMA...
		Arrays.stream(moreLangs, 1, 2).forEach(print); // 3ª FORMA, FILTRANDO UM SUBCONJUNTO A PARTIR DO ÍNIDICE.
		
		List<String> othersLangs = Arrays.asList("\nC# ", "PHP ", "C++\n");
		othersLangs.stream().forEach(print);
		othersLangs.parallelStream().forEach(print);
		
		// Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(printNum);
		
	}

}
