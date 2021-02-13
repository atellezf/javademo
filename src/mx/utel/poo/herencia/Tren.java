package mx.utel.poo.herencia;

import java.util.Arrays;
import java.util.List;

public class Tren {
	
	private final Maquina m;
	public List<Vagon> vagones;
	
	public Tren(Maquina m ) {
		this.m = m;
	}
	
	public void asignarVagones( Vagon ... v ) {
		this.vagones = Arrays.asList(v);
	}
	
	public double calcularVolumenTotal() {
		double volumen = 0;
		for (Vagon v : vagones) {
			volumen += v.calcularVolumen();
		}
		return volumen;
	}
	
	@Override
	public String toString() {
		return String.format("Tren %s con %d vagones, volúmen total: %.2f m3",
				m, vagones.size(), calcularVolumenTotal());
	}

}
