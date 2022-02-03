package matrices.ejercicios;

import java.util.Scanner;

/**
 * Ejercicios de diversa dificultad con matrices y arrays
 * 
 * @author Guillermo González-Benito (@ehguille)
 * @tags #matrices #arrays
 */
public class EjerciciosVariopintos {

	public EjerciciosVariopintos() {
		mostrarMenu();
	}
	
	public void mostrarMenu() {
		int opcion=0;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("[Seleccione una opción]\n"
					+ "\t1)	Ejercicio 1: moda\n"
					+ "\t2)	Ejercicio 2: máximo\n"
					+ "\t3)	Ejercicio 3: tabla de multiplicar\n"
					+ "\t4)	Ejercicio 4: cadena a mayúsculas\n"
					+ "\t5)	Ejercicio 5: cambiar filas\n"
					+ "***\n"
					+ "\t0)	Salir\n"
					+ "");	
			opcion=s.nextInt();
			switch(opcion) {
			case 1:
				int array[]= {3,4,4,5,5,5,6,7,1,4,9,0};
				ejercicio1(array);
				break;
			case 2:
				System.out.println(ejercicio2());
				break;
			case 3:
				System.out.println(toString(ejercicio3(2)));
				break;
			case 4:
				System.out.println(toString(ejercicio4("Ejercicio para principiantes")));
				break;
			case 5:
				int[][] matriz= { {1,3,5}, {2,4}, {0,9,8} };
				System.out.println(toStringLinear(ejercicio5(matriz)));
				break;
			case 0:
				System.out.println("Saliendo de la aplicación...");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while(opcion!=0);

	}
	
	/***
	 * Recibe un array de enteros y muestra por pantalla
	 * la moda de todos ellos (es decir: el valor que más veces aparece).
	 * @param array Valores sobre los que calcular la moda.
	 */
	public void ejercicio1(int[] array) {
		int numeroRepeticiones = 0;
		int moda = 0;
		for(int i=0; i<array.length; i++){
			int ocurrencias = 0;
			for(int j=0; j<array.length; j++){
				if(array[i] == array[j])
					ocurrencias++;
			}
			if(ocurrencias > numeroRepeticiones){
				moda = array[i];
				numeroRepeticiones = ocurrencias;
			}
		}
		System.out.println("La moda es "+moda+", que aparece "+numeroRepeticiones+" veces.");
	}

	/***
	 * Crea la siguiente matriz e imprime por pantalla
	 * el mayor número contenido en ella.
	 * 
	 * { {1,3,5}, {2,4}, {0,9,8} }
	 * 
	 * @return Cadena del tipo "El mayor número es 9".
	 */
	public String ejercicio2(){
		int[][] matriz= { {1,3,5}, {2,4}, {0,9,8} };
		int maximo=Integer.MIN_VALUE;
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				if(matriz[i][j]>maximo)
					maximo=matriz[i][j];
		return "El mayor número es "+maximo+".";
	}

	/***
	 * Retorna en una matriz de tamaño [10][3] la
	 * tabla de multiplicar del número pasado por
	 * parámetro.
	 * 
	 * @param numero Cuyos 10 primeros números de su
	 * tabla de multiplicar hay que calcular.
	 * @return Tabla de multiplicar con el siguiente
	 * formato:
	 * 
	 * [numero][multiplicador][resultado]
	 * 
	 * [2][1][2]
	 * [2][2][4]
	 * [2][3][6]
	 * [2][4][8]
	 * [2][5][10]
	 * [2][6][12]
	 * [2][7][14]
	 * [2][8][16]
	 * [2][9][18]
	 * [2][10][20]
	 */
	public int[][] ejercicio3(int numero){
		int tabla[][]=new int[10][3];
		for(int i=0;i<tabla.length;i++){
				tabla[i][0]=numero;
				tabla[i][1]=i+1;
				tabla[i][2]=(i+1)*numero;
		}
		return tabla;		
	}
	
	/***
	 * Recibe una cadena (en mayúsculas, minúsculas o con espacios)
	 * y devuelve un array de caracteres con los caracteres de la cadena
	 * convertidos en mayúscula.
	 * 
	 * Ayuda: Character.toUpperCase('x') devuelve 'X'.
	 * @param parametro Cadena a convertir
	 * @return Array con el resultado
	 */
	public char[] ejercicio4(String parametro){
		char[] resultado=new char[parametro.length()];
		for(int i=0;i<resultado.length;i++)
			resultado[i]=Character.toUpperCase(parametro.charAt(i));
		return resultado;
	}
	
	
	/**
	 * Recibe un array bidimensional e invierte el orden de sus filas
	 * (solo de sus filas)
	 * @param matriz Matriz a invertir
	 * @return Matriz invertida
	 */
	public int[][] ejercicio5(int[][] matriz){
		int[][] resultado=new int[matriz.length][matriz[0].length];
		for(int i=0;i<matriz.length;i++)
			resultado[i]=matriz[matriz.length-i-1];
		return resultado;
	}

	
	/***
	 * Devuelve la matriz pasada como parámetro
	 * formateada como un String
	 * @param array Matriz a convertir
	 * @return Matriz en formato String
	 */
	public String toString(int[][] array) {
		String resultado="";
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				resultado+=array[i][j]+" ";
			} resultado+="\n";		
		} 		
		return resultado;
	}
	
	/***
	 * Devuelve la matriz pasada como parámetro
	 * formateada al estilo { {...},...}
	 * @param array Matriz a convertir
	 * @return Matriz en formato String
	 */
	public String toStringLinear(int[][] array) {
		String resultado="{";
		for(int i=0;i<array.length-1;i++) {
			resultado+="{";
			for(int j=0;j<array[i].length-1;j++) {
				resultado+=array[i][j]+",";
			}	resultado+=array[i][array[i].length-1];
			resultado+="},";		
		}	
		resultado+="{";
		for(int j=0;j<array.length-1;j++) {
			resultado+=array[array.length-1][j]+",";
		}   resultado+=array[array.length-1][array[array.length-1].length-1];
		resultado+="}}";
		return resultado;
	}
	
	/***
	 * Devuelve el array pasado como parámetro
	 * formateado como un String
	 * @param array array a convertir
	 * @return array en formato String
	 */
	public String toString(char[] array) {
		String resultado="";
		for(int i=0;i<array.length;i++)
			resultado+="["+array[i]+"] ";
		return resultado;
	}
}
