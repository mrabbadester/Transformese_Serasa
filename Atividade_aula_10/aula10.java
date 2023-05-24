package Atividade_aula_10;

public class aula10 {
	
	
public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro();
		
		cachorro1.nome = "Greg";		
		cachorro1.sexo = "Macho";
		cachorro1.raca = "Vira Lata";
		cachorro1.idade = 9;
		cachorro1.peso = 4.5;
		cachorro1.responsavel = "Marcos";
		cachorro1.contato = "(11) 99999-8888";
		cachorro1.email = "xpto@gmail.com";
		cachorro1.servico = "Banho e Tosa";
		
		System.out.println("Atendimento Pet Lovers");
		System.out.println("Nome: " + cachorro1.nome);
		System.out.println("Sexo: " + cachorro1.sexo);
		System.out.println("Raça: " + cachorro1.raca);
		System.out.println("Idade em anos: " + cachorro1.idade);
		System.out.println("Peso em kilos: " + cachorro1.peso);
		System.out.println("Nome do Responsável: " + cachorro1.responsavel);
		System.out.println("Contato do Responsável: " + cachorro1.contato);
		System.out.println("E-Mail do Responsável: " + cachorro1.email);
		System.out.println("Serviço: " + cachorro1.servico);
		
		double servicoTotal = cachorro1.servicoTotal(50, 35);
		
		System.out.println("Valor total do serviço é de: R$ " + servicoTotal);
		
	}
	
}