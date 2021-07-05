package excecao.PersonalizadaB;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends Exception{

	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O Atributo '%s' não pode ser negativo.",
							nomeDoAtributo);
	}
}
