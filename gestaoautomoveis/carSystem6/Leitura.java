package carSystem6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String entDados( String dado ) throws Exception{

		InputStreamReader is      = new InputStreamReader( System.in );
		BufferedReader    cd      = new BufferedReader   (    is     );
		String            retorno = "";
		
		try {
			if ( !dado.equals( null ) ) {
				System.out.println( dado );
			}
			retorno = cd.readLine();

		}
		catch( Exception e ){
			System.out.println( "Erro de entrada!" );
		}
		
		return retorno;
	}
}