package sec09_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Ana", 7.1);
		Student s2 = new Student("Luna", 6.1);
		Student s3 = new Student("Gui", 8.1);
		Student s4 = new Student("Gabi", 10);
		
		List<Student> listStudents = Arrays.asList(s1,s2,s3,s4);
		
		Predicate<Student> approved = s -> s.getGrade() >= 7.0;
		Function<Student, Double> onlyGrade = s -> s.getGrade();
		BinaryOperator<Double> sum = (a, b) -> a + b;
		
		listStudents.stream()
					.filter(approved)
					.map(onlyGrade)
					.reduce(sum)
					.ifPresent(System.out::println);
	}

}
