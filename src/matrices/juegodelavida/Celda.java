package matrices.juegodelavida;

public class Celda {
	
	private boolean tieneVida;
	private int numeroVecinos;
	private int x, y;
	private Tablero t;
	
	public Celda(boolean tieneVida, int x, int y, Tablero t) {
		numeroVecinos=0;
		this.tieneVida=tieneVida;
		this.x=x;
		this.y=y;
		this.t=t;
	}
	
	public boolean getEstado() {
		return tieneVida;
	}
	
	public int getNumeroVecinos() {
		if(tieneVecinoSuperiorIzquierdo()) numeroVecinos++;
		if(tieneVecinoSuperiorCentral()) numeroVecinos++;
		if(tieneVecinoSuperiorDerecho()) numeroVecinos++;
		if(tieneVecinoCentralIzquierdo()) numeroVecinos++;
		if(tieneVecinoCentralDerecho()) numeroVecinos++;
		if(tieneVecinoInferiorIzquierdo()) numeroVecinos++;
		if(tieneVecinoInferiorCentral()) numeroVecinos++;
		if(tieneVecinoInferiorDerecho()) numeroVecinos++;
		return numeroVecinos;
	}

	
	public boolean tieneVecinoSuperiorIzquierdo() {
		if(x==0 || y==0 )
			return false;
		else
			return t.getEstadoCelda(x-1,y-1);
	}
	
	public boolean tieneVecinoSuperiorCentral() {
		if(x==0)
			return false;
		else
			return t.getEstadoCelda(x-1, y);
	}
	
	public boolean tieneVecinoSuperiorDerecho() {
		if(x==0 || y==t.getDimension()-1)
			return false;
		else
			return t.getEstadoCelda(x-1,y+1);
	}
	
	public boolean tieneVecinoCentralIzquierdo() {
		if(y==0)
			return false;
		else
			return t.getEstadoCelda(x, y-1);
	}
	
	public boolean tieneVecinoCentralDerecho() {
		if(y==t.getDimension()-1)
			return false;
		else
			return t.getEstadoCelda(x, y+1);
	}
	
	public boolean tieneVecinoInferiorIzquierdo() {
		if(x==t.getDimension()-1||y==0)
			return false;
		else
			return t.getEstadoCelda(x+1, y-1);
	}
	
	public boolean tieneVecinoInferiorCentral() {
		if(x==t.getDimension()-1)
			return false;
		else
			return t.getEstadoCelda(x+1, y);
	}
	
	public boolean tieneVecinoInferiorDerecho() {
		if(x==t.getDimension()-1 || y==t.getDimension()-1)
			return false;
		else
			return t.getEstadoCelda(x+1, y+1);
	}
	
	public String toString() {
		if(tieneVida) return "O";
		else return " ";
	}

}
