package lambdas;

@FunctionalInterface
public interface Calculo {

	// por padr�o esse metodo � publico e abstrato.
	// pra eu poder usar as interfaces lambdas eu s� posso ter 1 metodo abstrato por interface.
	// logo se eu criar outro m�todo PUBLICO E ABSTRATO o codigo vai dar erro!!!
	// Mas posso criar metodos statics ou default, etc...
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	static String muitolegal() {
		return "muito legal";
	}
}
