package carSystem5;

public class MenuAutomoveis {
	
	/**
	 * Implementação do Menu.
	 * @throws VelocException 
	 */
	public final static void menu( ) throws VelocException {
		// TODO Menu Car System 5
		
		System.out.println(                                                );
		System.out.println( "Sistema de Gestão de Veículos - Menu Inicial" );
		System.out.println(                                                );
		System.out.println( "1. Cadastrar Veículo de Passeio             " );
		System.out.println( "2. Cadastrar Veículo de Carga               " );
		System.out.println( "3. Imprimir Todos os Veículos de Passeio    " );
		System.out.println( "4. Imprimir Todos os Veículos de Carga      " );
		System.out.println( "5. Imprimir Veículo de Passeio pela Placa   " );
		System.out.println( "6. Imprimir Veículo de Carga pela Placa     " );
		System.out.println( "7. Excluir Veículo de Passeio pela Placa    " );
		System.out.println( "8. Excluir Veículo de Carga pela Placa      " );
		System.out.println( "9. Sair do Sistema		                     " );
		
		System.out.println();
		
		Leitura l = new Leitura();
		
		int key = 0;
		try {
			key  = Integer.parseInt( l.entDados( "Escolha uma opção" ) );
			
		} catch ( NumberFormatException ne) {
			// TODO: Tratar menu.
			System.out.println("Digite somente opções do menu.");
		}
		
		switch (key) {
		case 1:
			// Cadastrar ve�culos de Passeio.
			GestaoAutomoveis.cadastrarVeiculoPasseio( );
			break;
		case 2:
			// Cadastrar ve�culos de Carga.
			GestaoAutomoveis.cadastrarVeiculoCarga( );
			break;
		case 3:
			// Imprimir Todos os Veículos de Passeio.   OK
			GestaoAutomoveis.imprimirTodosVeiculosPasseio();
			break;
		case 4:
			// Imprimir Todos os Veículos de Carga.     OK
			GestaoAutomoveis.imprimirTodosVeiculosCarga();
			break;
		case 5:
			// Imprimir Veículo de Passeio pela Placa.
			GestaoAutomoveis.imprimirVeiculosPasseioPelaPlaca();
			break;
		case 6:
			// Imprimir Veículo de Carga pela Placa. 
			GestaoAutomoveis.imprimirVeiculoCargaPelaPlaca();
			break;
		case 7:
			// Excluir Ve�culo de Passeio pela Placa.
			GestaoAutomoveis.ExcluirVeiculoDePasseioPelaPlaca();
			break;
		case 8:
			// Excluir Ve�culo de Carga Pela Placa.
			GestaoAutomoveis.ExcluirVeiculoDeCargaPelaPlaca();
			break;
		case 9:
			// Sair do Sistema.
			System.exit(0);
			break;
			
		default:
			// Voltar ao menu.
			menu();
			break;
		}
	}

	
} // Fim da classe Teste
