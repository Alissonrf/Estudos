package excecao.PersonalizadaA;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException{

	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O Atributo '%s' n�o pode ser negativo.",
							nomeDoAtributo);
	}
}
