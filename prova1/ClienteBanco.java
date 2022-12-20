package java23.prova1;


/**
 * @author D88P
 * A classe ClienteBanco � abstrata e cont�m:
 */
public abstract class ClienteBanco {
	
	private int      numeroConta;
	private String   nome;
	private Endereco ender;
	
	
	
	/**
	 * um m�todo abstrato chamado �verifDoc� o qual verificar�:
	 * 
	 */
	abstract void verifDoc();
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	
	
	/**
	 * @param numeroConta
	 * 
	 * O seu m�todo setNumeroConta: se valor informado for positivo, 
	 * atribuir� este valor ao atributo numeroConta, 
	 * se n�o, dever� disparar uma exce��o do tipo NumException;
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
