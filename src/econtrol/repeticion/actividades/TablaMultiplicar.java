package econtrol.repeticion.actividades;

import java.util.Scanner;

/*
 * Actividades resueltas 02b002r
 * 
 * Realiza una aplicaci�n en Java que pida al usuario que introduzca un n�mero entero por teclado y muestre por pantalla la tabla de multiplicar para dicho n�mero.
 * Haz dos versiones del programa: una utilizando bucles for y otra utilizando while o do-while.
 */
public class TablaMultiplicar {
	
	/*
	 * Multiplica un n�mero introducido
	 * por pantalla por i, que va modificando
	 * su valor entre 1 y 10 en el propio
	 * bucle for.
	 */
	public static void multiplicarConFor(){
		Scanner teclado=new Scanner(System.in);
		int numero; // N�mero cuya tabla se va a mostrar
		System.out.print("Introduce un n�mero entero: ");
		numero=teclado.nextInt(); // Se le asigna valor al n�mero
		for(int i=1;i<=10;i++) // Se multiplica el valor por i.
			System.out.println(numero+"*"+i+"="+numero*i);
		teclado.close(); // Se cierra el teclado
	}
	
	/*
	 * Multiplica un n�mero introducido
	 * por pantalla por i, que va modificando
	 * su valor entre 1 y 10 entre los corchetes
	 * del while (i++).
	 */
	public static void multiplicarConWhile(){
		Scanner teclado=new Scanner(System.in);
		int numero; // N�mero cuya tabla se va a mostrar.
		int i=1; // Valor por el que se multiplicar� (de 1 a 10).
		System.out.print("Introduce un n�mero entero: ");
		numero=teclado.nextInt(); // Inicializaci�n de la variable n�mero.
		while(i<=10) { //Condici�n del bucle
			System.out.println(numero+"*"+i+"="+numero*i);
			i++; //Instrucci�n que har� terminar al bucle.
		}	
		teclado.close(); // Se cierra el teclado.		
	}

}
