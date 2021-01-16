package mx.utel.poo.intro;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {		
		Mensaje m = new Mensaje();
		Scanner scan = new Scanner(System.in);
		System.out.print("Escribe tu nombre: ");
		String nombre = scan.nextLine();
		m.imprimir(nombre);
		scan.close();
	}
	
}

