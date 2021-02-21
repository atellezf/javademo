package mx.utel.poo.threads;

public class Recolector extends Empleado {
	
	/**
	 * Gramos de café cosechados por hora
	 */
	private final int GRAMOS_CAFE = 250;
	
	public Recolector(String nombre) {
		super(nombre);
	}
	
	@Override
	void trabajar() {
		try {
			Thread.sleep(2000); // Simulando 60 minutos
			granero.almacenar(GRAMOS_CAFE);
			System.out.printf("%s \t ha cosechado %d grs café\n", this.getName(), GRAMOS_CAFE);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}

}
