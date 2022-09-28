package sec09_streamAPI;

public class Student {
	
	private final String name;
	private final double grade;
	
	public Student(String nome, double nota) {
		this.name = nome;
		this.grade = nota;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "{nome: " + name 
			   + "; nota: " + grade + "}";
	}
	
}
