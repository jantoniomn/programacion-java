package econtrol.seleccion;

/*
 * Ejemplos para ilustrar el funcionamiento de
 * la estructura switch.
 */
public class SeleccionConSwitch {
	
	/*
	 * Ejemplo est�ndar, bien implementado.
	 */
	public static void ejemplo01() {
		int variable=0; // Se inicializa a cero para que tenga alg�n valor.
		switch(variable) {// Entre par�ntesis, la variable o expresi�n a evaluar.
		case(0):// En caso de que variable==0, se ejecutar� el siguiente c�digo.
			System.out.println("La variable vale cero");
			break; // Esta sentencia hace que el flujo de ejecuci�n pase a la l�nea 17.
		case(1):// En caso de que variable==1, se ejecutar� el siguiente c�digo.
			System.out.println("La variable vale 1");
			break;// Esta sentencia hace que el flujo de ejecuci�n pase a la l�nea 17.
		default:// Esto se ejecuta siempre que no se haya salido del flujo de ejecuci�n a trav�s de un break.
			System.out.println("La variable tiene otro valor");
		}
		//Aqu� continuar�a la ejecuci�n tras el `switch`.
	}
	
	/*
	 * Ejemplo sin el uso del default.
	 * Su funcionamiento puede parecer confuso.
	 */
	public static void ejemplo02() {
		int var=0;
		switch(var) {
		case(0)://(1) En caso de que variable==0, se ejecutar� el siguiente c�digo.
			System.out.println("La variable vale cero");
		case(1)://(2) Como antes no se ha ejecutado ning�n `break`, esto contin�a ejecutar� en cascada, independientemente de que se cumpla la condici�n o no.
			System.out.println("La variable vale 1 (esto es mentira)");
		default://(3) Y aqu�, m�s de lo mismo.
			System.out.println("La variable tiene otro valor (tambi�n es falso)");
		}
		//Aqu� continuar�a la ejecuci�n tras el `switch`.
	}

}
