package econtrol.seleccion;

/*
 * Ejemplos para ilustrar el funcionamiento de
 * la estructura switch.
 */
public class SeleccionConSwitch {
	
	/*
	 * Ejemplo estándar, bien implementado.
	 */
	public static void ejemplo01() {
		int variable=0; // Se inicializa a cero para que tenga algún valor.
		switch(variable) {// Entre paréntesis, la variable o expresión a evaluar.
		case(0):// En caso de que variable==0, se ejecutará el siguiente código.
			System.out.println("La variable vale cero");
			break; // Esta sentencia hace que el flujo de ejecución pase a la línea 17.
		case(1):// En caso de que variable==1, se ejecutará el siguiente código.
			System.out.println("La variable vale 1");
			break;// Esta sentencia hace que el flujo de ejecución pase a la línea 17.
		default:// Esto se ejecuta siempre que no se haya salido del flujo de ejecución a través de un break.
			System.out.println("La variable tiene otro valor");
		}
		//Aquí continuaría la ejecución tras el `switch`.
	}
	
	/*
	 * Ejemplo sin el uso del default.
	 * Su funcionamiento puede parecer confuso.
	 */
	public static void ejemplo02() {
		int var=0;
		switch(var) {
		case(0)://(1) En caso de que variable==0, se ejecutará el siguiente código.
			System.out.println("La variable vale cero");
		case(1)://(2) Como antes no se ha ejecutado ningún `break`, esto continúa ejecutará en cascada, independientemente de que se cumpla la condición o no.
			System.out.println("La variable vale 1 (esto es mentira)");
		default://(3) Y aquí, más de lo mismo.
			System.out.println("La variable tiene otro valor (también es falso)");
		}
		//Aquí continuaría la ejecución tras el `switch`.
	}

}
