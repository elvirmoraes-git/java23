package carSystem6;

import javax.swing.JOptionPane;

public class VeicExistException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VeicExistException() {
		// TODO Auto-generated constructor stub
		//System.out.println( "Já existe um veículo com esta placa 1" );
	}
	
	public void impErroVeicExistException() {
		// System.out.println( "J� existe um ve�culo com esta placa " );
		
		JOptionPane.showMessageDialog( null, "J� existe um ve�culo com esta placa " );
	}
	
}
