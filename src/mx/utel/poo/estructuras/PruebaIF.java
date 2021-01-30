package mx.utel.poo.estructuras;

public class PruebaIF {
	
	public static void main(String[] args) {
		PruebaIF prog = new PruebaIF();
		prog.condicionalAnidado(8);
		String resultado = prog.operadorTernario(12);
		System.out.println(resultado);
	}
	
	private void condicionalAnidado(int edad) {
		if( edad < 18  ) {
			if( edad < 12 ) System.out.printf("Eres un niño(a), porque tienes %d años!!\n", edad);
			else System.out.printf("Eres menor de edad, porque tienes %d años!!\n", edad);
		} else {
			System.out.println("Eres mayor de edad\n");
		}
	}
	
	private String operadorTernario(int edad) {
		return edad < 18 ? "Eres menor de edad" : "Eres mayor de edad";
	}
	
	

}
