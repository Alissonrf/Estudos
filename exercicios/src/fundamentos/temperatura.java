package fundamentos;

public class temperatura 
{
	
	public static void main(String[] args) 
	{
		final double ajuste = 32;
		final double fator = 5.0/9.0;
		
		double farnheit = 86;
		double graus = ((farnheit - ajuste) * fator);
		System.out.println("O resultado em graus é igual a:" + graus + "°C.");
		
		farnheit = 0;
		graus = ((farnheit - 32) * fator);
		System.out.println("O resultado em graus é igual a:" + graus + "°C.");
		
	}
}
