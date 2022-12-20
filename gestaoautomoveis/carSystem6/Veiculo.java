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

	
	
//	Sobre a Velocidade Máxima dos veículos:
//	i. Caso a velocidade Máxima de um veículo seja menor que 80 ou maior
//	110, deverá disparar a exceção VelocException (que será do tipo
//	verificada). Seu método construtor deverá informar que: A velocidade
//	Máxima está fora dos limites brasileiros
//	ii. Neste caso (após disparar a exceção), se estiver tentando atribuir
//	velocidade para um carro de passeio, este deverá assumir 100 (Km/h
//	para velocidade Máxima) se for um veículo de carga assumirá 90 Km/h;
	
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
