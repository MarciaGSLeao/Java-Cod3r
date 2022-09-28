package sec09_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> sum = (s, n) -> s + n;
		
		Integer resultado1 = numbers.stream().reduce(sum).get();
		System.out.println(resultado1);
		
		Integer resultado2 = numbers.parallelStream().reduce(100, sum);
		System.out.println(resultado2);
		
		Integer resultado3 = numbers.stream().reduce(100, sum);
		System.out.println(resultado3);
		
		numbers.stream()
		       .filter(n -> n > 5)
		       .reduce(sum)
		       .ifPresent(System.out::println);
	}
}
