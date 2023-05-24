package Contas;

public class ContaPj {
	
	private int CNPJ = (18);
	public String nome = "Microabbade";
	public String PessoaJuridica;
	private double saldo;
	
	public ContaPj(int cNPJ, String nome, String pessoaJuridica, double saldo) {
		super();
		CNPJ = cNPJ;
		this.nome = nome;
		PessoaJuridica = pessoaJuridica;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getPessoaJuridica() {
		return PessoaJuridica;
	}

	public void setPessoaJuridica(String pessoaJuridica) {
		PessoaJuridica = pessoaJuridica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	
	
}