package stream;

public class MediaTeste {

	public static void main(String[] args) {
		Media m1 = new Media();
		m1.adcionar(9).adcionar(3);		
		
		Media m2 = new Media();
		m2.adcionar(3).adcionar(10);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		
		System.out.println(Media.mediaFinal(m1, m2).getValor() );
		
	}
}
