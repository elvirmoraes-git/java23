package polimorfismo_sobreposicao_sobrecarga_coercao;

public class TestaPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Passeio p1 = new Passeio( );
		System.out.println( "O mecanismo de Coer��o se utiliza do cast."            );
		System.out.println( "Regras cast do maior bits para o menor em bits."       );
		System.out.println( "@Override traduz do ingl�s 'Sobrepor'.\n Abaixo"       +
		                    "m�todos Sobrecargarregados com Coer��o Param�trica:\n" );
		p1.sobrecargaCoercao("Coer��o byte   8bits/double 64 de 3.14d: ",( byte  ) 3.14d );
		p1.sobrecargaCoercao("Coer��o short 16bits/double 64 de 3.14d: ",( short ) 3.14d );
		p1.sobrecargaCoercao("Coer��o char  'a' min�sculo /dec ASCII double: ",   'a'    );
		p1.sobrecargaCoercao("Coer��o char  'A' mai�sculo /dec ASCII double: ",   'A'    );
		p1.sobrecargaCoercao("Coer��o long 64bits/8 short ap�s double64: ",(short) 4444L );	
	}
}
