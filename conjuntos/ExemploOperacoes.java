package conjuntos;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOperacoes {

	
public static void main(String[] args) {
		
		// Criando dois conjuntos
		Set<String> grupo1 = new TreeSet<>(Arrays.asList("Maria", "João", "José", "Nazaré"));
		Set<String> grupo2 = new TreeSet<>(Arrays.asList("Ariel", "Tati", "Gabriel", "João", "Maria"));
		
		// Operação de União
		// 1- Criar um novo conjunto 
		Set<String> grupoUniao = new TreeSet<>(grupo1);
		
		// 2- Aqui estamos realizando a união
		grupoUniao.addAll(grupo2);
		System.out.println("Resultado da união do grupo1 com o grupo2");
		System.out.println(grupoUniao);

		
	}
	
}
