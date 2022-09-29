package exercicios;

import java.util.function.Predicate;

public class UsingPredicate2 {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num %2 == 0;
		Predicate<Integer> hasTresDigitos =
				num -> num >= 100 && num <= 999;
				
		System.out.println(isPar
				.and(hasTresDigitos)
				.test(540));
	}
	
}
