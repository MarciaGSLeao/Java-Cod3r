package exercises;

import java.util.function.UnaryOperator;

public class Utilities {

	public final static UnaryOperator<String> toUpper =
			n -> n.toUpperCase();
			
	public final static UnaryOperator<String> firstLetter = 
			n -> n.charAt(0) + "";
			
	public final static String punctuation(String text) {
		return text + "!";
	}
			
}
