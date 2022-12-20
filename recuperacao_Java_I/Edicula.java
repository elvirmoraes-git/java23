package java23.recuperacao_Java_I;

//As classes: Casa, Edicula e Corretor não poderão ser herdadas.
public final class Edicula extends Imovel implements Verifica {
	
	// atributo area indica área, em metros quadrados (m2), 
	// que a edícula ocupa no terreno;
	private int area;


	public int getArea() {
		return area;
	}

	public void setArea( int area ) {
		
		this.area = area;
	}

	/**
B) A Interface Verifica contém um método chamado validNum(), que:
B.2) E, para a classe Edicula, verificará se o número (da edícula) é ímpar. Caso seja, deverá imprimir na tela: 
“Número ímpar!” se não, imprimirá “Número par!”
	 */
	static int numeroValidoEdicula;
	static boolean validNum;
	@Override
	public final void validNum( ) {
		// TODO Auto-generated method stub
		
		numeroValidoEdicula = super.getNumero();
		
		if ( numeroValidoEdicula % 2 == 0 ) {
			 validNum = true;
			 System.out.println( numeroValidoEdicula );
			 System.out.println( "Número par!" );
		}else {
			System.out.println( "Número ímpar!" );
			validNum = false;
		}
	}

	//E, na classe Edicula, imprimir a primeira letra da rua 
	//(ex.: “A 1ª letra de rua é: “+...);
	@Override
	public void calcRua( String s ) {
		// TODO Auto-generated method stub
		char l = s.charAt(0);
		
		System.out.println( "A 1ª letra de rua é: " + l );
	}


}
