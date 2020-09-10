package arrays;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
		double []notasAlunoA = new double [3];
		String a =Arrays.toString(notasAlunoA);//ja se inicializa comm 0
		System.out.println(a);
		notasAlunoA [0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		String a1 =Arrays.toString(notasAlunoA);
		System.out.println(a1);
		
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		System.out.println(total/notasAlunoA.length);//media de nota do aluno
		
		//(menos usado,pois pegamos os dados de um banco de dados)podemos definir os elementos do array dessa forma: double[] notasAlunoA = {6.9,7,8};
	//podemos armazenar uma variavel em um array
	}
}
