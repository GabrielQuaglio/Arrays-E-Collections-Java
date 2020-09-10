package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
	Deque<String>pilha = new ArrayDeque<>();
	
	pilha.add("O pequeno principe");
	pilha.push("Pequena sereia");
	pilha.push("O hobbit");
		
		System.out.println(pilha.peek());
		System.out.println(pilha.peek());
		System.out.println(pilha.element());
		//NA FILA O PRIMEIRO A ENTRAR É O PRIMEIRO A SAIR
		//AQUI O ULTIMO A ENTRAR É O PRIMEIRO A SAIR
		
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());
		System.out.println(pilha.poll());//null
		//System.out.println(pilha.pop()); //erro
		//System.out.println(pilha.remove());//erro
		
		//pilha.size();
		//pilha.clear();
		//pilha.contains(o);
		//pilha.isEmpty();
		
		for(String livro: pilha) {
			System.out.println(livro);//forech brabo
		}
		
		
	}
	
	
	
	

}
