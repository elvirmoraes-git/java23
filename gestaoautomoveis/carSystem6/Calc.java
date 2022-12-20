package carSystem6;

public interface Calc {
	
	/**
	 * g. O método “calcular�? da interface “Calc�?, quando sobrescrito:
	 *  i. Na classe Passeio: retornará a soma das quantidades de letras
	 *     existentes em todos os atributos do tipo String;
	 * ii. Na classe Carga: retornará a soma de todos os valores contidos nos
	 *     atributos numéricos.
	 * 
	 * @param text
	 * @param count
	 * @return
	 */
	int calcular(String text, int count);
	
	
}
