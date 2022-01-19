package juegos.wordle;

import java.util.Scanner;

public class Wordle {
	
	private String secreto;
	
	public Wordle(String secreto) {
		this.secreto=secreto.toUpperCase();
		int contador=0;
		while(contador<secreto.length()) {
			contador++;
			System.out.println("** Intento "+contador+" de "+secreto.length());
			Palabra conjetura=pedirConjetura();
			comprobarConjetura(conjetura);
			System.out.println(conjetura);
			if(esCorrecta(conjetura)) {
				System.out.println("Has ganado la partida en el intento "+contador+" de "+secreto.length());
				break;
			}
			if(!esCorrecta(conjetura)&&contador>=secreto.length())
				System.out.println("Has perdido la partida.");
		}
		System.out.println("La palabra secreta era "+secreto+".");
	}
	
	public Palabra pedirConjetura() {
		String palabra;
		Palabra p;
		do {
			System.out.println("Introduce una palabra de "+secreto.length()+" letras:");
			Scanner s=new Scanner(System.in);
			palabra=s.nextLine().toUpperCase();
			p=new Palabra(palabra);		
		} while(palabra.length()!=secreto.length());
		return p;
	}
	
	public void comprobarConjetura(Palabra conjetura) {
		for(int i=0;i<secreto.length();i++) {
			estaEnPosicion(conjetura, i);
			contiene(conjetura, secreto.charAt(i));
		}
	}
		
	public void estaEnPosicion(Palabra conjetura, int posicion) {
		if(conjetura.getLetraAt(posicion).getCaracter()==secreto.charAt(posicion))
			conjetura.getLetraAt(posicion).setPosicionCorrecta(true);
		else
			conjetura.getLetraAt(posicion).setPosicionCorrecta(false);
	}
	
	public void contiene(Palabra conjetura, char c) {
		for(int i=0;i<conjetura.length();i++)
			if(conjetura.getLetraAt(i).getCaracter()==c)
				conjetura.getLetraAt(i).setExiste(true);
			else
				conjetura.getLetraAt(i).setExiste(false);
	}
	
	public boolean esCorrecta(Palabra conjetura) {
		for(int i=0;i<conjetura.length();i++)
			if(conjetura.getLetraAt(i).getCaracter()!=secreto.charAt(i))
				return false;
		return true;
	}

}
