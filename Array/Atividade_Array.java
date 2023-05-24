package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade_Array {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double [] notas = new double[4];
		
		double somaNotas = 0.0;
				
		
		for (int i = 0; i <=3; i++) {
			System.err.println("Informe a nota " + i);
			notas[i] = entrada.nextDouble();
			
			somaNotas += notas[i];
			somaNotas = 5.5;
		}		
		
		System.out.println(somaNotas);
		System.out.println(Arrays.toString(notas));
		
		entrada.close();
	}
	

	
}
