package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;

/**
 * Generalización de los productos que venderemos a través de la tienda
 */
public class Articulos {

	private String nombre;
	private String temporada;
	private String descripcion;
	private String material;
	private String color;
	private float precio;
	private int stock;

	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public String getMaterial() {
		return this.material;
	}

	public String getColor() {
		return this.color;
	}

	public float getPrecio() {
		return this.precio;
	}

	public int getStock() {
		return this.stock;
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
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * 
	 * @param material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * 
	 * @param temporada
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	/**
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * 
	 * @param nombre
	 * @param descripcion
	 * @param material
	 * @param color
	 * @param precio
	 * @param stock
	 */
	public Articulos(String nombre, String descripcion, String material, String color, float precio, int stock) {
		throw new UnsupportedOperationException();
	}

}