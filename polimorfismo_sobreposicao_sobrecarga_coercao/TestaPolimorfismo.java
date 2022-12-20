package polimorfismo_sobreposicao_sobrecarga_coercao;

public class TestaPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Passeio p1 = new Passeio( );
		System.out.println( "O mecanismo de Coerção se utiliza do cast."            );
		System.out.println( "Regras cast do maior bits para o menor em bits."       );
		System.out.println( "@Override traduz do inglês 'Sobrepor'.\n Abaixo"       +
		                    "métodos Sobrecargarregados com Coerção Paramétrica:\n" );
		p1.sobrecargaCoercao("Coerção byte   8bits/double 64 de 3.14d: ",( byte  ) 3.14d );
		p1.sobrecargaCoercao("Coerção short 16bits/double 64 de 3.14d: ",( short ) 3.14d );
		p1.sobrecargaCoercao("Coerção char  'a' minúsculo /dec ASCII double: ",   'a'    );
		p1.sobrecargaCoercao("Coerção char  'A' maiúsculo /dec ASCII double: ",   'A'    );
		p1.sobrecargaCoercao("Coerção long 64bits/8 short após double64: ",(short) 4444L );	
	}
}
