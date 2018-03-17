package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;

/**
 * Clase que permite ver los artículos de la tienda aunque no permite adquirir ninguno hasta que no se haya dado de alta como socio
 */
public class Usuario {

	private String nombre;
	private String email;

	public Usuario() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param email
	 */
	public Usuario(String nombre, String email) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getEmail() {
		return this.email;
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
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public void verArticulos() {
		throw new UnsupportedOperationException();
	}

}