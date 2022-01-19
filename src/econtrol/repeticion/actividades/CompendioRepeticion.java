package econtrol.repeticion.actividades;

import java.util.Scanner;

/*
 * Actividades resueltas 02b004r
 */
public class CompendioRepeticion {
	
	/*
	 * a. Elabora un programa que pida por teclado diez
	 * cifras enteras y muestre por pantalla su media aritmética.
	 */
	public static void mediaAritmetica10Cifras() {
		Scanner teclado=new Scanner(System.in);
		int acumulador=0; //Contendrá la suma de cada número introducido.
		for(int i=0;i<10;i++) {
			System.out.print("Introduzca un número ("+(10-i)+" pendientes): ");
			acumulador+=teclado.nextInt(); //Va sumando (acumulando) valores.
		}
		System.out.println("La media es "+acumulador/10); //Divide el total entre 10.
		teclado.close();
	}
	
	/*
	 * b. Modifica el programa anterior para que, en vez de
	 *   diez cifras, pida al usuario el número de cifras 
	 *   sobre las que desee hacer la media.
	 */
	public static void mediaNCifras() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el número de cifras a promediar: ");
		int n=teclado.nextInt(); //Solicita el número de enteros que va a promediar.
		int acumulador=0; //El resto es igual que el ejercicio anterior.
		for(int i=n;i<10;i++) {
			System.out.print("Introduzca un número ("+(n-i)+" pendientes): ");
			acumulador+=teclado.nextInt();
		}
		System.out.println("La media es "+acumulador/n);
		teclado.close();		
	}
	
	/*
	 * c. Modifica el programa anterior para que el
	 * usuario pueda introducir un número indeterminado
	 * de cifras hasta que introduzca una negativa, momento
	 * en el cual se dejará de pedir cifras y se calculará la media de las anteriores.
	 */
	public static void mediaCifrasHastaNegativo() {
		Scanner teclado=new Scanner(System.in);
		int acumulador=0;
		int numeroCifras=0; // Como a priori no sabemos el número exacto de cifras a promediar, es necesario llevar un contador.
		boolean salir=false; //Cambiará de valor cuando se cumpla la condición para terminar de introducir números.
		while(!salir) { // Mientras no haya que salir...
			System.out.println("Introduzca un número a promediar.");
			System.out.println("Escoja un número negativo para salir de la aplicación.");
			int numeroActual=teclado.nextInt(); // ... sigue introduciendo números.
			if(numeroActual>=0) { // Se ejecutará mientras el número introducido sea mayor o igual que cero.
				acumulador+=numeroActual; //Súmalo al acumulador (igual a acumulador=acumulador+numeroActual).
				numeroCifras++; // E incrementa el número de cifras introducidas.
			}
			else
				salir=true;
		}
		System.out.println("La media es "+acumulador/numeroCifras);
		teclado.close();
	}
	
	/*
	 * d. Realiza un programa que pida por teclado diez
	 * cifras enteras e imprima por pantalla la mayor de ellas.
	 */
	public static void maximo10Cifras() {
		Scanner teclado=new Scanner(System.in);
		/*
		 * Integer.MIN_VALUE es el mínimo valor que puede tomar un entero.
		 * Cualquier número que introduzcamos será mayor que este, por eso tomamos
		 * este para calcular el máximo.
		 */
		int maximo=Integer.MIN_VALUE;
		for(int i=0;i<0;i++) { // Solicita 10 números por pantalla...
			System.out.print("Introduzca un número: ");
			int numeroActual=teclado.nextInt();
			if(numeroActual>maximo) // ... si el número recién introducido es mayor que el máximo actual...
				maximo=numeroActual; // ... pasa a ser el máximo
		}
		System.out.println("El valor máximo es "+maximo);
		teclado.close();
	}

	/*
	 * e. Desarrolla una aplicación que pida al usuario números
	 * enteros hasta que introduzca un valor negativo. En ese
	 * momento, mostrar por pantalla la media, valor máximo y mínimo de todos los introducidos anteriormente.
	 */
	public static void medidasHastaNegativo() {
		Scanner teclado=new Scanner(System.in);
		int acumulador=0;
		int numeroCifras=0;
		int maximo=Integer.MIN_VALUE; // Como en el ejercicio anterior.
		int minimo=Integer.MAX_VALUE; // Utilizado para calcular el mínimo.
		boolean salir=false;
		while(!salir) {
			System.out.println("Introduzca un número.");
			System.out.println("Escoja un número negativo para salir de la aplicación.");
			int numeroActual=teclado.nextInt();
			if(numeroActual>=0) { // Se ejecutará mientras el número introducido sea mayor o igual que cero.
				acumulador+=numeroActual; // Esto para calcular la media
				numeroCifras++; // Aquí, el contador de números introducidos hasta el momento.
				if(numeroActual>maximo)
					maximo=numeroActual; // Cálculo del máximo.
				if(numeroActual<minimo)
					minimo=numeroActual; // Cálculo del mínimo con la misma filosofía que el cálculo del máximo.
			}
			else // Si el número es negativo...
				salir=true; // ... salir.
		}
		System.out.println("La media es "+acumulador/numeroCifras);
		System.out.println("El valor máximo es "+maximo);
		System.out.println("El valor mínimo es "+minimo);
		teclado.close();		
	}
	
	/* f. Modifica la aplicación anterior para que, además 
	 * de la media, valor máximo y mínimo, muestre
	 * también su varianza. Si no recuerdas cómo calcular
	 * la varianza, busca en Internet. Ups, aún no estamos
	 * capacitados para resolver esto.
	 * */
	public static void medidasConVarianza() {
		/*
		 * Para calcular la varianza necesitamos almacenar
		 * todos los números que hayamos introducido por separado,
		 * y aún no hemos visto cómo hacerlo.
		 */
	}
	
	/*
	 * g. La división entre dos números enteros puede realizarse
	 * restando al dividendo el divisor un número determinado de
	 * veces mientras el resto sea positivo. El número de veces
	 * que ha sido necesario realizar esta resta es el cociente. 
	 * 
	 * Implementa un programa que divida dos números enteros
	 * utilizando este método.
	 */
	public static void dividirRestando() {
		int dividendo=45;
		int divisor=5;
		int resto=dividendo; // En un principio, el resto es igual al dividendo.
		int numeroRestas=0; // Esto será el cociente.
		while(resto>=divisor) {
				resto=resto-divisor; // El resto se actualiza restándole el divisor.
				numeroRestas++; // El cociente se incrementa con cada resta.
		}
		System.out.println(dividendo+"/"+divisor+"="+numeroRestas+", con resto="+resto);
		
	}
	
	/*
	 * 	h. Haz un programa que imprima los 20 primeros números
	 *  de la sucessión de Fibonacci. La sucesión de Fibonacci
	 *  toma punto de partida dos números: 0 y 1, y calcula el
	 *  valor de los siguientes como la suma de los dos anteriores
	 *  (es decir, el tercer valor de la sucesión sería 1, y el cuarto sería 2).
	 */
	public static void fibonacci() {
		int primero=0; // El primer número es conocido
		int segundo=1; // El segundo también
		int fibonacci;
		System.out.println("1) "+ primero);
		System.out.println("2) "+ segundo);
		for(int i=3;i<=20;i++) {
			fibonacci=primero+segundo; // la posición n es la suma de las dos anteriores.
			primero=segundo; // la primera pasa a valer lo que valía la segunda.
			segundo=fibonacci; // la segunda pasa a valer lo que vale el número de fibonacci.
			System.out.println(i+") "+ fibonacci);
		}
	}
}
