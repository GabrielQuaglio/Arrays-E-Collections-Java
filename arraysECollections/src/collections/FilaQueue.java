package collections;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
	
	public static void main(String[] args) {
	
	Queue<String> fila = new LinkedList<>();
	
	//Offer e add = adicionam elementos na fila
	//Diferença é o comportamento quando a fila esta cheia
	//add = erro e offer= true ou falso
	
	fila.add("Ana");
	fila.offer("bia");
	fila.offer("Alex");
	fila.offer("Vinicius");
	fila.offer("Marcio");
	fila.offer("Joao");
	fila.offer("Gab");
	
	//os dois sao usados para pegarmos elementos da fila, oque muda é quando a fila esta vazia
	//peek = null e element = erro(os dois nao eliminam nenhum elemento
	
	
	System.out.println(fila.peek());
	System.out.println(fila.peek());
	System.out.println(fila.element());
	
	//fila.clear();
	//fila.size();
	//fila.isEmpyty();
	
	System.out.println(fila.poll());//ele traz o elemento e ja elimina, quando vazio ele retorna null
	System.out.println(fila.poll());
	System.out.println(fila.poll());
	
	System.out.println(fila.remove());//ele tmbem tira o elemento e quando vazio retorna erro
	
	
	
	
	
	
	}
}
