package carSystem4;


// Classe concreta
public abstract class Motor {
	
	private int qtdPist  = 0, 
			    potencia = 0;
	
	public Motor() {
		// TODO Motor turbo.
	}

	public Motor(int qtdPist, int potencia) {
		this.qtdPist  = qtdPist;
		this.potencia = potencia;
	}
	
	public int getQtdPist() {
		return qtdPist;
	}

	public final void setQtdPist( int qtdPist ) {
		this.qtdPist = qtdPist;
	}

	public int getPotencia() {
		return potencia;
	}

	public final void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
