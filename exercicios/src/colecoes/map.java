package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Alisson");
		usuarios.put(30, "Ingelore");
		usuarios.put(3, "Jonas");
		usuarios.put(120, "Andre");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(30));
		System.out.println(usuarios.containsValue("Andre"));
		
		System.out.println(usuarios.get(1));
		
		for( int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		for( String valor : usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}
}
