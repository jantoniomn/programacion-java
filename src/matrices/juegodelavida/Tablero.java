package matrices.juegodelavida;

import java.util.Random;

import utilidades.Debug;

public class Tablero {

	private Celda[][] tablero;
	private Celda[][] tableroEvolucionado;
	private int dimension;
	
	public Tablero(int dimension, int porcentaje) {
		tablero=new Celda[dimension][dimension];
		tableroEvolucionado=new Celda[dimension][dimension];
		this.dimension=dimension;
		Debug.depurar("Acabo de crear un tablero");
		rellenar(porcentaje);
	}
	
	public int getDimension() {
		return dimension;
	}
	
	public void evolucionar() {
		for(int i=0;i<dimension;i++)
			for(int j=0;j<dimension;j++)  {
				if(tablero[i][j].getEstado()) {
					if(tablero[i][j].getNumeroVecinos()==2||tablero[i][j].getNumeroVecinos()==3)
						tableroEvolucionado[i][j]=new Celda(true, i, j,this);
					else
						tableroEvolucionado[i][j]=new Celda(false, i, j,this);
				}
				else {
					if(tablero[i][j].getNumeroVecinos()==3)
						tableroEvolucionado[i][j]=new Celda(true, i, j,this);
					else
						tableroEvolucionado[i][j]=new Celda(false, i, j,this);
				}
			}
		tablero=tableroEvolucionado;
	}
	
	private void rellenar(int porcentaje) {
		Random r=new Random();
		for(int i=0;i<tablero.length;i++)
			for(int j=0;j<tablero[0].length;j++) {
				int probabilidad=Math.abs(r.nextInt()%100);
				Debug.depurar("Probabilidad obtenida: "+probabilidad);
				if(probabilidad<porcentaje) {
					tablero[i][j]=new Celda(true,i,j,this);
					Debug.depurar("Acabo de crear una célula viva");
				}
				else {
					tablero[i][j]=new Celda(false,i,j,this);
					Debug.depurar("Acabo de crear una célula muerta");
				}
			}			
	}
	
	public String toString() {
		Debug.depurar("Estoy imprimiendo un tablero");
		String resultado="";
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[0].length;j++) {
				Debug.depurar("Estoy imprimiendo una celda");
				resultado+=tablero[i][j].toString();
			} resultado+="\n";
		}
		resultado+="-----------------\n";
		return resultado;
	}
	
	public boolean getEstadoCelda(int x, int y) {
		return tablero[x][y].getEstado();
	}
	
	public boolean esApocalipsis() {
		boolean esApocalipsis=true;
		for(int i=0;i<tablero.length;i++)
			for(int j=0;j<tablero[0].length;j++)
				if(tablero[i][j].getEstado()==true)
					esApocalipsis=false;
		return esApocalipsis;
	}

}
