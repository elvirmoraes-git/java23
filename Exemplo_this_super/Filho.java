package java23.Exemplo_this_super;

public class Filho extends Pai{
	
	String nome;
	
	Filho( String nome, String sobrenome ){
		this  .nome     = nome;
		super.sobrenome = sobrenome;
	}
	
	void herdaSobrenome() {
		
		System.out.println( "Nome:      " + this .nome      );
		System.out.println( "Sobrenome: " + super.sobrenome );
		
		super.herdaSobrenome();
		
	}
	
	
	
	
}
