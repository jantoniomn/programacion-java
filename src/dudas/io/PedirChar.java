package dudas.io;

import java.util.Scanner;

/**
 * ¿Cómo pido un carácter por teclado?
 * @author guillermogb
 *
 */
public class PedirChar {
	
	private Scanner s;
	private char unCaracter;
	
	public PedirChar() {
		String cadena;
		cadena=s.nextLine();
		unCaracter=cadena.charAt(0);
		//Igual que unCaracter=s.nextLine().charAt(0);
	}

}
