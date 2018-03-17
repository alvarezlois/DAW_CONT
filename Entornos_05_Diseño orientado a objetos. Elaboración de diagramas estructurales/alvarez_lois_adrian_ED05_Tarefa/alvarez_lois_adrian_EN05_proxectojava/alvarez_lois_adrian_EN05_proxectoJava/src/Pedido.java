public class Pedido {

	private date fecha;
	private float total;
	private Socio socio;

	public date getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(date fecha) {
		this.fecha = fecha;
	}

	public float getTotal() {
		return this.total;
	}

	/**
	 * 
	 * @param total
	 */
	public void setTotal(float total) {
		this.total = total;
	}

	public Socio getSocio() {
		return this.socio;
	}

	/**
	 * 
	 * @param socio
	 */
	public void setSocio(Socio socio) {
		this.socio = socio;
	}

}