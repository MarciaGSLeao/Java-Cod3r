package sec08_lambdas;

public class Program1 {

	public static void main(String[] args) {
		
		Calc calc = new Sum();
		System.out.println("SOMA = " + calc.execute(2, 10));
		
		Calc somaLambda = (x, y) -> {
			return x + y;
		};
		System.out.println(somaLambda.execute(2, 5));
		
//		Uma expressão lambda também pode ser escrita omitindo-se as chaves.
//		Neste caso, não se usa a palavra reservada "return".
		somaLambda = (x, y) -> x + y;
		System.out.println(somaLambda.execute(10, 5));

		/* Observe que na expressão lambda abaixo, o Java não permitirá que a mesma
		 * seja executada, pois os parâmetros do método .execute() foi definido
		 * para receber apenas dois parâmetros e não três.
		 */ 
//		Calc somaLambda2 = (x, y, z) -> {return x + y + z;};
//		System.out.println(somaLambda.execute(2, 5, 7));
		
		calc = new Multiply();
		System.out.println("MULTIPLICAÇÃO = " + calc.execute(2, 10));
	
		System.out.println("MÉTODO DEFAULT = " + calc.printDefault());
		System.out.println("MÉTODO STATIC = " + Calc.printHi());
	}
}
