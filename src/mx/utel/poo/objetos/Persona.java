package mx.utel.poo.objetos;

// JavaBean, Bean, POJO (Plain Old Java Object)
public class Persona {
	
	private String nombre, apellidos;

	public Persona(String nombre, String apellidos) {	
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		return String.format("Persona: %s, %s", apellidos, nombre);
	}
	

}
