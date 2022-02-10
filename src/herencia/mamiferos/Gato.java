package herencia.mamiferos;

import herencia.Mamifero;

public class Gato extends Mamifero {
	
	private String nombre;
	
	public Gato(String nombre, int peso, int altura) {
		super(false,peso,4,altura); //Un gato no es ovíparo
		this.nombre=nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void emitirRuido() {
		System.out.println("Me llamo "+nombre+" y hago Miau.");
	}
	
	public void desplazarse(int cantidad) {
		System.out.println("Me desplazo a lo sigiloso una distancia de "+cantidad);
	}
	
	public void respirar() {
		System.out.println("Respiro con dos pulmones estándar.");
	}

}
