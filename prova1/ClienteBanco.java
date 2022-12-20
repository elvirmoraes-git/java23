package java23.prova1;


/**
 * @author D88P
 * A classe ClienteBanco é abstrata e contém:
 */
public abstract class ClienteBanco {
	
	private int      numeroConta;
	private String   nome;
	private Endereco ender;
	
	
	
	/**
	 * um método abstrato chamado “verifDoc” o qual verificará:
	 * 
	 */
	abstract void verifDoc();
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	
	
	/**
	 * @param numeroConta
	 * 
	 * O seu método setNumeroConta: se valor informado for positivo, 
	 * atribuirá este valor ao atributo numeroConta, 
	 * se não, deverá disparar uma exceção do tipo NumException;
	 * @throws NumException 
	 * 
	 */
	public void setNumeroConta( int numeroConta ) throws NumException {
		
		if ( numeroConta % 2 == 0 ) {
			
			this.numeroConta = numeroConta;
			
			
		} else {
			
			throw new NumException();
			
		}
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEnder() {
		return ender;
	}
	public void setEnder(Endereco ender) {
		this.ender = ender;
	}
	
}
