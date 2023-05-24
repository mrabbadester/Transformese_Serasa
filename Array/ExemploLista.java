package Array;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		// Para adicionar um elemento na lista
		
		nomes.add("Tati");
		nomes.add("Ariel");
		
		// Para adicionar um elemente em uma determinada posição
		
		nomes.set(0, "Gabriel");
		
		// para mostrar tosos os elementes
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.add(0, "Tarti" );
		
		// Para acessar determinado elemento
		
		String terceiroElemento = nomes.get(2);
		
		System.out.println("Mostrando terceiro elemente");
		System.out.println(terceiroElemento);
		
		
	}

}
