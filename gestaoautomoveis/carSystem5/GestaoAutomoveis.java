package carSystem5;

public class GestaoAutomoveis {
	
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

	public static void ExcluirVeiculoDePasseioPelaPlaca() throws VelocException {
		// TODO Auto-generated method stub
		
		Leitura l = new Leitura();
		String plac = null;

		int consulta = 0;
		
		try {
			plac = l.entDados( "Digite a Placa: " );
			Passeio passeio;
			for ( Veiculo veiculo : bd.listaVeiculos ) {
				passeio = (Passeio) veiculo;
				if( passeio == null ) {
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
				
				for ( Veiculo veiculo : bd.listaVeiculos ) {
					passeio = (Passeio)veiculo;
					if ( plac.equals( passeio.getPlaca( ) ) ) {
						
						//System.out.println( "remover" );
						bd.listaVeiculos.remove(passeio);
					}
				}
				break;

			default:
				break;
			}
			
		} 
		
		finally {
			MenuAutomoveis.menu();
		}
		
	}
	
	public static void ExcluirVeiculoDeCargaPelaPlaca() throws VelocException {
		// TODO Auto-generated method stub
		Leitura l = new Leitura();
		String plac = null;

		int consulta = 0;
		
		try {
			plac = l.entDados( "Digite a Placa: " );
			Carga carga;
			for ( Veiculo veiculo : bd.listaVeiculos ) {
				carga = (Carga) veiculo;
				if( carga == null ) {
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
				
				for ( Veiculo veiculo : bd.listaVeiculos ) {
					carga = (Carga)veiculo;
					if ( plac.equals( carga.getPlaca( ) ) ) {
						
						//System.out.println( "remover" );
						bd.listaVeiculos.remove(carga);
					}
				}
				break;

			default:
				break;
			}
			
		} 
		
		finally {
			MenuAutomoveis.menu();
		}
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
	
	public final static void cadastrarVeiculoPasseio( ) throws VelocException{
		// TODO: Triagem para Cadastro de Veículos.
		Leitura l = new  Leitura();
		String entrada = "";
		Veiculo veiculo;
			
		String plac    = "", marc    = "", model  = "", corr    = "",
				   velocMa = "", qtdRoda = "", qtdPis = "", potenci = "",
					   // Passeio.
				   qtdPassageiro = "";
					
			
		passeioMaior ++;
			
			
		System.out.println( "=======================================" );
		System.out.println(  "Cadastro de Veículos de PASSEIO"        );
		System.out.println( "=======================================" );

		qtdPassageiro = l.entDados( "Quantidade de Passageiros: " );
		plac          = l.entDados( "placa: " );
		
		// c. Ao inserir um novo veículo o sistema deverá verificar se já existe um veículo
		// cadastrado com a mesma placa. Caso exista, deverá informar ao usuário sobre
		// esta existência e deverá voltar ao Menu Inicial.
		
		try {
			if( ( b = !conferePlaca( plac ) ) ){
				
				marc    = l.entDados( "marca: "                );               
				model   = l.entDados( "modelo: "               );              
				corr    = l.entDados( "cor: "                  );              
				velocMa = l.entDados( "Velocidade Máxima: "    );           
				qtdRoda = l.entDados( "Quantidade de Rodas: "  );           
				qtdPis  = l.entDados( "Quantidade de Pistão: " );      
				potenci = l.entDados( "Potência: "             );
				
				// Passeio
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
				veiculo = new Passeio( 1, placa, marca, modelo, cor, qtdRodas, qtdPist, potencia, qtdPassageiros );
				
				try {
						veiculo.setVelocMax( velocMax, 1 );
					} catch ( VelocException e1 ) {
						// TODO Auto-generated catch block
						e1.impErroVelocException();
						// Voltar ao menu
						//MenuAutomoveis.menu();
						
				}
							
				bd.listaVeiculos.add(veiculo);
				
				entrada = l.entDados( "Passeio armazenado na posição " +  bd.listaVeiculos.indexOf(veiculo) + " do bd - press <ENTER>" );
				entrada = l.entDados("Deseja cadastrar outro PASSEIO? <s/n>").toLowerCase( );
				
				switch ( entrada ) {
				case "s":
					cadastrarVeiculoPasseio( );
					break;
				case "n":
					MenuAutomoveis.menu();
					break;
				}
				
			//inCarg++;
		}
			
		} catch ( VeicExistException e1 ) {
			// TODO Já existe veículo com essa placa
			
			e1.impErroVeicExistException();
			MenuAutomoveis.menu();
		}

		
		}


	static int cargaMaior = 0;
	
	public final static void cadastrarVeiculoCarga( ) throws VelocException{
		// TODO: Triagem para Cadastro de Veículos.
		Leitura l = new  Leitura();
		String entrada = "";
		Veiculo veiculo;
		
	String plac    = "", marc    = "", model   = "", corr    = "",
		   velocMa = "", qtdRoda = "", qtdPis  = "", potenci = "",
		    // Carga.
		   cargaMa = "", tar     = "";
				
		
		cargaMaior ++;
		
		
		System.out.println( "=======================================" );
		System.out.println(  "Cadastro de Veículos de CARGA"          );
		System.out.println( "=======================================" );
		
		cargaMa = l.entDados( "Carga Máxima: " );
		tar     = l.entDados( "Tara: "         );
		plac    = l.entDados( "placa: "        );  
	
	// c. Ao inserir um novo veículo o sistema deverá verificar se já existe um veículo
	// cadastrado com a mesma placa. Caso exista, deverá informar ao usuário sobre
	// esta existência e deverá voltar ao Menu Inicial.
	
	try {
		if( ( b = !conferePlaca( plac ) ) ){
			
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
			
			// Cadastro:
			veiculo = new Carga( 2, placa, marca, modelo, cor, qtdRodas, qtdPist, potencia, cargaMax, tara );
			
			try {
					veiculo.setVelocMax( velocMax, 2 );
				} catch ( VelocException e1 ) {
					// TODO Auto-generated catch block
					e1.impErroVelocException();
					
			}
						
			bd.listaVeiculos.add(veiculo);
		
			entrada = l.entDados( "Carga armazenado na posição " +  bd.listaVeiculos.indexOf(veiculo) + " do bd - press <ENTER>" );
			entrada = l.entDados( "Deseja cadastrar outro CARGA? <s/n>" ).toLowerCase();
			switch ( entrada ) {
			case "s":
				cadastrarVeiculoCarga( );
				break;
			case "n":
				MenuAutomoveis.menu();
				break;
				
			}
		
		//inCarg++;
	}
		
	} catch ( VeicExistException e1 ) {
		// TODO Já existe veículo com essa placa
		
		e1.impErroVeicExistException();
		MenuAutomoveis.menu();
	}
	}
	
	private static boolean conferePlaca( String plac ) throws VeicExistException {
		// TODO Confere placa de veículos se já cadastradas.
		boolean b = false;
		
		for ( Veiculo veiculo : bd.listaVeiculos ) {
		
			if ( veiculo != null ) {
				if ( plac.equals( veiculo.getPlaca( ) ) ) {
					b = true;
					throw new VeicExistException();
				} else {
					b = false;
				}
			}
		}
		
		return b;
	}

	public static final void imprimirTodosVeiculosPasseio( ) throws VelocException {
		// TODO 3. Imprimir Todos os Veículos de Passeio
		int countPasseio = 1;
		
		if ( bd.listaVeiculos.isEmpty() ) {
			System.out.println( "Sem veículos cadastrado. vazio " );
		}
		else {
			
			Passeio passeio;
			int count = 0;
			for ( Veiculo v : bd.listaVeiculos ) {
				if( v.getTipo() == 1 ) {
					count++;
				}
			}
			
			if ( count == 0 ) {
				System.out.println( "Sem veículos de PASSEIO cadastrado. " );
					
			}else {
							
				for ( Veiculo v : bd.listaVeiculos ) {
					if( v.getTipo() == 1 ) {
						passeio = (Passeio)v;
						System.out.println( "Veículos de Passeio: "        + countPasseio                );
						System.out.println( "Placa: "                     + passeio.getPlaca         ( ) );
						System.out.println( "Marca: "                     + passeio.getMarca         ( ) );
						System.out.println( "Modelo: "                    + passeio.getModelo        ( ) );
						System.out.println( "Cor: "                       + passeio.getCor           ( ) );
						System.out.println( "Velocidade Máxima: "         + passeio.getVelocMax      ( ) );
						System.out.println( "Quantidade de Rodas: "       + passeio.getQtdRodas      ( ) );
						System.out.println( "Quantidade de Pistão: "      + passeio.getQtdPist       ( ) );
						System.out.println( "Potência: "                  + passeio.getPotencia      ( ) );
						System.out.println( "Quantidade de Passageiros: " + passeio.getQtdPassageiros( ) );
						
						int i = ( passeio.calcular( passeio.getPlaca ( ), 0 ) ) + 
								( passeio.calcular( passeio.getMarca ( ), 0 ) ) +
								( passeio.calcular( passeio.getModelo( ), 0 ) ) +
								( passeio.calcular( passeio.getCor   ( ), 0 ) );
						
						System.out.println( "Quantidade total de letras: " + i );
						
						float velocMax = passeio.getVelocMax();
						float calc     = passeio.calcVel(velocMax);
						System.out.println( "Velocidade em Metros por hora: " + calc + " m/h" );
						
						countPasseio++;	
					}
				}
			}
		}
		MenuAutomoveis.menu();
	} // Fim do método imprimirTodosVeiculosPasseio()

	
	
	public static final void imprimirVeiculosPasseioPelaPlaca( ) throws VelocException {
		// TODO 5. Imprimir Veículo de Passeio pela Placa

		Leitura l = new Leitura();
		String plac = "";
		
		int consulta = 0;

		try {
			plac = l.entDados( "Digite a Placa para Consulta: " );
			Passeio passeio;
			
			for ( Veiculo veiculo : bd.listaVeiculos ) {
				passeio = (Passeio)veiculo;
				if( passeio == null ) {
					consulta = 0;
				}else {
					consulta = 1;
				}
			}
			
			switch (consulta) {
			case 0:
				System.out.println( "Sem veículos de Passeio cadastrado. " );
				break;

			case 1:
			
				for ( Veiculo veiculo : bd.listaVeiculos ) {
					passeio = (Passeio) veiculo;
				
					if ( plac.equals( passeio.getPlaca())) {
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
			}		

		}
		
		finally {
			// Voltar ao menu.
			MenuAutomoveis.menu();
		}
	} // Fim Pela Placa Passeio.

	public static final void imprimirTodosVeiculosCarga( ) throws VelocException {
		// TODO 3. Imprimir Todos os Veículos de Carga
		int countCarga = 1;
		
		if ( bd.listaVeiculos.isEmpty() ) {
			System.out.println( "Sem veículos cadastrado. " );
		}
		else {
			
			Carga carga;
			int count = 0;
			for ( Veiculo v : bd.listaVeiculos ) {
				if( v.getTipo() == 2 ) {
					count++;
				}
			}
			
			if ( count == 0 ) {
				System.out.println( "Sem veículos de Carga cadastrado. " );
					
			}else {
							
				for ( Veiculo veiculo : bd.listaVeiculos ) {
					if( veiculo.getTipo() == 2 ) {
						carga = (Carga)veiculo;
						System.out.println( "Veículo de Carga: "     + countCarga );
						System.out.println( "Placa: "                 + carga.getPlaca   ( ) );
						System.out.println( "Marca: "                 + carga.getMarca   ( ) );
						System.out.println( "Modelo: "                + carga.getModelo  ( ) );
						System.out.println( "Cor: "                   + carga.getCor     ( ) );
						System.out.println( "Velocidade Máxima: "    + carga.getVelocMax( ) );
						System.out.println( "Quantidade de Rodas: "   + carga.getQtdRodas( ) );
						System.out.println( "Quantidade de Pistão: " + carga.getQtdPist ( ) );
						System.out.println( "Potência: "             + carga.getPotencia( ) );
						System.out.println( "Carga Máxima: "         + carga.getCargaMax( ) );
						System.out.println( "Tara: "                  + carga.getTara    ( ) );
						
						int i = ( carga.calcular( "", carga.getQtdRodas( ) ) ) + 
						    ( carga.calcular( "", carga.getQtdPist ( ) ) ) +
						    ( carga.calcular( "", carga.getPotencia( ) ) ) +
						    ( carga.calcular( "", carga.getCargaMax( ) ) ) +
						    ( carga.calcular( "", carga.getTara    ( ) ) );
						
						System.out.println( "Valor total de somatório: " + i );
					
					
						float velocMax = carga.getVelocMax();
						float calc     = carga.calcVel(velocMax);
						System.out.println( "Velocidade em Centímetros por hora: " + calc + " cm/h" );
						
						countCarga++;	
					}
				}
			}
		}
		MenuAutomoveis.menu();
	} // Fim do método imprimirTodosVeiculosCarga()
	
	public static void imprimirVeiculoCargaPelaPlaca( ) throws VelocException {
		// TODO 6. Imprimir Veículo de Carga pela Placa  
		
		Leitura l = new Leitura();
		String plac = "";
		
		int consulta = 0;
		
		try {
			plac = l.entDados( "Digite a Placa para Consulta: " );
			Carga carga;
			
			for ( Veiculo veiculo : bd.listaVeiculos ) {
				carga = (Carga)veiculo;
				if( carga == null ) {
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
				
				for ( Veiculo veiculo : bd.listaVeiculos ) {
					carga = (Carga)veiculo;
					if (  plac.equals( carga.getPlaca( ) ) ) {
						System.out.println( "Veículo de Carga: "                            );
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
						
						float velocMax = carga.getVelocMax(          );
						float calculo  = carga.calcVel    ( velocMax );
						
						System.out.println( "Velocidade em Centímetros por hora: " + calculo + " cm/h" );
					}
				}				
				break;
			}
			
		} 
		
		finally {
			// Voltar ao menu.
			MenuAutomoveis.menu();
		}
	} // Fim Pela Placa Carga
	
	
} // Fim da classe Teste
