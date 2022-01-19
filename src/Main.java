import java.util.Scanner;

import juegos.wordle.Wordle;

public class Main {
	
	public Main() {
		int opcion=0;
		Scanner s=new Scanner(System.in);
		do {
			//Imprime el menú
			System.out.println("[Menú de ejecución: seleccione una opción]");
			System.out.println("\t1) Wordle.");
			System.out.println("***");
			System.out.println("\t0) Salir.");
			
			//Lee la opción seleccionada
			opcion=s.nextInt();
			
			/*
			 * TODO: resto del menú
			 */
			
			//Procesa la opción seleccionada
			switch(opcion) {
			case 0:
				System.out.println("Saliendo de la aplicación...");
				break;
			case 1:
				new Wordle("cachopo");
				break;
			default:
				System.out.println("Introduce un número válido");
			}
		}while(opcion!=0);
		
		//Antes de terminar, se cierra el scanner
		s.close();
	}

	public static void main(String[] args) {
		Main m=new Main();

	}

}
