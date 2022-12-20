package java23.recuperacao_Java_I;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public abstract class Imovel {
	
	private String rua;
	protected int numero;
	
	private Corretor corretor;

	
	static NumException numException = new NumException();
	/**
C) A classe Imovel: � abstrata e entre seus m�todos conter�:
C.2) O m�todo abstrato void calcRua() dever�:
- Na classe Casa imprimir a quantidade de letras da String que define o nome da rua 
  (ex.: �A rua tem: �+...);
- E, na classe Edicula, imprimir a primeira letra da rua (ex.: �A 1� letra de rua �: �+...);

	 * @return
	 */
	
	
	public static String entDados( String dado ) throws Exception{
		
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
	
	
	public String getLogradouro() {
		return rua;
	}

	public void setLogradouro( ) throws Exception {
		String rua = "";
		try {
			rua = entDados( "Logradouro: " );
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println( "Entrada inv�lida, digite corretamente: " );
			setLogradouro();
		}
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

//  C.1) O m�todo setNumero: se valor informado for menor ou 
//  igual a 5000 atribuir� o valor ao atributo numero, 
//	se n�o, dever� disparar uma exce��o do tipo NumException;

	public Corretor getCorretor() {
		return corretor;
	}

	public void setCorretor( ) throws Exception {
		Corretor corretor = new Corretor( );		
		String nomeCorretor = entDados( "Digite o nome do corretor: "  );
		corretor.setNome( nomeCorretor );
		
		int idade = 0;
		
		try {
			idade = Integer.parseInt( entDados( "Digite a idade do corretor: " ) );
			
		} catch ( Exception e ) {
			// TODO: Entrada inv�lida
			System.out.println( "Entrada inv�lida, digite corretamente. " );
			
			setCorretor();
		}
	
		corretor.setRg( idade );
		
		this.corretor = corretor;
	}


	public void setNumero( int numero ) throws NumException, Exception {
		// TODO Auto-generated method stub
		try {
			numero = Integer.parseInt( entDados( "Digite n�mero: " ) );
			
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println( "Digite corretamente." );
			this.setNumero( numero );
		}
		
		if ( numero <= 5000 ) {
			this.numero = numero;
		}else {
			numException.impMsg();
		}
		
	}


	//public abstract void calcRua(  );

	public abstract void calcRua( String s );



	
}
