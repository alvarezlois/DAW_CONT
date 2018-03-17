public class Articulos {

	private string nombre;
	private float talla;
	private string descripcion;
	private string material;
	private float precio;
	private int stock;
	private string temporada;

	public Articulos() {
		// TODO - implement Articulos.Articulos
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param parameter
	 * @param nombre
	 * @param descripcion
	 * @param material
	 * @param precio
	 * @param stock
	 * @param temporada
	 */
	public Articulos(int parameter, string nombre, string descripcion, string material, float precio, int stock, string temporada) {
		// TODO - implement Articulos.Articulos
		throw new UnsupportedOperationException();
	}

	public float getTalla() {
		return this.talla;
	}

	/**
	 * 
	 * @param talla
	 */
	public void setTalla(float talla) {
		this.talla = talla;
	}

	public string getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(string descripcion) {
		this.descripcion = descripcion;
	}

	public string getMaterial() {
		return this.material;
	}

	/**
	 * 
	 * @param material
	 */
	public void setMaterial(string material) {
		this.material = material;
	}

	public float getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	/**
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	public string getTemporada() {
		return this.temporada;
	}

	/**
	 * 
	 * @param temporada
	 */
	public void setTemporada(string temporada) {
		this.temporada = temporada;
	}

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

}