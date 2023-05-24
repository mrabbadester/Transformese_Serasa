package Banco;

public class ContaBancaria {
	
	public String nome;
	private int idade;
	private double saldo;
	
	public double mostrarSaldo() {
		return saldo;
	}
	
	public String mostrarNome() {
		return nome;
	}
	
	public void maiorIdade(int idade) {
		
		System.out.println("Usando idade antes de passar " + idade);
		System.out.println("idade é usando this.idade antes " + this.idade);
		this.idade = idade;
		System.out.println("A idade é: usando this.idade " + this.idade);
		System.out.println("Usando idade antes de passar " + idade);
	}

	public ContaBancaria(double saldo, String nome ) {
		this.saldo = saldo;
		this.nome = nome;
		
	}

}
