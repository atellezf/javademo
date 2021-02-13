package mx.utel.poo.herencia;

public abstract class Vagon {
	
	private final String CONTENIDO;
	private String tipo;
	
	public Vagon(String contenido) {	
		CONTENIDO = contenido;
		this.tipo = determinarTipo();
	}
	
	public String obtenerContenido() {
		return CONTENIDO;
	}
	
	public abstract double calcularVolumen();
	
	@Override
	public String toString() {
		double volumen = calcularVolumen();
		return String.format("Vagón %s con un volúmen de %.2f m3", tipo, volumen);
	}
	
	private String determinarTipo() {
		String nombre = this.getClass().getSimpleName();
		return nombre.replace("Vagon", "").toLowerCase();
	}
	
}
