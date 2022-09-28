package sec09_streamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjects {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Jonas", "Rubens", "Márcia");
		
		System.out.println("FOR TRADICIONAL...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nFOR EACH...");
		for(String nome : aprovados) {
			System.out.println(nome);
		}

		// ITERATOR
		System.out.println("\nITERATOR...");
		Iterator<String> iteratorAprovados = aprovados.iterator();
		while(iteratorAprovados.hasNext()) {
			System.out.println(iteratorAprovados.next());
		}
				
		// STREAM
		System.out.println("\nSTREAM...");
		Stream<String> streamAprovados = aprovados.stream();
		streamAprovados.forEach(System.out::println); // Laço interno!
	}
}
