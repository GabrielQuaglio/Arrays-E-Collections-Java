package collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Gabriel");
		lista.add(u1);
		lista.add(new Usuario("Marcos"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Pedro"));
		
		System.out.println(lista.get(3));///acessar o usuario a partir do indice podemos usar direto o nome tambem
		
		System.out.println("vapo " + lista.remove(3));//remover usando o indice podemos usar direto o nome tbm
		
	System.out.println(lista.contains(new Usuario("pedro")));	//ver se esta contido direto pelo nome
		
		for (Usuario u: lista) {
			System.out.println(u);
			
		}
	}
}
