package arrays;

import java.util.Random;
import utilidades.Debug;

/**
 * Clase envoltorio para arrays de enteros
 * @author guillermogb
 * @version 1.0
 */
public class ArrayEnteros {
	
	/**
	 * Array que sirve de base a la clase
	 */
	private int[] array;
	
	public static final int ORDEN_CRECIENTE=0;
	public static final int ORDEN_DECRECIENTE=1;
	
	/**
	 * Constructor para crear un array
	 * @param tamanio Tamaño que tendrá el array
	 */
	public ArrayEnteros(int tamanio) {
		array=new int[tamanio];
		Debug.depurar("Se ha creado un array");
		inicializarAleatorio(tamanio);
	}
	
	
	
	public void set(int valor, int posicion) {
		if(posicion<array.length && posicion>=0)
			array[posicion]=valor;
		else
			System.err.println("No se puede acceder a la posición "+posicion);
	}
	
	/**
	 * Este método devuelve el contenido de la posición array[posicion]
	 * @param posicion La posición que se consulta
	 * @return El contenido de array[posicion]
	 */
	public int get(int posicion) {
		if(posicion<array.length && posicion>=0)
			return array[posicion];
		else {
			System.err.println("No se puede acceder a la posición "+posicion);
			return -1;
		}
	}
	
	public void incrementar(int posiciones) {
		int[] nuevoArray=new int[array.length+posiciones];
		for(int i=0;i<array.length;i++)
			nuevoArray[i]=array[i];
		array=nuevoArray;
	}
	
	public void voltear() {
		int[] arrayDelReves=new int[array.length];
		for(int i=array.length;i>0;i--) {
			arrayDelReves[i-1]=array[array.length-i];
		}
		array=arrayDelReves;
		Debug.depurar("Se ha volteado el array "+this);
	}
	
	/**
	 * 
	 * @param orden Orden creciente o decreciente de ordenación
	 * (creciente=1, decreciente=0)
	 */
	public void ordenar(int orden) {
		Debug.depurar("Se va a ordenar un array");
		//Comenzamos presuponiendo que el array no está ordenado
		boolean estaOrdenado=false;
		//Mientras no esté ordenado, realizamos pasadas de ordenación
		while(!estaOrdenado) {
			//Cambiamos el valor de estaOrdenado para que, si encuentra valores desordenados, los ordene
			estaOrdenado=true;
			Debug.depurar("Se inicia una vuelta de ordenación");
			for(int i=0;i<array.length-1;i++) {
				//Si se encuentran dos valores desordenados, se ordenan
				if(array[i]>array[i+1]) {
					Debug.depurar("Se ha encontrado un par de valores desordenado ("+array[i]+","+array[i+1]+"]");
					//Se entiende que si llegamos a este punto, el array no está ordenado
					estaOrdenado=false;
					//Se guarda en una variable auxiliar el valor menor
					int auxiliar=array[i+1];
					//Se sobreescribe el valor mayor con el menor
					array[i+1]=array[i];
					//Se sobreescribe el valor mayor (anterior) con el de la variable auxiliar
					array[i]=auxiliar;
				}
			}
		}
		Debug.depurar("Se ha ordenado un array");
		if(orden==1) {
			voltear();
		Debug.depurar("Se ha ordenado un array de manera inversa");
		}
	}

	/**
	 * Este método inicializa el array con números aleatorios
	 * @param valorMaximo Contiene el mayor número que podrá contener el array
	 */
	private void inicializarAleatorio(int valorMaximo) {
		//Se necesita la clase Random para generar valores aleatorios.
		Random r=new Random();
		//Se recorre todo el array
		for(int i=0;i<array.length;i++)
			/*En cada posición (i) se introduce un número entre 1 y valorMaximo.
			El método Math.abs se asegura de que los números son positivos.
			El +1 tras valorMaximo se asegura que los números vayan de 1 al valor máximo, y no 
			de 0 a valorMaximo-1.*/
			array[i]=Math.abs(r.nextInt()%valorMaximo+1);
		Debug.depurar("Se ha inicializado un array con valores aleatorios cuyo máximo es "+valorMaximo);
	}
	
	public String toString() {
		String resultado="{";
		for(int i=0;i<array.length;i++)
			resultado+=array[i]+" ";
		resultado+="}";
		return resultado;
	}
	
}
