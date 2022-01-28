import java.util.Scanner;

import juegos.wordle.Wordle;
import matrices.ejercicios.Graficax2;
import matrices.listadoAlumnado.ListadoAlumnos;
import utilidades.Debug;

public class Main {
	
	public Main() {
		int opcion=0;
		Scanner s=new Scanner(System.in);
		Debug.apagar();
		do {
			//Imprime el men�
			System.out.println("[Men� de ejecuci�n: seleccione una opci�n]");
			System.out.println("\t1) Wordle.");
			System.out.println("\t2) Gr�fica x^2");
			System.out.println("\t3) Listado de alumnado");
			System.out.println("***");
			System.out.println("\t0) Salir.");
			
			//Lee la opci�n seleccionada
			opcion=s.nextInt();
			
			/*
			 * TODO: resto del men�.
			 */
			
			//Procesa la opci�n seleccionada
			switch(opcion) {
			case 0:
				System.out.println("Saliendo de la aplicaci�n...");
				break;
			case 1: 
				new Wordle("avion");
				break;
			case 2:
				new Graficax2();
				break;
			case 3:
				new ListadoAlumnos();
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
