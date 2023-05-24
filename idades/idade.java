package idades;

public class idade {

	private String nome;
	private int ano_nascimento;
	private int ano;
	private double altura;
	
	public idade (String nome, int ano_nascimento, int ano, double altura) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.ano = ano;
		this.altura = altura;
		
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getano_nascimento() {
		return this.ano - this.ano_nascimento;
	}
	public void setano_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	public double getaltura() {
		return altura;
	}
	public void setaltura (double altura) {
		this.altura = altura;
	}
	public void apresentaPessoa() {
		System.err.println("O nome é: " + this.getnome() );
		System.err.println("O ano do nacimento é: " + getano_nascimento());
		System.err.println("Sua altura é: " + getaltura());
		System.err.println("Sua idade é: " + this.getano_nascimento());
	}
	
}
