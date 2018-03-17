public class Incidencia {

	private date fecha;
	private string descripcion;

	public Incidencia() {
		// TODO - implement Incidencia.Incidencia
		throw new UnsupportedOperationException();
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

    private static class date {

        public date() {
        }
    }

}