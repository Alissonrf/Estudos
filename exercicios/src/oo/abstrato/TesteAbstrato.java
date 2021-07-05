package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		Animal b = new Cachorro();
		System.out.println(b.mover());
		System.out.println(b.respirar());
		
		System.out.println();
		Mamifero c = new Cachorro();
		System.out.println(c.mamar());
		System.out.println(c.mover());
		System.out.println(c.respirar());
		
		Cachorro a = new Cachorro();
		System.out.println(a.mamar());
		System.out.println(a.mover());
		System.out.println(a.respirar());
		
		System.out.println();
	}
}
