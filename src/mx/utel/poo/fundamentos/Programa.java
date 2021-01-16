package mx.utel.poo.fundamentos;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		Operaciones oper = new Operaciones();		
		Scanner scan = new Scanner(System.in);

		System.out.print("Escribe un número entero: ");
		int v1 = scan.nextInt();
		System.out.print("Escribe un número entero: ");
		int v2 = scan.nextInt();
		
		int r1 = oper.suma(v1, v2);
		
		System.out.printf("El resultado de la suma es: %d \n", r1);
		
		float r2 = oper.divide(v1, v2);
		System.out.printf("El resultado de la división es: %.2f \n", r2);
		
		boolean b1 = oper.esVerdadero() | oper.esFalso();
		
		System.out.println("Resultado: " + b1);
		
		scan.close();
	}
	
}
