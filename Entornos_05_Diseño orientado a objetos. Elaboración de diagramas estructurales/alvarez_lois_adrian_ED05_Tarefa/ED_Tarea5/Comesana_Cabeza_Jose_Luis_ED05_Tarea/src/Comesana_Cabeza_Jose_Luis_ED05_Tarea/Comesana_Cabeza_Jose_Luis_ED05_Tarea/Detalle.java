package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;

/**
 * Es el cuerpo de la factura. Donde almacenaremos qué artículo se vende, qu� cantidad y a qué precio, grabando cada línea del cuerpo de la factura.
 */
public class Detalle {

	private Articulos articulo;
	private float cantidad;
	private float precio;

	public Articulos getArticulo() {
		throw new UnsupportedOperationException();
	}

	public float getCantidad() {
		return this.cantidad;
	}

	public float getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param articulo
	 */
	public void setArticulo(Articulos articulo) {
		this.articulo = articulo;
	}

	/**
	 * 
	 * @param cantidad
	 */
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

}