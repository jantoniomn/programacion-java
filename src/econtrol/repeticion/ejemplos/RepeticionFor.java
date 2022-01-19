package econtrol.repeticion.ejemplos;

/*
 * Ejemplos básicos con el bucle for
 */
public class RepeticionFor {

	/*
	 * Bucle que se ejecuta 10 veces
	 */
	public static void ejemploFor01() {
		/*
		 * Descripción de cada una de las partes del bucle:
		 * 
		 * int i=0; // Este es el punto de partida. Se declara una variable i y se le asigna el valor 0. Solo se ejecutará al inicio del bucle.
		 * i<10; // Esta es la condición de ejecución. Mientras se cumpla, se ejecutará el contenido entre corchetes.
		 * i++; // Esta instrucción se ejecuta después de cada paso (iteración) por el bucle. En este caso, se incrementa el valor de i una vez finalizado el contenido entre corchetes.
		 */
		for(int i=0/*(1)*/;i<10/*(2)*/;i++/*(3)*/) {
			System.out.println("El valor de i es "+i);
		}

	}

	/*
	 * Bucles anidados.
	 * 
	 * Cada uno de ellos se ejecuta 10 veces.
	 * Al estar uno anidado en el otro, el más
	 * interno se ejecutará 100 veces (10 por sí
	 * solo multiplicado por las 10 veces que se
	 * ejecutará el bucle externo).
	 * 
	 * En definitiva, imprimirá la siguiente figura:
	 * 
	 * 	0000000000
	 *	0000000000
	 *	0000000000
	 *	0000000000
	 *	0000000000
	 *	0000000000
	 *	0000000000
	 *	0000000000
	 *	0000000000
	 *	0000000000
	 */
	public static void ejemploFor02(){
		int n=10; //Dimensión de la matriz a imprimir
		for(int i=0;i<n;i++) { // Ejecutado n veces, uno por cada fila.
		    for(int j=0;j<n;j++) // Este bucle se ejecutará n veces cada vez que se ejecute el bucle anterior, así que se ejecutará n*n veces.
		        System.out.print(0); // Esto imprime un 0 en cada una de las posiciones de la matriz.
		    System.out.println(""); // Esto imprime un salto de línea al finalizar una fila. Observa que solo se ejecutará n veces, ya que está dentro del primer bucle, no del segundo.
		}	
	}

}
