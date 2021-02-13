package mx.utel.poo.herencia;

public class Maquina {
	
	private final String NOMBRE;

	public Maquina(String nombre) {		
		NOMBRE = nombre;
	}
	
	@Override
	public String toString() {
		return NOMBRE;
	}	
	
}
