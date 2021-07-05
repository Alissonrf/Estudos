package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; // o VAR descobre sozinho qual o tipo da variavel
		System.out.println(b);
		
		var c = "texto"; // o VAR descobre sozinho qual o tipo da variavel
		System.out.println(c);
		
		c = "outro texto"; // o VAR descobre sozinho qual o tipo da variavel     
		System.out.println(c);
		
		double d; // variavel foi declarada como double
		d = 18.5; // atribui um valor a variavel
		System.out.println(d); // usada!
	}
}
