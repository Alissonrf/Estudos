package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) 
	{
		//objetos eu possso manipular assim por exemplo
		String s = new String("texto");
		s.toUpperCase();
		
		
		//Wrappers s�o a versao objeto dos tipos primitivos
		
		//tipos primitivos sao mais pobres em manipula��o
		int a = 123;
		System.out.println(a);
	}
}
