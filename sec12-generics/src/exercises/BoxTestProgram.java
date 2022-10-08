package exercises;

public class BoxTestProgram {

	public static void main(String[] args) {
		
		Box<String> names= new Box<>();
		names.stockInBox("Helena");
		System.out.println(names.openBox());
		names.stockInBox("Felipe");
		System.out.println(names.openBox());
		
		Box<Integer> age= new Box<>();
		age.stockInBox(1);
		System.out.println(age.openBox());
		age.stockInBox(7);
		System.out.println(age.openBox());
		
		// AO INSTANCIAR A CLASSE BOXNUMBER, NÃO SERÁ POSSÍVEL ATRIBUIR O TIPO STRING POIS FOI 
        // DEFINIDO QUE O TIPO A SER INFORMADO NO GENERICS DEVE SER UM TIPO HERDADO DA CLASSE NUMBER.
		// BoxNumber<String> books = new BoxNumber<>(); // AQUI DÁ ERRO!!!!
		
	}
}
