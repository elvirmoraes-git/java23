package carSystem4;

public final class Passeio extends Veiculo implements Calc{
	
	private int qtdPassageiros;
	
	public Passeio() {
		// TODO Construtor vazio
	}
	public Passeio(  
			        String placa, 
			        String marca, 
			        String modelo, 
			        String cor, 
			        //float velocMax, 
			        int qtdRodas,
			        int qtdPist,
			        int potencia, 
			        int qtdPassageiros ) {
		// TODO Construtor com parâmetros.
		super.setPlaca(placa);
		super.setMarca(marca);
		super.setModelo(modelo);
		super.setCor(cor);
      //super.setVelocMax( velocMax , 1 );
		super.setQtdRodas(qtdRodas);
		super.setQtdPist(qtdPist);
		super.setPotencia(potencia);
		this.qtdPassageiros = qtdPassageiros;
	}
	
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}
	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	@Override
	public final float calcVel( float velocMax ) {
		// TODO Velocidade do veículo de passeio deverá ser calculada em m/h;
		float velMH = velocMax * 100f; 
		
		return velMH;
	}
	
	/**
	 * g. O método “calcular�? da interface “Calc�?, quando sobrescrito:
     * 
     * 	i. Na classe Passeio: retornará a soma das quantidades de letras
     *  existentes em todos os atributos do tipo String; 
	 */
	@Override
	public final int calcular( String text, int count ) {
		// TODO Sobrescreve Interface Calc.
		
		count = text.length();
		
		return count;
	}
}
