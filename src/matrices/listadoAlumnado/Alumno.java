package matrices.listadoAlumnado;

/**
 * Clase que contiene un alumno o alumna.
 * Perdón por no ser inclusivo en el nombre de la clase.
 */
public class Alumno {
	
	private String nombre;
	private String apellidos;
	private final String nif;
	
	public Alumno(String nombre, String apellido, String nif) {
		this.nombre=nombre;
		this.apellidos=apellido;
		this.nif=nif;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellido(String apellidos) {
		this.apellidos=apellidos;
	}
	
	public String getNif() {
		return nif;
	}
	
	public String toString() {
		return nombre+"\t\t"+apellidos+"\t\t"+nif;
	}

}
