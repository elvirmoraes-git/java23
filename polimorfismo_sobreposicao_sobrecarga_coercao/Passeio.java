package polimorfismo_sobreposicao_sobrecarga_coercao;

public final class Passeio extends Veiculo{

	@Override // <-- Override = Sobrepor, abaixo Sobrecarga com Coerção
	public void sobrecargaCoercao( String mensagem, double velocidade ) {
		
		System.out.println( mensagem + velocidade );
	}
}
