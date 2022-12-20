package carSystem6;

import javax.swing.JOptionPane;

public class VeicExistException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VeicExistException() {
		// TODO Auto-generated constructor stub
		//System.out.println( "JÃ¡ existe um veÃ­culo com esta placa 1" );
	}
	
	public void impErroVeicExistException() {
		// System.out.println( "Já existe um veículo com esta placa " );
		
		JOptionPane.showMessageDialog( null, "Já existe um veículo com esta placa " );
	}
	
}
