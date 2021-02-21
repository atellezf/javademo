package mx.utel.poo.threads;

public class MaestroTostador extends Empleado {
	
	/**
	 * Gramos de café tostados cada 30 min
	 */
	private final int GRAMOS_CAFE = 500;
	
	public MaestroTostador(String nombre) {
		super(nombre);
	}
	
	@Override
	void trabajar() {
		try {
			while( !granero.retirar(GRAMOS_CAFE) ) {
				System.out.printf("%s \t esperando cosecha...\n", this.getName());
				Thread.sleep(1000); // Simulando 30 minutos
			}
			System.out.printf("%s \t ha tostado %d grs de café, \t Granero: %d grs \n",
					this.getName(), GRAMOS_CAFE, granero.totalAlmacenado());
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
