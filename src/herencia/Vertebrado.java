package herencia;

public abstract class Vertebrado {
	
	private int peso;
	private int numeroPatas;
	private int altura;
	
	public Vertebrado(int peso, int numeroPatas, int altura) {
		this.peso=peso;
		this.numeroPatas=numeroPatas;
		this.altura=altura;
	}
	
	public void convertirPiedrasEnOro() {
		System.out.println("No soy capaz de convertir piedras en oro");
	}
	
	abstract public void desplazarse(int metros);
		
	abstract public void respirar();
	
	abstract public void emitirRuido();

}
