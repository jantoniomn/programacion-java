package herencia.mamiferos; //Esto es el nombre del paquete

import herencia.Mamifero; //El nombre de la clase que estoy importando

public class Elefante extends Mamifero {
	
	public Elefante(int peso, int altura) {
		super(false, peso, 4, altura); //Mamifero(false); 
					  // Vamos, que no es ovíparo
	}
	
	public void emitirRuido() {
		System.out.println("BRRRRRRRRRR (a esto se llama barritar).");
	}
	
	public void respirar() {
		System.out.println("Uso mis pulmones de 20kg para respirar.");
	}
	
	public void desplazarse(int distancia) {
		System.out.println("Camino una distancia de "+distancia+" dando unas zancadas enormes.");
	}

}
