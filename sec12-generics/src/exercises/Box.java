package exercises;

public class Box<T> {

	private T attribute;

	public Box() {
	}
	public Box(T attribute) {
		this.attribute = attribute;
	}

//	public T getAttribute() {
//		return attribute;
//	}
//
//	public void setAttribute(T attribute) {
//		this.attribute = attribute;
//	}
	
	public T openBox() {
		return attribute;
	}

	public void stockInBox(T attribute) {
		this.attribute = attribute;
	}
	
}
