public class Pago {

	private long tarjeta;
	private date fecha;
	private Socio socio;

	public long getTarjeta() {
		return this.tarjeta;
	}

	/**
	 * 
	 * @param tarjeta
	 */
	public void setTarjeta(long tarjeta) {
		this.tarjeta = tarjeta;
	}

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

	public Pago() {
		// TODO - implement Pago.Pago
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tarjeta
	 * @param fecha
	 * @param socio
	 */
	public Pago(long tarjeta, date fecha, Socio socio) {
		// TODO - implement Pago.Pago
		throw new UnsupportedOperationException();
	}

}