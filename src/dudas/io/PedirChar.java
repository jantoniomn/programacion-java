package dudas.io;

import java.util.Scanner;

/**
 * �C�mo pido un car�cter por teclado?
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
