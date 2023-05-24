package Atividade_aula_10;

public class Cachorro {
	
	String nome;
	String sexo;
	String raca;
	double peso;
	double idade;
	String responsavel;
	String contato;
	String email;
	String servico;
	
	double servicoTotal(double banho, double tosa) {
	double servicoTotal = banho + tosa;
	double servicoPagamento = servicoTotal;
	return servicoPagamento;
	}
}
