package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;
import java.util.Date;
/**
 * Según el Área de influencia se ha de distribuir el paquete en unos d�as determinados. Almacenaremos el �rea de influencia, la fecha en que se puede realizar el pedido y los días de reparto en que se realizará dicha entrega.
 */
public class Ruta {

	private String areaInfluencia;
	private String diasReparto;
	private Date fecha;

	public Ruta() {
		throw new UnsupportedOperationException();
	}

	public String getAreaInfluencia() {
		return this.areaInfluencia;
	}

	public String getDiasReparto() {
		return this.diasReparto;
	}

	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param areaInfluencia
	 */
	public void setAreaInfluencia(String areaInfluencia) {
		this.areaInfluencia = areaInfluencia;
	}

	/**
	 * 
	 * @param diasReparto
	 */
	public void setDiasReparto(String diasReparto) {
		this.diasReparto = diasReparto;
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
	 * @param direSocio
	 */
	public String destino(String direSocio) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fecha
	 */
	public int diaReparto(Date fecha) {
		throw new UnsupportedOperationException();
	}

}