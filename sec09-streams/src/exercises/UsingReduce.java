package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class UsingReduce {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> sum = 
				(acum, number) -> acum + number;
				
		Integer total = numbers.stream().reduce(sum).get(); // NECESSÁRIO CHAMAR O GET SEM O VALOR INICIAL
		System.out.println(total);
		
		Integer total2 = numbers.stream().reduce(0, sum); // NÃO É NECESSÁRIO CHAMAR O GET QUANDO SE PASSA UM VALOR INICIAL
		System.out.println(total2);                       // AINDA QUE COM VALOR ZERADO.
	
		Optional<Integer> sumNumbersBiggerThanFive = 
				numbers.stream().filter(n -> n > 5 && n %2 == 0).reduce(sum);
		System.out.println(sumNumbersBiggerThanFive.get());
	}
	
}

