package carSystem5;

public class VelocException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
//	Sobre a Velocidade Máxima dos veículos:
//		i. Caso a velocidade máxima de um veículo seja menor que 80 ou maior
//		110, deverá disparar a exceção “VelocException” (que será do tipo
//		verificada). Seu método construtor deverá informar que: “A velocidade
//		máxima está fora dos limites brasileiros”.
	public VelocException() {
		// TODO Construtor
		
	}
//		ii. Neste caso (após disparar a exceção), se estiver “tentando” atribuir
//		velocidade para um carro de passeio, este deverá assumir 100 (Km/h
//		para velocidade máxima) se for um veículo de carga assumirá 90 Km/h;
	public void impErroVelocException( ) {
		System.out.println( "\nA velocidade máxima está fora dos limites brasileiros" );
		
	}
	
}
