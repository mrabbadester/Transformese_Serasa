package Contas;

public class ContaPf {
	
	private int cpf;
	public String nome;
	public String PessoaFisical;
	public double saldo;
	
	
	public int getCpf() {
		return cpf;
		
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPessoaFisical() {
		return PessoaFisical;
	}
	public void setPessoaFisical(String pessoaFisical) {
		PessoaFisical = pessoaFisical;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
public void maiorSaldo(double saldo) {
		
	System.out.println("seu banco o saldo de conta: " + saldo);
	System.out.println("O saldo é usando antes saldo do conta: " + this.saldo);
	this.saldo = saldo;
	System.out.println("O saldo é: usando saldo do conta:" + this.saldo);
	System.out.println("Usando saldo do conta de deposito antes de passar " + saldo);
	}
	

}
