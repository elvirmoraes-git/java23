package java23.karina; 

import java.util.ArrayList;
import java.util.List;


public class Anamnese {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		menu();
	}

	private static void menu() throws Exception {
		// TODO Auto-generated method stub
		System.out.println( "----------------------------------" );
		System.out.println( "       Anamnese              " );
		System.out.println( "Menu                         " );
		System.out.println( "---------------------        " );
		System.out.println( "1- Cadastrar Pacientes       " );
		System.out.println( "2- Mostrar Paciente por ID   " );
		System.out.println( "3- Mostrar todos os Pacientes" );
		
		Leitura l = new Leitura();
		
		int key = 0;
		try {
			key  = Integer.parseInt( l.entDados( "Escolha uma opção" ) );
		}catch (Exception e) {
			
		}
		switch (key) {
		case 1:
			cadastrarPaciente();
			break;
		case 2:
			mostrarPacientePorId();
			break;
		case 3:
			mostrarTodosPacientes();
			break;
			
		default:
			break;
		}
		
	}

	// lista de pacientes
	static List<Paciente> pacientes = new ArrayList<Paciente>();
	
	
	//static int    id           = 0 ; 
	//static String nome         = ""; 
	//static String numero       = ""; 
	//static String tipo         = ""; 
	//static String modalidade   = ""; 
	//static String data         = ""; 
	//static String visualizacao = "";
	
	static int    id = 0;
	private static void cadastrarPaciente() throws Exception {
		// TODO Auto-generated method stub
		
		Leitura l = new Leitura();
		Paciente paciente;
		
		String nome         = "";
		String numero       = "";
		String tipo         = "";
		String modalidade   = "";
		String data         = "";
		String visualizacao = "";
		
		
		
		System.out.println( "Cadastro de Pacientes: " );
		System.out.println();
		try {
			
			//id++;
			nome          = l.entDados( "Nome:          " );
			numero        = l.entDados( "Número:        " );
			tipo          = l.entDados( "Tipo de Exame: " );
			modalidade    = l.entDados( "Modalidade:    " );
			data          = l.entDados( "Data:          " );
			visualizacao  = l.entDados( "Visualização:  " );
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
			paciente = new Paciente( id, nome, numero, tipo, modalidade, data, visualizacao );
			//paciente.setIdPaciente( id );
			pacientes.add( paciente );
			id++;
		
		
		System.out.println( "Deseja Cadastrar outro Paciente? " );

		int outro = 0;
		try {
			outro = Integer.parseInt( l.entDados( "      1- Sim      2- Não         " ));
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			
		}
		
		switch (outro) {
		case 1:
			cadastrarPaciente();
			break;

		case 2:
			menu();
			break;
		default:
			break;
		}
		
	}

	//private static int geraID() {
	//	// TODO Auto-generated method stub
	//	int i = id + 1;
	//	id = id++;
	//	return i;
	//}

	private static void mostrarPacientePorId() throws Exception {
		// TODO Auto-generated method stub
		Leitura l = new Leitura();
		
		
		int    id           = 0; 
		String nome         = ""; 
		String numero       = ""; 
		String tipo         = ""; 
		String modalidade   = ""; 
		String data         = ""; 
		String visualizacao = "";
		
		System.out.println( " Mostrar paciente por ID " );
		System.out.println( );
		id = Integer.parseInt( l.entDados( "Digite ID do paciente: "  ) );
		
		for ( Paciente paciente : pacientes ) {
			
			if ( id == Paciente.getIdPaciente( ) ) {
				
				nome         = paciente.getNome();
				numero       = paciente.getNumero();
				tipo         = paciente.getTipoExame();
				modalidade   = paciente.getModalidade();
				data         = paciente.getData();
				visualizacao = paciente.getVisualizacao();
				
			}
		}
		
		System.out.println( "ID Paciente:   " + pacientes.get(id) );
		System.out.println( "Paciente:      " + nome         );
		System.out.println( "Número:        " + numero       );
		System.out.println( "Tipo de Exame: " + tipo         );
		System.out.println( "Modalidade:    " + modalidade   );
		System.out.println( "Data:          " + data         );
		System.out.println( "Visulalização: " + visualizacao );
		
		// voltar
		menu();
	}

	private static void mostrarTodosPacientes() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println( "----------------------------------" );
		System.out.println( "Pacientes Cadastrados no Sistema: " );
		System.out.println( "----------------------------------" );
		
		try {
			
			for ( Paciente paciente : pacientes ) {
				
				//id           = paciente.getIdPaciente  ( );
				//nome         = paciente.getNome        ( );
				//numero       = paciente.getNumero      ( );
				//tipo         = paciente.getTipoExame   ( );
				//modalidade   = paciente.getModalidade  ( );
				//data         = paciente.getData        ( );
				//visualizacao = paciente.getVisualizacao( );
				
				System.out.println( "----------------------------------" );
				System.out.println( "ID Paciente:   " + paciente.getIdPaciente  ( ) );
				System.out.println( "Paciente:      " + paciente.getNome        ( ) );
				System.out.println( "Número:        " + paciente.getNumero      ( ) );
				System.out.println( "Tipo de Exame: " + paciente.getTipoExame   ( ) );
				System.out.println( "Modalidade:    " + paciente.getModalidade  ( ) );
				System.out.println( "Data:          " + paciente.getData        ( ) );
				System.out.println( "Visulalização: " + paciente.getVisualizacao( ) );
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			menu();
		}
	}
	
	
	
	
	
	
	
	
}
