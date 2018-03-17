package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;
import java.util.Date;
/**
 * Usuario dado de alta. Cuando se convierte en socio puede hacer pedidos, verlos o cancelarlos, así como modificar sus propios datos.
 */
public class Socio {

	private String nombre;
	private String correoElectronico;
	private String direccion;

	public Socio() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param correoElectronico
	 * @param direccion
	 */
	public Socio(String nombre, String correoElectronico, String direccion) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public String getDireccion() {
		return this.direccion;
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
	 * @param correoElectronico
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void verPedido(Date fecha) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fecha
	 */
	public boolean cancelarPedido(Date fecha) {
		throw new UnsupportedOperationException();
	}

}