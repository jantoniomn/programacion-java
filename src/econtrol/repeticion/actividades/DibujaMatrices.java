package econtrol.repeticion.actividades;

/*
 * Actividades resueltas 02b003r
 */
public class DibujaMatrices {
	
	/* 	Dibuja la siguiente figura:
	 * 

	 */
	public static void dibujaCeros() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				//Esta línea se ejecuta un total de 100 veces
				System.out.print("0");
		//Esta línea se ejecuta un total de 10 veces
		System.out.println("");
		}
	}
	
	/*
	 * Dibuja la siguiente figura:
	 * 
	 * 0 1 2 3 4 5 6 7 8 9 
	 * 1 2 3 4 5 6 7 8 9 10 
	 * 2 3 4 5 6 7 8 9 10 11 
	 * 3 4 5 6 7 8 9 10 11 12 
	 * 4 5 6 7 8 9 10 11 12 13 
	 * 5 6 7 8 9 10 11 12 13 14 
	 * 6 7 8 9 10 11 12 13 14 15 
	 * 7 8 9 10 11 12 13 14 15 16 
	 * 8 9 10 11 12 13 14 15 16 17 
	 * 9 10 11 12 13 14 15 16 17 18 
	 * 
	 * En este caso, el punto en común de 
	 * todas las celdas es que contienen
	 * la suma de sus índices (i+j).
	 */
	public static void sumaIndices() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				System.out.print(i+j+" ");
		System.out.println("");
		}
	}
	
	/*
	 * Dibuja la siguiente figura:
	 * 
	 * *-*-*-*-*-
	 * -*-*-*-*-*
	 * *-*-*-*-*-
	 * -*-*-*-*-*
	 * *-*-*-*-*-
	 * -*-*-*-*-*
	 * *-*-*-*-*-
	 * -*-*-*-*-*
	 * *-*-*-*-*-
 	 * -*-*-*-*-*
 	 * 
 	 * En este caso, el punto en común de
 	 * todas sus celdas es que contienen un
 	 * asterisco (*) si la suma de sus índices
 	 * es par, y un guión (-) en caso contrario.
	 */
	public static void dibujaAlterno() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				if(i+j%2==0)
					System.out.print("*");
				else
					System.out.print("-");
		System.out.println("");
		}		
	}
	
	/*
	 * Dibuja la siguiente figura:
	 * 
	 * ---------*
   	 * --------*-
   	 * -------*--
   	 * ------*---
   	 * -----*----
   	 * ----*-----
   	 * ---*------
   	 * --*-------
   	 * -*--------
   	 * *---------
   	 * 
   	 * En este caso, el punto en común de
   	 * todas sus celdas es que imprime un
   	 * asterisco cuando la suma de sus índices
   	 * es 9, y un guión en caso contrario.
	 */
	public static void dibujaDiagonal() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				if(i+j==9)
					System.out.print("*");
				else
					System.out.print("-");
		System.out.println("");
		}		
	}
	

	/*
	 * Dibuja la siguiente figura:
	 * 
	 * *--------*
	 * -*------*-
	 * --*----*--
	 * ---*--*---
	 * ----**----
	 * ----**----
	 * ---*--*---
	 * --*----*--
	 * -*------*-
	 * *--------*
	 * 
	 * En este caso, el punto en común de 
	 * todas sus celdas es que contienen un
	 * asterisco si la suma de sus índices
	 * es igual a 9 o si ambos índices son iguales,
	 * y un guión en caso contrario.
	 */
	public static void dibujaCruz() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				if(i+j==9||i==j)
					System.out.print("*");
				else
					System.out.print("-");
		System.out.println("");
		}		
	}
		
	
}
