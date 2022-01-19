package econtrol.repeticion.actividades;

import java.util.Scanner; //  Importamos la clase `Scanner`, perteneciente al paquete `java.util`.

/*
 * Actividad resuelta 02b001r
 * 
 * Muestra un menú correspondiente a
 * una calculadora simple y permite
 * al usuario escoger y ejecutar una opción.
 * 
 * Gran parte del código puede reutilizarse,
 * pero eso se verá más adelante.
 */
public class MenuCalculadora {

	public static void ejecutar() {		
		Scanner teclado=new Scanner(System.in); // Declaramos el objeto teclado
		int opcion; // Esta variable contendrá la opción seleccionada.
		int operador1;
		int operador2;
		int resultado;
		do { // Lo contenido entre este y el siguiente corchete de cierre se ejecutará mientras se cumpla la condición del `while`.
			System.out.println("** Bienvenido a la calculadora"); // Mostramos un mensaje de bienvenida
			System.out.println("** Escoja una opción:");
			System.out.println("1. Sumar dos números enteros"); // Mostramos el menú
			System.out.println("2. Restar dos números enteros");
			System.out.println("3. Multiplicar dos números enteros");
			System.out.println("4. Dividir un número entero entre otro");
			System.out.println("5. Salir");
			System.out.print("> "); // Esto es un símbolo para que el usuario sepa que debe introducir algún valor. Aquí se ha usado el método `print` de `System.out` para evitar que incluya un salto de línea al final y el usuario escriba justo después del `>`.
			opcion=Integer.parseInt(teclado.nextLine()); // Recuerda lo explicado sobre `nextInt()` y `nextLine()`.
			if(opcion==1) { // Si el usuario decide hacer la suma...
				System.out.println("** Has escogido la opción 'sumar'");
				System.out.println("** Introduce ambos operadores");
				System.out.print("Operador 1=");
				operador1=Integer.parseInt(teclado.nextLine());
				System.out.print("Operador 2=");
				operador2=Integer.parseInt(teclado.nextLine());
				resultado=operador1+operador2;
				System.out.println(operador1+"+"+operador2+"="+resultado);
			} else if(opcion==2) { // Si el usuario prefiere restar...
				System.out.println("** Has escogido la opción 'restar'");
				System.out.println("** Introduce ambos operadores");
				System.out.print("Operador 1=");
				operador1=Integer.parseInt(teclado.nextLine());
				System.out.print("Operador 2=");
				operador2=Integer.parseInt(teclado.nextLine());
				resultado=operador1-operador2;
				System.out.println(operador1+"-"+operador2+"="+resultado);
			} else if(opcion==3) { // Esta opción multiplica
				System.out.println("** Has escogido la opción 'multiplicar'");
				System.out.println("** Introduce ambos operadores");
				System.out.print("Operador 1=");
				operador1=Integer.parseInt(teclado.nextLine());
				System.out.print("Operador 2=");
				operador2=Integer.parseInt(teclado.nextLine());
				resultado=operador1*operador2;
				System.out.println(operador1+"*"+operador2+"="+resultado);	
			} else if(opcion==4) { // Esta opción divide
				System.out.println("** Has escogido la opción 'dividir'");
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
			} else if (opcion==5) {// La última opción: salir de la calculadora.
				System.out.println("** Saliendo de la calculadora...");
			} else { // La opción "por defecto", salir de la calculadora.
				System.out.println(opcion+" no es una opción válida.");
			}
		} while(opcion!=5);
		System.out.println("** Se ha salido de la calculadora");
		teclado.close(); // Se cierra el teclado.
	} 

}
