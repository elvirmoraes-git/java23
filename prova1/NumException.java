/**
 * 
 */
package java23.prova1;

import javax.swing.JOptionPane;

/**
 * @author D88P
 *
 */
public class NumException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void impMsg( ) {
		System.out.println( "ERRO: Não pode haver Número Negativo para conta!" );
	}
	
}
