package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;

/**
 * Persona encargada de vendernos los productos ajenos a nuestra producción y que vende todos nuestros productos.
 */
public class Proveedor {

	private String nombre;
	private String cif;
	private String domicilioFiscal;

	/**
	 * 
	 * @param nombre
	 * @param cif
	 * @param domicilioFiscal
	 */
	public Proveedor(String nombre, String cif, String domicilioFiscal) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getCif() {
		return this.cif;
	}

	public String getDomicilioFiscal() {
		return this.domicilioFiscal;
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
	 * @param cif
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * 
	 * @param domicilioFiscal
	 */
	public void setDomicilioFiscal(String domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;
	}

}