package introduccion.ejemplos;

/*
 * Muestra distintos modos de concatenar cadenas.
 */
public class ConcatenaStrings {
	
	public static void concatenar() {
		int unNumero=7;
		String unaCadena="El número es ";
		String concatenada=unaCadena+unNumero;
		
		System.out.println(concatenada); //Esto imprimirá "El número es 7"
		System.out.println("El número es "+7); //Esto imprimirá lo mismo
		System.out.println("El número "+
							"es "+unNumero); // Y esto
	}

}
