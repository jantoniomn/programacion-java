package econtrol.repeticion.actividades;

import java.util.Scanner;

/*
 * Actividades resueltas 02b004r
 */
public class CompendioRepeticion {
	
	/*
	 * a. Elabora un programa que pida por teclado diez
	 * cifras enteras y muestre por pantalla su media aritm�tica.
	 */
	public static void mediaAritmetica10Cifras() {
		Scanner teclado=new Scanner(System.in);
		int acumulador=0; //Contendr� la suma de cada n�mero introducido.
		for(int i=0;i<10;i++) {
			System.out.print("Introduzca un n�mero ("+(10-i)+" pendientes): ");
			acumulador+=teclado.nextInt(); //Va sumando (acumulando) valores.
		}
		System.out.println("La media es "+acumulador/10); //Divide el total entre 10.
		teclado.close();
	}
	
	/*
	 * b. Modifica el programa anterior para que, en vez de
	 *   diez cifras, pida al usuario el n�mero de cifras 
	 *   sobre las que desee hacer la media.
	 */
	public static void mediaNCifras() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el n�mero de cifras a promediar: ");
		int n=teclado.nextInt(); //Solicita el n�mero de enteros que va a promediar.
		int acumulador=0; //El resto es igual que el ejercicio anterior.
		for(int i=n;i<10;i++) {
			System.out.print("Introduzca un n�mero ("+(n-i)+" pendientes): ");
			acumulador+=teclado.nextInt();
		}
		System.out.println("La media es "+acumulador/n);
		teclado.close();		
	}
	
	/*
	 * c. Modifica el programa anterior para que el
	 * usuario pueda introducir un n�mero indeterminado
	 * de cifras hasta que introduzca una negativa, momento
	 * en el cual se dejar� de pedir cifras y se calcular� la media de las anteriores.
	 */
	public static void mediaCifrasHastaNegativo() {
		Scanner teclado=new Scanner(System.in);
		int acumulador=0;
		int numeroCifras=0; // Como a priori no sabemos el n�mero exacto de cifras a promediar, es necesario llevar un contador.
		boolean salir=false; //Cambiar� de valor cuando se cumpla la condici�n para terminar de introducir n�meros.
		while(!salir) { // Mientras no haya que salir...
			System.out.println("Introduzca un n�mero a promediar.");
			System.out.println("Escoja un n�mero negativo para salir de la aplicaci�n.");
			int numeroActual=teclado.nextInt(); // ... sigue introduciendo n�meros.
			if(numeroActual>=0) { // Se ejecutar� mientras el n�mero introducido sea mayor o igual que cero.
				acumulador+=numeroActual; //S�malo al acumulador (igual a acumulador=acumulador+numeroActual).
				numeroCifras++; // E incrementa el n�mero de cifras introducidas.
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
		 * Integer.MIN_VALUE es el m�nimo valor que puede tomar un entero.
		 * Cualquier n�mero que introduzcamos ser� mayor que este, por eso tomamos
		 * este para calcular el m�ximo.
		 */
		int maximo=Integer.MIN_VALUE;
		for(int i=0;i<0;i++) { // Solicita 10 n�meros por pantalla...
			System.out.print("Introduzca un n�mero: ");
			int numeroActual=teclado.nextInt();
			if(numeroActual>maximo) // ... si el n�mero reci�n introducido es mayor que el m�ximo actual...
				maximo=numeroActual; // ... pasa a ser el m�ximo
		}
		System.out.println("El valor m�ximo es "+maximo);
		teclado.close();
	}

	/*
	 * e. Desarrolla una aplicaci�n que pida al usuario n�meros
	 * enteros hasta que introduzca un valor negativo. En ese
	 * momento, mostrar por pantalla la media, valor m�ximo y m�nimo de todos los introducidos anteriormente.
	 */
	public static void medidasHastaNegativo() {
		Scanner teclado=new Scanner(System.in);
		int acumulador=0;
		int numeroCifras=0;
		int maximo=Integer.MIN_VALUE; // Como en el ejercicio anterior.
		int minimo=Integer.MAX_VALUE; // Utilizado para calcular el m�nimo.
		boolean salir=false;
		while(!salir) {
			System.out.println("Introduzca un n�mero.");
			System.out.println("Escoja un n�mero negativo para salir de la aplicaci�n.");
			int numeroActual=teclado.nextInt();
			if(numeroActual>=0) { // Se ejecutar� mientras el n�mero introducido sea mayor o igual que cero.
				acumulador+=numeroActual; // Esto para calcular la media
				numeroCifras++; // Aqu�, el contador de n�meros introducidos hasta el momento.
				if(numeroActual>maximo)
					maximo=numeroActual; // C�lculo del m�ximo.
				if(numeroActual<minimo)
					minimo=numeroActual; // C�lculo del m�nimo con la misma filosof�a que el c�lculo del m�ximo.
			}
			else // Si el n�mero es negativo...
				salir=true; // ... salir.
		}
		System.out.println("La media es "+acumulador/numeroCifras);
		System.out.println("El valor m�ximo es "+maximo);
		System.out.println("El valor m�nimo es "+minimo);
		teclado.close();		
	}
	
	/* f. Modifica la aplicaci�n anterior para que, adem�s 
	 * de la media, valor m�ximo y m�nimo, muestre
	 * tambi�n su varianza. Si no recuerdas c�mo calcular
	 * la varianza, busca en Internet. Ups, a�n no estamos
	 * capacitados para resolver esto.
	 * */
	public static void medidasConVarianza() {
		/*
		 * Para calcular la varianza necesitamos almacenar
		 * todos los n�meros que hayamos introducido por separado,
		 * y a�n no hemos visto c�mo hacerlo.
		 */
	}
	
	/*
	 * g. La divisi�n entre dos n�meros enteros puede realizarse
	 * restando al dividendo el divisor un n�mero determinado de
	 * veces mientras el resto sea positivo. El n�mero de veces
	 * que ha sido necesario realizar esta resta es el cociente. 
	 * 
	 * Implementa un programa que divida dos n�meros enteros
	 * utilizando este m�todo.
	 */
	public static void dividirRestando() {
		int dividendo=45;
		int divisor=5;
		int resto=dividendo; // En un principio, el resto es igual al dividendo.
		int numeroRestas=0; // Esto ser� el cociente.
		while(resto>=divisor) {
				resto=resto-divisor; // El resto se actualiza rest�ndole el divisor.
				numeroRestas++; // El cociente se incrementa con cada resta.
		}
		System.out.println(dividendo+"/"+divisor+"="+numeroRestas+", con resto="+resto);
		
	}
	
	/*
	 * 	h. Haz un programa que imprima los 20 primeros n�meros
	 *  de la sucessi�n de Fibonacci. La sucesi�n de Fibonacci
	 *  toma punto de partida dos n�meros: 0 y 1, y calcula el
	 *  valor de los siguientes como la suma de los dos anteriores
	 *  (es decir, el tercer valor de la sucesi�n ser�a 1, y el cuarto ser�a 2).
	 */
	public static void fibonacci() {
		int primero=0; // El primer n�mero es conocido
		int segundo=1; // El segundo tambi�n
		int fibonacci;
		System.out.println("1) "+ primero);
		System.out.println("2) "+ segundo);
		for(int i=3;i<=20;i++) {
			fibonacci=primero+segundo; // la posici�n n es la suma de las dos anteriores.
			primero=segundo; // la primera pasa a valer lo que val�a la segunda.
			segundo=fibonacci; // la segunda pasa a valer lo que vale el n�mero de fibonacci.
			System.out.println(i+") "+ fibonacci);
		}
	}
}
