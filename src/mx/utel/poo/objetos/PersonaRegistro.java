package mx.utel.poo.objetos;

public record PersonaRegistro(String nombre, String apellidos) {
	
	@Override
	public String toString() {
		return String.format("Persona: %s, %s", apellidos, nombre);
	}
	
}
