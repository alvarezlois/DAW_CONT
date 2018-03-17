package Comesana_Cabeza_Jose_Luis_ED05_Tarea.Comesana_Cabeza_Jose_Luis_ED05_Tarea;

/**
 * Se almacenará el número del paquete preparado por el empleado y el destino que le corresponde a dicho paquete, el cual hemos de comprobar tomando como referencia la dirección del socio
 */
public class Almacen {

	private int paqueteNum;
	private String destino;

	public Almacen() {
		throw new UnsupportedOperationException();
	}

	public String getDestino() {
		return this.destino;
	}

	public int getPaqueteNum() {
		return this.paqueteNum;
	}

	/**
	 * 
	 * @param destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * 
	 * @param paqueteNum
	 */
	public void setPaqueteNum(int paqueteNum) {
		this.paqueteNum = paqueteNum;
	}

	/**
	 * 
	 * @param direSocio
	 */
	public String asignarDestino(String direSocio) {
		throw new UnsupportedOperationException();
	}

}