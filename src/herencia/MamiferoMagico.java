package herencia;

public class MamiferoMagico extends Mamifero {
	
	public MamiferoMagico() {
		super(false,0,0,0);
	}
	
	public void convertirPiedrasEnOro() {
		System.out.println("Yo s� que puedo convertir piedras en oro.");
	}
	
	public void bailarLaMacarena() {
		System.out.println("El mam�fero m�gico baila la macarena.");
	}

	public void desplazarse(int metros) {
		System.out.println("Me teletransporto "+metros+" metros.");
	}

	public void respirar() {
		System.out.println("En realidad respiro por �smosis.");
	}

	public void emitirRuido() {
		System.out.println("�C�morl?");
	}

}
