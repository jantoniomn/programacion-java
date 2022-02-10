package herencia;

public abstract class Mamifero extends Vertebrado {

	private final boolean esOviparo;
	
	public Mamifero(boolean esOviparo, int peso, int numeroPatas, int altura) {
		super(peso, numeroPatas, altura);
		this.esOviparo=esOviparo;
	}
	
	
	public boolean esOviparo() {
		return esOviparo;
	}
}
