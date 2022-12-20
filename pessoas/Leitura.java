package java23.pessoas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura extends Exception{

	public Leitura() {}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	InputStreamReader is = new InputStreamReader( System.in );
	BufferedReader   isb = new BufferedReader   ( is        );
	
	final  String entDados( String titulo ) throws Exception {
		
		System.out.print( titulo );		
		String stisb = "";
		
		try {
			stisb = isb.readLine(); 
					
		}catch( Exception e ) {
			System.out.println( "Erro de entrada de dados. " );
			e.printStackTrace();			
		}
		
		return stisb;
	}
	
	
	
}
