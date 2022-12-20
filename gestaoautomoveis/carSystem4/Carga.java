package carSystem4;

public final class Carga extends Veiculo implements Calc{
	
	private int cargaMax;
	private int tara;
	
	public Carga() {}
	
	public Carga(
			
			String placa, 
	        String marca, 
	        String modelo, 
	        String cor, 
	        //float  velocMax, 
	        int    qtdRodas,
	        int    qtdPist,
	        int    potencia,
	        int    cargaMax, 
			int    tara      ) {
		
		super.setPlaca   ( placa    );
		super.setMarca   (  marca   );
		super.setModelo  ( modelo   );
		super.setCor     ( cor      );
		//super.setVelocMax( velocMax, 2 );
		super.setQtdRodas( qtdRodas );
		super.setQtdPist ( qtdPist  );
		super.setPotencia( potencia );
		this.cargaMax    = cargaMax;
		this.tara        = tara;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	@Override
	public final float calcVel( float velocMax ) {
		// TODO A velocidade do veículo de carga deverá ser calculada em cm/h;
		float velCH = velocMax * 1000f; 
		
		return velCH;
	}
	
	/**
	 * Na classe Carga: retornará a soma de todos os valores contidos nos
     * atributos numéricos.
	 */
	@Override
	public final int calcular( String text, int count ) {
		// TODO Auto-generated method stub
		
		int total =+ count;
		
		
		return total;
	}
	
}
