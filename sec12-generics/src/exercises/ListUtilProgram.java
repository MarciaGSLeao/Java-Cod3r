package exercises;

import java.util.Arrays;
import java.util.List;

public class ListUtilProgram {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Márcia", "Helena", "Felipe");
		List<Integer> age = Arrays.asList(32, 1, 7);
		
		String lastName = (String)ListUtil.getLast(names); // NOTE QUE AQUI E NO EXEMPLO ABAIXO
		Integer lastAge = (Integer)ListUtil.getLast(age);  // É NECESSÁRIO FAZER O CAST.
		
		System.out.println(lastName);
		System.out.println(lastAge);
		
		String lastName2 = ListUtil.getLast2(names); // AQUI NÃO É NECESSÁRIO FAZER O CAST
		Integer lastAge2 = ListUtil.getLast2(age);
		System.out.println(lastName2);
		System.out.println(lastAge2);
		
	}
	
}
