package ejercicio5dos;

public class Televisor extends Electrodomestico{
	private double pulgadas;
	private String resolucion;
	
	public void cambiarCanal(int canal) {
		System.out.println("cambiando de canal");
	}
	
	public void encender() {
		System.out.println("Encendiendo electrodomestico televisor");
	}
}
