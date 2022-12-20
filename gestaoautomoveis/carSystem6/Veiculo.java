package carSystem6;

public abstract class Veiculo extends Motor {
	
	private String placa,
	               marca,
	               modelo,
	               cor;
	private float  velocMax;
	private int    qtdRodas;
	
	private int tipo;
	
	Motor          motor;
	
	public Veiculo() {	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo( int tipo ) {
		if ( tipo == 2 ) {
			this.tipo = tipo;
		}else if ( tipo == 1 ) {
			this.tipo = tipo;
		}
	}

	// Implementa na filha
	public abstract float calcVel( float velocMax );
	
	public String getPlaca() {
		return placa;
	}
	
	public final void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public final void setCor(String cor) {
		this.cor = cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	
	
//	Sobre a Velocidade M�xima dos ve�culos:
//	i. Caso a velocidade M�xima de um ve�culo seja menor que 80 ou maior
//	110, dever� disparar a exce��o VelocException (que ser� do tipo
//	verificada). Seu m�todo construtor dever� informar que: A velocidade
//	M�xima est� fora dos limites brasileiros
//	ii. Neste caso (ap�s disparar a exce��o), se estiver tentando atribuir
//	velocidade para um carro de passeio, este dever� assumir 100 (Km/h
//	para velocidade M�xima) se for um ve�culo de carga assumir� 90 Km/h;
	
	public final void setVelocMax( float velocMax, int key ) throws VelocException{
		
		if ( velocMax < 80f || velocMax > 110f ) {
			switch ( key ) {
			case 1:
				this.velocMax = 100f;
				break;
			case 2:
				this.velocMax = 90f;
				break;
			}
			throw new VelocException( );

		} else {
			this.velocMax = velocMax;
		}
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public final void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public Motor getMotor() {
		return motor;
	}

	public final void setMotor( Motor motor ) {
		this.motor = motor;
	}
}
