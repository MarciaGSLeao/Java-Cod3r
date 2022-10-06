package challenges;

import java.util.function.Function;
import java.util.function.Predicate;

public class Utilities {
	
	public static String inverterString(String string) {
		StringBuilder strb = new StringBuilder(string);
		String newString;
		strb.reverse();
		newString = strb.toString();
		return newString;
	}
	
	public final static Function<String, Integer> strBiToInt = 
		str -> Integer.parseInt(str, 2);
		
	public final static Predicate<Product> freeFreightWithDiscountMoreThan20 =
		product -> (product.getDiscount() >= 0.2 && product.getHasFreeFreight() == true);
		
}
