package treimento_aprender;

import java.util.Scanner;

public class ValidaCPF {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String CPF;

        System.out.printf("Informe um CPF: ");
        CPF = entrada.next();

        System.out.printf("\nResultado: ");
   
        if (ValidaCPF.isCPF(CPF) == true)
           System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
        else System.out.printf("Erro, CPF invalido !!!\n");
        }

	private static Object imprimeCPF(String cPF) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean isCPF(String cPF) {
		// TODO Auto-generated method stub
		return false;
	}
}