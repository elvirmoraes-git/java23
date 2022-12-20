package carSystem6;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JanelaMenuInicial implements ActionListener{
	/**
	 * Janela Menu/Frame Inicial 
	 * Bot�es Frame Principal
	 */
	static JFrame  frameGestaoVeiculos = new JFrame( );
	static JButton botaoPasseio   = new JButton( "Passeio" );
	static JButton botaoCarga     = new JButton( "Carga  " );

	// JanelaMenuInicial/Frame Principal
	static JanelaMenuInicial j = new JanelaMenuInicial();
	
	/**
	 * Main JanelaMenuInicial Principal
	 * @param args
	 */
	public static void main( String[] args ) {
		// TODO Main JanelaMenuInicial Principal
		
		menu(  );
		
	}
	
	
	private static void menu( ) {
		// TODO Janela Principal
		frameGestaoVeiculos.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE  );
		frameGestaoVeiculos                .setTitle( "Gest�o de Ve�culos"  );
		frameGestaoVeiculos                 .setSize( 400, 300              );
		frameGestaoVeiculos.setLayout( new GridLayout( 4,1,10,10 ) );
		frameGestaoVeiculos.getContentPane().setBackground(Color.WHITE);
		//
		
		// Frame Gest�o de Ve�culos 
		frameGestaoVeiculos.add( botaoPasseio );
		frameGestaoVeiculos.add( botaoCarga   );
		botaoPasseio  .addActionListener( j );
		botaoCarga    .addActionListener( j );		
		//
		
		// Frame Ve�culo de Passeio
		botaoCadastrarVeiculoDePasseio               .addActionListener( j );
		botaoConsultarExcluiVeiculoDePasseioPelaPlaca.addActionListener( j );
		botaoImprimirExcluirTodosPasseio             .addActionListener( j );
		botaoSairVeiculoDePasseio                    .addActionListener( j );
		// Frame Ve�culo de Carga
		botaoCadastrarVeiculoDeCarga               .addActionListener( j );
		botaoConsultarExcluiVeiculoDeCargaPelaPlaca.addActionListener( j );
		botaoImprimirExcluirTodosCarga             .addActionListener( j );
		botaoSairVeiculoDeCarga                    .addActionListener( j );
		//
		
		// Frame Cadastro de Ve�culo Passeio
		botaoCadastrarPasseio            .addActionListener( j );
		botaoLimparCadastrarPasseio      .addActionListener( j );
		botaoNovoCadastrarPasseio        .addActionListener( j );
		botaoSairCadastroVeiculoDePasseio.addActionListener( j );
		// Frame Cadastro Ve�culos de Carga
		botaoCadastrarCarga            .addActionListener( j );
		botaoLimparCadastrarCarga      .addActionListener( j );
		botaoNovoCadastrarCarga        .addActionListener( j );
		botaoSairCadastroVeiculoDeCarga.addActionListener( j );
		//
		
		// Frame Consultar/Excluir Ve�culo de Passeio Pela Placa
		botaoConsultarVeiculoDePasseioPelaPlaca.addActionListener( j );
		botaoExcluirVeiculoDePasseioPelaPlaca  .addActionListener( j );
		botaoSairVeiculoDePasseioPelaPlaca     .addActionListener( j );
		// Frame Consultar/Excluir Ve�culo de Carga Pela Placa
		botaoConsultarVeiculoDeCargaPelaPlaca.addActionListener( j );
		botaoExcluirVeiculoDeCargaPelaPlaca  .addActionListener( j );
		botaoSairVeiculoDeCargaPelaPlaca     .addActionListener( j );
		//
		
		// Frame Imprimir / Excluir Todos Passeio
		botaoImprimirTodosPasseio  .addActionListener( j );
		botaoExcluirTodosPasseio   .addActionListener( j );
		botaoSairImpExcTodosPasseio.addActionListener( j );
		// Frame Imprimir / Excluir Todos Carga
		botaoImprimirTodosCarga  .addActionListener( j );
		botaoExcluirTodosCarga   .addActionListener( j );
		botaoSairImpExcTodosCarga.addActionListener( j );
		//
		
		// Frame Principal
		//frameGestaoVeiculos.setLayout ( new FlowLayout( FlowLayout.CENTER ) );
		frameGestaoVeiculos.setLocationRelativeTo(null);
		frameGestaoVeiculos.setVisible( true   );
	}


	/**
	 * Frame Ve�culo de Passeio
	 * Bot�es Frame Ve�culo de Passeio
	 */
	static JFrame  frameVeiculoDePasseio                         = new JFrame( );
	static JButton botaoCadastrarVeiculoDePasseio                = new JButton( "Cadastrar Ve�culo de Passeio" );
	static JButton botaoConsultarExcluiVeiculoDePasseioPelaPlaca = new JButton( "Consultar/Excluir Pela Placa" );
	static JButton botaoImprimirExcluirTodosPasseio              = new JButton( "   Imprimir/Excluir todos   " );
	static JButton botaoSairVeiculoDePasseio                     = new JButton( "           Sair             " );
	
	/**
	 * Frame Ve�culo de Carga
	 * Bot�es Frame Ve�culo de Carga
	 */
	static JFrame  frameVeiculoDeCarga                         = new JFrame( );
	static JButton botaoCadastrarVeiculoDeCarga                = new JButton( " Cadastrar Ve�culo de Carga " );
	static JButton botaoConsultarExcluiVeiculoDeCargaPelaPlaca = new JButton( "Consultar/Excluir Pela Placa" );
	static JButton botaoImprimirExcluirTodosCarga              = new JButton( "   Imprimir/Excluir todos   " );
	static JButton botaoSairVeiculoDeCarga                     = new JButton( "           Sair             " );
	
	/**
	 * Frame Formul�rio Cadastro Ve�culo de Passeio
	 * Bot�es Frame Cadastro Ve�culo de Passeio.
	 */ 
	static JFrame     frameCadastroVeiculoDePasseio        = new JFrame( );
	static JLabel     labelQuantidadeDePassageirosPasseio  = new JLabel    ( "Qtd. Passageiros"     );
	static JTextField textoQtdDePassageirosPasseio         = new JTextField( 10                     );
	static JLabel     labelPlacaDePasseio                  = new JLabel    ( "Placa"                );
	static JTextField textoPlacaDePasseio                  = new JTextField( 10                     );
	static JLabel     labelMarcaDePasseio                  = new JLabel    ( "Marca"                );
	static JTextField textoMarcaDePasseio                  = new JTextField( 10                     );
	static JLabel     labelModeloDePasseio                 = new JLabel    ( "Modelo"               );     
	static JTextField textoModeloDePasseio                 = new JTextField( 10                     );
	static JLabel     labelCorPasseio                      = new JLabel    ( "Cor"                  );     
	static JTextField textoCorPasseio                      = new JTextField( 10                     );
	static JLabel     labelQuantidadeRodasPasseio          = new JLabel    ( "Quantidade de Roda"   );     
	static JTextField textoQuantidadeRodasPasseio          = new JTextField( 10                     );
	static JLabel     labelVelocidadeMaximaPasseio         = new JLabel    ( "Velocidade M�xima"    );
	static JTextField textoVelocidadeMaximaPasseio         = new JTextField( 10                     );
	static JLabel     labelQuantidadePistaoPasseio         = new JLabel    ( "Quantidade de Pist�o" );
	static JTextField textoQuantidadePistaoPasseio         = new JTextField( 10                     );
	static JLabel     labelPotenciaPasseio                 = new JLabel    ( "Pot�ncia"             );
	static JTextField textoPotenciaPasseio                 = new JTextField( 10                     );
	// Bot�es Formul�rio Cadastro Ve�culos de Passageiros
	static JButton    botaoCadastrarPasseio                = new JButton( "Cadastrar" );
	static JButton    botaoLimparCadastrarPasseio          = new JButton( "Limpar"    ); 
	static JButton    botaoNovoCadastrarPasseio            = new JButton( "Novo"      );
	static JButton    botaoSairCadastroVeiculoDePasseio    = new JButton( "Sair"      );
	// Fim Formul�rio de Cadastro Ve�culos de Passageiros
	// Bot�es Formul�rio Cadastro Ve�culos de Carga
	static JButton    botaoCadastrarCarga                = new JButton( "Cadastrar" );
	static JButton    botaoLimparCadastrarCarga          = new JButton( "Limpar"    ); 
	static JButton    botaoNovoCadastrarCarga            = new JButton( "Novo"      );
	static JButton    botaoSairCadastroVeiculoDeCarga    = new JButton( "Sair"      );
	
	
	// Frame Consultar/Excluir pela Placa Passeio
	static JFrame     frameConsultarExcluirVeiculoDePasseioPelaPlaca  = new JFrame    ( );
	static JLabel     labelInformePlacaVeiculoPasseio                 = new JLabel    ( );
	static JTextField textoInformePlacaVeiculoPasseio                 = new JTextField( );
	static JButton    botaoConsultarVeiculoDePasseioPelaPlaca         = new JButton( "Consultar" );
	static JButton    botaoExcluirVeiculoDePasseioPelaPlaca           = new JButton( "Excluir  " );
	static JButton    botaoSairVeiculoDePasseioPelaPlaca              = new JButton( "Sair     " );
	
	static JFrame     frameConsultarExcluirVeiculoDeCargaPelaPlaca  = new JFrame    ( );
	static JLabel     labelInformePlacaVeiculoCarga                 = new JLabel    ( );
	static JTextField textoInformePlacaVeiculoCarga                 = new JTextField( );
	static JButton    botaoConsultarVeiculoDeCargaPelaPlaca         = new JButton( "Consultar" );
	static JButton    botaoExcluirVeiculoDeCargaPelaPlaca           = new JButton( "Excluir  " );
	static JButton    botaoSairVeiculoDeCargaPelaPlaca              = new JButton( "Sair     " );
	
	// Frame Imprimir/Excluir Todos
	static JFrame    frameImprimirExcluirTodosPasseio   = new  JFrame( "Imprimir /Excluir todos ve�culos de Passeio" );
	static JButton   botaoImprimirTodosPasseio          = new JButton( "Imprimir Todos"          );
	static JButton   botaoExcluirTodosPasseio           = new JButton( "Excluir Todos"           );
	static JButton   botaoSairImpExcTodosPasseio        = new JButton( "Sair"                    );
	static JTable    tabelaImprimirExcluirTodosPasseio = new JTable( );
	
	// Frame Imprimir/Excluir Todos
	static JFrame    frameImprimirExcluirTodosCarga   = new  JFrame( "Imprimir /Excluir todos ve�culos de Carga" );
	static JButton   botaoImprimirTodosCarga          = new JButton( "Imprimir Todos"          );
	static JButton   botaoExcluirTodosCarga           = new JButton( "Excluir Todos"           );
	static JButton   botaoSairImpExcTodosCarga        = new JButton( "Sair"                    );
	static JTable    tabelaImprimirExcluirTodosCarga  = new JTable( );
	
	static  String[]          colunasPasseio = { "Placa", "Marca","Modelo", "Cor","Qtd. Rodas", "Velocidade M�x.","Qtd. Pist�es", "Pot�ncia", "Qtd. Passageiros"  };
    static DefaultTableModel modelPasseio             = new DefaultTableModel( colunasPasseio ,0 );
    static JTable            tableDadosPasseio        = new JTable           ( modelPasseio       );
    static JScrollPane       barraRolagemListaPasseio = new JScrollPane      ( tableDadosPasseio  );
	
    static int botaoImprimirTodosPressionadoPasseio;
    static int botaoImprimirTodosPressionadoCarga;
    
    
    static String[]          colunasCarga = { "Placa", "Marca","Modelo", "Cor","Qtd. Rodas", "Velocidade M�x.","Qtd. Pist�es", "Pot�ncia", "Tara", "Carga M�x"  };
    static DefaultTableModel modelCarga             = new DefaultTableModel( colunasCarga ,0 );
    static JTable            tableDadosCarga        = new JTable           ( modelCarga       );
    static JScrollPane       barraRolagemListaCarga = new JScrollPane      ( tableDadosCarga  );
	
	
	
	/**
	 * Frame Formul�rio Cadastro Ve�culo de Carga
	 * Bot�es Cadastro Ve�culo de Carga
	 */
	static JFrame     frameCadastroVeiculoDeCarga = new JFrame    ( );
	static JLabel     labelTara                   = new JLabel    ( "Tara"                 );
	static JTextField textoTara                   = new JTextField( 10                     );
	static JLabel     labelCargaMaxima            = new JLabel    ( "Carga M�xima"         );
	static JTextField textoCargaMaxima            = new JTextField( 10                     );
	static JLabel     labelPlacaDeCarga           = new JLabel    ( "Placa"                );
	static JTextField textoPlacaDeCarga           = new JTextField( 10                     );
	static JLabel     labelMarcaDeCarga           = new JLabel    ( "Marca"                );
	static JTextField textoMarcaDeCarga           = new JTextField( 10                     );
	static JLabel     labelModeloDeCarga          = new JLabel    ( "Modelo"               );     
	static JTextField textoModeloDeCarga          = new JTextField( 10                     );
	static JLabel     labelCorCarga               = new JLabel    ( "Cor"                  );     
	static JTextField textoCorCarga               = new JTextField( 10                     );
	static JLabel     labelQuantidadeRodasCarga   = new JLabel    ( "Quantidade de Roda"   );     
	static JTextField textoQuantidadeRodasCarga   = new JTextField( 10                     );
	static JLabel     labelVelocidadeMaximaCarga  = new JLabel    ( "Velocidade M�xima"    );
	static JTextField textoVelocidadeMaximaCarga  = new JTextField( 10                     );
	static JLabel     labelQuantidadePistaoCarga  = new JLabel    ( "Quantidade de Pist�o" );
	static JTextField textoQuantidadePistaoCarga  = new JTextField( 10                     );
	static JLabel     labelPotenciaCarga          = new JLabel    ( "Pot�ncia"             );
	static JTextField textoPotenciaCarga          = new JTextField( 10                     );
	
	
	//static Object obj;
	
	// Ve�culo
	static int    tipo;
    static String placa           = ""; 
    static String marca           = ""; 
    static String modelo          = ""; 
    static String cor             = "";
    static String velocMax        = ""; 
    static String qtdRodas        = "";
    static String qtdPistao       = "";
    static String potencia        = ""; 
    // Passeio
    static String qtdPassageiros = "";
	// Carga
    static String tara        = "";
    static String cargaMaxima = "";
	
    static int aux1 = 0;
    static int aux2 = 0;
    
	
    static BDVeiculos bd = new BDVeiculos();
	/**
	 * quem chama: menu();
	 * Caso de uso: 1. Cadastrar ve�culo de passeio.
	 *              2. Cadastrar ve�culo de carga.
	 */
	
	static int     passeioMaior = 0;
	static boolean b            = true;
    
    
	// Eventos Bot�es
	public void actionPerformed( ActionEvent act ) {
		
		// Bot�es Frame Principal
		if ( act.getSource().equals( botaoPasseio ) ) {
			frameVeiculosDePasseio();
		}
		if ( act.getSource().equals( botaoCarga ) ) {
			frameVeiculoDeCarga();
		}
		
		// Bot�es Frame Ve�culo de Passeio
		if( act.getSource().equals( botaoCadastrarVeiculoDePasseio ) ) {
			
			resetaCamposDeTextoPasseio();
			frameCadastroVeiculosDePasseio();
		}

		// Bot�es Frame Ve�culo de Carga
		if( act.getSource().equals( botaoCadastrarVeiculoDeCarga ) ) {
			
			resetaCamposDeTextoCarga();
			frameCadastroVeiculosDeCarga();
		}
		
		// Bot�es Frame Cadastro de Passeio
		if ( act.getSource( ).equals( botaoCadastrarPasseio ) ) {
			boolean b = false;
			// N�o pode cadastrar campos Nulos
			try {
				b = verificaCamposNulosPasseio();
				if ( b ) {
					JOptionPane.showMessageDialog( null, "Preencha os campos de texto corretamente." );
				}else if ( !b ) {
					
					cadastrarVeiculoDePasseio();
				}
				
			} catch ( VeicExistException e1 ) {
				// TODO J� existe ve�culo com essa placa
				
				if ( aux1 == 0  ) {
					aux1++;
				}else if ( aux1 > 0 ){
					//resetaCamposDeTextoPasseio();
					e1.impErroVeicExistException();
				}
			} 
		}
		
		// Bot�es Frame Cadastro de Carga
		if ( act.getSource( ).equals( botaoCadastrarCarga ) ) {
			boolean b = false;
			// N�o pode cadastrar campos Nulos
			try {
				b = verificaCamposNulosCarga();
				if ( b ) {
					JOptionPane.showMessageDialog( null, "Preencha os campos de texto corretamente." );
				}else if ( !b ) {
					
					cadastrarVeiculoDeCarga();
				}
				
			} catch ( VeicExistException e1 ) {
				// TODO J� existe ve�culo com essa placa
				
				if ( aux2 == 0  ) {
					aux2++;
				}else if ( aux2 > 0 ){
					//resetaCamposDeTextoPasseio();
					e1.impErroVeicExistException();
				}
			} 
		}
		
		// Frame Consultar/Excluir Ve�culo de Passeio Pela Placa
		if ( act.getSource().equals( botaoConsultarExcluiVeiculoDePasseioPelaPlaca )  ) {
			
			frameConsultarExcluirVeiculoDePasseioPelaPlaca();
		}

		// Frame Consultar/Excluir Ve�culo de Passeio Pela Placa
		if ( act.getSource().equals( botaoConsultarExcluiVeiculoDeCargaPelaPlaca )  ) {
			
			frameConsultarExcluirVeiculoDeCargaPelaPlaca();
		}
		
		if ( act.getSource().equals( botaoConsultarVeiculoDePasseioPelaPlaca ) ) {
			//resetaCamposDeTextoPasseio();
			//JOptionPane.showMessageDialog( null, "teste." );
			
			if ( !bd.listaPasseio.isEmpty( ) ) {
				for ( Veiculo veiculo : bd.listaPasseio ) {
					Passeio passeio = (Passeio) veiculo;
					if ( passeio.getPlaca().equals( textoPlacaDePasseio.getText() ) ) {
						
						placa          =  String.valueOf ( passeio.getPlaca( ) );
						qtdPassageiros =  String.valueOf ( passeio.getQtdPassageiros( ) );
						marca          =  String.valueOf ( passeio.getMarca         ( ) );
						modelo         =  String.valueOf ( passeio.getModelo        ( ) );
						cor            =  String.valueOf ( passeio.getCor           ( ) );
						qtdRodas       =  String.valueOf ( passeio.getQtdRodas      ( ) );
						velocMax       =  String.valueOf ( passeio.getVelocMax      ( ) );
						qtdPistao      =  String.valueOf ( passeio.getQtdPist       ( ) );
						potencia       =  String.valueOf ( passeio.getPotencia      ( ) );
						
						textoQtdDePassageirosPasseio.setText( qtdPassageiros );
						textoMarcaDePasseio         .setText( marca          );
						textoModeloDePasseio        .setText( modelo         );
						textoCorPasseio             .setText( cor            );
						textoQuantidadeRodasPasseio .setText( qtdRodas       );
						textoVelocidadeMaximaPasseio.setText( velocMax       );
						textoQuantidadePistaoPasseio.setText( qtdPistao      );
						textoPotenciaPasseio        .setText( potencia       );
						
					}
				}
				
			}else {
				JOptionPane.showMessageDialog( null, "Lista de Ve�culos vazia: " + bd.listaPasseio.size( ) );
			}
			
			//frameConsultarExcluirVeiculoDePasseioPelaPlaca( );
			//resetaCamposDeTextoPasseio();
		}
		
		if ( act.getSource().equals( botaoConsultarVeiculoDeCargaPelaPlaca ) ) {
			//resetaCamposDeTextoPasseio();
			//JOptionPane.showMessageDialog( null, "teste." );
			
			if ( !bd.listaCarga.isEmpty( ) ) {
				for ( Veiculo veiculo : bd.listaCarga ) {
					Carga carga = (Carga) veiculo;
					if ( carga.getPlaca().equals( textoPlacaDeCarga.getText() ) ) {
						
						tara           =  String.valueOf ( carga.getTara          ( ) );
						cargaMaxima    =  String.valueOf ( carga.getCargaMax      ( ) );
						placa          =  String.valueOf ( carga.getPlaca         ( ) );
						marca          =  String.valueOf ( carga.getMarca         ( ) );
						modelo         =  String.valueOf ( carga.getModelo        ( ) );
						cor            =  String.valueOf ( carga.getCor           ( ) );
						qtdRodas       =  String.valueOf ( carga.getQtdRodas      ( ) );
						velocMax       =  String.valueOf ( carga.getVelocMax      ( ) );
						qtdPistao      =  String.valueOf ( carga.getQtdPist       ( ) );
						potencia       =  String.valueOf ( carga.getPotencia      ( ) );
						
						textoTara                 .setText( tara           );
						textoCargaMaxima          .setText( cargaMaxima    );
						textoMarcaDeCarga         .setText( marca          );
						textoModeloDeCarga        .setText( modelo         );
						textoCorCarga             .setText( cor            );
						textoQuantidadeRodasCarga .setText( qtdRodas       );
						textoVelocidadeMaximaCarga.setText( velocMax       );
						textoQuantidadePistaoCarga.setText( qtdPistao      );
						textoPotenciaCarga        .setText( potencia       );
						
					}
				}
				
			}else {
				JOptionPane.showMessageDialog( null, "Lista de Ve�culos vazia: " + bd.listaCarga.size( ) );
			}
			
			//frameConsultarExcluirVeiculoDePasseioPelaPlaca( );
			//resetaCamposDeTextoPasseio();
		}
		
		
		if ( act.getSource().equals( botaoExcluirVeiculoDePasseioPelaPlaca ) ) {
		
			if ( bd.listaPasseio.isEmpty( ) ) {
				
				JOptionPane.showMessageDialog( null, "Lista de Ve�culos vazia: " + bd.listaPasseio.size( ) );
				
			}else {
				try {
					
					for ( Veiculo veiculo : bd.listaPasseio ) {
						
						if ( veiculo.getPlaca().equals( textoPlacaDePasseio.getText( ) ) ) {
							resetaCamposDeTextoPasseio();
							bd.listaPasseio.remove( veiculo );
							
						}
					}
					
				} catch (java.util.ConcurrentModificationException e) {
					// TODO: handle exception
				}
				
			}

		}
		
		if ( act.getSource().equals( botaoExcluirVeiculoDeCargaPelaPlaca ) ) {
			
			if ( bd.listaCarga.isEmpty( ) ) {
				
				JOptionPane.showMessageDialog( null, "Lista de Ve�culos vazia: " + bd.listaCarga.size( ) );
				
			}else {
				try {
					
					for ( Veiculo veiculo : bd.listaCarga ) {
						
						if ( veiculo.getPlaca().equals( textoPlacaDeCarga.getText( ) ) ) {
							resetaCamposDeTextoCarga();
							bd.listaCarga.remove( veiculo );
							
						}
					}
					
				} catch (java.util.ConcurrentModificationException e) {
					// TODO: handle exception
				}
				
			}

		}
		
		// Bot�o Sair Frame Consultar/Excluir pela placa Passeio
		if ( act.getSource().equals( botaoSairVeiculoDePasseioPelaPlaca )  ) {
			
			frameConsultarExcluirVeiculoDePasseioPelaPlaca.setVisible(false);
			frameVeiculoDePasseio.setVisible( true );
		}
		// Bot�o Sair Frame Consultar/Excluir pela placa Passeio
		if ( act.getSource().equals( botaoSairVeiculoDeCargaPelaPlaca )  ) {
			
			frameConsultarExcluirVeiculoDeCargaPelaPlaca.setVisible(false);
			frameVeiculoDeCarga.setVisible( true );
		}
		
		
		// Frame Imprimir/Excluir todos Passeio
		if ( act.getSource().equals( botaoImprimirExcluirTodosPasseio )  ) {
			
			frameImprimirExcluirTodosPasseio();
			
		}
		// Frame Imprimir/Excluir todos Carga
		if ( act.getSource().equals( botaoImprimirExcluirTodosCarga )  ) {
			
			frameImprimirExcluirTodosCarga();
			
		}
		if ( act.getSource().equals( botaoSairImpExcTodosPasseio ) ) {
			modelPasseio   = new DefaultTableModel( colunasPasseio ,0 );
	       	tableDadosPasseio.setModel( modelPasseio );
			
	       	//botaoImprimirTodosPressionado = 0;
	       	
			frameImprimirExcluirTodosPasseio.setVisible(false);
			frameVeiculoDePasseio.setVisible(true);
		}
		if ( act.getSource().equals( botaoSairImpExcTodosCarga ) ) {
			modelCarga   = new DefaultTableModel( colunasCarga ,0 );
	       	tableDadosCarga.setModel( modelCarga );
			
	       	//botaoImprimirTodosPressionado = 0;
	       	
			frameImprimirExcluirTodosCarga.setVisible(false);
			frameVeiculoDeCarga.setVisible(true);
		}
		if ( act.getSource( ).equals( botaoImprimirTodosPasseio ) ) {
			
			botaoImprimirTodosPressionadoPasseio = 1;
			
			modelPasseio   = new DefaultTableModel( colunasPasseio ,0 );
			
			tableDadosPasseio.setModel( modelPasseio );
			
	       	imprimirTodosPasseio();
	       	
		}
		if ( act.getSource( ).equals( botaoImprimirTodosCarga ) ) {
			
			botaoImprimirTodosPressionadoCarga = 1;
			
			modelCarga   = new DefaultTableModel( colunasCarga ,0 );
			
			tableDadosCarga.setModel( modelCarga );
			
	       	imprimirTodosCarga();
	       	
		}
		
		if ( act.getSource( ).equals( botaoExcluirTodosPasseio ) ) {
			try {
				int i = 0;	
				if ( bd.listaPasseio.isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Sem Ve�culos Cadastrado.");
				} else {
					int mensagem = 0;
					for ( Veiculo veiculo :  bd.listaPasseio ) {
						if ( veiculo.getTipo ( ) == 1  ) {
							mensagem++;
							continue;
						}
					}
					if( mensagem == 0 ) {
						JOptionPane.showMessageDialog(null, "Sem Ve�culos Cadastrado.");
					}
				}
				if ( botaoImprimirTodosPressionadoPasseio > 0 ) {
					while ( i < bd.listaPasseio.size( ) ) {
						Passeio passeio = ( Passeio ) bd.listaPasseio.get(i);
						if ( passeio.getTipo( ) == 1 ) {
							bd.listaPasseio.remove( passeio );
							continue;
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Sem Ve�culos Cadastrado.");
			}
			finally {
				resetaCamposDeTextoPasseio();

				modelPasseio     = new DefaultTableModel( colunasPasseio ,0 );
				tableDadosPasseio.setModel( modelPasseio );
			}
		}
		
		if ( act.getSource( ).equals( botaoExcluirTodosCarga ) ) {
			try {
				int i = 0;	
				if ( bd.listaCarga.isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Sem Ve�culos Cadastrado.");
				} else {
					int mensagem = 0;
					for ( Veiculo veiculo :  bd.listaCarga ) {
						if ( veiculo.getTipo ( ) == 2  ) {
							mensagem++;
							continue;
						}
					}
					if( mensagem == 0 ) {
						JOptionPane.showMessageDialog(null, "Sem Ve�culos Cadastrado.");
					}
				}
				if ( botaoImprimirTodosPressionadoCarga > 0 ) {
					while ( i < bd.listaCarga.size( ) ) {
						Carga carga = ( Carga ) bd.listaCarga.get(i);
						if ( carga.getTipo( ) == 2 ) {
							bd.listaCarga.remove( carga );
							continue;
						}
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Sem Ve�culos Cadastrado.");
			}
			finally {
				resetaCamposDeTextoCarga();
	
				modelCarga     = new DefaultTableModel( colunasCarga ,0 );
				tableDadosCarga.setModel( modelCarga );
			}
		}
		// Frame Cadastro Ve�culo de Passeio
		if ( act.getSource().equals ( botaoLimparCadastrarPasseio ) ) {
			// TODO Limpa o Formul�rio
			
			resetaCamposDeTextoPasseio();
			
			frameCadastroVeiculoDePasseio.setVisible( false );
			frameCadastroVeiculoDePasseio.setVisible( true  );
		}
		// Frame Cadastro Ve�culo de Passeio
		if ( act.getSource().equals ( botaoLimparCadastrarCarga ) ) {
			// TODO Limpa o Formul�rio
			
			resetaCamposDeTextoCarga();
			
			frameCadastroVeiculoDeCarga.setVisible( false );
			frameCadastroVeiculoDeCarga.setVisible( true  );
		}
		
		
		if ( act.getSource().equals( botaoNovoCadastrarPasseio ) ) {
			
			resetaCamposDeTextoPasseio();
			
			frameCadastroVeiculoDePasseio.setVisible( false );
			frameCadastroVeiculoDePasseio.setVisible( true  );
			
		}
		if ( act.getSource().equals( botaoNovoCadastrarCarga ) ) {
			
			resetaCamposDeTextoCarga();
			
			frameCadastroVeiculoDeCarga.setVisible( false );
			frameCadastroVeiculoDeCarga.setVisible( true  );
			
		}
		
		
		if ( act.getSource().equals( botaoSairCadastroVeiculoDePasseio ) ) {
			
			frameCadastroVeiculoDePasseio.setVisible( false );
			frameVeiculoDePasseio        .setVisible( true  );
			frameGestaoVeiculos               .setVisible( false );
			
		}
		
		if ( act.getSource().equals( botaoSairCadastroVeiculoDeCarga ) ) {
			
			frameCadastroVeiculoDeCarga.setVisible( false );
			frameVeiculoDeCarga        .setVisible( true  );
			frameGestaoVeiculos               .setVisible( false );
			
		}
		
		if ( act.getSource().equals( botaoSairVeiculoDePasseio ) ) {
			
			frameCadastroVeiculoDePasseio.setVisible( false );
			frameVeiculoDePasseio        .setVisible( false );
			frameGestaoVeiculos               .setVisible( true  );
			
		}
		
		// Bot�o Sair Frame Ve�culo de Carga 
		if ( act.getSource().equals( botaoSairVeiculoDeCarga ) ) {
			frameVeiculoDeCarga.setVisible( false );
			frameGestaoVeiculos     .setVisible( true  );
		}
		
		// Frame Cadastro Ve�culo de Carga.
		if ( act.getSource().equals( botaoCadastrarVeiculoDeCarga) ) {
			
			// Formul�rio Frame Cadastro de Ve�culo de Carga
			frameCadastroVeiculoDeCarga.setSize ( 400, 300 );
			frameCadastroVeiculoDeCarga.setTitle( "Cadastro Carga" );
			frameCadastroVeiculoDeCarga.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			
			frameCadastroVeiculoDeCarga.add( labelCargaMaxima           ); 
			frameCadastroVeiculoDeCarga.add( textoCargaMaxima           );
			frameCadastroVeiculoDeCarga.add( labelPlacaDeCarga          );
			frameCadastroVeiculoDeCarga.add( textoPlacaDeCarga          );
			frameCadastroVeiculoDeCarga.add( labelMarcaDeCarga          );
			frameCadastroVeiculoDeCarga.add( textoMarcaDeCarga          );
			frameCadastroVeiculoDeCarga.add( labelModeloDeCarga         );
			frameCadastroVeiculoDeCarga.add( textoModeloDeCarga         );
			frameCadastroVeiculoDeCarga.add( labelCorCarga              );
			frameCadastroVeiculoDeCarga.add( textoCorCarga              );
			frameCadastroVeiculoDeCarga.add( labelQuantidadeRodasCarga  );
			frameCadastroVeiculoDeCarga.add( textoQuantidadeRodasCarga  );
			frameCadastroVeiculoDeCarga.add( labelVelocidadeMaximaCarga );
			frameCadastroVeiculoDeCarga.add( textoVelocidadeMaximaCarga );
			frameCadastroVeiculoDeCarga.add( labelQuantidadePistaoCarga );
			frameCadastroVeiculoDeCarga.add( textoQuantidadePistaoCarga );
			frameCadastroVeiculoDeCarga.add( labelPotenciaCarga         );
			frameCadastroVeiculoDeCarga.add( textoPotenciaCarga         );
			
			// Fim Frame Cadastro de Ve�culo de Carga
			
			// Bot�es Frame Formul�rio Cadastrar Ve�culos de Carga
			frameCadastroVeiculoDeCarga.add( botaoCadastrarCarga               );
			frameCadastroVeiculoDeCarga.add( botaoLimparCadastrarCarga         );
			frameCadastroVeiculoDeCarga.add( botaoNovoCadastrarCarga           );
			frameCadastroVeiculoDeCarga.add( botaoSairCadastroVeiculoDeCarga   );
			
			// Fim Bot�es Frame Formul�rio Cadastrar Ve�culos de Carga
			
			// Alternar Frames Ve�culo de Carga para Formul�rio Cadastro Ve�culo de Carga
			frameVeiculoDeCarga        .setVisible( false             );
			frameCadastroVeiculoDeCarga .setLayout( new FlowLayout( ) );
			frameCadastroVeiculoDeCarga.setVisible( true              );
		}
	}// Fim Frame Cadastro Ve�culo de Carga

	
	private void excluirTodosPasseio() {
		// TODO Auto-generated method stub

		while ( !bd.listaPasseio.isEmpty( ) )  {
			try {
				for ( Veiculo veiculo : bd.listaPasseio ) {
					if ( veiculo.getTipo ( ) == 1  ) {
						bd.listaPasseio.remove( veiculo );
						continue;
					}
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		if ( bd.listaPasseio.isEmpty( ) )  {
			JOptionPane.showMessageDialog(null, "Sem Ve�culos Cadastrado.");
		}
		
		resetaCamposDeTextoPasseio();
		
		modelPasseio     = new DefaultTableModel( colunasPasseio ,0 );
		tableDadosPasseio.setModel( modelPasseio );
	}





	private void frameImprimirExcluirTodosPasseio( ) {
		
		//resetaCamposDeTextoPasseio();
		
		
		// TODO Auto-generated method stub
		//frameImprimirExcluirTodosPasseio.se
		frameImprimirExcluirTodosPasseio.setSize ( 480, 500 );                                         
		frameImprimirExcluirTodosPasseio.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );             
		frameImprimirExcluirTodosPasseio.setLocationRelativeTo( null );                                
		
		//tabelaImprimirExcluirTodosPasseio.
		frameImprimirExcluirTodosPasseio.add( barraRolagemListaPasseio           );
		
		frameImprimirExcluirTodosPasseio.add( botaoImprimirTodosPasseio   );
		frameImprimirExcluirTodosPasseio.add( botaoExcluirTodosPasseio    );
		frameImprimirExcluirTodosPasseio.add( botaoSairImpExcTodosPasseio );
		
		
		
		
		frameImprimirExcluirTodosPasseio.setLayout(new FlowLayout( FlowLayout.LEFT ));
		frameImprimirExcluirTodosPasseio.setVisible( true );
		
		frameVeiculoDePasseio.setVisible(false);
	}

	private void frameImprimirExcluirTodosCarga( ) {
		// TODO Auto-generated method stub
		
		frameImprimirExcluirTodosCarga.setSize ( 480, 500 );                                         
		frameImprimirExcluirTodosCarga.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );             
		frameImprimirExcluirTodosCarga.setLocationRelativeTo( null );                                
		

		frameImprimirExcluirTodosCarga.add( barraRolagemListaCarga           );
		
		frameImprimirExcluirTodosCarga.add( botaoImprimirTodosCarga );
		frameImprimirExcluirTodosCarga.add( botaoExcluirTodosCarga         );
		frameImprimirExcluirTodosCarga.add( botaoSairImpExcTodosCarga      );
		

		
		frameImprimirExcluirTodosCarga.setLayout(new FlowLayout( FlowLayout.LEFT ));
		frameImprimirExcluirTodosCarga.setVisible( true );
	
		frameVeiculoDeCarga.setVisible(false);
	}
	
	public void imprimirTodosPasseio( ) {
		
		if ( bd.listaPasseio.isEmpty( ) ) {
			JOptionPane.showMessageDialog(null,"Sem Ve�culos Cadastrado." , "ERRO",  JOptionPane.ERROR_MESSAGE);
		} else {

				for( Veiculo veiculo : bd.listaPasseio ) {
					if ( veiculo.getTipo( ) == 1 ) {
						Passeio passeio = (Passeio) veiculo;
																				  
																			
						placa          = passeio.getPlaca         ( )                 ;
						marca          = passeio.getMarca         ( )                 ;
						modelo         = passeio.getModelo        ( )                 ;
						cor            = passeio.getCor           ( )                 ;
						qtdRodas       = String.valueOf( passeio.getQtdRodas      ( ) );
						velocMax       = String.valueOf( passeio.getVelocMax      ( ) );
						qtdPistao      = String.valueOf( passeio.getQtdPist       ( ) );
						potencia       = String.valueOf( passeio.getPotencia      ( ) );
						qtdPassageiros = String.valueOf( passeio.getQtdPassageiros( ) ); 
						
						String[] dados   = { 
								 
								placa         ,
								marca         ,
								modelo        ,
								cor           ,
								 
								qtdRodas      ,
								velocMax      ,
								qtdPistao     ,
								potencia      ,   
								qtdPassageiros
						};
						modelPasseio.addRow( dados );
						
				}
			}
		}
		tableDadosPasseio.setModel( modelPasseio );
	}
	
	public void imprimirTodosCarga() {

        if(bd.listaCarga.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Sem Ve�culos Cadastrado." , "ERRO",  JOptionPane.ERROR_MESSAGE);

        }else {

            for( Veiculo veiculo : bd.listaCarga ) {
            	if ( veiculo.getTipo() == 2 ) {
            		Carga  carga = ( Carga ) veiculo;
					
            				        tara             = String.valueOf( carga.getTara    ( ) );
            						cargaMaxima      = String.valueOf( carga.getCargaMax( ) );
            						placa            =                 carga.getPlaca   ( )  ;
            						marca            =                 carga.getMarca   ( )  ;
            						modelo           =                 carga.getModelo  ( )  ;
            						cor              =                 carga.getCor     ( )  ;
            						velocMax         = String.valueOf( carga.getQtdRodas( ) );
            						qtdRodas         = String.valueOf( carga.getVelocMax( ) );
            						qtdPistao        = String.valueOf( carga.getQtdPist ( ) );
            						potencia         = String.valueOf( carga.getPotencia( ) );   
            						
            						String[] dados   = { 
            								tara        ,
            								cargaMaxima ,
            								placa       ,
            								marca       ,
            								modelo      ,
            								cor         ,
            								velocMax    ,
            								qtdRodas    ,
            								qtdPistao   ,
            								potencia    
            		};
            		modelCarga.addRow( dados );
				}
            }
        }
        tableDadosCarga.setModel( modelCarga );
    }
	
	private void frameConsultarExcluirVeiculoDePasseioPelaPlaca() {
		// TODO Frame Consultar/Excluir Ve�culo de Passeio Pela Placa
		
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.setSize ( 400, 300 );                            
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.setTitle( "Consultar/Excluir Veiculo de Passeio Pela Placa" );                    
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.setLocationRelativeTo( null );
		
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( labelQuantidadeDePassageirosPasseio ); 
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( textoQtdDePassageirosPasseio        );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( labelPlacaDePasseio                 );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( textoPlacaDePasseio                 );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( labelMarcaDePasseio                 );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( textoMarcaDePasseio                 );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( labelModeloDePasseio                );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( textoModeloDePasseio                );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( labelCorPasseio                     );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( textoCorPasseio                     );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( labelQuantidadeRodasPasseio         );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( textoQuantidadeRodasPasseio         );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( labelVelocidadeMaximaPasseio        );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( textoVelocidadeMaximaPasseio        );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( labelQuantidadePistaoPasseio        ); 
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( textoQuantidadePistaoPasseio        );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( labelPotenciaPasseio                );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( textoPotenciaPasseio                );
		
		
		desativaCamposPasseio();
		
		
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( botaoConsultarVeiculoDePasseioPelaPlaca );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( botaoExcluirVeiculoDePasseioPelaPlaca   );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.add( botaoSairVeiculoDePasseioPelaPlaca      );
		
		frameConsultarExcluirVeiculoDePasseioPelaPlaca .setLayout( new FlowLayout( FlowLayout.LEFT ) );
		frameVeiculoDePasseio                         .setVisible( false                             );
		frameConsultarExcluirVeiculoDePasseioPelaPlaca.setVisible( true                              );
		
	}

	private void frameConsultarExcluirVeiculoDeCargaPelaPlaca() {
		// TODO Frame Consultar/Excluir Ve�culo de Passeio Pela Placa
		
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.setSize ( 400, 300 );                            
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.setTitle( "Consultar/Excluir Veiculo de Carga Pela Placa" );                    
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.setLocationRelativeTo( null );
		
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelTara        ); 
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoTara        );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelCargaMaxima ); 
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoCargaMaxima        );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelPlacaDeCarga                 );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoPlacaDeCarga                 );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelMarcaDeCarga                 );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoMarcaDeCarga                 );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelModeloDeCarga                );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoModeloDeCarga                );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelCorCarga                     );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoCorCarga                     );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelQuantidadeRodasCarga         );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoQuantidadeRodasCarga         );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelVelocidadeMaximaCarga        );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoVelocidadeMaximaCarga        );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelQuantidadePistaoCarga        ); 
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoQuantidadePistaoCarga        );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( labelPotenciaCarga                );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( textoPotenciaCarga                );
		
		
		desativaCamposCarga();
		
		
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( botaoConsultarVeiculoDeCargaPelaPlaca );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( botaoExcluirVeiculoDeCargaPelaPlaca   );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.add( botaoSairVeiculoDeCargaPelaPlaca      );
		
		frameConsultarExcluirVeiculoDeCargaPelaPlaca .setLayout( new FlowLayout( FlowLayout.LEFT ) );
		frameVeiculoDeCarga                         .setVisible( false                             );
		frameConsultarExcluirVeiculoDeCargaPelaPlaca.setVisible( true                              );
		
	}
	
	
	private void ativaCamposPasseio( ) {
		textoQtdDePassageirosPasseio.setEditable( true );
		textoPlacaDePasseio         .setEditable( true ); 
		textoMarcaDePasseio         .setEditable( true );
		textoModeloDePasseio        .setEditable( true );
		textoCorPasseio             .setEditable( true );
		textoQuantidadeRodasPasseio .setEditable( true );
		textoVelocidadeMaximaPasseio.setEditable( true );
		textoQuantidadePistaoPasseio.setEditable( true );
		textoPotenciaPasseio        .setEditable( true );
		
	}
	
	private void ativaCamposCarga( ) {
		textoTara                   .setEditable( true );
		textoCargaMaxima            .setEditable( true );
		textoPlacaDeCarga         .setEditable( true ); 
		textoMarcaDeCarga         .setEditable( true );
		textoModeloDeCarga        .setEditable( true );
		textoCorCarga             .setEditable( true );
		textoQuantidadeRodasCarga .setEditable( true );
		textoVelocidadeMaximaCarga.setEditable( true );
		textoQuantidadePistaoCarga.setEditable( true );
		textoPotenciaCarga        .setEditable( true );
		
	}
	
	private void desativaCamposPasseio() {
		// TODO Auto-generated method stub
		
		textoQtdDePassageirosPasseio.setEditable( false );
		textoPlacaDePasseio         .setEditable( true  ); 
		textoMarcaDePasseio         .setEditable( false );
		textoModeloDePasseio        .setEditable( false );
		textoCorPasseio             .setEditable( false );
		textoQuantidadeRodasPasseio .setEditable( false );
		textoVelocidadeMaximaPasseio.setEditable( false );
		textoQuantidadePistaoPasseio.setEditable( false );
		textoPotenciaPasseio        .setEditable( false );
		
	}

	private void desativaCamposCarga() {
		// TODO Auto-generated method stub
		
		textoTara                 .setEditable( false );
		textoCargaMaxima          .setEditable( false );
		textoPlacaDeCarga         .setEditable( true  ); 
		textoMarcaDeCarga         .setEditable( false );
		textoModeloDeCarga        .setEditable( false );
		textoCorCarga             .setEditable( false );
		textoQuantidadeRodasCarga .setEditable( false );
		textoVelocidadeMaximaCarga.setEditable( false );
		textoQuantidadePistaoCarga.setEditable( false );
		textoPotenciaCarga        .setEditable( false );
		
	}

	public static final void imprimirVeiculosPasseioPelaPlaca( ) throws VelocException, VeicExistException {
		// TODO 5. Imprimir Ve�culo de Passeio pela Placa

		// Leitura l = new Leitura();
		String plac = "";
		
		int consulta = 0;

		try {
			// plac = l.entDados( "Digite a Placa para Consulta: " );
			Passeio passeio;
			
			for ( Veiculo veiculo : bd.listaPasseio ) {
				passeio = (Passeio)veiculo;
				if( passeio == null ) {
					consulta = 0;
				}else {
					consulta = 1;
				}
			}
			
			switch (consulta) {
			case 0:
				System.out.println( "Sem Ve�culos de Passeio cadastrado. " );
				break;

			case 1:
			
				for ( Veiculo veiculo : bd.listaPasseio ) {
					passeio = (Passeio) veiculo;
				
					if ( plac.equals( passeio.getPlaca())) {
						System.out.println( "Placa: "                     + passeio.getPlaca         ( ) );
						System.out.println( "Marca: "                     + passeio.getMarca         ( ) );
						System.out.println( "Modelo: "                    + passeio.getModelo        ( ) );
						System.out.println( "Cor: "                       + passeio.getCor           ( ) );
						System.out.println( "Quantidade de Rodas: "       + passeio.getQtdRodas      ( ) );
						System.out.println( "Velocidade M�xima: "         + passeio.getVelocMax      ( ) );
						System.out.println( "Quantidade de Pist�o: "      + passeio.getQtdPist       ( ) );
						System.out.println( "Pot�ncia: "                  + passeio.getPotencia      ( ) );
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
			//MenuAutomoveis.menu();
		}
	} // Fim Pela Placa Passeio.
	
	private void cadastrarVeiculoDePasseio() throws VeicExistException {
		// TODO Auto-generated method stub
		
		
		placa          = ( String ) textoPlacaDePasseio         .getText( );
		qtdPassageiros = ( String ) textoQtdDePassageirosPasseio.getText( );
		marca          = ( String ) textoMarcaDePasseio         .getText( );
		modelo         = ( String ) textoModeloDePasseio        .getText( );
		cor            = ( String ) textoCorPasseio             .getText( );
		qtdRodas       = ( String ) textoQuantidadeRodasPasseio .getText( );
		velocMax       = ( String ) textoVelocidadeMaximaPasseio.getText( );
		qtdPistao      = ( String ) textoQuantidadePistaoPasseio.getText( );
		potencia       = ( String ) textoPotenciaPasseio        .getText( );
		
		if( ( b = !conferePlacaPasseio( placa ) ) ){

			String plac =  "";
	        String marc =  "";
	        String model = ""; 
	        String corr  = "";
	        int   qtdRoda       = 0;
	        float velocMaxx     = 0.0f;
	        int   qtdPista      = 0;
	        int   potenci       = 0;
	        int   qtdPassageiro = 0;
	        
	        try {
	        	
	        	plac          = placa;  
	        	marc          = marca;  
	        	model         = modelo;
	        	corr          = cor;   
	        	qtdRoda       = Integer.parseInt( qtdRodas      .toString( ) );
	        	qtdPista      = Integer.parseInt( qtdPistao     .toString( ) );
	        	potenci       = Integer.parseInt( potencia      .toString( ) ); 
	        	qtdPassageiro = Integer.parseInt( qtdPassageiros.toString( ) );
	        	velocMaxx     = Float.parseFloat( velocMax      .toString( ) );
			} catch ( NumberFormatException e ) {
				// TODO: Convers�es Float, Integer
				// System.out.println( "Convers�es: " );
			}
			
			//System.out.println("Aqui tamb�m");
			// Cadastro:
			Veiculo veiculo = new Passeio( 1, plac, marc, model, corr, qtdRoda, qtdPista, potenci, qtdPassageiro );
			
			try {
				veiculo.setVelocMax( velocMaxx, 1 );
				//System.out.println( "Velocidade M�xima ve�culo: "  + veiculo.getVelocMax() );
			} catch ( VelocException e1 ) {
				// TODO Auto-generated catch block
				e1.impErroVelocException( );
				// Voltar ao menu
				//MenuAutomoveis.menu();
			}
			
			bd.listaPasseio.add( veiculo );
			
			//resetaCamposDeTextoPasseio();
			
			JOptionPane.showMessageDialog( null, "Passeio armazenado na posi��o " +  bd.listaPasseio.indexOf(veiculo) + " do bd" );
			// entrada = l.entDados("Deseja cadastrar outro PASSEIO? <s/n>").toLowerCase( );
			
			int entrada = JOptionPane.showConfirmDialog( null, "Deseja cadastrar outro Ve�culo de Passeio?" );
			//JOptionPane.showMessageDialog( null, "Entrada: " + entrada );
			
			// Deseja cadastrar outro Ve�culo de Passeio?
			// Sim Permanece no Formul�rio
			if ( entrada == 0 ) {
				resetaCamposDeTextoPasseio();
				
				frameCadastroVeiculoDePasseio.setVisible( false );
				frameCadastroVeiculoDePasseio.setVisible( true );
				//frameCadastroVeiculosDePasseio();
				
			// N�o Volta a Frame anterior
			} else if ( entrada == 1 ) {
				resetaCamposDeTextoPasseio();
				
				frameCadastroVeiculoDePasseio.setVisible( false );
				frameVeiculoDePasseio.setVisible( true );
			
			// Cancelar Voltar ao Menu Incial
			} else if ( entrada == 2 ) {
				resetaCamposDeTextoPasseio();
				
				frameCadastroVeiculoDePasseio.setVisible( false );
				frameGestaoVeiculos.setVisible( true );
			}
		}
	}

	private void cadastrarVeiculoDeCarga() throws VeicExistException {
		// TODO Auto-generated method stub
		tara           = ( String ) textoTara                   .getText();
	 
		cargaMaxima    = ( String ) textoCargaMaxima            .getText( );
		placa          = ( String ) textoPlacaDeCarga         .getText( );
		marca          = ( String ) textoMarcaDeCarga         .getText( );
		modelo         = ( String ) textoModeloDeCarga        .getText( );
		cor            = ( String ) textoCorCarga             .getText( );
		qtdRodas       = ( String ) textoQuantidadeRodasCarga .getText( );
		velocMax       = ( String ) textoVelocidadeMaximaCarga.getText( );
		qtdPistao      = ( String ) textoQuantidadePistaoCarga.getText( );
		potencia       = ( String ) textoPotenciaCarga        .getText( );
		
		if( ( b = !conferePlacaCarga( placa ) ) ){

			String plac    =  "";
	        String marc    =  "";
	        String model   = ""; 
	        String corr    = "";
	        int   qtdRoda  = 0;
	        float velocMaxx= 0.0f;
	        int   qtdPista = 0;
	        int   potenci  = 0;
	        int   cargaMax = 0;
	        int   taraa    = 0;
	        
	        try {
	        	
	        	taraa         = Integer.parseInt( tara.toString( ) );
	        	cargaMax      = Integer.parseInt( cargaMaxima.toString( ) );
	        	plac          = placa;  
	        	marc          = marca;  
	        	model         = modelo;
	        	corr          = cor;   
	        	qtdRoda       = Integer.parseInt( qtdRodas      .toString( ) );
	        	velocMaxx     = Float.parseFloat( velocMax      .toString( ) );
	        	qtdPista      = Integer.parseInt( qtdPistao     .toString( ) );
	        	potenci       = Integer.parseInt( potencia      .toString( ) ); 
																			
																			
			} catch ( NumberFormatException e ) {
				// TODO: Convers�es Float, Integer
				// System.out.println( "Convers�es: " );
			}
			
			//System.out.println("Aqui tamb�m");
			// Cadastro:
			Veiculo veiculo = new Carga( 2, taraa, cargaMax, plac, marc, model, corr, qtdRoda, qtdPista, potenci);
			
			try {
				veiculo.setVelocMax( velocMaxx, 2 );
				//System.out.println( "Velocidade M�xima ve�culo: "  + veiculo.getVelocMax() );
			} catch ( VelocException e1 ) {
				// TODO Auto-generated catch block
				e1.impErroVelocException( );
				// Voltar ao menu
							   
			}
			
			bd.listaCarga.add( veiculo );
			
			//resetaCamposDeTextoCarga();
			
			JOptionPane.showMessageDialog( null, "Carga armazenado na posi��o " +  bd.listaCarga.indexOf(veiculo) + " do bd" );
			// entrada = l.entDados("Deseja cadastrar outro PASSEIO? <s/n>").toLowerCase( );
			
			int entrada = JOptionPane.showConfirmDialog( null, "Deseja cadastrar outro Ve�culo de Carga?" );
			//JOptionPane.showMessageDialog( null, "Entrada: " + entrada );
			
			// Deseja cadastrar outro Ve�culo de Carga?
			// Sim Permanece no Formul�rio
			if ( entrada == 0 ) {
				resetaCamposDeTextoCarga();
				
				frameCadastroVeiculoDeCarga.setVisible( false );
				frameCadastroVeiculoDeCarga.setVisible( true );
				//frameCadastroVeiculosDePasseio();
				
			// N�o Volta a Frame anterior
			} else if ( entrada == 1 ) {
				resetaCamposDeTextoCarga();
				
				frameCadastroVeiculoDeCarga.setVisible( false );
				frameVeiculoDeCarga.setVisible( true );
			
			// Cancelar Voltar ao Menu Incial
			} else if ( entrada == 2 ) {
				resetaCamposDeTextoCarga();
				
				frameCadastroVeiculoDeCarga.setVisible( false );
				frameGestaoVeiculos.setVisible( true );
			}
		}
	}
	
	
	
	private boolean verificaCamposNulosPasseio( ) {
		// TODO Auto-generated method stub
		
		boolean b = false;
		
		placa          = ( String ) textoPlacaDePasseio         .getText( );
		qtdPassageiros = ( String ) textoQtdDePassageirosPasseio.getText( );
		marca          = ( String ) textoMarcaDePasseio         .getText( );
		modelo         = ( String ) textoModeloDePasseio        .getText( );
		cor            = ( String ) textoCorPasseio             .getText( );
		qtdRodas       = ( String ) textoQuantidadeRodasPasseio .getText( );
		velocMax       = ( String ) textoVelocidadeMaximaPasseio.getText( );
		qtdPistao      = ( String ) textoQuantidadePistaoPasseio.getText( );
		potencia       = ( String ) textoPotenciaPasseio        .getText( );
		
		if( placa         .isBlank() || 
		    qtdPassageiros.isBlank() ||
		    marca         .isBlank() ||
		    modelo        .isBlank() ||
		    cor           .isBlank() ||
		    qtdRodas      .isBlank() ||
		    velocMax      .isBlank() ||
		    qtdPistao     .isBlank() ||
		    potencia      .isBlank() 
				) {
			b = true;
		}
		
		//JOptionPane.showMessageDialog( null, "Algum campo de texto vazio? "  + b  );
		
		return b;
	}

	private boolean verificaCamposNulosCarga( ) {
		// TODO Auto-generated method stub
		
		boolean b = false;
		
		tara           = ( String ) textoTara.getText( );
		cargaMaxima    = ( String ) textoCargaMaxima         .getText( );
		placa          = ( String ) textoPlacaDeCarga         .getText( );
		marca          = ( String ) textoMarcaDeCarga         .getText( );
		modelo         = ( String ) textoModeloDeCarga        .getText( );
		cor            = ( String ) textoCorCarga             .getText( );
		qtdRodas       = ( String ) textoQuantidadeRodasCarga .getText( );
		velocMax       = ( String ) textoVelocidadeMaximaCarga.getText( );
		qtdPistao      = ( String ) textoQuantidadePistaoCarga.getText( );
		potencia       = ( String ) textoPotenciaCarga        .getText( );
		
		if( 
			tara.isBlank() ||
			cargaMaxima.isBlank() ||
			placa         .isBlank() || 
		    marca         .isBlank() ||
		    modelo        .isBlank() ||
		    cor           .isBlank() ||
		    qtdRodas      .isBlank() ||
		    velocMax      .isBlank() ||
		    qtdPistao     .isBlank() ||
		    potencia      .isBlank() 
				) {
			b = true;
			
		}
		
		//JOptionPane.showMessageDialog( null, "Algum campo de texto vazio? "  + b  );
		
		return b;
	}
	

	private void resetaCamposDeTextoPasseio() {
		// TODO Auto-generated method stub
		
		placa          = "";
		qtdPassageiros = "";
		marca          = "";
		modelo         = "";
		cor            = "";
		qtdRodas       = "";
		velocMax       = "";
		qtdPistao      = "";
		potencia       = "";
		
		//textoPlacaDePasseio.
		textoPlacaDePasseio          .setText( placa          );
		textoQtdDePassageirosPasseio .setText( qtdPassageiros );
		textoMarcaDePasseio          .setText( marca          );
		textoModeloDePasseio         .setText( modelo         );
		textoCorPasseio              .setText( cor            );
		textoQuantidadeRodasPasseio  .setText( qtdRodas       );
		textoVelocidadeMaximaPasseio .setText( velocMax       );
		textoQuantidadePistaoPasseio .setText( qtdPistao      );
		textoPotenciaPasseio         .setText( potencia       );
		
	}
	private void resetaCamposDeTextoCarga() {
		// TODO Auto-generated method stub
		
		tara           = "";
		cargaMaxima    = "";
		placa          = "";
		marca          = "";
		modelo         = "";
		cor            = "";
		qtdRodas       = "";
		velocMax       = "";
		qtdPistao      = "";
		potencia       = "";
		
		//textoPlacaDeCarga.
		textoTara                  .setText( tara        );
		textoCargaMaxima           .setText( cargaMaxima );
		textoPlacaDeCarga          .setText( placa       );
		textoMarcaDeCarga          .setText( marca       );
		textoModeloDeCarga         .setText( modelo      );
		textoCorCarga              .setText( cor         );
		textoQuantidadeRodasCarga  .setText( qtdRodas    );
		textoVelocidadeMaximaCarga .setText( velocMax    );
		textoQuantidadePistaoCarga .setText( qtdPistao   );
		textoPotenciaCarga         .setText( potencia    );
		
	}

	private void frameCadastroVeiculosDePasseio() {
		// TODO Frame Cadastro Ve�culo de Passeio.
		
		frameCadastroVeiculoDePasseio.setSize ( 400, 300 );
		frameCadastroVeiculoDePasseio.setTitle( "Cadastro Ve�culo de Passeio" );
		frameCadastroVeiculoDePasseio.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frameCadastroVeiculoDePasseio.setLocationRelativeTo(null);
		
		//frameCadastroVeiculoDePasseio.setLayout( new GridLayout( 4,1,8,8 ) );
		frameCadastroVeiculoDePasseio.getContentPane().setBackground(Color.WHITE);
		
		frameCadastroVeiculoDePasseio .setLayout( new FlowLayout( FlowLayout.LEFT ) );
		
		resetaCamposDeTextoPasseio();
		ativaCamposPasseio( );
		
		
		// Formul�rio Frame Cadastro de Ve�culo de Passeio
		frameCadastroVeiculoDePasseio.add( labelQuantidadeDePassageirosPasseio ); 
		frameCadastroVeiculoDePasseio.add( textoQtdDePassageirosPasseio        );
		frameCadastroVeiculoDePasseio.add( labelPlacaDePasseio                 );
		frameCadastroVeiculoDePasseio.add( textoPlacaDePasseio                 );
		frameCadastroVeiculoDePasseio.add( labelMarcaDePasseio                 );
		frameCadastroVeiculoDePasseio.add( textoMarcaDePasseio                 );
		frameCadastroVeiculoDePasseio.add( labelModeloDePasseio                );
		frameCadastroVeiculoDePasseio.add( textoModeloDePasseio                );
		frameCadastroVeiculoDePasseio.add( labelCorPasseio                     );
		frameCadastroVeiculoDePasseio.add( textoCorPasseio                     );
		frameCadastroVeiculoDePasseio.add( labelQuantidadeRodasPasseio         );
		frameCadastroVeiculoDePasseio.add( textoQuantidadeRodasPasseio         );
		frameCadastroVeiculoDePasseio.add( labelVelocidadeMaximaPasseio        );
		frameCadastroVeiculoDePasseio.add( textoVelocidadeMaximaPasseio        );
		frameCadastroVeiculoDePasseio.add( labelQuantidadePistaoPasseio        ); 
		frameCadastroVeiculoDePasseio.add( textoQuantidadePistaoPasseio        );
		frameCadastroVeiculoDePasseio.add( labelPotenciaPasseio                );
		frameCadastroVeiculoDePasseio.add( textoPotenciaPasseio                );

		// Bot�es Frame Formul�rio Cadastrar Ve�culos de Passeio
		frameCadastroVeiculoDePasseio.add( botaoCadastrarPasseio               );
		frameCadastroVeiculoDePasseio.add( botaoLimparCadastrarPasseio         );
		frameCadastroVeiculoDePasseio.add( botaoNovoCadastrarPasseio           );
		frameCadastroVeiculoDePasseio.add( botaoSairCadastroVeiculoDePasseio   );
		
		// Fim Bot�es Frame Formul�rio Cadastrar Ve�culos de Passeio
		
		// Alternar Frames Ve�culo de Passeio para Formul�rio Cadastro Ve�culo de Passeio
		frameVeiculoDePasseio        .setVisible( false             );
		frameCadastroVeiculoDePasseio.setVisible( true              );
	}


	private void frameCadastroVeiculosDeCarga() {
		// TODO Frame Cadastro Ve�culo de Carga.
		
		//resetaCamposDeTextoCarga();
		
		//frameCadastroVeiculoDeCarga = new JFrame();
		
		frameCadastroVeiculoDeCarga.setSize ( 400, 300 );
		frameCadastroVeiculoDeCarga.setTitle( "Cadastro Ve�culo de Carga" );
		frameCadastroVeiculoDeCarga.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frameCadastroVeiculoDeCarga.setLocationRelativeTo( null );
		frameCadastroVeiculoDeCarga .setLayout( new FlowLayout( FlowLayout.LEFT ) );
		frameCadastroVeiculoDeCarga.getContentPane().setBackground(Color.WHITE);
		
		resetaCamposDeTextoCarga();
		ativaCamposCarga( );
		
		// Formul�rio Frame Cadastro de Ve�culo de Carga
		frameCadastroVeiculoDeCarga.add( labelTara           ); 
		frameCadastroVeiculoDeCarga.add( textoTara           );
		frameCadastroVeiculoDeCarga.add( labelCargaMaxima           ); 
		frameCadastroVeiculoDeCarga.add( textoCargaMaxima           );
		frameCadastroVeiculoDeCarga.add( labelPlacaDeCarga          );
		frameCadastroVeiculoDeCarga.add( textoPlacaDeCarga          );
		frameCadastroVeiculoDeCarga.add( labelMarcaDeCarga          );
		frameCadastroVeiculoDeCarga.add( textoMarcaDeCarga          );
		frameCadastroVeiculoDeCarga.add( labelModeloDeCarga         );
		frameCadastroVeiculoDeCarga.add( textoModeloDeCarga         );
		frameCadastroVeiculoDeCarga.add( labelCorCarga              );
		frameCadastroVeiculoDeCarga.add( textoCorCarga              );
		frameCadastroVeiculoDeCarga.add( labelQuantidadeRodasCarga  );
		frameCadastroVeiculoDeCarga.add( textoQuantidadeRodasCarga  );
		frameCadastroVeiculoDeCarga.add( labelVelocidadeMaximaCarga );
		frameCadastroVeiculoDeCarga.add( textoVelocidadeMaximaCarga );
		frameCadastroVeiculoDeCarga.add( labelQuantidadePistaoCarga ); 
		frameCadastroVeiculoDeCarga.add( textoQuantidadePistaoCarga );
		frameCadastroVeiculoDeCarga.add( labelPotenciaCarga         );
		frameCadastroVeiculoDeCarga.add( textoPotenciaCarga         );

		// Bot�es Frame Formul�rio Cadastrar Ve�culos de Carga
		frameCadastroVeiculoDeCarga.add( botaoCadastrarCarga             );
		frameCadastroVeiculoDeCarga.add( botaoLimparCadastrarCarga       );
		frameCadastroVeiculoDeCarga.add( botaoNovoCadastrarCarga         );
		frameCadastroVeiculoDeCarga.add( botaoSairCadastroVeiculoDeCarga );
		// Fim Bot�es Frame Formul�rio Cadastrar Ve�culos de Carga
		
		// Alternar Frames Ve�culo de Passeio para Formul�rio Cadastro Ve�culo de Carga
		frameVeiculoDeCarga        .setVisible( false             );
		frameCadastroVeiculoDeCarga.setVisible( true              );
	}
	
	
	private void frameVeiculoDeCarga() {
		// TODO Auto-generated method stub
		// Frame Ve�culo de Carga
		
		frameVeiculoDeCarga.setSize ( 400, 300 );
		frameVeiculoDeCarga.setTitle( "Ve�culos de Carga" );
		frameVeiculoDeCarga.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frameVeiculoDeCarga.setLocationRelativeTo(null);
		
		frameVeiculoDeCarga.setLayout( new GridLayout( 4,1,10,10 ) );
		frameVeiculoDeCarga.getContentPane().setBackground(Color.WHITE);
		
		// Bot�es Frame Ve�culo de Carga
		frameVeiculoDeCarga.add( botaoCadastrarVeiculoDeCarga                );
		frameVeiculoDeCarga.add( botaoConsultarExcluiVeiculoDeCargaPelaPlaca );
		frameVeiculoDeCarga.add( botaoImprimirExcluirTodosCarga              );
		frameVeiculoDeCarga.add( botaoSairVeiculoDeCarga                     );
		// Fim Bot�es Frame Ve�culo de Carga
		
		// Alternar Frames
		frameGestaoVeiculos     .setVisible( false             );
		frameVeiculoDeCarga.setVisible( true              );
	}


	private void frameVeiculosDePasseio() {
		// TODO Frame Ve�culo de Passeio.
		
		frameVeiculoDePasseio.setSize( 400, 300 );
		frameVeiculoDePasseio.setTitle( "Ve�culos de Passeio" );
		frameVeiculoDePasseio.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frameVeiculoDePasseio.setLocationRelativeTo(null);
		
		frameVeiculoDePasseio.setLayout( new GridLayout( 4,1,10,10 ) );
		frameVeiculoDePasseio.getContentPane().setBackground(Color.WHITE);
		
		
		
		// Bot�es Frame Ve�culo de Passeio
		
		frameVeiculoDePasseio.add( botaoCadastrarVeiculoDePasseio                );
		frameVeiculoDePasseio.add( botaoConsultarExcluiVeiculoDePasseioPelaPlaca );
		frameVeiculoDePasseio.add( botaoImprimirExcluirTodosPasseio              );
		frameVeiculoDePasseio.add( botaoSairVeiculoDePasseio                     );
		
		
		// Fim Bot�es Frame Ve�culo de Passeio 
		
		// Altenar Frames Principal para 
		frameGestaoVeiculos       .setVisible( false             );
		//frameVeiculoDePasseio.setLayout ( new FlowLayout( FlowLayout.LEFT ) );
		frameVeiculoDePasseio.setVisible( true              );
	}


	private static boolean conferePlacaPasseio( String plac ) throws VeicExistException {
		// TODO Confere placa de Ve�culos se j� cadastradas.
		boolean b = false;
		String teste = "";
		if ( !bd.listaPasseio.isEmpty( ) ) {
			for ( Veiculo veiculo : bd.listaPasseio ) {
				teste = String.valueOf(veiculo.getPlaca());
				if ( plac.equals( teste ) ) {
					//System.out.println("Placa: " + plac.toString() );
					//System.out.println( "Placa do ve�culo igual: "  + veiculo.getPlaca( ).toString( ) );
					b = true;
					throw new VeicExistException();
				} // Fim Placa existe 
			} // Fim for
		}
		// JOptionPane.showMessageDialog(null,  "Valor de B:  "  + b );
		return b;
	}// Fim m�todo conferePlaca
	
	private static boolean conferePlacaCarga( String plac ) throws VeicExistException {
		// TODO Confere placa de Ve�culos se j� cadastradas.
		boolean b = false;
		String teste = "";
		if ( !bd.listaCarga.isEmpty( ) ) {
			for ( Veiculo veiculo : bd.listaCarga ) {
				teste = String.valueOf(veiculo.getPlaca());
				if ( plac.equals( teste ) ) {
					//System.out.println("Placa: " + plac.toString() );
					//System.out.println( "Placa do ve�culo igual: "  + veiculo.getPlaca( ).toString( ) );
					b = true;
					throw new VeicExistException();
				} // Fim Placa existe 
			} // Fim for
		}
		// JOptionPane.showMessageDialog(null,  "Valor de B:  "  + b );
		return b;
	}// Fim m�todo conferePlaca
	
	
} // Fim Classe
