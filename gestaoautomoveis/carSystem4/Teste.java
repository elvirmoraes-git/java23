package carSystem4;

import java.io.IOException;

import carSystem5.Leitura;

public class Teste {
	
	// globais
	static String placa          = "", 
			      marca          = "", 
			      modelo         = "",
			      cor            = ""; 
	static float  velocMax       = 0f;
	static int    qtdRodas       = 0,
			      qtdPist        = 0, 
			      potencia       = 0,
			      // passeio
			      qtdPassageiros = 0,
			      // carga
			      cargaMax       = 0,
			      tara           = 0;
	
	// CONTABILIZAR QUANTIDADE DE VE�?CULOS.
	static int inPass = 0, inCarg = 0;
	
	public static void main( String[] args ) {
		// Interação.
		menu();
		
	}
	/**
	 * Implementação do Menu.
	 */
	private final static void menu( ) {
		// TODO Menu Car System 4
		
		Leitura l = new Leitura();
		
		System.out.println(                                                );
		System.out.println( "Sistema de Gestão de Veículos - Menu Inicial" );
		System.out.println(                                                );
		System.out.println( "1. Cadastrar Veículo de Passeio             " );
		System.out.println( "2. Cadastrar Veículo de Carga               " );
		System.out.println( "3. Imprimir Todos os Veículos de Passeio    " );
		System.out.println( "4. Imprimir Todos os Veículos de Carga      " );
		System.out.println( "5. Imprimir Veículo de Passeio pela Placa   " );
		System.out.println( "6. Imprimir Veículo de Carga pela Placa     " );
		System.out.println( "7. Sair do Sistema		                     " );
		System.out.println();
		
		int key = 0;
		try {
			key  = Integer.parseInt( l.entDados( "Escolha uma opção" ) );
			
		} catch ( NumberFormatException ne) {
			// TODO: Tratar menu.
			System.out.println("Digite somente opções do menu.");
		}
		
		switch (key) {
		case 1:
			cadastrarVeiculoPasseio( );
			
			break;
		case 2:
			cadastrarVeiculoCarga( );
			
			break;
		case 3:
			// Imprimir Todos os Veículos de Passeio.   OK
			imprimirTodosVeiculosPasseio();
			break;
		case 4:
			// Imprimir Todos os Veículos de Carga.     OK
			imprimirTodosVeiculosCarga();
			break;
		case 5:
			// Imprimir Veículo de Passeio pela Placa.
			imprimirVeiculosPasseioPelaPlaca();
			break;
		case 6:
			// Imprimir Veículo de Carga pela Placa. 
			imprimirVeiculoCargaPelaPlaca();
			break;
		case 7:
			// Sair do Sistema.
			System.exit(0);
			break;
		default:
			menu();
			break;
		}
		menu();
	}
	/**
	 * quem chama: menu();
	 * Caso de uso: 1. Cadastrar veículo de passeio.
	 *              2. Cadastrar veículo de carga.
	 */
	
	static int passeioMaior = 0;
	
	static BDVeiculos bd = new BDVeiculos();
	static int c; 
	
	static boolean b = true;
	
	public final static void cadastrarVeiculoPasseio( ) {
		// TODO: Triagem para Cadastro de Veículos.
		Leitura l = new  Leitura();
		String entDados = "";
		Veiculo veiculo;
		
		String plac    = "", marc    = "", model  = "", corr    = "",
			   velocMa = "", qtdRoda = "", qtdPis = "", potenci = "",
				   // Passeio.
			   qtdPassageiro = "";
				
		if ( inPass >= bd.listaPasseio.length ) {
			
			System.out.println( "Vetor de PASSEIO está cheio!! - Pressione <ENTER>" );
			try {
				c = System.in.read();
				menu();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} else {
			passeioMaior ++;
		}
		
			System.out.println( "=======================================" );
			System.out.println(  "Cadastro de Veículos de PASSEIO"        );
			System.out.println( "=======================================" );

			qtdPassageiro = l.entDados( "Quantidade de Passageiros: " );
			plac          = l.entDados( "placa: " );
			
			// c. Ao inserir um novo veículo o sistema deverá verificar se já existe um veículo
			// cadastrado com a mesma placa. Caso exista, deverá informar ao usuário sobre
			// esta existência e deverá voltar ao Menu Inicial.
			
			try {
				if( (b = conferePlaca( plac, 1 ) ) ){
					
					marc    = l.entDados( "marca: "                );               
					model   = l.entDados( "modelo: "               );              
					corr    = l.entDados( "cor: "                  );              
					velocMa = l.entDados( "Velocidade Máxima: "    );           
					qtdRoda = l.entDados( "Quantidade de Rodas: "  );           
					qtdPis  = l.entDados( "Quantidade de Pistão: " );      
					potenci = l.entDados( "Potência: "             );
					
					// Configura variáveis globais
					qtdPassageiros = Integer.parseInt( qtdPassageiro );
					placa          =  plac; 
					marca          =  marc;  
					modelo         =  model;  
					cor            =  corr;  
					velocMax       = Float.parseFloat( velocMa ); 
					qtdRodas       = Integer.parseInt( qtdRoda ); 
					qtdPist        = Integer.parseInt( qtdPis  );
					potencia       = Integer.parseInt( potenci );
					
					// Cadastro:
					veiculo = new Passeio( placa, marca, modelo, cor, qtdRodas, qtdPist, potencia, qtdPassageiros );
					
					try {
						veiculo.setVelocMax( velocMax, 1 );
					} catch ( VelocException e1 ) {
						// TODO Auto-generated catch block
						//e1.printStackTrace();
					}
					
					bd.listaPasseio[ inPass ] = (Passeio) veiculo;
					// Opção para cadastrar mais veículos de PASSEIO
					
					System.out.println( "Passeio armazenado na posição " + inPass  + " do vetor - press <ENTER>" );
					try {
						c = System.in.read();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				inPass++;// nova posição disponível.
				
				
			}
				
			} catch ( VeicExistException e1 ) {
				// TODO Já existe veículo com essa placa
				//System.out.println("Entrou aqui");
				e1.impErroVeicExistException();
				menu();
			}
			
			entDados = l.entDados("Deseja cadastrar outro PASSEIO? <s/n>").toLowerCase( );
			switch (entDados) {
			case "s":
				// Cadastrar novamente:
				cadastrarVeiculoPasseio( );
				break;
			case "n":
				menu( );
				break;
			
			}
	}
	
	static int cargaMaior = 0;
	
	public final static void cadastrarVeiculoCarga( ) {
		// TODO: Triagem para Cadastro de Veículos.
		Leitura l = new  Leitura();
		String entrada = "";
		Veiculo veiculo;
		
		String plac    = "", marc    = "", model   = "", corr    = "",
			   velocMa = "", qtdRoda = "", qtdPis  = "", potenci = "",
		    // Carga.
			   cargaMa = "", tar     = "";
		
		if ( cargaMaior >= bd.listaCarga.length ) {
			
			System.out.println( "Vetor de carga está cheio!! - Pressione <ENTER>" );
			try {
				c = System.in.read();
				menu();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} else {
			cargaMaior ++;
		}
		
		System.out.println( "=======================================" );
		System.out.println(  "Cadastro de Veículos de CARGA"          );
		System.out.println( "=======================================" );
		// Configurado para cadastrar veículo de carga.
		cargaMa = l.entDados( "Carga Máxima: " );
		tar     = l.entDados( "Tara: "         );
		plac    = l.entDados( "placa: "        );               
		
		try {
			if( ( b = conferePlaca( plac, 2 ) ) ) {
				marc    = l.entDados( "marca: "                );               
				model   = l.entDados( "modelo: "               );              
				corr    = l.entDados( "cor: "                  );              
				velocMa = l.entDados( "Velocidade Máxima: "    );           
				qtdRoda = l.entDados( "Quantidade de Rodas: "  );           
				qtdPis  = l.entDados( "Quantidade de Pistão: " );      
				potenci = l.entDados( "Potência: "             );
				
				// Carga
				cargaMax = Integer.parseInt( cargaMa );
				tara     = Integer.parseInt( tar );
				placa    = plac; 
				marca    = marc;  
				modelo   = model;  
				cor      = corr;  
				velocMax = Float.parseFloat( velocMa ); 
				qtdRodas = Integer.parseInt( qtdRoda ); 
				qtdPist  = Integer.parseInt( qtdPis  );
				potencia = Integer.parseInt( potenci );
				
				// Cadastro
				
				veiculo = new Carga( placa, marca, modelo, cor, qtdRodas, qtdPist, potencia, cargaMax, tara );
				try {
					veiculo.setVelocMax( velocMax, 2 );
				} catch ( VelocException e1 ) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					
				}
				bd.listaCarga[ inCarg ] = (Carga) veiculo;
				
				System.out.println( "Carga armazenado na posição " + inCarg + " do vetor - press <ENTER>" );
				try {
					c = System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				inCarg++;
			}
		} catch ( VeicExistException e1 ) {
			// TODO 
			e1.impErroVeicExistException();
			menu();
		}
		
		entrada = l.entDados( "Deseja cadastrar outro CARGA? <s/n>" ).toLowerCase();
		switch ( entrada ) {
		case "s":
			cadastrarVeiculoCarga( );
			break;
		case "n":
			menu( );
			break;
		}
	}
	
	private static boolean conferePlaca( String plac, int key ) throws VeicExistException {
		// TODO Confere placa de veículos se já cadastradas.
		boolean b = true;
		
		switch (key) {
		case 1:
			
			for ( Passeio passeio : bd.listaPasseio ) {
				
				if (passeio != null) {
					if ( plac.equals( passeio.getPlaca( ) ) ) {
						b = false;
						throw new VeicExistException();
					} else {
						b = true;
					}
				}
			}
			
			break;
			
		case 2:
			
			for ( Carga carga : bd.listaCarga ) {
				
				if (carga != null) {
					if ( plac.equals( carga.getPlaca( ) ) ) {
						b = false;
						throw new VeicExistException();
					} else {
						b = true;
					}
				}
			}
			
			break;
			
		default:
			break;
		}
		return b;
	}

	private static final void imprimirTodosVeiculosPasseio( ) {
		// TODO 3. Imprimir Todos os Veículos de Passeio
		int countPasseio = 1;
		
		int consulta = 0;
		
		try {
			for ( Passeio passeio : bd.listaPasseio ) {
				if( inPass == 0 && passeio == null ) {
					consulta = 0;
				}else {
					consulta = 1;
				}
			}
			
			switch (consulta) {
			case 0:
				System.out.println( "Sem veículos de PASSEIO cadastrado. " );
				break;
			
			case 1:
				
				for ( Passeio veiculo : bd.listaPasseio ) {
					if ( veiculo != null ) {
						System.out.println( "Veículos de Passeio: "        + countPasseio            );
					}
					System.out.println( "Placa: "                     + veiculo.getPlaca         ( ) );
					System.out.println( "Marca: "                     + veiculo.getMarca         ( ) );
					System.out.println( "Modelo: "                    + veiculo.getModelo        ( ) );
					System.out.println( "Cor: "                       + veiculo.getCor           ( ) );
					System.out.println( "Velocidade Máxima: "         + veiculo.getVelocMax      ( ) );
					System.out.println( "Quantidade de Rodas: "       + veiculo.getQtdRodas      ( ) );
					System.out.println( "Quantidade de Pistão: "      + veiculo.getQtdPist       ( ) );
					System.out.println( "Potência: "                  + veiculo.getPotencia      ( ) );
					System.out.println( "Quantidade de Passageiros: " + veiculo.getQtdPassageiros( ) );
					
					int i = ( veiculo.calcular( veiculo.getPlaca ( ), 0 ) ) + 
							( veiculo.calcular( veiculo.getMarca ( ), 0 ) ) +
							( veiculo.calcular( veiculo.getModelo( ), 0 ) ) +
							( veiculo.calcular( veiculo.getCor   ( ), 0 ) );
					
					System.out.println( "Quantidade total de letras: " + i );
					
					float velocMax = veiculo.getVelocMax();
					float calc     = veiculo.calcVel(velocMax);
					System.out.println( "Velocidade em Metros por hora: " + calc + " m/h" );
					
					countPasseio++;
					
				}
				break;

			default:
				break;
			}
			
		} 
		
		finally {
			menu();
		}
	} // Fim do método imprimirTodosVeiculosPasseio()

	private static final void imprimirTodosVeiculosCarga() {
		// TODO 4. Imprimir Todos os Veículos de Carga  
		int countCarga   = 1;
		
		int consulta = 0;
		
		try {
			for ( Carga carga : bd.listaCarga ) {
				if( inCarg == 0 && carga == null ) {
					consulta = 0;
				}else {
					consulta = 1;
				}
			}
			
			switch (consulta) {
			case 0:
				System.out.println( "Sem veículos de CARGA cadastrado. " );
				break;
			
			case 1:
				for ( Carga veiculo : bd.listaCarga ) {
					if ( veiculo != null ) {
						System.out.println( "Veículo de Carga: "     + countCarga );
						System.out.println( "Placa: "                + veiculo.getPlaca   ( ) );
						System.out.println( "Marca: "                + veiculo.getMarca   ( ) );
						System.out.println( "Modelo: "               + veiculo.getModelo  ( ) );
						System.out.println( "Cor: "                  + veiculo.getCor     ( ) );
						System.out.println( "Velocidade Máxima: "    + veiculo.getVelocMax( ) );
						System.out.println( "Quantidade de Rodas: "  + veiculo.getQtdRodas( ) );
						System.out.println( "Quantidade de Pistão: " + veiculo.getQtdPist ( ) );
						System.out.println( "Potência: "             + veiculo.getPotencia( ) );
						System.out.println( "Carga Máxima: "         + veiculo.getCargaMax( ) );
						System.out.println( "Tara: "                 + veiculo.getTara    ( ) );
						
						
						int i = ( veiculo.calcular( "", veiculo.getQtdRodas( ) ) ) + 
							    ( veiculo.calcular( "", veiculo.getQtdPist ( ) ) ) +
							    ( veiculo.calcular( "", veiculo.getPotencia( ) ) ) +
							    ( veiculo.calcular( "", veiculo.getCargaMax( ) ) ) +
							    ( veiculo.calcular( "", veiculo.getTara    ( ) ) );;
						
						System.out.println( "Valor total de somatório: " + i );
						
						
						float velocMax = veiculo.getVelocMax();
						float calc     = veiculo.calcVel(velocMax);
						System.out.println( "Velocidade em Centímetros por hora: " + calc + " cm/h" );
						
						countCarga++;
					}
				}
				break;
			
			default:
				break;
			}
			
		} 
		
		finally {
			menu();
		}
	}
	
	private static final void imprimirVeiculosPasseioPelaPlaca( ) {
		// TODO 5. Imprimir Veículo de Passeio pela Placa

		Leitura l = new Leitura();
		String plac = null;

		int consulta = 0;
		
		try {
			plac = l.entDados( "Digite a Placa para Consulta: " );
			
			for ( Passeio passeio : bd.listaPasseio ) {
				if( inPass == 0 && passeio == null ) {
					consulta = 0;
				}else {
					consulta = 1;
				}
			}
			
			switch (consulta) {
			case 0:
				System.out.println( "Sem veículos de PASSEIO cadastrado. " );
				
				break;
			case 1:
				
				for ( Passeio passeio : bd.listaPasseio ) {
					
					if ( plac.equals( passeio.getPlaca( ) ) ) {
						
						System.out.println( "Placa: "                     + passeio.getPlaca         ( ) );
						System.out.println( "Marca: "                     + passeio.getMarca         ( ) );
						System.out.println( "Modelo: "                    + passeio.getModelo        ( ) );
						System.out.println( "Cor: "                       + passeio.getCor           ( ) );
						System.out.println( "Velocidade Máxima: "         + passeio.getVelocMax      ( ) );
						System.out.println( "Quantidade de Rodas: "       + passeio.getQtdRodas      ( ) );
						System.out.println( "Quantidade de Pistão: "      + passeio.getQtdPist       ( ) );
						System.out.println( "Potência: "                  + passeio.getPotencia      ( ) );
						System.out.println( "Quantidade de Passageiros: " + passeio.getQtdPassageiros( ) );
						
						float velocMax = passeio.getVelocMax();
						float calc     = passeio.calcVel(velocMax);
						System.out.println( "Velocidade em Metros por hora: " + calc + " m/h" );
						
					}
				}
				break;

			default:
				break;
			}
			
		} 
		
		finally {
			menu();
		}
	}

	private static void imprimirVeiculoCargaPelaPlaca( ) {
		// TODO 6. Imprimir Veículo de Carga pela Placa  
		
		Leitura l = new Leitura();
		String plac = "";
		
		int consulta = 0;
		
		try {
			plac = l.entDados( "Digite a Placa para Consulta: " );
			
			for ( Carga carga : bd.listaCarga ) {
				if( inCarg == 0 && carga == null ) {
					consulta = 0;
				}else {
					consulta = 1;
				}
			}
			
			switch (consulta) {
			case 0:
				System.out.println( "Sem veículos de CARGA cadastrado. " );
				break;

			case 1:
				
				for ( Carga carga : bd.listaCarga ) {
					if (  plac.equals( carga.getPlaca( ) ) ) {
						System.out.println( "Veículo de Carga: "                              );
						System.out.println( "Placa: "                + carga.getPlaca   ( ) );
						System.out.println( "Marca: "                + carga.getMarca   ( ) );
						System.out.println( "Modelo: "               + carga.getModelo  ( ) );
						System.out.println( "Cor: "                  + carga.getCor     ( ) );
						System.out.println( "Velocidade Máxima: "    + carga.getVelocMax( ) );
						System.out.println( "Quantidade de Rodas: "  + carga.getQtdRodas( ) );
						System.out.println( "Quantidade de Pistão: " + carga.getQtdPist ( ) );
						System.out.println( "Potência: "             + carga.getPotencia( ) );
						System.out.println( "Carga Máxima: "         + carga.getCargaMax( ) );
						System.out.println( "Tara: "                 + carga.getTara    ( ) );
						
						float velocMax = carga.getVelocMax();
						float calc     = carga.calcVel(velocMax);
						System.out.println( "Velocidade em Centímetros por hora: " + calc + " cm/h" );
						
					}
				}				
				break;
				
			default:
				break;
			}
			
		} 
		
		finally {
			menu();
			
		}
	} // Fim Pela Placa Carga
	
	
} // Fim da classe Teste
