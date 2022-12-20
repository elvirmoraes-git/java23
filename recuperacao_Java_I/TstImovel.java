package java23.recuperacao_Java_I;

import java.util.ArrayList;

public class TstImovel {

	static ArrayList< Casa > listaCasas = new ArrayList< Casa >( );
	
	public static void main( String[] args ) throws Exception {
		// TODO Iniciar Sistema.
		
		menu();
		
	}
	
	private static void menu( ) throws Exception, NumberFormatException {
		System.out.println( "------------------------" );
		System.out.println( "Imobiliária Casas Lindas" );
		System.out.println( "------------------------" );
		System.out.println( "menu:                   " );
		System.out.println( "------------------------" );
		System.out.println( "1- Cadastrar Imóveis    " );
		System.out.println( "2- Exibir Imóveis       " );
		System.out.println( "3- Sair                 " );
		
		int menu = 0;
		try {
			menu = Integer.parseInt( Imovel.entDados( "opção: " ) );
		} catch (Exception e) {
			System.out.println( "Entrada inválida." );
		}
		switch ( menu ) {
		case 1:
			cadastrarImoveis();
			break;
		case 2:
			exibirImoveis();
			break;
		
		case 3:
			System.exit( 0 );
			break;
		default:
			menu();
			break;
		}
	}
	
	static int numeroValidoEdicula;
	static int numeroValidoCasa;
	
	private static void exibirImoveis() throws Exception, NullPointerException, IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		int i = 0;
		
		if ( listaCasas.isEmpty( ) ) {
			
			System.out.println( "Sem imóveis cadastrado." );
			menu();
			
		} else {

			try {
				for ( Casa casa : listaCasas ) {
					System.out.println( "----------------------------" );
					System.out.println( "Casa:       " +  i + "º "     );
					System.out.println( "Logradouro: "                 );
					System.out.println( "Rua:                " + casa.getLogradouro  ( ) );
					casa.calcRua ( casa.getLogradouro( ) );
					casa.validNum( );
					System.out.println( "Número:             " + casa.getNumero      ( )                   );
					System.out.println( "Vagas de garagem:   " + casa.getVagasGaragem( )                   );
					System.out.println( "Área total Edícula: " + casa.getEdicula( ).getArea( ) + "m²" );
					System.out.println( "Número Edicula:     " + casa.getEdicula( ).getNumero( ) );
					casa.getEdicula( ).calcRua ( casa.getLogradouro( ) );
					casa.getEdicula( ).validNum( );
					System.out.println( "Nome do Corretor:   " + casa.getCorretor    ( ).getNome( )        );
					System.out.println( " Rg  do Corretor:   " + casa.getCorretor    ( ).getRg  ( )        );
					i++;
				} 
				
			}catch ( IndexOutOfBoundsException e) {
					// TODO: handle exception
			}finally {
				menu();
			}
		}
	}

	private static void cadastrarImoveis( ) throws Exception {
		// TODO Auto-generated method stub
		Casa casa;
			
		casa = new Casa      (                     );
		casa .setLogradouro  (                     );
		casa .setNumero      ( numeroValidoCasa    );
		casa .setVagasGaragem(                     );
		casa .setEdicula     ( numeroValidoEdicula );
		casa .setCorretor    (                     );
		
		listaCasas.add( casa );
		
		int novoCadastro = Integer.parseInt( 
				                 Imovel.entDados( "Deseja Cadastrar ou Imóvel? " + 
		                                           "  1- Sim  " + "  2- Não      " ) );
		
		switch ( novoCadastro ) {
		case 1:
			cadastrarImoveis( );
			break;
			
		case 2:
			menu();
			break;
		
		default:
			break;
		}
		
	}
}
