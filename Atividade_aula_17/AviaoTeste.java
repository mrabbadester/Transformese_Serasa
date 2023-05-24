package Atividade_aula_17;

public class AviaoTeste {
	
	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		System.out.println("Esta é o modelo do aviao : " + aviao.fabricante);
		System.out.println("A Velocidade do motor é: " + aviao.motor.velocidadeMotor);
		
		aviao.acelerarAviao();
		aviao.acelerarAviao();
		aviao.acelerarAviao();
		
		System.out.println("A Velocidade do motor é: " + aviao.motor.velocidadeMotor);
		
		Piloto piloto = new Piloto();
	
		
	}

}
