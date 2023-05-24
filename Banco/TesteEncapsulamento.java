package Banco;

public class TesteEncapsulamento {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(100.00, "Marlus");
		
		//System.out.println("O saldo é : " + conta1.saldo);
		System.out.println("O saldo é : " + conta1.mostrarSaldo());
		System.out.println("O nome é : " + conta1.mostrarNome());
		
		conta1.maiorIdade(15);
		
		//conta1.saldo = 100.00;
		
		//System.out.println("O saldo é : " + conta1.mostrarSaldo());
		
		
	}

}
