package Atividade_aula_9;

public class Princial {
	
	public static void main(String[] args) {
        Cachorro gata1 = new Cachorro("Bolinha", "Poodle", 'F', 3);
        Cachorro gato2 = new Cachorro("Rex", "Vira-lata", 'M', 3);

        // Atribuindo valores aos atributos de cada cachorro
        gata1.setNome("Flor");
        gata1.setRaca("Golden Retriever");
        gata1.setSexo('F');
        gata1.setIdade(3);

        gato2.setNome("Tom");
        gato2.setRaca("Golden");
        gato2.setSexo('M');
        gato2.setIdade(3);

        // Acessando e imprimindo os valores dos atributos de cada cachorro
        System.out.println("Gata 1:");
        System.out.println("Nome: " + gata1.getNome());
        System.out.println("Raça: " + gata1.getRaca());
        System.out.println("Sexo: " + gata1.getSexo());
        System.out.println("Idade: " + gata1.getIdade());

        System.out.println();

        System.out.println("Gato 2:");
        System.out.println("Nome: " + gato2.getNome());
        System.out.println("Raça: " + gato2.getRaca());
        System.out.println("Sexo: " + gato2.getSexo());
        System.out.println("Idade: " + gato2.getIdade());
    }
}