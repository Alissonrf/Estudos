package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) 
	{
		//objetos eu possso manipular assim por exemplo
		String s = new String("texto");
		s.toUpperCase();
		
		
		//Wrappers são a versao objeto dos tipos primitivos
		
		//tipos primitivos sao mais pobres em manipulação
		int a = 123;
		System.out.println(a);
	}
}
