import java.util.Scanner;

import juegos.wordle.Wordle;

public class Main {
	
	public Main() {
		int opcion=0;
		Scanner s=new Scanner(System.in);
		do {
			//Imprime el men�
			System.out.println("[Men� de ejecuci�n: seleccione una opci�n]");
			System.out.println("\t1) Wordle.");
			System.out.println("***");
			System.out.println("\t0) Salir.");
			
			//Lee la opci�n seleccionada
			opcion=s.nextInt();
			
			/*
			 * TODO: resto del men�
			 */
			
			//Procesa la opci�n seleccionada
			switch(opcion) {
			case 0:
				System.out.println("Saliendo de la aplicaci�n...");
				break;
			case 1:
				new Wordle("cachopo");
				break;
			default:
				System.out.println("Introduce un n�mero v�lido");
			}
		}while(opcion!=0);
		
		//Antes de terminar, se cierra el scanner
		s.close();
	}

	public static void main(String[] args) {
		Main m=new Main();

	}

}
