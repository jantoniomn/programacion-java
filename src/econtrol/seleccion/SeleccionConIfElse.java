package econtrol.seleccion;

/** 
 * Ejemplos para ilustrar el
 * funcionamiento de la estructura
 * if-else
 */
public class SeleccionConIfElse {
		
	public SeleccionConIfElse() {
		//Primer ejemplo		
		//Se inicializa una variable `edad` con el valor 20.
		int edad=20;
		if(edad>=18) { //Si `edad` es mayor o igual a 18, se ejecuta el contenido entre corchetes.
			System.out.println("Tienes "+edad+" años. Eres mayor de edad.");
		} else { //En caso contrario, se ejecuta el contenido entre los siguientes corchetes.
			System.out.println("Tienes menos de 18 años. Eres menor de edad");
		}
		
		//Segundo ejemplo
		char genero='M';
		if(edad>=18&&genero=='M')
			System.out.println("Tienes más de 18 años y tu género es masculino.");
		else
			System.out.println("O tienes menos de 18, o tu género no es másculino (o ninguna de las dos)");
		//Tercer ejemplo
		if(edad>=18)
			System.out.println("Solo actuaré si eres mayor de edad");
		
		//Cuarto ejemplo
		if(edad<0)
			System.out.println("¡Es imposible!");
		else if(edad==0)
			System.out.println("Eres una recién nacida.");
		else if(edad>0&&edad<=12)
			System.out.println("Eres un preadolescente");
		else if(edad>12&&edad<18)
			System.out.println("Eres un adolescente");
		else
			System.out.println("Eres mayor de edad");
		
		//Quinto ejemplo
		if(edad<0)
			System.out.println("¡Es imposible!");
		if(edad==0)
			System.out.println("Eres una recién nacida.");
		if(edad>0&&edad<=12)
			System.out.println("Eres un preadolescente");
		if(edad>12&&edad<18)
			System.out.println("Eres un adolescente");
		if(edad>=18)
			System.out.println("Eres mayor de edad");
	}
	
}
