package java23.Exemplo_this_super;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Moraes";
		String sobrenome = "Moraes"   ;
		
		Filho filho = new Filho( nome, sobrenome );
				
		filho.herdaSobrenome( );
		
		
	}

}
