package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class UsingSupplier {
	
	public static void main(String[] args) {
		
		Supplier<List<String>> listNames =
				() -> Arrays.asList("Ana", "Bia", "Gui");
	
		System.out.println(listNames.get());
	
	}

}
