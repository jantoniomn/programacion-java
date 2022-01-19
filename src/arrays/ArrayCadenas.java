package arrays;
import java.util.Scanner;

public class ArrayCadenas {
	
	private String[] array;
	
	public ArrayCadenas(int tamanio) {
		array=new String[tamanio];
	}
	
	public void ordenar() {
		boolean estaOrdenado=false;
		while(!estaOrdenado) {
			estaOrdenado=true;
			for(int i=0;i<array.length-1;i++) {
				if(array[i].compareTo(array[i+1])>0) {
					String aux=array[i+1];
					array[i+1]=array[i];
					array[i]=aux;
					estaOrdenado=false;
				}
			}		
		}
	}
	
	public void inicializar() {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.println("Introduzca un valor para la posición "+i);
			array[i]=s.nextLine();
		}			
	}
	
	/* TO-DO
	public void voltear() {
	}
	
	public void incrementar(int posiciones) {
	}
	*/
	
	public String toString() {
		String resultado="{ ";
		for(int i=0;i<array.length;i++)
			resultado+=array[i]+" ";
		resultado+="}";
		return resultado;
	}

}
