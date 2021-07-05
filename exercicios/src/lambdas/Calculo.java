package lambdas;

@FunctionalInterface
public interface Calculo {

	// por padrão esse metodo é publico e abstrato.
	// pra eu poder usar as interfaces lambdas eu só posso ter 1 metodo abstrato por interface.
	// logo se eu criar outro método PUBLICO E ABSTRATO o codigo vai dar erro!!!
	// Mas posso criar metodos statics ou default, etc...
	
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	static String muitolegal() {
		return "muito legal";
	}
}
