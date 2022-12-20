package polimorfismo_sobreposicao_sobrecarga_coercao;

abstract class Veiculo {
	
	// Este, será Sobreposto por ser abstrato, além de Sobrecarga e Coerção
	public abstract void sobrecargaCoercao( String mensagem, double velocidade );
}
