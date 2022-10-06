package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class UsingFilter {
	
	public static void main(String[] args) {
		
//		 FIRST EXAMPLE.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		numbers.stream()
			   .filter(n -> n %2 == 0)
			   .forEach(System.out::println);
		
		System.out.println();
		
//		SECOND EXAMPLE.
		List<Student> students = new ArrayList<>();
		students.add(new Student("Márcia", 10.0));
		students.add(new Student("Felipe", 8.0));
		students.add(new Student("João", 3.0));
		students.add(new Student("Helena", 8.9));
		students.add(new Student("Chica", 9.6));
		
		Predicate<Student> isApproved = student -> student.getGrade() >= 7.0;
				
		Function<Student, String> resultMessageIfApproved = student -> "Parabéns " + student.getName() + "! Você foi aprovado.";
				
		students.stream().filter(isApproved).map(resultMessageIfApproved).forEach(System.out::println);
		
	}

}
