package exercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjects {
	
	public static void main(String[] args) {
		
		List<String> nephews = Arrays.asList("Dudu", "Loló", "Laurex", "Vinny");
	
		System.out.println("Usando o forEach...");
		for(String nephew : nephews ) {
			System.out.println(nephew);
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = nephews.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		/* NOS EXEMPLOS ACIMA, EXISTE A NECESSIDADE DE UTILIZARMOS ESTRUTURAS DE
		 * REPETIÇÃO PARA EXECUTAR O COMANDO INTERNO QUE DESEJAMOS QUE É A 
		 * IMPRESSÃO DE CADA ELEMENTO DA LISTA GERADA.
		 * 
		 * NO CASO DO USO DA API DO JAVA CHAMADA STREAM, NÃO TEREMOS ESSA NECESSIDADE.
		 */
		
		System.out.println("\nUsando Stream...");
		Stream<String> nephewsStream = nephews.stream();
		nephewsStream.forEach(System.out::println); // METHOD REFERENCE
	
	}
}
