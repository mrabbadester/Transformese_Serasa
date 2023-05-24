package Treinamento;

import java.util.Scanner;

public class dias_atrasado {

	 public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);  
		     
		    System.out.print("Seu salário na saldo: ");
		    double salario = Double.parseDouble(entrada.nextLine());
		    
		    System.out.print("Valor do boleto: ");
		    double conta = Double.parseDouble(entrada.nextLine());    
		    
		  //pagamento de contas para boletos os todos
		    double totalValor = conta ;
		    
		  //pagamento de contas 10 dias as cadas no juros.
		    double totalJuros = totalValor + 10 * 1.00;
		    
		  //pagamento de contas um multa + valor total.
		    double totalMultas = totalValor + 1.50;
		    
		  //pagamento de contas juntamos dias juros + contas
		    double totalValorComJuros = totalValor + totalJuros;
		    
		  //pagamento de contas, sobra de salario na banco.
		    double sobraSalario = salario - totalValorComJuros;
		    
		    System.out.println("\nTotal contas sem juros: " + totalValor);
		    System.out.println("Total juros: " + totalJuros);
		    System.out.println("Total multas: " + totalMultas);
		    System.out.println("Total contas com juros: " + totalValorComJuros);
		    System.out.println("Sobra seu salário no saldo: " + sobraSalario);
		    
		    entrada.close();
		     
	}
}