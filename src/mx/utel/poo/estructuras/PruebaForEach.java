package mx.utel.poo.estructuras;

public class PruebaForEach {
	
	public static void main(String[] args) {
		PruebaForEach prog = new PruebaForEach();
		String[] nombres = {"Rebeca", "Aldo", "Alex", "Carlos", "Samuel"};
		prog.imprimeNombres(nombres);
	}
	
	private void imprimeNombres(String[] nombres) {
//		for (int i = 0; i < nombres.length; i++) {
//			System.out.println("Nombre: " + nombres[i]);
//		}
		for (String str : nombres) {
			System.out.println("Nombre: " + str);
		}
		// TODO: Implementar programación funcional
	}

}
