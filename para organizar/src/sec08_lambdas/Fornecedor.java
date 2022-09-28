package sec08_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		// SUPPLIER
		Supplier<List<String>> oneList =
				() -> Arrays.asList("Márcia", "Felipe", "Helena");
				
		System.out.println(oneList.get());
		
	}
	
			

}
