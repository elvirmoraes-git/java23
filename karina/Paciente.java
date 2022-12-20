package java23.karina;

public class Paciente {
	
	private static int    IdPaciente; 
	private static String nome;
	private static String numero;
	private static String tipoExame;
	private static String modalidade;
	private static String data;
	private static String visualizacao;
	
	
	Paciente( 
			  int    id, 
			  String nome, 
			  String numero, 
			  String tipo, 
			  String modalidade, 
			  String data, 
			  String visualizacao 
			  ){
		
		//Paciente.IdPaciente   = id;
		Paciente.nome         = nome;
		Paciente.numero       = numero;
		Paciente.tipoExame    = tipo;
		Paciente.modalidade   = modalidade;
		Paciente.data         = data;
		Paciente.visualizacao = visualizacao;
		
	}

	public static void setIdPaciente(int idPaciente) {
		IdPaciente = idPaciente;
	}


	public static int getIdPaciente() {
		return IdPaciente;
	}


	public static String getNome() {
		return nome;
	}


	public static String getNumero() {
		return numero;
	}


	public static String getTipoExame() {
		return tipoExame;
	}


	public static String getModalidade() {
		return modalidade;
	}


	public static String getData() {
		return data;
	}


	public static String getVisualizacao() {
		return visualizacao;
	}
	
}
