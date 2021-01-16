package mx.utel.poo.fundamentos;

public class Operaciones {
	
	/**
	 * Este es un método para sumar dos valores
	 * @param x el primer valor
	 * @param y el segundo valor
	 * @return El resultado de la suma
	 */
	public int suma(int x, int y) {
		return x +y;
	}
	
	public int resta(int x, int y) {
		return x-y;
	}
	
	public int multiplica(int x, int y) {
		return x*y;
	}
	
	public float divide(float x, int y) {
		return x/y;
	}
	
	public int residuo(int x, int y) {
		return x%y;
	}
	
	public boolean esFalso() {
		System.out.println("Este método regresa falso");
		return false;
	}
	
	public boolean esVerdadero() {
		System.out.println("Este método regresa verdadero");
		return true;
	}
	
}
