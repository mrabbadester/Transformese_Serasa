package ComputadorPC;

public class Computador1 {
	
private boolean ligado = false;

	public void setLigado(boolean alteraLigadoDesligado){
		if(isLigado() != alteraLigadoDesligado)
			this.ligado = alteraLigadoDesligado;
	}
	
	public boolean isLigado(){
		return ligado;
	}
}
