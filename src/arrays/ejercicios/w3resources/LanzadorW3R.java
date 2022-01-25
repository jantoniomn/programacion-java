package arrays.ejercicios.w3resources;

import java.util.Random;
import java.util.Scanner;

import juegos.wordle.Wordle;
import matrices.ejercicios.Graficax2;
import matrices.listadoAlumnado.ListadoAlumnos;
import utilidades.Debug;

/**
 * @author guillermogb
 *
 */
public class LanzadorW3R {
	
	public LanzadorW3R() {
		
		Scanner s=new Scanner(System.in);
		int opcion=0;
		do {
			//Imprime el menú
			System.out.println("[Menú de ejecución: seleccione una opción]");
			System.out.println("\t26) Desplazar ceros al final.");
			System.out.println("\t27) Contador de números pares e impares.");
			System.out.println("\t32) Comprobar dos enteros en matriz.");
			System.out.println("***");
			System.out.println("\t0) Salir.");
			
			//Lee la opción seleccionada
			opcion=s.nextInt();
			
			/*
			 * TODO: resto del menú.
			 */
			
			//Procesa la opción seleccionada
			switch(opcion) {
			case 0:
				System.out.println("Saliendo de la aplicación...");
				break;
			case 26: 
				int[] array26=new int[20];
				rellenarArray(array26, 0, 3);
				imprimirArray(array26);
				array26=ejercicio26feo(array26);
				imprimirArray(array26);
				break;
			case 27: 
				int[] array27=new int[10];
				rellenarArray(array27, 0, 9);
				imprimirArray(array27);
				ejercicio27(array27);
				break;
			case 32: 
				int[] array32=new int[40];
				rellenarArray(array32, 64, 78);
				imprimirArray(array32);
				System.out.println(ejercicio32(array32));
				break;
			default:
				System.out.println("Introduce un número válido");
			}
		}while(opcion!=0);
	}
	
	/**
	 * 26. Write a Java program to move all 0's
	 * to the end of an array. Maintain the relative
	 * order of the other (non-zero) array elements.
	 */
	public void ejercicio26(int[] array) {
		while(cerosAlFinal(array)==false) {
			for(int i=0;i<array.length-1;i++) {
				if(array[i]==0) {
					array[i]=array[i+1];
					array[i+1]=0;
				}
			}
		}
	}
	
	/**
	 * Auxiliar para ejercicio26(int[] array)
	 */
	public boolean cerosAlFinal(int[] array) {
		boolean cerosAlFinal=true;
		for(int i=0;i<array.length-1;i++)
			if(array[i]==0 && array[i+1]!=0) {
				cerosAlFinal=false;
				break;
			}
		return cerosAlFinal;
	}
	
	/**
	 * Versión fea del ejercicio anterior
	 * @param array sin ordenar
	 * @return array ordenado
	 */
	public int[] ejercicio26feo(int[] array) {
		int[] temporal=new int[array.length];
		int contador=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				temporal[contador]=array[i];
				contador++;
			}
		}
		for(int i=contador;i<temporal.length;i++)
			temporal[i]=0;
		return temporal;
	}
	
	/**
	 * 27. Write a Java program to find the number of even
	 * and odd integers in a given array of integers. 
	 */
	public void ejercicio27(int[] array) {
		int contadorPares=0;
		int contadorImpares=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0)
				contadorPares++;
			else
				contadorImpares++;
		}
		System.out.println("Contador de pares: "+contadorPares);
		System.out.println("Contador de impares: "+contadorImpares);
	}
	
	
	/**
	 * 32. Write a Java program to check if an array
	 * of integers contains two specified elements 65 and 77
	 */
	public boolean ejercicio32(int[] array) {
		boolean existe65=false;
		boolean existe77=false;
		for(int i=0;i<array.length;i++) {
			if(array[i]==65)
				existe65=true;
			else if(array[i]==77)
				existe77=true;
		}
		return existe65 && existe77;
	}
	
	public void rellenarArray(int[] array, int limiteInferior, int limiteSuperior) {
		Random r=new Random();
		int rango=limiteSuperior-limiteInferior;
		for(int i=0;i<array.length;i++) 
			array[i]=r.nextInt(rango)+limiteInferior;
	}
	
	public void imprimirArray(int[] array) {
		System.out.print("{ ");
		for(int i=0;i<array.length-1;i++)
			System.out.print(array[i]+", ");
		System.out.print(array[array.length-1]+"}\n");
	}
	
}
