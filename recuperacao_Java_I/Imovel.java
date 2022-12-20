package java23.recuperacao_Java_I;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public abstract class Imovel {
	
	private String rua;
	protected int numero;
	
	private Corretor corretor;

	
	static NumException numException = new NumException();
	/**
C) A classe Imovel: é abstrata e entre seus métodos conterá:
C.2) O método abstrato void calcRua() deverá:
- Na classe Casa imprimir a quantidade de letras da String que define o nome da rua 
  (ex.: “A rua tem: “+...);
- E, na classe Edicula, imprimir a primeira letra da rua (ex.: “A 1ª letra de rua é: “+...);

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
			System.out.println( "Entrada inválida, digite corretamente: " );
			setLogradouro();
		}
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

//  C.1) O método setNumero: se valor informado for menor ou 
//  igual a 5000 atribuirá o valor ao atributo numero, 
//	se não, deverá disparar uma exceção do tipo NumException;

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
			// TODO: Entrada inválida
			System.out.println( "Entrada inválida, digite corretamente. " );
			
			setCorretor();
		}
	
		corretor.setRg( idade );
		
		this.corretor = corretor;
	}


	public void setNumero( int numero ) throws NumException, Exception {
		// TODO Auto-generated method stub
		try {
			numero = Integer.parseInt( entDados( "Digite número: " ) );
			
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
