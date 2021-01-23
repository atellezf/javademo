package mx.utel.poo.objetos;

public class SmartPhone {
	
	private String sistemaOperativo, marca, modelo;
	private Procesador cpu;
	private int memoria;
	
	public SmartPhone() {
		this("Android", "Motorola", "Edge", 4);
	}

	public SmartPhone(String sistemaOperativo, String marca, String modelo, int memoria) {		
		this.sistemaOperativo = sistemaOperativo;
		this.marca = marca;
		this.modelo = modelo;		
		this.memoria = memoria;
	}
	
	public void instalarProcesador(Procesador cpu) {
		this.cpu = cpu;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return String.format("SmartPhone: %s %s con %d GB RAM, \n %s", marca, modelo, memoria, cpu);
	}
	

}
