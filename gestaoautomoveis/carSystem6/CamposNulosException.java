package carSystem6;

import javax.swing.JOptionPane;

public class CamposNulosException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CamposNulosException() {
		// TODO Auto-generated constructor stub
		//System.out.println( "Já existe um veículo com esta placa 1" );
	}
	
	public void impErroCamposNulosException() {
		// System.out.println( "J� existe um ve�culo com esta placa " );
		
		JOptionPane.showMessageDialog( null, "Campos de Texto vazios" );
	}
	
}
