package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicios obtenidos de https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-matrices-de-java/
 */
public class EjerciciosMatrices {
		
	public EjerciciosMatrices(){
		int opcion=0;
		do {
			//Mostrar menú
			System.out.println("Escoja una opción:");
			System.out.println("\t1) Ejercicio 1 (crear matriz 3x3)");
			System.out.println("\t2) Ejercicio 2 (crear matriz 5xn con números aleatorios)");
			System.out.println("\t3) Ejercicio 3 (suma de matrices)");
			System.out.println("\t4) Ejercicio 4 (operaciones con matrices)");
			System.out.println("\t5) Ejercicio 5 (Pokemon)");
			System.out.println("\t6) Ejercicio 6 (Matriz sin números repetidos)");
			System.out.println("\t7) Ejercicio 7 (Sumas aleatorias)");
			System.out.println("\t0) Salir");
			
			//Elegir opción
			Scanner s=new Scanner(System.in);
			opcion=s.nextInt();
			switch(opcion) {
			case 1:
				ejercicio1();
				break;
			case 2:
				ejercicio2();
				break;
			case 3:
				ejercicio3();
				break;
			case 4:
				ejercicio4();
				break;
			case 5:
				System.out.println("En otro momento");
				break;
			case 6:
				ejercicio6();
				break;
			case 7:
				System.out.println("En otro momento");
				break;
			case 8:
				//ejercicio8();
				break;
			}
		} while(opcion!=0);
	}

	/**
	 *  Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz.
	 */
	public void ejercicio1() {
		int[][] matriz= {{1,2,3},{4,5,6},{7,8,9}};
		imprimirMatriz(matriz);
	}
	
	public void ejercicio6() {
		int numeroFilas=3;
		int numeroColumnas=3;
		int[][] matriz=new int[numeroFilas][numeroColumnas];
		int numerito;
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[0].length;j++) {
				do {
					numerito=getRandom(0,numeroFilas*numeroColumnas);
				}
				while(contiene(matriz,numerito));
				matriz[i][j]=numerito;
			} 
		imprimirMatriz(matriz);
	}
				
	public boolean contiene(int[][] matriz, int numero) {
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				if(matriz[i][j]==numero)
					return true;
		return false;
	}
	
	/**
	 * Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números aleatorios entre 0 y 10.
	 */
	public void ejercicio2() {
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca el número de columnas de la matriz.");
		int numeroColumnas=s.nextInt();
		
		int[][] matriz = new int[5][numeroColumnas];
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=getRandom(0,10);
			}
		}
		imprimirMatriz(matriz);
	}
	
	/**
	Crear dos matrices de nxn y sumar sus valores, 
	los resultados se deben almacenar en otra matriz.
	Los valores y la longitud, seran insertados por el usuario.
	Mostrar las matrices originales y el resultado.
	 */
	public void ejercicio3() {
		//Se pide la dimensión de la matriz
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca la dimensión de la matriz:");
		int dimension=s.nextInt();

		//Se crean las dos matrices iniciales
		int[][] matriz1=new int[dimension][dimension];
		int[][] matriz2=new int[dimension][dimension];
		
		//Se piden al usuario los valores de la primera matriz
		System.out.println("Cumplimente la primera matriz:");
		for(int i=0;i<dimension;i++)
			for(int j=0;j<dimension;j++) {
				//Se introducen los valores de la primera matriz
				System.out.print("\tIntroduzca el valor para la columna ("+i+j+")");
				matriz1[i][j]=s.nextInt();
				System.out.println();
			}
		
		//Se piden al usuario los valores de la segunda matriz
		System.out.println("Cumplimente la segunda matriz");
		for(int i=0;i<dimension;i++)
			for(int j=0;j<dimension;j++) {
				//Se introducen los valores de la segunda matriz
				System.out.print("\tIntroduzca el valor para la columna ("+i+j+")");
				matriz2[i][j]=s.nextInt();
				System.out.println();
			}
		
		//Se muestran las dos matrices originales
		System.out.println("Mostrando la primera matriz:");
		imprimirMatriz(matriz1);
		System.out.println("Mostrando la segunda matriz:");
		imprimirMatriz(matriz2);
		
		//Se calcula la suma de las matrices y se muestra por pantalla.
		int[][] matrizResultado=new int[dimension][dimension];
		for(int i=0;i<dimension;i++)
			for(int j=0;j<dimension;j++) 
				matrizResultado[i][j]=matriz1[i][j]+matriz2[i][j];
		System.out.println("Mostrando la matriz suma:");
		imprimirMatriz(matrizResultado);

		
	}
	
	/**
	 * 4) Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos piden hacer un menú con estas opciones:
		Rellenar TODA la matriz de números, debes pedírselo al usuario.
		Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
		Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
		Sumar la diagonal principal (ver ejemplo)
		Sumar la diagonal inversa (ver ejemplo)
		La media de todos los valores de la matriz
		IMPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de ejecutar, simplemente mostrar un mensaje donde diga que debes rellenar la matriz.
	 */
	public void ejercicio4() {
		int[][] matriz=new int[4][4];
		int opcion=0;
		boolean estaRellenada=false;
		do {
			System.out.println("Escoge una opción:");
			System.out.println("1) Rellenar matriz");
			System.out.println("2) Sumar una fila:");
			System.out.println("3) Sumar una columna:");
			System.out.println("4) Sumar la diagonal principal:");
			System.out.println("5) Sumar la diagonal inversa:");
			System.out.println("6) Media de todos los valores:");
			System.out.println("0) Volver atrás:");
			System.out.println("Escoge una opción:");
			Scanner s=new Scanner(System.in);
			opcion=s.nextInt();
			
			switch(opcion) {
			case 1:
				estaRellenada=rellenarMatriz(matriz);
				imprimirMatriz(matriz);
				break;
			case 2:
				if(estaRellenada)
					System.out.println("Suma de la fila="+sumarFila(matriz));
				break;
			case 3:
				if(estaRellenada)
					System.out.println("Suma de la columna="+sumarColumna(matriz));
				break;
			case 4:
				if(estaRellenada)
					System.out.println("Suma de la diagonal principal="+sumarDiagonalPrincipal(matriz));
				break;
			case 5:
				if(estaRellenada)
					System.out.println("Suma de la diagonal inversa="+sumarDiagonalInversa(matriz));
				break;
			case 6:
				if(estaRellenada) 
					System.out.println("Media de los valores="+media(matriz));
				break;
			default:
				System.out.println("Debes rellenar la matriz con anterioridad.");
			}
		} while(opcion!=0);
	}
	
	public boolean rellenarMatriz(int[][] matriz) {
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=getRandom(0,9);
		return true;
	}
	
	public int sumarDiagonalPrincipal(int[][] matriz) {
		int resultado=0;
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				if(i==j)
					resultado+=matriz[i][j];
		return resultado;
	}
	
	public int sumarDiagonalInversa(int[][] matriz) {
		int resultado=0;
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				if(i+j==matriz.length-1)
					resultado+=matriz[i][j];
		return resultado;
	}
	
	public int media(int[][] matriz) {
		int sumatorio=0;
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[0].length;j++)
				sumatorio+=matriz[i][j];
		return sumatorio/(matriz.length*matriz[0].length);
	}
	
	public int sumarFila(int[][] matriz) {
		Scanner s=new Scanner(System.in);
		int fila;
		do {
			System.out.println("Introduzca una fila entre 0 y "+(matriz.length-1));
			fila=s.nextInt();
		} while(fila<0||fila>matriz.length-1);
		int resultado=0;
		for(int j=0;j<matriz[fila].length;j++)
			resultado+=matriz[fila][j];
		return resultado;
	}
	
	
	public int sumarColumna(int[][] matriz) {
		Scanner s=new Scanner(System.in);
		int columna;
		do {
			System.out.println("Introduzca una columna entre 0 y "+(matriz[0].length-1));
			columna=s.nextInt();
		} while(columna<0||columna>matriz.length-1);
		int resultado=0;
		for(int i=0;i<matriz.length;i++)
			resultado+=matriz[i][columna];
		return resultado;
	}
	
	public void imprimirMatriz(int[][] matriz) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public int getRandom(int minimo, int maximo) {
		return minimo+new Random().nextInt(maximo+1);
	}
	
}
