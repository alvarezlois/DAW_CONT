package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;

/**
 * Especificación de un tipo de producto determinado (Zapatos) que se venderá a través de la tienda.
 */
public class Zapatos {

	private int numero;
	private String tipo;

	/**
	 * 
	 * @param articulo
	 * @param tipo
	 * @param numero
	 */
	public Zapatos(Articulos articulo, String tipo, int numero) {
		throw new UnsupportedOperationException();
	}

	public int getNumero() {
		return this.numero;
	}

	public String getTipo() {
		return this.tipo;
	}

	public Articulos getArticulo() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * 
	 * @param articulo
	 */
	public void setArticulo(Articulos articulo) {
		throw new UnsupportedOperationException();
	}

}