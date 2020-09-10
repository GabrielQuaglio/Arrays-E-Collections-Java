package arrays;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quanto alunos ? ");
		int quantDeAlunos = entrada.nextInt();

		System.out.print("Quanta notas por aluno ? ");
		int quantDeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[quantDeAlunos][quantDeNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {//vai percorrer o externo
			for (int n = 0; n < notasDaTurma[a].length; n++) {//vai percorrer o interno
				
				System.out.printf("informe a nota %d do aluno %d: "
						, n + 1,a + 1 );
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];	
			}
		}
			double media = total/( quantDeAlunos * quantDeNotas);
			System.out.println("A media da sala é "+ media);
		
		entrada.close();
	}
}
