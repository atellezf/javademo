package mx.utel.poo.objetos;

public class Procesador {
	
	private String marca, modelo;
	private int nucleos;
	private float velocidad;
	
	public Procesador() {
		this.marca = "SnapDragon";
		this.modelo = "885+";
		this.nucleos = 8;
		this.velocidad = 2.4298f;
	}
	
	public Procesador(String marca, String modelo, int nucleos, float velocidad) {		
		this.marca = marca;
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		if( nucleos >=1 ) {
			this.nucleos = nucleos;			
		}
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
		return String.format("CPU: %s (%s), corriendo a %.2f Ghz, con %d núcleos", marca, modelo, velocidad, nucleos);
	}	
	
}
