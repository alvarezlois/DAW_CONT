public class Socio {

	private string nombre;
	private string correoElectronico;
	private string direccion;

	public string getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}

	public string getCorreoElectronico() {
		return this.correoElectronico;
	}

	/**
	 * 
	 * @param correoElectronico
	 */
	public void setCorreoElectronico(string correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public string getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(string direccion) {
		this.direccion = direccion;
	}

}