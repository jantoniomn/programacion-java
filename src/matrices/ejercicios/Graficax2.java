package matrices.ejercicios;

/**
 * Matriz de caracteres de 100x100 que dibuja la gráfica
 * x=x^2 para x>=0 (cada punto se representará con un *)
 * @author guillermogb
 *
 */
public class Graficax2 {
	
	private char[][] lienzo;
	private final int SIZE=40;
	
	public Graficax2() {
		lienzo = new char[SIZE][SIZE];
		rellenarLienzo();
		System.out.println(this);
	}
	
	public void rellenarLienzo() {
		for(int i=0;i<lienzo.length;i++)
			for(int j=0;j<lienzo[i].length;j++)
				if(i==Math.pow(j, 2)) // Equivale a j*j
					lienzo[lienzo.length-1-i][j]='*';
	}
	
}
