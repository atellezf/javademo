package mx.utel.poo.herencia;

public class VagonCisterna extends Vagon {
	
	private double radio, altura;

	public VagonCisterna(String contenido) {
		this(contenido, 1.5d, 4.25d);		
	}
	
	public VagonCisterna(String contenido, double radio, double altura) {
		super(contenido);
		this.radio = radio;
		this.altura = altura;		
	}

	@Override
	public double calcularVolumen() {
		double r2 = Math.pow(radio, 2);
		double volumen = ( Math.PI * r2 ) * altura;
		return volumen;		
	}

}
