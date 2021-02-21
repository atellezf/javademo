package mx.utel.poo.threads;

import java.util.ArrayList;

public class ProgramaCafetal {
	
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>(6);

	public static void main(String[] args) {
		ProgramaCafetal prog = new ProgramaCafetal();
		prog.contratarRecolectores("Miguel", "Alex", "Rafael", "Carlos");
		prog.contratarTostadores("Maria", "Lucía");
		prog.iniciarJornadaLaboral();
	}
	
	public void contratarTostadores(String ... nombres) {
		for (String nombre : nombres) {
			MaestroTostador emp = new MaestroTostador(nombre);
			empleados.add(emp);
		}
	}
	
	public void contratarRecolectores(String ... nombres) {
		for (String nombre : nombres) {
			Recolector emp = new Recolector(nombre);
			empleados.add(emp);
		}
	}
	
	public void iniciarJornadaLaboral() {
		empleados.forEach(  emp -> emp.start()  );
	}

}
