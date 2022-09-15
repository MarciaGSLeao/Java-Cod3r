package sec09_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Filter {

	public static void main(String[] args) {
		
		Student student1 = new Student("Ana", 8.0);
		Student student2 = new Student("Júlia", 9.0);
		Student student3 = new Student("Maria", 6.7);
		Student student4 = new Student("Gui", 5.8);
		Student student5 = new Student("Leo", 7.5);
		Student student6 = new Student("Andrew", 6.4);
		
		List<Student> listStudents = Arrays.
				asList(student1, student2, student3,
						student4, student5, student6);
		
		Function<Student, String> saudacaoAprovado = 
				s -> "Parabéns " + s.getName() + "! Você foi aprovado(a).";
		
		listStudents.stream()
			.filter(s -> s.getGrade() >= 7.0)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}
}
