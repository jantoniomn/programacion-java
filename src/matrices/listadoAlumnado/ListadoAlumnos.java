package matrices.listadoAlumnado;

import java.util.Scanner;

import utilidades.Debug;

/**
 * Aplicación que mantiene un listado de alumnado con el siguiente formato
 *
 * ( [Nombre][Apellidos][NIF] )
 * ( [Nombre][Apellidos][NIF] )
 * 
 * 
 * La aplicación permite añadir alumnos y alumnas y borrarlos o borrarlas
 * 
 * @author guillermogb
 *
 */
public class ListadoAlumnos {
	
	private Alumno[] listado;
	
	public ListadoAlumnos() {
		Debug.depurar("Ejecutando "+this.getClass());
		
		listado=new Alumno[1];
		mostrarMenu();
		
		Debug.depurar("Finalizando "+this.getClass());
		
	}
	
	/**
	 * Método que imprime un menú y ejecuta distintos métodos
	 * en función de la opción seleccionada.
	 */
	public void mostrarMenu() {
		Scanner s=new Scanner(System.in);
		int opcion=0;
		do {
			System.out.println("[Listado de alumnos]");
			System.out.println("\t1) Añadir alumno\\a");
			System.out.println("\t2) Borrar alumno\\a");
			System.out.println("\t3) Imprimir listado\\a");
			System.out.println("***");
			System.out.println("\t0) Salir\\a");
			
			opcion=Integer.parseInt(s.nextLine());
			
			switch(opcion) {
			case 1:
				String nombre;
				String apellido;
				String nif;
				System.out.println("Introduzca el nombre del alumno: ");
				nombre=s.nextLine();
				System.out.println("Introduzca el apellido del alumno: ");
				apellido=s.nextLine();
				System.out.println("Introduzca el NIF del alumno: ");
				nif=s.nextLine();
				addAlumno(nombre, apellido, nif);
				/*
				 * Alumno a=new Alumno(nombre, apellido, nif)
				 * addAlumno(a);
				 */
				break;
			case 2:
				System.out.println("Introduzca el número de alumno a borrar:");
				int alumnoBorrar=Integer.parseInt(s.nextLine());
				borrarAlumno(alumnoBorrar);
				break;
			case 3:
				System.out.println(this);
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while(opcion!=0);
	}
	
	public void addAlumno(Alumno a) {
		int posicionInsertar=getNumeroAlumnos();
		listado[posicionInsertar]=a;
		incrementarListado();
	}
	
	public void addAlumno(String nombre, String apellido, String nif) {
		Alumno a=new Alumno(nombre, apellido, nif);
		addAlumno(a);
	}
	
	public void borrarAlumno(int i) {
		listado[i]=null;
		ajustarListado();
	}
		
	public String toString() {
		String resultado="";
		for(int i=0;i<listado.length;i++)
			if(listado[i]!=null)
				resultado+=Integer.toString(i)+"\t"+listado[i]+"\n";
		return resultado;
	}
	
	private int getNumeroAlumnos() {
		int numeroAlumnos=0;
		for(int i=0;i<listado.length;i++)
			if(listado[i]!=null)
				numeroAlumnos++;
		return numeroAlumnos;
	}	

	private void incrementarListado() {
		int tamanyoListado=listado.length;
		Alumno[] nuevoListado=new Alumno[tamanyoListado+1];
		for(int i=0;i<listado.length;i++)
			nuevoListado[i]=listado[i];
		listado=nuevoListado;
	}
	
	private void ajustarListado() {
		compactar();
		Alumno[] nuevoListado=new Alumno[getNumeroAlumnos()];
		for(int i=0;i<getNumeroAlumnos();i++)
			nuevoListado[i]=listado[i];
		listado=nuevoListado;
	}
	

	private void compactar() {
		while(!estaCompactado()) {
			for(int i=0;i<listado.length-1;i++)
				if(listado[i]==null && listado[i+1] !=null ) {
					listado[i]=listado[i+1];
					listado[i+1]=null;
				}
		}
	}
	
	private boolean estaCompactado() {
		boolean estaCompactado=true;
		for(int i=0;i<listado.length-1;i++)
			if(listado[i]==null && listado[i+1] != null)
				estaCompactado=false;
		return estaCompactado;
	}
	

}
