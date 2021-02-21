package mx.utel.poo.threads;

public abstract class Empleado extends Thread {
	
	protected Granero granero;
	protected final int HORAS_LABORABLES = 4;
	
	public Empleado(String nombre) {
		super(nombre); // Esta debe ser la primera línea de código dentro del constructor
		granero = Granero.obtenerGranero();
	}
	
	@Override
	public void run() {
		for(int i = 0; i < HORAS_LABORABLES; i++) {
			trabajar();
		}
		System.out.printf("%s \t terminó su jornada laboral!!\n", this.getName());
	}
	
	/**
	 * Método para que el empleado trabaje	
	 */
	abstract void trabajar();

}
