package Matriz;

import java.util.Arrays;

public class ExemploMatriz2 {
	
	public static void main(String[] args) {
		
		double [][] alunos = new double[3][3];
	
		alunos[0][0] = 5.2;
		alunos[0][1] = 4.7;
		alunos[1][0] = 6.2;
		alunos[1][1] = 5.1;
		alunos[2][0] = 8.7;
		alunos[1][0] = 2.1;
		
		for (double[] nota: alunos ) {
			System.out.println(Arrays.toString(nota));
		}
		
		for (int i = 0; i < 2; i++ ) {
		System.out.println(Arrays.toString(alunos));	
		}
	}
}


