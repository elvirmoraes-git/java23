package carros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Menu Screen option: 
		
		String  placa    = "",
				marca    = "", 
				modelo   = "",
				cor      = ""; 
		float  	velocMax = 0f;
		int     qtdRodas = 0, i = 0,
				qtdPist  = 0, 
				potencia = 0;
		
		// Veículos preenchidos:
		Veiculo veiculo1 = new Veiculo(), veiculo2 = new Veiculo(),
				veiculo3 = new Veiculo(), veiculo4 = new Veiculo(),
				veiculo5 = new Veiculo();
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader   bir = new BufferedReader(ir);
		String s = "";
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Menu: ********** CAR SYSTEMS **********");
		System.out.println();
		System.out.println("1 - Exibir veiculos cadastrados"        .toUpperCase( )   );
		System.out.println("2 - Cadastrar veículos usando objetos." .toLowerCase( )   );
		System.out.println("3 - Cadastrar veículos usando Construtor com parâmetros." );
		System.out.println("     *********** Digite opção: ***********              " );
		
		int key = 0;
		try {
			s = bir.readLine();
			key  = Integer.parseInt(s);
		} catch (IOException e) {
			System.out.println("Erro de Entrada. ");
			e.printStackTrace();
		}
		switch (key) {
		case 1:
			veiculo1.setPlaca         ( "ELV-1979" );
			veiculo1.setMarca         ( "Ford"     );
			veiculo1.setModelo        ( "1988"     );
			veiculo1.setCor           ( "Azul"     );
			veiculo1.setVelocMax      ( 200f       );
			veiculo1.setQtdRodas      ( 5          );
			veiculo1.motor.setQtdPist ( 20         );
			veiculo1.motor.setPotencia( 300        );
			
			veiculo2.setPlaca         ( "ROS-1978"  );
			veiculo2.setMarca         ( "Chevrolet" );
			veiculo2.setModelo        ( "1996"      );
			veiculo2.setCor           ( "Rosa"      );
			veiculo2.setVelocMax      ( 150f        );
			veiculo2.setQtdRodas      ( 5           );
			veiculo2.motor.setQtdPist ( 15          );
			veiculo2.motor.setPotencia( 250         );
			
			veiculo3.setPlaca         ( "ASC-1960");
			veiculo3.setMarca         ( "Ford");
			veiculo3.setModelo        ( "1960");
			veiculo3.setCor           ( "Azul-Petróleo");
			veiculo3.setVelocMax      ( 400f           );
			veiculo3.setQtdRodas      ( 4              );
			veiculo3.motor.setQtdPist ( 32             );
			veiculo3.motor.setPotencia( 500            );
			
			veiculo4.setPlaca         ( "BOSS-1970" );
			veiculo4.setMarca         ( "Chevrolet" );
			veiculo4.setModelo        ( "1970"      );
			veiculo4.setCor           ( "Vinho"     );
			veiculo4.setVelocMax      ( 350f        );
			veiculo4.setQtdRodas      ( 4           );
			veiculo4.motor.setQtdPist ( 35          );
			veiculo4.motor.setPotencia( 450         );
			
			veiculo5.setPlaca         ( "CAV-2000" );
			veiculo5.setMarca         ( "Fiat"     );
			veiculo5.setModelo        ( "1996"     );
			veiculo5.setCor           ( "Rosa"     );
			veiculo5.setVelocMax      ( 160f       );
			veiculo5.setQtdRodas      ( 5          );
			veiculo5.motor.setQtdPist ( 15         );
			veiculo5.motor.setPotencia( 250        );
			
			Veiculo vet[]= new Veiculo[5];
			vet[0] = veiculo1;
			vet[1] = veiculo2;
			vet[2] = veiculo3;
			vet[3] = veiculo4;
			vet[4] = veiculo5;
			int c = 1;
			System.out.println("Veículos cadastrados: ");
			for ( Veiculo veiculo : vet ) {
				System.out.println();
				System.out.println( "Veículo: "              + c );
				System.out.println( "Placa: "                + veiculo.getPlaca( )          );
				System.out.println( "Marca: "                + veiculo.getMarca( )          );
				System.out.println( "Modelo: "               + veiculo.getModelo( )         );
				System.out.println( "Cor: "                  + veiculo.getCor( )            );
				System.out.println( "Velocidade Máxima: "    + veiculo.getVelocMax( )       );
				System.out.println( "Quantidade de Rodas: "  + veiculo.getQtdRodas( )       );
				System.out.println( "Quantidade de Pistão: " + veiculo.motor.getQtdPist( )  );
				System.out.println( "Potência: "             + veiculo.motor.getPotencia( ) );
				c++;
			}
			break;
			
		case 2:
			System.out.printf("Quantidade de veiculos: ");
			try {
				s = bir.readLine();
				i = Integer.parseInt(s);
				Veiculo veio[] = new Veiculo[i];
				
				for ( int j = 0; j < i; j++ ) {
					
					// Parece que o InputStrea... atropelam quantidade entrada de dados sequencial
					
					System.out.println("Registrando veiculo: " + j + ",... ");
					System.out.println( "Placa: "  );
					placa    = sc.next(); 
							//bir.readLine( ).toUpperCase();
					System.out.println( "Marca: "  ); 
					marca    = sc.next();
							//bir.readLine( ).toUpperCase();
					System.out.println( "Modelo: " ); 
					modelo   = sc.next(); 
							//bir.readLine( ) ;
					System.out.println( "Cor: "    ); 
					cor      = sc.next();
							//bir.readLine();
					System.out.println( "Velocidade máxima: "     ); 
					velocMax = sc.nextFloat();
							//Float.parseFloat( ); 
							//bir.readLine( ) );
					System.out.println( "Quantidade de Rodas: "   ); 
					qtdRodas = sc.nextInt();
							//bir.read();
					System.out.println( "Quantidade de Pistões: " ); 
					qtdPist  = sc.nextInt(); 
							//bir.read();
					System.out.println( "Potencia: "              ); 
					potencia = sc.nextInt(); 
							//bir.read();

					
					veio[j] = new Veiculo();
					
					veio[j].setPlaca         ( placa    );
					veio[j].setMarca         ( marca    );
					veio[j].setModelo        ( modelo   );
					veio[j].setCor           ( cor      );
					veio[j].setVelocMax      ( velocMax );
					veio[j].setQtdRodas      ( qtdRodas );
					veio[j].motor.setQtdPist ( qtdPist  );
					veio[j].motor.setPotencia( potencia );
				}
				int x = 0;
				for (Veiculo veiculo : veio) {
					System.out.println( "Veiculo: " + x );
					System.out.println( "Placa: "                  + veiculo.getPlaca( )          );
					System.out.println( "Marca: "                  + veiculo.getMarca( )          );         
					System.out.println( "Modelo: "                 + veiculo.getModelo( )         );        
					System.out.println( "Cor: "                    + veiculo.getCor( )            );           
					System.out.println( "Velocidade máxima: "     + veiculo.getVelocMax( )       );      
					System.out.println( "Quantidade de Rodas: "    + veiculo.getQtdRodas( )       );      
					System.out.println( "Quantidade de Pistões: " + veiculo.motor.getQtdPist( )  ); 
					System.out.println( "Potencia: "               + veiculo.motor.getPotencia( ) );
					x++;
				}
				
			} catch (IOException e) {
				System.out.println("Erro de entrada de dados.");
			}
			break;
			
		case 3:
			System.out.println("Insersão com Parâmetros: ");
			try {
				System.out.printf("Quantidade de veiculos: ");
				s = bir.readLine();
				i = Integer.parseInt(s);
				Veiculo parametrizado[] = new Veiculo[i];
				
				for ( int j = 0; j < i; j++ ) {
					System.out.println("Registrando veiculo: " + j + ",... ");
					System.out.println( "Placa: "  );
					placa    = sc.next(); 
							//bir.readLine( ).toUpperCase();
					System.out.println( "Marca: "  ); 
					marca    = sc.next();
							//bir.readLine( ).toUpperCase();
					System.out.println( "Modelo: " ); 
					modelo   = sc.next(); 
							//bir.readLine( ) ;
					System.out.println( "Cor: "    ); 
					cor      = sc.next();
							//bir.readLine();
					System.out.println( "Velocidade máxima: "     ); 
					velocMax = sc.nextFloat();
							//Float.parseFloat( ); 
							//bir.readLine( ) );
					System.out.println( "Quantidade de Rodas: "   ); 
					qtdRodas = sc.nextInt();
							//bir.read();
					System.out.println( "Quantidade de Pistões: " ); 
					qtdPist  = sc.nextInt(); 
							//bir.read();
					System.out.println( "Potencia: "              ); 
					potencia = sc.nextInt(); 
							//bir.read();
					
					// Construtor com parâmetros:
					parametrizado[j] = new Veiculo( placa,    marca,    modelo,  cor, 
							                        velocMax, qtdRodas, qtdPist, potencia );
				}
				
				for ( Veiculo veiculo : parametrizado ) {
					System.out.println(	"Placa: "                 + veiculo.getPlaca( )         );
					System.out.println(	"Marca: "                 + veiculo.getMarca( )         );
					System.out.println(	"Modelo: "                + veiculo.getModelo( )        );
					System.out.println(	"Cor: "                   + veiculo.getCor( )           );
					System.out.println(	"Velocidade Máxima: "     + veiculo.getVelocMax( )      );
					System.out.println(	"Quantidade de rodas: "   + veiculo.getQtdRodas( )      );
					System.out.println(	"Quantidade de Pistões: " + veiculo.motor.getQtdPist( ) );
					System.out.println(	"Potência: "              + veiculo.motor.getPotencia() );
				}
				
			} catch (IOException e) {
				System.out.println("Erro de entrada de dados.");
			}
			break;
			
		default:
			System.out.println("Op��o inv�lida.");
			//break;
		}
		sc.close();
	}

}
