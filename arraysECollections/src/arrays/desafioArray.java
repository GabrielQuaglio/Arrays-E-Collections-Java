package arrays;

import java.util.Scanner;

public class desafioArray {
public static void main(String[] args) {
	//calcular a media de notas que o usuario ira informar 
	//onde ele ira falar quantas notas ele quer informar
	//quebra o algoritmo em dois laços for o primeiro pra perguntar as notas e armazenar no array
	//no segundo para somar e por ultimo mostrar a media
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Quantas notas voce quer imprimir? ");
	int i = entrada.nextInt();

	double[] a = new double[i];

	for ( int j = 0 ; j<i ; j++) {
		
		System.out.println("Informe a nota " + (j + 1) +":" );
		a [j] = entrada.nextDouble();
	}
	double total = 0;
	for(double nota:a) {
		total += nota;
	}
	double media = total/a.length;
	System.out.println("A media das notas é " + media);
	
	
	entrada.close();
	
	
	
	
}
}
