package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;
import java.util.Date;
/**
 * Persona encargada de activar una u otra campa�a una vez que compruebe que todos los pedidos pendientes han sido entregados.
 */
public class Administrativo {

	private String nombre;

	/**
	 * 
	 * @param nombre
	 */
	public Administrativo(String nombre) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @param fecha
	 */
	public boolean compruebaPedidoPendiente(Date fecha) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param temporada
	 */
	public boolean altaNuevaCampaña(String temporada) {
		throw new UnsupportedOperationException();
	}

}