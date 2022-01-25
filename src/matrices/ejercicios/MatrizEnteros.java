package matrices.ejercicios;

import java.util.Random;

public class MatrizEnteros {
	
	private int[][] matriz;

	public MatrizEnteros(int x, int y) throws Exception {
		if(x<=0 || y<=0)
			throw new Exception("No se pueden crear matrices con dimensiones menores o iguales a cero.");
		matriz=new int[x][y];
	}
	
	public MatrizEnteros(int[][] unaMatriz) {
		this.matriz=unaMatriz;
	}
	
	public void inicializarAleatorio(int valorMaximo) {
		Random r=new Random();
		for(int i=0;i<getNumeroFilas();i++)
			for(int j=0;j<getNumeroColumnas();j++) {
				matriz[i][j]=r.nextInt()%valorMaximo+1;
			}
	}
	
	public MatrizEnteros sumar(MatrizEnteros matrizB) throws Exception {
		if(!coincidenDimensiones(this,matrizB))
			throw new Exception("No pueden sumarse matrices de dimensiones distintas");
		int numeroFilas=matrizB.getNumeroFilas();
		int numeroColumnas=matrizB.getNumeroColumnas();
		int[][] resultadoArray = new int[numeroFilas][numeroColumnas];
		for(int i=0;i<numeroFilas;i++)
			for(int j=0;j<numeroColumnas;j++) 
				resultadoArray[i][j]=matrizB.get(i, j)+this.get(i,j);
		MatrizEnteros resultado=new MatrizEnteros(resultadoArray);
		return resultado;
	}
	
	/* TO-DO
	public MatrizEnteros multiplicar(MatrizEnteros matrizB) {
	}*/
	
	public boolean coincidenDimensiones(MatrizEnteros matrizA, MatrizEnteros matrizB) {
		if(matrizB.getNumeroColumnas()!=matrizA.getNumeroColumnas() || matrizB.getNumeroFilas()!=matrizA.getNumeroFilas())
			return false;
		else
			return true;
	}
	
	public int get(int i, int j) {
		return matriz[i][j];
	}
	
	public void set(int i, int j, int valor) {
		matriz[i][j]=valor;
	}
	
	public int getNumeroFilas() {
		return matriz.length;
	}
	
	/**
	 * 
	 * @return Devuelve el número de columnas de la matriz
	 * o -1 en caso de error.
	 */
	public int getNumeroColumnas() {
		try {
			return matriz[0].length;
		} catch(Exception e) {
			System.err.println("Error al acceder a la posición 0 de la matriz");
			e.printStackTrace();
		}
		return -1;
	}
	
	/**
	 * Ejemplo para probar distintas formas de invocar toString
	 * @throws Exception
	 */
	public void ejemploToString() throws Exception {
		MatrizEnteros matriz1=new MatrizEnteros(3,3);
		MatrizEnteros matriz2=new MatrizEnteros(3,3);
		
		matriz1.inicializarAleatorio(10);
		matriz2.inicializarAleatorio(10);
		
		String variable=matriz1.toString();
		
		System.out.println(variable);
		System.out.println(matriz2.toString());
		System.out.println(matriz2);
	}
	
	public String toString() {
		String resultado="";
		for(int i=0;i<getNumeroFilas();i++) {
			for(int j=0;j<getNumeroColumnas();j++) {
				resultado+=matriz[i][j]+" ";
			} resultado+="\n";
		}
		return resultado;
	}

}
