package sec08_lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		
		List<String> approveds = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional...");
		for(String name : approveds ) {
			System.out.println(name);
		}
		
		System.out.println("\nUsando Lambda#01...");
		approveds.forEach((name) -> {System.out.println(name + "!");});
		
		System.out.println("\nUsando Lambda#02...");
		approveds.forEach(name -> myPrint(name));
		
		System.out.println("\nUsando Method References#01...");
		approveds.forEach(System.out::println);
		
		System.out.println("\nUsando Method References#02...");
		approveds.forEach(ForEach::myPrint);
	}
	
	public static void myPrint(String name) {
		System.out.println("Oi meu nome é " + name);
	}
	
}
