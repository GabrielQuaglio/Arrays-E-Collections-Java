package collections;

import java.util.HashSet;
import java.util.Set;


public class Conjuntobagunçado {

	public static void main(String[] args) {
		
		Set conjunto = new HashSet();
		
		conjunto.add(1.2);//como o set nao suporta tipos primitivos ele ira passar o double aqui para - Double
		conjunto.add(true);//Boolean 
		conjunto.add("teste");//String
		conjunto.add(3);//Integer
		conjunto.add('x');//Character
		
		System.out.println("o tamanho é " + conjunto.size());
		
		conjunto.add("teste");
		
		System.out.println("o tamanho é " + conjunto.size());// o tamanho nao muda poi ele nao aceita objetos iguais
	

	
	  System.out.println(conjunto.remove("teste"));//ele devolve true(quando remove) e false(quando nao remove)
	  
	  System.out.println(conjunto.size());//4 pois foi retirado 1 de dentro do conjunto
	  
	  System.out.println(conjunto.contains("teste")); //ele verifica se tem a palavra dentor do conjunto(se tem true se nao false)
	  
	  HashSet nums = new HashSet();
	  nums.add(1);
	  nums.add(2);
	  nums.add(3);
	  
	  System.out.println(nums);
	  
	  // nums.addAll(conjunto); //dessa forma fazemos a uniao de dois conjuntos
	  
	  nums.retainAll(conjunto); //intersecçao entre dois conjuntos
	  System.out.println(nums);
	  
	  nums.clear();
	  System.out.println(nums);//limpa tudo
	  //alguns metodos daqui exiatem em outras collections
	  //bastante advertencias aqui, porem na proxima aula sera feito de forma homogenea
	  
	  
	}
}
