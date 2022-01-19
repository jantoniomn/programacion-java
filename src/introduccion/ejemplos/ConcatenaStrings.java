package introduccion.ejemplos;

/*
 * Muestra distintos modos de concatenar cadenas.
 */
public class ConcatenaStrings {
	
	public static void concatenar() {
		int unNumero=7;
		String unaCadena="El n�mero es ";
		String concatenada=unaCadena+unNumero;
		
		System.out.println(concatenada); //Esto imprimir� "El n�mero es 7"
		System.out.println("El n�mero es "+7); //Esto imprimir� lo mismo
		System.out.println("El n�mero "+
							"es "+unNumero); // Y esto
	}

}
