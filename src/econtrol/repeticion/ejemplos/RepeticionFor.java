package econtrol.repeticion.ejemplos;

/*
 * Ejemplos b�sicos con el bucle for
 */
public class RepeticionFor {

	/*
	 * Bucle que se ejecuta 10 veces
	 */
	public static void ejemploFor01() {
		/*
		 * Descripci�n de cada una de las partes del bucle:
		 * 
		 * int i=0; // Este es el punto de partida. Se declara una variable i y se le asigna el valor 0. Solo se ejecutar� al inicio del bucle.
		 * i<10; // Esta es la condici�n de ejecuci�n. Mientras se cumpla, se ejecutar� el contenido entre corchetes.
		 * i++; // Esta instrucci�n se ejecuta despu�s de cada paso (iteraci�n) por el bucle. En este caso, se incrementa el valor de i una vez finalizado el contenido entre corchetes.
		 */
		for(int i=0/*(1)*/;i<10/*(2)*/;i++/*(3)*/) {
			System.out.println("El valor de i es "+i);
		}

	}

	/*
	 * Bucles anidados.
	 * 
	 * Cada uno de ellos se ejecuta 10 veces.
	 * Al estar uno anidado en el otro, el m�s
	 * interno se ejecutar� 100 veces (10 por s�
	 * solo multiplicado por las 10 veces que se
	 * ejecutar� el bucle externo).
	 * 
	 * En definitiva, imprimir� la siguiente figura:
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
		int n=10; //Dimensi�n de la matriz a imprimir
		for(int i=0;i<n;i++) { // Ejecutado n veces, uno por cada fila.
		    for(int j=0;j<n;j++) // Este bucle se ejecutar� n veces cada vez que se ejecute el bucle anterior, as� que se ejecutar� n*n veces.
		        System.out.print(0); // Esto imprime un 0 en cada una de las posiciones de la matriz.
		    System.out.println(""); // Esto imprime un salto de l�nea al finalizar una fila. Observa que solo se ejecutar� n veces, ya que est� dentro del primer bucle, no del segundo.
		}	
	}

}
