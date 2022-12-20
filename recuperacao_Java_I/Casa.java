package java23.recuperacao_Java_I;

//As classes: Casa, Edicula e Corretor não poderão ser herdadas.
public final class Casa extends Imovel implements Verifica {
	
	private int vagasGaragem;//indica quantos carros cabem na garagem 
	private static Edicula edicula;
	
	public Casa( ) {
		edicula = new Edicula(); 
		System.out.println( "-----------------------------" );
		System.out.println( "Cadastro de Casas com Edícula" );
		System.out.println( "-----------------------------" );
	}
	
	public int getVagasGaragem( ) {
		return vagasGaragem;
	}
	public void setVagasGaragem( ) throws NumberFormatException  {
		int vagasGaragem = 0;
		try {
			vagasGaragem = Integer.parseInt( entDados( "Quantas vagas garagem: " ) );
			
		} catch ( Exception e) {
										 
			// TODO: handle exception
			System.out.println( "Digite corretamente." );
			setVagasGaragem( );
		}
		
		this.vagasGaragem = vagasGaragem;
		
	}
	public Edicula getEdicula() {
		return edicula;
	}

	
	
	public void setEdicula( int numero  ) throws Exception {
		
		Edicula edicula = new Edicula( );
		
		int     area      = Integer.parseInt( entDados( "Digite a área da Edícula: " ) );
		edicula.setArea( area );
		
		//numero = Integer.parseInt( entDados( "Digite o número da Edícula: " ) );
		
		edicula.setNumero(  numero );
		
		//casa.setEdicula = edicula;
		
	}
	
	/**
B) A Interface Verifica contém um método chamado validNum(), que:
B.1) Para a classe Casa verificará se o número da casa é menor que 100. Caso seja, deverá imprimir na tela: 
“Numero da casa menor que 100!”;
	 **/

	@Override
	public void validNum( ) {
		// TODO Auto-generated method stub
		if ( super.getNumero( ) < 100 ) {
			System.out.println( "Numero da casa menor que 100!" );
		}
	}
	
	//  Na classe Casa imprimir a quantidade de letras da String que define o nome da rua 
	// (ex.: “A rua tem: “+...);
	@Override
	public void calcRua( String s ) {
		// TODO Auto-generated method stub
		int contaLetras = s.length();
		
		System.out.println( "O nome da Rua tem: " + contaLetras + " letras" );
	}

}
