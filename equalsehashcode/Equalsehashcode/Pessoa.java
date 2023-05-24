package Equalsehashcode;

import java.util.Objects;

public class Pessoa {

	  String nome;
	  
	  // construtor padão
	  Pessoa(){
		  
	  }
	  
	  Pessoa(String nome){
		  this.nome = nome;
	  }
	  
	  
	// Sobrecarga 
	  
	  public void dizBomDia() {
		  System.out.println("Olá, bom dia! ");
	  }
	  
	  public void dizBoaTarde(String nome) {
		  System.out.println("Olá, boa Tarde! " + nome);

	  }
	  
	  public void dizBoaNoite(String nome, int hora) {
		  System.out.println("Olá, boa noite! " + nome + "agora são " + hora + "horas ");

	  }
	  
	  //Metodo para cadastrar uma pessoa 
	  public void cadastrar (String nome, String cpf) {
		  System.out.println("Olá " + nome + "Castro realizado. ");
		}

	  //Exemplo de uma pessoa usando
	  //pessoa1.cadastrar("Suda", 10, "São Paulo", "Analista")
	
	  
	  //Exemplo de Equals
	  
		@Override
		public boolean equals(Object obj) {
			
			// verificando se o endereço de memoria são iguais
			if (this == obj)
				return true;
			
			if (obj == null)
				return false;
			
			//Pegando a classe do objeto atual
			// E Verificando se é diferente do
			// que eu estou comparando
			
			if (getClass() != obj.getClass())
				return false;
			
			Pessoa other = (Pessoa) obj;
			return Objects.equals(nome, other.nome);
		} 
	  
	}


