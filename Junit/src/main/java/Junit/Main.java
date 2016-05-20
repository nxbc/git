package Junit;

public class Main {

	public static void main(String[] args) {
		
		HelloJUnit hello = new HelloJUnit();
		System.out.println(hello.hello());

		System.out.println(Math.pow(Double.MAX_VALUE,2)); // x² = puissance 2
		System.out.println(Math.exp(Double.MAX_VALUE));   // fonction exponsentielle
	}

}
// on met le test unitaire dans src/test/java