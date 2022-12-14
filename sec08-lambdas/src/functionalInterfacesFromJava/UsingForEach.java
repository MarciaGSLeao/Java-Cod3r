package functionalInterfacesFromJava;

import java.util.Arrays;
import java.util.List;

public class UsingForEach {
	
	public static void main(String[] args) {
		
		List<String> nephews = Arrays
				.asList("Eduardo", "Lorenzo", "Laura", "Vinícius");
	
		System.out.println("Forma Tradicional...");
		for(String nephew : nephews) {
			System.out.println(nephew);
		}
		
		System.out.println("\nUsando Lambda...");
		nephews.forEach(nephew -> System.out.println(nephew));
		
		System.out.println("\nUsando Method Reference...");
		nephews.forEach(System.out::println);
	}

}
