package java23.prova1;

public final class PessoaFisica extends ClienteBanco {
	
	private int cpf;

	
	/**
	 * Em PessoaFisica: se o valor informado para o atributo CPF está entre 10 e 20. 
	 * Caso o valor esteja fora desta escala, informará na tela a mensagem 
	 * “CPF inválido”, se não, informará na tela a mensagem “CPF válido”;
	 */
	@Override
	public final void verifDoc() {
		if ( cpf >= 10 && cpf <= 20 ) {
			
			System.out.println( "CPF válido" );
			
		} else {
			System.out.println( "CPF inválido" );
		}
	}
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
