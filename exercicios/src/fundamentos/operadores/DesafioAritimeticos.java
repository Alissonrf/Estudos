package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args)
	{
		//RESOLVER FORMULA GIGANTROLHA
		
		double divisor = 10;
		
		double lado1 = 6*(3+2);
		double lado1b = Math.pow(lado1, 2)/(3*2);
		
		double lado2 =((1-5) * (2-7) / 2);
		double lado2b = Math.pow(lado2, 2);
		
		double penultimo = lado1b - lado2b;
		
		double ultimo = (Math.pow(penultimo, 3)) / (Math.pow(divisor, 3));
		
		System.out.println(ultimo);
		
		
	}
}

