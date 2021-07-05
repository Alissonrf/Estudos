package stream;

public class Media {

	private double total;
	private int quantidade;
	
	public Media adcionar(double nota) {
		total += nota;
		quantidade++;
		return this;
	}
	
	public double getValor() {
		return total / quantidade;
	}
	
	public static Media mediaFinal(Media m1, Media m2) {
		Media resultado = new Media();
		resultado.total = m1.total + m2.total;
		resultado.quantidade = m1.quantidade + m2.quantidade;
		return resultado;
	}
}
