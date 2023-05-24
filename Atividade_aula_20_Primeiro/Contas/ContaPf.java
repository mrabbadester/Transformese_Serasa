package Contas;

public class ContaPf {

	private int cpf ;
	public String nome = "Marlus Abbade";
	public String PessoaFisical;
	private double saldo;
	
	public ContaPf(int cpf, String nome, String pessoaFisical, double saldo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		PessoaFisical = pessoaFisical;
		this.saldo = saldo;
	}

	public ContaPf(int cpf, String nome, String pessoaFisical) {
		this.cpf = cpf;
		this.nome = nome;
		PessoaFisical = pessoaFisical;
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
