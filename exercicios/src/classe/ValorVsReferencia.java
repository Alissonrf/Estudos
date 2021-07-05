package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2; // atribuição por valor!!!!! (Tipo primitivo)
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data("1","6","2022");
		Data d2 = d1; // atribuição por referencia!!!!! (Objeto)
		
		d1.dia = "02";
		d2.mes = "12";
		
		d1.ano = "2000";
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		

		}
	static void voltarParaValorPadrao(Data d) {
		d.dia = "01";
		d.mes = "01";
		d.ano = "1970";
	}
}
