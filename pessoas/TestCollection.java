package java23.pessoas;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {

	public static void main( String args[] ) {
		
		menu();
		
	}

	private static void menu() {
		// TODO Auto-generated method stub
		
		
		System.out.println( "UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ" );
		System.out.println( "================= UTFPR ==================" );
		
		System.out.println( "1 - Cadastro de Aluno."                     );
		System.out.println( "2 - Cadastro de Professor."                 );
		System.out.println( "3 - Imprimir Alunos."                       );
		System.out.println( "4 - Imprimir Professores."                  );
		System.out.println( "5 - Imprimir aluno pelo Id."                );
		System.out.println( "6 - Imprimir Professor pelo Id."            );
		Leitura l = new Leitura();
		String s = "";
		try {
			s = l.entDados( "Digite opção: " );
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println( "Erro de entrada de dados: " );
		}
		int key = Integer.parseInt( s );
		switch (key) {
		case 1:
			cadastrarAluno();
			break;
		case 2:
			cadastrarProfessor();
			break;
		case 3:
			imprimirAlunos();
			break;
		case 4:
			imprimirProfessores();
			break;
		case 5:
			imprimirAlunoPorID();
			break;
		case 6:
			imprimirProfessorPorID();
			break;

		default:
			break;
		}
	}

	static List<Pessoa> lista = new ArrayList<Pessoa>();

	/**
	 * Caso de Uso 1
	 * Cadastrar Alunos
	 */
	private static void cadastrarAluno() {
		// TODO Auto-generated method stub
		Aluno a = new Aluno();
		
		String cod = "";
		String nome = "";
		String ra   = "";
		
		Leitura l = new Leitura();
		
		try {
			cod  = l.entDados( "Código: " );
			nome = l.entDados( "Nome"     );
			ra   = l.entDados( "Ra"       );
			
			a.setCod ( Integer.parseInt( cod  ) );
			a.setNome(                   nome   );
			a.setRa  ( Integer.parseInt( ra   ) );
			
			lista.add( a );
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void cadastrarProfessor( ) {
		// TODO Auto-generated method stub
		Professor a = new Professor();
		
		String cod     = "";
		String nome    = "";
		String salario = "";
		String titulo  = "";
		
		Leitura l = new Leitura();
		
		try {
			cod     = l.entDados( "Código: " );
			nome    = l.entDados( "Nome"     );
			salario = l.entDados( "Salário"  );
			titulo  = l.entDados( "Título"   );
			
			a.setCod   ( Integer.parseInt( cod     ) );
			a.setNome  (                   nome      );
			a.setSal   ( Integer.parseInt( salario ) );
			a.setTitulo(                   titulo    );
			
			lista.add(a);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	private static void imprimirAlunos() {
		// TODO Auto-generated method stub
		
		
		
	}
	
	private static void imprimirProfessores() {
		// TODO Auto-generated method stub
		
	}

	private static void imprimirAlunoPorID() {
		// TODO Auto-generated method stub
		
	}
	
	private static void imprimirProfessorPorID() {
		// TODO Auto-generated method stub
		
	}
	
}
