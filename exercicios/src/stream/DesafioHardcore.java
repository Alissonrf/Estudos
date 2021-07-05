package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioHardcore {

	public static void main(String[] args) {
		
		Pessoa alisson = new Pessoa("Alisson", 18, false);
		Pessoa rubens = new Pessoa("Rubens", 18, true);
		Pessoa gustavo = new Pessoa("Gustavo", 19, true);
		Pessoa paulo = new Pessoa("Paulo", 15, true);
		Pessoa gui = new Pessoa("Gui", 10, false);
		
		List<Pessoa> pessoas = Arrays.asList(alisson, rubens, gustavo, paulo, gui);
		Function<Pessoa, String> consagracao = a -> "Parabens " + a.nome +
													" Voce possui mais de 18 anos e CNH";
		
		pessoas.stream()
			.filter(a -> a.idade >= 18)
			.filter(t -> t.temCarteira == true)
			.map(consagracao)
			.forEach(System.out::println);
	}
}
