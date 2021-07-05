package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Alisson Flores";
		u1.email = "alisonreinaldof21@gmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Alisson Flores";
		u2.email = "alisonreinaldof21@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
}
