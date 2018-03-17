package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;

/**
 * Empresa que crea los productos que vendamos y que no son de fabricaci�n propia.
 */
public class Firma {

	private String nombre;
	private String cif;
	private String domicilioFiscal;

	/**
	 * 
	 * @param nombre
	 * @param cif
	 * @param domicilioFiscal
	 */
	public Firma(String nombre, String cif, String domicilioFiscal) {
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