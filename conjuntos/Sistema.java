package conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Sistema {

	public static void main(String[] args) {
		
		//Criando um conjunto em Java
		Set<String> pessoas = new HashSet<>();
		
		// Para adicionar elementos
		pessoas.add("Tati");
		pessoas.add("Ariel");
		pessoas.add("Gabriel");
		pessoas.add("José");
		pessoas.add("Nazaré");
		
		// Para verificar se contém um elemento no conjunto
		System.out.println(pessoas.contains("Tati"));
		
		// Para mostrar todos os elementos do conjunto
		for (String elemento : pessoas) {
			System.out.println(elemento);
		}
		
	}
	
}
