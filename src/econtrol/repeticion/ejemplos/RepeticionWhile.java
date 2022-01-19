package econtrol.repeticion.ejemplos;

/*
 * Esta clase implementa algunos ejemplos con
 * estructuras while y do-while.
 */
public class RepeticionWhile {

	/*
	 * Implementación de un bucle infinito con while
	 */
	public static void ejemploWhile01() {
		int n=5; // Declaramos una variable `n` con un valor igual a `5`.
		while(n>3) { // Mientras `n` sea mayor que `3`, ejecutaremos lo que va entre corchetes. Nuevamente, estos corchetes son opcionales si únicamente se va a ejecutar una instrucción.
			System.out.println("3 es siempre menor que 5"); // Esta es la instrucción a ejecutar.
		}
	}

	/*
	 * Bucle while básico, con una instrucción
	 * (n=n-1) para romper el bucle infinito del
	 * ejemplo anterior.
	 */
	public static void ejemploWhile02() {
		int n=5;
		while(n>3) { // Buscamos que esta condición deje de cumplirse en algún momento
			System.out.println("El valor de n es "+n+", ahora vamos a decrementarlo una unidad.");
			n=n-1; // Esta es la instrucción que, con el tiempo, hará que `n` acabe valiendo 3 o menos que 3.
			System.out.println("Ahora, el valor de n es "+n+
					". Lo siguiente que pasará es que el programa "+
					"evaluará si n sigue siendo mayor "+
					"que 3 y, de ser así, volverá a ejecutar el bucle");
		}
		System.out.println("Si hemos llegado aquí, es que n es menor o igual que tres.");
		System.out.println("Efectivamente, n vale ahora "+n);
	}
	
	/*
	 * Implementación de un bucle infinito con do-while
	 */
	public static void ejemploDoWhile01() {
		int m=10; // Se declara una variable
		do { // Se realizan las instrucciones entre corchetes (en este caso, solo una).
			System.out.println("m vale "+m);
		} while(m>=0); // Si, tras ejecutarse las instrucciones entre corchetes, la condición se cumple, se vuelve a ejecutar.
		System.out.println("El bucle ha terminado"); // Aquí ya estamos fuera del bucle.
	}

	/*
	 * Estructura do-while básica.
	 * La instrucción m-- acaba por romper
	 * la condición de ejecución del bucle.
	 */
	public static void ejemploDoWhile02() {
		int m=10;
		do {
			System.out.println("m vale "+m+". Ahora, decrementaremos su valor.");
			m--; // Esto equivale a m=m-1. Es la instrucción que ayudará a romper el bucle.
			System.out.println("Ahora, m vale "+m+". El programa"+
					" comprobará si sigue siendo mayor que 0");
		} while(m>=0);
		System.out.println("Ahora, m vale "+m);
		System.out.println("El bucle ha terminado");
	}
}
