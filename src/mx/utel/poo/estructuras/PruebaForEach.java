package mx.utel.poo.estructuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PruebaForEach {
	
	public static void main(String[] args) {
		PruebaForEach prog = new PruebaForEach();
//		String[] nombres = {"Rebeca", "Aldo", "Alex", "Carlos", "Samuel"};
//		prog.imprimeNombres(nombres);
		
		System.out.println("### CICLO FOR-EACH OCUPANDO LISTAS");
		// EN EL JDK 6 Y ANTERIORES
		ArrayList<String> lista = new ArrayList<String>(3);
		lista.add("Homero");
		lista.add("Bart");
		lista.add("Maggie");
		prog.imprimeLista(lista);
		
		System.out.println("### CICLO FOR-EACH OCUPANDO OPERADOR DIAMANTE");
		// A PARTIR DEL JDK 7
		ArrayList<String> lista2 = new ArrayList<>();
		lista2.add("March");		
		lista2.add("Maggie");
		prog.imprimeLista(lista2);
		
		System.out.println("### CICLO FOR EACH OCUPANDO LISTAS (1ª Parte)");
		// A PARTIR DEL JDK 8
		List<String> lista3 = List.of("Thor", "Hawk", "IronMan", "Black Widow", "Spiderman");
		prog.imprimeLista(lista3);
		
		System.out.println("### CICLO FOR EACH OCUPANDO LISTAS (2ª Parte)");
		// A PARTIR DEL JDK 10
		var lista4 = List.of("Thor", "Hawk", "IronMan", "Black Widow", "Spiderman");
		prog.imprimeLista(lista4);
		
	}
	
	// TODO: Explicar Herencia y Polimorfismo
	private void imprimeLista(List<String> lista) {
		// A partir del JDK 5: Programación con estructura FOR-EACH
//		for (String cad : lista) {
//			System.out.printf("Nombre: %s\n", cad);
//		}
		// A partir del JDK 8: Programación Funcional
//		lista.forEach(nombre -> {
//			System.out.printf("Nombre: %s \n", nombre);
//		});
		// A partir del JDK 8: Programación Funcional Avanzada
		lista.forEach(System.out::println);
		
	}
	
	private void imprimeNombres(String[] nombres) {
//		 IMPRIMIENDO POR MEDIO DEL FOR TRADICIONAL
//		for (int i = 0; i < nombres.length; i++) {
//			System.out.println("Nombre: " + nombres[i]);
//		}
//		IMPRIMIENTO POR MEDIO DEL FOR-EACH
//		for (String str : nombres) {
//			System.out.println("Nombre: " + str);
//		}
		Arrays.stream(nombres).filter( cad -> cad.startsWith("A") ).forEach( cad -> {
			System.out.println("Nombre: " + cad);
		});
		
	}

}
