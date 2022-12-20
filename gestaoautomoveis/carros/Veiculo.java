package carros;

public class Veiculo {
	
	String placa,
	       marca,
	       modelo,
	       cor;
	float  velocMax;
	int    qtdRodas;       
	Motor  motor = new Motor();

	public Veiculo() {	}

	public Veiculo( String placa, 
			        String marca, 
			        String modelo, 
			        String cor, 
			        Float  velocMax, 
			        int qtdRodas, 
			        int qtdPist, 
			        int potencia ){
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor    = cor;
		this.velocMax = velocMax;
		this.qtdRodas = qtdRodas;
		this.motor.qtdPist  = qtdPist ;
		this.motor.potencia = potencia;
		
		
	}
	
	
	public String getPlaca() {
		return placa;
	}

	public Object[] setPlaca(String placa) {
		this.placa = placa;
		return null;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(float velocMax) {
		this.velocMax = velocMax;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}
