package java23.prova1;

public final class PessoaJuridica extends ClienteBanco {

	private int          cnpj;
	
	
	/**
	 * A classe PessoaJuridica cont�m um atributo denominado responsavel, 
	 * este indica uma pessoa f�sica da empresa incumbida de gerenciar a conta. 
	 */
	private PessoaFisica responsavel;
	
	/**
	 * chamado �verifDoc� o qual verificar�:
	 * 
	 * Em PessoaJuridica: se a quantidade de letras do nome do �responsavel� 
	 * � maior que 30, caso seja dever� informar na tela a mensagem 
	 * 
	 * 	�Nome inv�lido para Respons�vel�, 
	 * 
	 * se n�o, informar� na tela a mensagem 
	 * 
	 * 	�Nome v�lido para Respons�vel�;
	 */
	@Override
	public final void verifDoc(){
		
		int letras = responsavel.getNome().length();
		
		if( letras > 30 ) {
			
			System.out.println( "Nome inv�lido para Respons�vel" );
			
		}else {
			
			System.out.println( "Nome v�lido para Respons�vel" );
		}
	}
	
	
	public int getCnpj( ) {
		return cnpj;
	}
	public void setCnpj( int cnpj ) {
		this.cnpj = cnpj;
	}
	public PessoaFisica getResponsavel( ) {
		return responsavel;
	}
	public void setResponsavel( PessoaFisica responsavel ) {
		this.responsavel = responsavel;
	}
	
}
