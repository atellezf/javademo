package mx.utel.poo.herencia;

public class VagonCerrado extends Vagon {
	
	private double ladoA, ladoB, altura;
	
	public VagonCerrado(String contenido) {
		this(contenido, 2.5d, 1.2d, 4.25d);		
	}
	
	public VagonCerrado(String contenido, double ladoA, double ladoB, double altura) {
		super(contenido);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.altura = altura;		
	}

	@Override
	public double calcularVolumen() {
		return ladoA * ladoB * altura;
	}

}
