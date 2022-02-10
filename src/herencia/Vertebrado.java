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
	
	abstract public void desplazarse(int metros);
		
	abstract public void respirar();
	
	abstract public void emitirRuido();

}
