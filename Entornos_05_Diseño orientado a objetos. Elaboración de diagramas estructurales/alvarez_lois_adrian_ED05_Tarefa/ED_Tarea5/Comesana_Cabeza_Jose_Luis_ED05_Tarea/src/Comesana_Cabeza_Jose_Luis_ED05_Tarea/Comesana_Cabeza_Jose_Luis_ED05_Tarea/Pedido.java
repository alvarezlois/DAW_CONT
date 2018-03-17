package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;
import java.util.Date;
/**
 * Pedido que realizará el socio y que suministra el proveedor. Es la cabecera de la factura donde almacenamos la fecha en la que se realiza la venta, el socio que nos compra los productos y el total de dicha factura. Dicho total lo hemos de averiguar añadiendo los subtotales que hemos de calcular de la clase detalle.
 */
public class Pedido {

	private Date fecha;
	private float total;
	private Socio socio;

	public Pedido() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fecha
	 * @param total
	 * @param socio
	 */
	public Pedido(Date fecha, float total, Socio socio) {
		throw new UnsupportedOperationException();
	}

	public Date getFecha() {
		return this.fecha;
	}

	public float getTotal() {
		return this.total;
	}

	public Socio getSocio() {
		return this.socio;
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
	 * @param total
	 */
	public void setTotal(float total) {
		this.total = total;
	}

	/**
	 * 
	 * @param cantidad
	 * @param precio
	 */
	public float hallarTotal(float cantidad, float precio) {
		throw new UnsupportedOperationException();
	}

}