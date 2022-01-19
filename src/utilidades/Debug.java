package utilidades;

public class Debug {
	
	private static boolean encendido=true;
	private static int verbosity=0; 
	public static final int TRAZA=0;
	public static final int INFO=1;
	public static final int WARNING=2;
	public static final int ERROR=3;
	
	public static void depurar(String mensaje) {
		if(encendido) {
		    System.out.println("["+java.time.LocalDateTime.now()+"] "+mensaje);
		}
	}
	
	public static void depurar(String mensaje,int parametroVerbosity) {
		if(encendido&&parametroVerbosity<=verbosity) {
		    System.out.println(mensaje);
		}
	}
	
	public static boolean getEstado() {
		return encendido;
	}
	
	public static void setVerbosity(int parametroVerbosity) {
		verbosity=parametroVerbosity;
	}
	
	public static int getVerbosity() {
		return verbosity;
	}
	
	public static void encender() {
		encendido=true;
	}
	
	public static void apagar() {
		encendido=false;
	}
	

}
