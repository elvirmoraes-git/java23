package java23.prova1;

public final class PessoaJuridica extends ClienteBanco {

	private int          cnpj;
	
	
	/**
	 * A classe PessoaJuridica contém um atributo denominado responsavel, 
	 * este indica uma pessoa física da empresa incumbida de gerenciar a conta. 
	 */
	private PessoaFisica responsavel;
	
	/**
	 * chamado “verifDoc” o qual verificará:
	 * 
	 * Em PessoaJuridica: se a quantidade de letras do nome do “responsavel” 
	 * é maior que 30, caso seja deverá informar na tela a mensagem 
	 * 
	 * 	“Nome inválido para Responsável”, 
	 * 
	 * se não, informará na tela a mensagem 
	 * 
	 * 	“Nome válido para Responsável”;
	 */
	@Override
	public final void verifDoc(){
		
		int letras = responsavel.getNome().length();
		
		if( letras > 30 ) {
			
			System.out.println( "Nome inválido para Responsável" );
			
		}else {
			
			System.out.println( "Nome válido para Responsável" );
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
