package Contas;

public class ContaPj {
	
	private int CNPJ=(0);
	public String nome;
	public String PessoaJurídica;
	private double saldo;
	
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPessoaJurídica() {
		return PessoaJurídica;
	}
	public void setPessoaJurídica(String pessoaJurídica) {
		PessoaJurídica = pessoaJurídica;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
public void maiorSaldo1(double saldo) {
		
		System.out.println("seu banco o saldo de conta: " + saldo);
		System.out.println("O saldo é usando antes saldo do conta: " + this.saldo);
		this.saldo = saldo;
		System.out.println("O saldo é: usando saldo do conta:" + this.saldo);
		System.out.println("Usando saldo do conta de deposito antes de passar " + saldo);
	}
	

}
