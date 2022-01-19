package econtrol.repeticion.ejemplos;

/*
 * Esta clase implementa algunos ejemplos con
 * estructuras while y do-while.
 */
public class RepeticionWhile {

	/*
	 * Implementaci�n de un bucle infinito con while
	 */
	public static void ejemploWhile01() {
		int n=5; // Declaramos una variable `n` con un valor igual a `5`.
		while(n>3) { // Mientras `n` sea mayor que `3`, ejecutaremos lo que va entre corchetes. Nuevamente, estos corchetes son opcionales si �nicamente se va a ejecutar una instrucci�n.
			System.out.println("3 es siempre menor que 5"); // Esta es la instrucci�n a ejecutar.
		}
	}

	/*
	 * Bucle while b�sico, con una instrucci�n
	 * (n=n-1) para romper el bucle infinito del
	 * ejemplo anterior.
	 */
	public static void ejemploWhile02() {
		int n=5;
		while(n>3) { // Buscamos que esta condici�n deje de cumplirse en alg�n momento
			System.out.println("El valor de n es "+n+", ahora vamos a decrementarlo una unidad.");
			n=n-1; // Esta es la instrucci�n que, con el tiempo, har� que `n` acabe valiendo 3 o menos que 3.
			System.out.println("Ahora, el valor de n es "+n+
					". Lo siguiente que pasar� es que el programa "+
					"evaluar� si n sigue siendo mayor "+
					"que 3 y, de ser as�, volver� a ejecutar el bucle");
		}
		System.out.println("Si hemos llegado aqu�, es que n es menor o igual que tres.");
		System.out.println("Efectivamente, n vale ahora "+n);
	}
	
	/*
	 * Implementaci�n de un bucle infinito con do-while
	 */
	public static void ejemploDoWhile01() {
		int m=10; // Se declara una variable
		do { // Se realizan las instrucciones entre corchetes (en este caso, solo una).
			System.out.println("m vale "+m);
		} while(m>=0); // Si, tras ejecutarse las instrucciones entre corchetes, la condici�n se cumple, se vuelve a ejecutar.
		System.out.println("El bucle ha terminado"); // Aqu� ya estamos fuera del bucle.
	}

	/*
	 * Estructura do-while b�sica.
	 * La instrucci�n m-- acaba por romper
	 * la condici�n de ejecuci�n del bucle.
	 */
	public static void ejemploDoWhile02() {
		int m=10;
		do {
			System.out.println("m vale "+m+". Ahora, decrementaremos su valor.");
			m--; // Esto equivale a m=m-1. Es la instrucci�n que ayudar� a romper el bucle.
			System.out.println("Ahora, m vale "+m+". El programa"+
					" comprobar� si sigue siendo mayor que 0");
		} while(m>=0);
		System.out.println("Ahora, m vale "+m);
		System.out.println("El bucle ha terminado");
	}
}
