package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Gabriel");
		usuarios.put(4, "Artur");
		//DIFERENTE DO ADD, AQUI ELE ADICIONA SE NAO EXISTIR E SE EXISTIR ELE SUBSTITUI
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.remove(3));
		System.out.println(usuarios.remove(4, "gui"));
		
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Artur"));
		
		System.out.println(usuarios.get(2));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey() + " ==>");
			System.out.println(registro.getValue());
		}
			
		
	}
	
	
}
