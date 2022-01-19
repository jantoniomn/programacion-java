package econtrol.repeticion.ejercicios;

/*
 * Implementaci�n de las actividades propuestas
 */
public class EjerciciosPropuestos02001 {
	
	/*
	 * Volteando cadenas
	 * 
	 * Utilizando un bucle for, realiza una aplicaci�n
	 * que imprima una cadena de caracteres en vertical. 
	 * Por ejemplo, la cadena Hola, Mundo, deber�a
	 * mostrarse como sigue:
	 * 
	 * H
	 * o
	 * l
	 * a
	 * 
	 * M
	 * u
	 * n
	 * d
	 * o
	 * 
	 */
	public static void volteaCadena() {
		String cadena="Hola, Mundo"; // Cadena a voltear.
		for(int i=0;i<cadena.length();i++) // Recorrido de la cadena.
			System.out.println(cadena.charAt(i)); // Imprimir caracter+salto de l�nea.
	}

}
