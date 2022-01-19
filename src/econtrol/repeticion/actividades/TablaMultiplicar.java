package econtrol.repeticion.actividades;

import java.util.Scanner;

/*
 * Actividades resueltas 02b002r
 * 
 * Realiza una aplicación en Java que pida al usuario que introduzca un número entero por teclado y muestre por pantalla la tabla de multiplicar para dicho número.
 * Haz dos versiones del programa: una utilizando bucles for y otra utilizando while o do-while.
 */
public class TablaMultiplicar {
	
	/*
	 * Multiplica un número introducido
	 * por pantalla por i, que va modificando
	 * su valor entre 1 y 10 en el propio
	 * bucle for.
	 */
	public static void multiplicarConFor(){
		Scanner teclado=new Scanner(System.in);
		int numero; // Número cuya tabla se va a mostrar
		System.out.print("Introduce un número entero: ");
		numero=teclado.nextInt(); // Se le asigna valor al número
		for(int i=1;i<=10;i++) // Se multiplica el valor por i.
			System.out.println(numero+"*"+i+"="+numero*i);
		teclado.close(); // Se cierra el teclado
	}
	
	/*
	 * Multiplica un número introducido
	 * por pantalla por i, que va modificando
	 * su valor entre 1 y 10 entre los corchetes
	 * del while (i++).
	 */
	public static void multiplicarConWhile(){
		Scanner teclado=new Scanner(System.in);
		int numero; // Número cuya tabla se va a mostrar.
		int i=1; // Valor por el que se multiplicará (de 1 a 10).
		System.out.print("Introduce un número entero: ");
		numero=teclado.nextInt(); // Inicialización de la variable número.
		while(i<=10) { //Condición del bucle
			System.out.println(numero+"*"+i+"="+numero*i);
			i++; //Instrucción que hará terminar al bucle.
		}	
		teclado.close(); // Se cierra el teclado.		
	}

}
