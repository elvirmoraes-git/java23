package java23.recuperacao_Java_I;

//As classes: Casa, Edicula e Corretor n�o poder�o ser herdadas.
public final class Edicula extends Imovel implements Verifica {
	
	// atributo area indica �rea, em metros quadrados (m2), 
	// que a ed�cula ocupa no terreno;
	private int area;


	public int getArea() {
		return area;
	}

	public void setArea( int area ) {
		
		this.area = area;
	}

	/**
B) A Interface Verifica cont�m um m�todo chamado validNum(), que:
B.2) E, para a classe Edicula, verificar� se o n�mero (da ed�cula) � �mpar. Caso seja, dever� imprimir na tela: 
�N�mero �mpar!� se n�o, imprimir� �N�mero par!�
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
			 System.out.println( "N�mero par!" );
		}else {
			System.out.println( "N�mero �mpar!" );
			validNum = false;
		}
	}

	//E, na classe Edicula, imprimir a primeira letra da rua 
	//(ex.: �A 1� letra de rua �: �+...);
	@Override
	public void calcRua( String s ) {
		// TODO Auto-generated method stub
		char l = s.charAt(0);
		
		System.out.println( "A 1� letra de rua �: " + l );
	}


}
