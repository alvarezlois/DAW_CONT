package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;

/**
 * Empresa encargada del transporte de mercancías y que realizara la entrega de los paquetes.
 */
public class EmpresaTransporte {

	private String nombre;
	private String cif;
	private String domicilioFiscal;

	public EmpresaTransporte() {
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