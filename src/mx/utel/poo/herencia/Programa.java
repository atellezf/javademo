package mx.utel.poo.herencia;

public class Programa {

	public static void main(String[] args) {
		Programa prog = new Programa();
		Tren t = prog.conectarMaquina("El Olivo");
		prog.engancharVagones(t);
		System.out.println(t);
		for (Vagon v : t.vagones) {
			System.out.printf("\t%s\n", v);
		}
	}
	
	public Tren conectarMaquina(String nombre) {
		return new Tren( new Maquina(nombre) );
	}
	
	public void engancharVagones(Tren tren) {
		VagonCerrado v1 = new VagonCerrado("Grava");		
		VagonCisterna v2 = new VagonCisterna("Gasolina");
		tren.asignarVagones(v1, v2);
	}

}
