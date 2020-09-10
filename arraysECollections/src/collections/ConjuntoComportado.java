package collections;



import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		      //tipo de dados que queremos na lista//nao prescisamos definir duas vezes podemos fazer o diamond(<>)
		Set<String> conjunto = new TreeSet();
		conjunto.add("Ana");//dessa forma que constuimos um hash ele so recebra String
		              //diferente da outra forma que recebe os mais variados objetos
		
		conjunto.add("Pedro");
		conjunto.add("Lucca");
		conjunto.add("Gab");
		conjunto.add("Gui");
		
		//LEMBRAR QUE O SET NAO RESPEITA A ORDEM DE INSERÇAO, PODEMOS USAR O TREESET PARA SER EM ORDEM ALFABETICA
		//OS ELEMENTOS USADOS AQUI FORAM HOMOGENEOS
		//NAO ESQUECER ELE NAO RECEBE TIPOS PRIMITIVOS
		for(String candidatos: conjunto) {
			System.out.println(candidatos);
		}
		
		
		
		
		
	}
}
