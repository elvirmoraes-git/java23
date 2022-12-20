package java23.prova1;

public final class PessoaFisica extends ClienteBanco {
	
	private int cpf;

	
	/**
	 * Em PessoaFisica: se o valor informado para o atributo CPF est� entre 10 e 20. 
	 * Caso o valor esteja fora desta escala, informar� na tela a mensagem 
	 * �CPF inv�lido�, se n�o, informar� na tela a mensagem �CPF v�lido�;
	 */
	@Override
	public final void verifDoc() {
		if ( cpf >= 10 && cpf <= 20 ) {
			
			System.out.println( "CPF v�lido" );
			
		} else {
			System.out.println( "CPF inv�lido" );
		}
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
