package mx.utel.poo.estructuras;

public class PruebaSwitch {
	
	public static void main(String[] args) {
		PruebaSwitch prog = new PruebaSwitch();
		prog.seleccionaModelo(8);
		prog.seleccionaTalla(Talla.GRANDE);
		System.out.println(prog.expresionSwitch(4));
	}
	
	private String expresionSwitch(int mod) {
		String mensaje = switch(mod) {
			case 1 -> "Es el modelo 2021";
			case 2 -> "Es el modelo 2022";
			case 3 -> "Es el modelo 2023";
			case 4 -> "Es el modelo 2024";
			case 5 -> "Es el modelo 2025";
			default -> "Modelo desconocido";
		};
		return mensaje;
	}
	
	private void seleccionaModelo(int mod) {
		switch (mod) {
			case 1:
				System.out.println("Es el modelo 2021");
				break;
			case 2:
				System.out.println("Es el modelo 2022");
				break;
			case 3:
				System.out.println("Es el modelo 2023");
				break;
			case 4:
				System.out.println("Es el modelo 2024");
				break;
			default:
				System.out.println("Modelo desconocido");
				break;
		}
	}
	
	private void seleccionaTalla(Talla t) {
		switch(t) {
			case CHICA:
				System.out.println("Seleccionaste la talla chica");
				break;
			case MEDIANA:
				System.out.println("Seleccionaste la talla mediana");
				break;
			case GRANDE:
				System.out.println("Seleccionaste la talla grande");
				break;
			case EXTRA_GRANDE:
				System.out.println("Seleccionaste la talla extra grande");
				break;
		}
	}

}
