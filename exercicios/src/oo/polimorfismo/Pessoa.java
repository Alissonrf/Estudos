package oo.polimorfismo;

public class Pessoa {

	private double peso;
	private String nome;
	
	
	public Pessoa(String nome, double peso) {
		setPeso(peso);
		setNome(nome);
	}
	

	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
