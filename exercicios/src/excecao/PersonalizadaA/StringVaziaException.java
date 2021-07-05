package excecao.PersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O Atributo '%s' n�o pode ser vazio.",
							nomeDoAtributo);
	}
}
