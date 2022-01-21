package juegos.wordle;

public class Palabra {
	
	private Letra[] palabra;
	
	public Palabra(String palabra) {
		this.palabra=new Letra[palabra.length()];
		for(int i=0;i<palabra.length();i++)
			this.palabra[i]=new Letra(palabra.charAt(i));
	}
	
	public Letra getLetraAt(int i) {
		return palabra[i];
	}
	
	public int length() {
		return palabra.length;
	}
	
	public String toString() {
		String resultado="";
		for(int i=0;i<palabra.length;i++)
			resultado+=palabra[i].getCaracter();
		resultado+="\n";
		for(int i=0;i<palabra.length;i++)
			if(palabra[i].posicionCorrecta())
				resultado+="¡";
			else if (palabra[i].existe())
				resultado+="^";
			else
				resultado+=" ";
		return resultado;
	}

}
