package classe.DesafioModulo;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar(){
		return "Olá me chamo "+ nome +" e peso " + peso + "kgs.";
	}
}
