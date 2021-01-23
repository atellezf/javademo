package mx.utel.poo.objetos;

public class Programa {
	
	public static void main(String[] args) {
		Procesador cpu1 = new Procesador();
//		System.out.println(cpu1);
		SmartPhone ph1 = new SmartPhone();
		ph1.instalarProcesador(cpu1);
		System.out.println(ph1);		
	}

}
