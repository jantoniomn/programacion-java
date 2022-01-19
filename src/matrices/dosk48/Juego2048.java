package matrices.dosk48;

import java.util.Random;

public class Juego2048 {
	
	private int[][] tablero;
	
	public Juego2048() {
		tablero=new int[4][4];
		inicializar();
		System.out.println(this);
		moverDerecha();
		
	}
	
	public void moverDerecha() {
		System.out.println("Empiezan los movimientos");
		boolean haSidoModificado=true;
		while(haSidoModificado) {
			for(int i=0;i<tablero.length;i++) {
				for(int j=tablero[0].length-1/*2*/;j>0;j--) {
					if(tablero[i][j]==0) { //POSICION=0
						tablero[i][j]=tablero[i][j-1]+tablero[i][j];
						System.out.println("Se ha encontrado un cero, i y j valen "+i+" "+j);
					} //POSICIONES IGUALES (SUMAR)
					else if(tablero[i][j]==tablero[i][j-1]) {
						tablero[i][j]=tablero[i][j]+tablero[i][j-1]; 
						System.out.println("Se han encontrado dos posiciones iguales, i y j valen "+i+" "+j);
					}
					else if(tablero[i][j]!=0&&tablero[i][j]!=tablero[i][j-1]) { //POSICION!=0
						System.out.println("CONDICION NUEVA (i,j) "+i+" "+j);
					}
					else if(tablero[i][j-1]!=0&&tablero[i][j]!=tablero[i][j-1])
					haSidoModificado=false;
					tablero[i][j-1]=0;
				}
			}
			System.out.println(this);
		}
	}
		
	public void inicializar() {
		Random r=new Random();
		int coordenadax=Math.abs(r.nextInt()%tablero.length);
		int coordenaday=Math.abs(r.nextInt()%tablero[0].length);
		int coordenadax2;
		int coordenaday2;
		tablero[coordenadax][coordenaday]=2;
		do{
			coordenadax2=Math.abs(r.nextInt()%tablero.length);
			coordenaday2=Math.abs(r.nextInt()%tablero[0].length);
			tablero[coordenadax2][coordenaday2]=2;
		} while(coordenadax==coordenadax2&&coordenaday==coordenaday2);
	}
	
	public String toString() {
		String resultado="";
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				resultado+=tablero[i][j]+" ";
			}
			resultado+="\n";
		}		
		return resultado;
	}	

}