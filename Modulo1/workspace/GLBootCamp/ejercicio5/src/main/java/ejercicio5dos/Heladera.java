package ejercicio5dos;

public class Heladera extends Electrodomestico{
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	public void guardarElemento(String elemento) {
		System.out.println("Guardando elemento");
	}
	
	public void extraerElemento(String elemento) {
		System.out.println("Extrayendo elemento");
	}
	
	public void encender() {
		System.out.println("Encendiendo electrodomestico heladera");
	}
}
