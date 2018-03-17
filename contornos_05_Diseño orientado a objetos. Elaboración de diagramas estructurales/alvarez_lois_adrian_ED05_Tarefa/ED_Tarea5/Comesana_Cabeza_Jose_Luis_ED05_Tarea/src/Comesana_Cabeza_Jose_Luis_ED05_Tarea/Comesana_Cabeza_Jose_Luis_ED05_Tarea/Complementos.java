package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;

/**
 * Especificación de un tipo de producto determinado (Complementos) que se venderá a través de la tienda.
 */
public class Complementos {

	private float talla;

	/**
	 * 
	 * @param articulo
	 * @param talla
	 */
	public Complementos(Articulos articulo, float talla) {
		throw new UnsupportedOperationException();
	}

	public float getTalla() {
		return this.talla;
	}

	public Articulos getArticulo() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param talla
	 */
	public void setTalla(float talla) {
		this.talla = talla;
	}

	/**
	 * 
	 * @param articulo
	 */
	public void setArticulo(Articulos articulo) {
		throw new UnsupportedOperationException();
	}

}