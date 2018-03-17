package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;
import java.util.Date;
/**
 * S�lo haremos uso de esta clase cuando se produzca alg�n tipo de incidencia, en cuyo caso almacenaremos la fecha y la descripci�n de la misma.
 */
public class Incidencia {

	private Date fecha;
	private String descripcion;

	public Incidencia() {
		throw new UnsupportedOperationException();
	}

	public Date getFecha() {
		return this.fecha;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}