package mx.utel.poo.arreglos;

public class PruebaArreglos {

	public static void main(String[] args) {
		
		final int HANNAB = 0, DISNEY = 1, SIMPSONS = 2;
		String personajes[][] = new String[3][];
		
		personajes[HANNAB] = new String[4];
		personajes[HANNAB][0] = "Oso Yogi";
		personajes[HANNAB][1] = "Birdman";
		personajes[HANNAB][2] = "Mr. Magoo";
		personajes[HANNAB][3] = "La Hormiga Atómica";
		
		personajes[DISNEY] = new String[5];
		personajes[DISNEY][0] = "La Cenicienta";
		personajes[DISNEY][1] = "Bambi";
		personajes[DISNEY][2] = "Mickey Mouse";
		personajes[DISNEY][3] = "Dumbo";
		personajes[DISNEY][4] = "Aladín";
		
		personajes[SIMPSONS] = new String[3];
		personajes[SIMPSONS][0] = "Homero";
		personajes[SIMPSONS][1] = "Lisa";
		personajes[SIMPSONS][2] = "Marge";
		
		PruebaArreglos prog = new PruebaArreglos();
		prog.imprimeArreglo(personajes);
		
	}
	
	private void imprimeArreglo(String[][] personajes) {
		System.out.println("### IMPRIMIENDO ARREGLO USANDO FOR TRADICIONAL");
		for (int i = 0; i < personajes.length; i++) {
			System.out.printf("\tPERSONAJES DE: %s \n", familia(i));
			for (int j = 0; j < personajes[i].length; j++) {
				System.out.printf("\t * %s \n", personajes[i][j]);
			}			
		}
	}
	
	private String familia(int x) {
		// A PARTIR DEL JDK 11
		return switch(x) {
			case 0 -> "Hanna-Barbera";
			case 1 -> "Disney";
			case 2 -> "Simpsons";
			default -> "Desconocido";
		};
	}

}
