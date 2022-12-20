package java23.karina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String entDados( String dado ) {

		InputStreamReader is = new InputStreamReader( System.in );
		BufferedReader    cd = new BufferedReader   (    is     );
		
		String retorno = "";
		
		try{
			if ( !dado.equals( null ) ) {
				System.out.println( dado );
			}
			
			
			retorno = cd.readLine();
		}
		catch( IOException e ){
			System.out.println( "Erro de entrada" );
			e.printStackTrace();
		}
		catch( NumberFormatException n ) {
			System.out.println( "Entrada inválida. " );
			n.printStackTrace();
		}
		
		return retorno;
	}
}