package mx.utel.poo.threads;

public final class Granero {
	
	/**
	 * Total del café almacenado en el granero, expresado en gramos.
	 */
	private int cafeAlmacenado;
	
	// ### Aplicando patrón de diseño Singleton ####################
	private static final Granero INSTANCIA = new Granero(); 
	
	private Granero() { }
	
	public static Granero obtenerGranero() {
		return INSTANCIA;
	}
	// #############################################################
	
	public synchronized void almacenar(int gramos) {
		cafeAlmacenado += gramos;
	}
	
	public synchronized boolean retirar(int gramos) {
		if( cafeAlmacenado >= gramos  ) {
			cafeAlmacenado -= gramos;
			return true;
		}
		return false;
	}
	
	public synchronized int totalAlmacenado() {
		return cafeAlmacenado;
	}

}
