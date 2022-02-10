package herencia.mamiferos;

import herencia.Mamifero;

public class Ornitorrinco extends Mamifero {
	
	public Ornitorrinco(int peso, int altura) {
		super(true, peso, 4, altura);//S� es ov�paro
	}
	
	public void emitirRuido() {
		System.out.println("�Qu� ruido hace un ornitorrinco?");
	}
	
	public void desplazarse(int distancia) {
		System.out.println("Voy con un contoneo sexy a lo largo de una distancia de "+distancia);
	}
	
	public void respirar() {
		System.out.println("Respiro con mis minipulmones");
	}

}
