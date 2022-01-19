package econtrol.repeticion.actividades;

import java.util.Scanner; //  Importamos la clase `Scanner`, perteneciente al paquete `java.util`.

/*
 * Actividad resuelta 02b001r
 * 
 * Muestra un men� correspondiente a
 * una calculadora simple y permite
 * al usuario escoger y ejecutar una opci�n.
 * 
 * Gran parte del c�digo puede reutilizarse,
 * pero eso se ver� m�s adelante.
 */
public class MenuCalculadora {

	public static void ejecutar() {		
		Scanner teclado=new Scanner(System.in); // Declaramos el objeto teclado
		int opcion; // Esta variable contendr� la opci�n seleccionada.
		int operador1;
		int operador2;
		int resultado;
		do { // Lo contenido entre este y el siguiente corchete de cierre se ejecutar� mientras se cumpla la condici�n del `while`.
			System.out.println("** Bienvenido a la calculadora"); // Mostramos un mensaje de bienvenida
			System.out.println("** Escoja una opci�n:");
			System.out.println("1. Sumar dos n�meros enteros"); // Mostramos el men�
			System.out.println("2. Restar dos n�meros enteros");
			System.out.println("3. Multiplicar dos n�meros enteros");
			System.out.println("4. Dividir un n�mero entero entre otro");
			System.out.println("5. Salir");
			System.out.print("> "); // Esto es un s�mbolo para que el usuario sepa que debe introducir alg�n valor. Aqu� se ha usado el m�todo `print` de `System.out` para evitar que incluya un salto de l�nea al final y el usuario escriba justo despu�s del `>`.
			opcion=Integer.parseInt(teclado.nextLine()); // Recuerda lo explicado sobre `nextInt()` y `nextLine()`.
			if(opcion==1) { // Si el usuario decide hacer la suma...
				System.out.println("** Has escogido la opci�n 'sumar'");
				System.out.println("** Introduce ambos operadores");
				System.out.print("Operador 1=");
				operador1=Integer.parseInt(teclado.nextLine());
				System.out.print("Operador 2=");
				operador2=Integer.parseInt(teclado.nextLine());
				resultado=operador1+operador2;
				System.out.println(operador1+"+"+operador2+"="+resultado);
			} else if(opcion==2) { // Si el usuario prefiere restar...
				System.out.println("** Has escogido la opci�n 'restar'");
				System.out.println("** Introduce ambos operadores");
				System.out.print("Operador 1=");
				operador1=Integer.parseInt(teclado.nextLine());
				System.out.print("Operador 2=");
				operador2=Integer.parseInt(teclado.nextLine());
				resultado=operador1-operador2;
				System.out.println(operador1+"-"+operador2+"="+resultado);
			} else if(opcion==3) { // Esta opci�n multiplica
				System.out.println("** Has escogido la opci�n 'multiplicar'");
				System.out.println("** Introduce ambos operadores");
				System.out.print("Operador 1=");
				operador1=Integer.parseInt(teclado.nextLine());
				System.out.print("Operador 2=");
				operador2=Integer.parseInt(teclado.nextLine());
				resultado=operador1*operador2;
				System.out.println(operador1+"*"+operador2+"="+resultado);	
			} else if(opcion==4) { // Esta opci�n divide
				System.out.println("** Has escogido la opci�n 'dividir'");
				System.out.println("** Introduce ambos operadores");
				System.out.print("Dividendo=");
				operador1=Integer.parseInt(teclado.nextLine());
				System.out.print("Divisor=");
				operador2=Integer.parseInt(teclado.nextLine());
				if(operador2==0) { // Este `if` comprueba que el divisor no sea cero.
					System.out.println("El divisor no puede ser igual a cero.");
				} else { // En caso contrario, divide.
					resultado=operador1/operador2;
					System.out.println(operador1+"/"+operador2+"="+resultado);
				}
			} else if (opcion==5) {// La �ltima opci�n: salir de la calculadora.
				System.out.println("** Saliendo de la calculadora...");
			} else { // La opci�n "por defecto", salir de la calculadora.
				System.out.println(opcion+" no es una opci�n v�lida.");
			}
		} while(opcion!=5);
		System.out.println("** Se ha salido de la calculadora");
		teclado.close(); // Se cierra el teclado.
	} 

}
