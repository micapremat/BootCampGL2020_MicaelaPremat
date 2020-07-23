package ejercicio5;

public class Electrodomestico {
	protected String marca;
	private double peso;
	private char consumo;
	private String color;
	
	public void encender() {
		System.out.println("Encendiendo electrodomestico");
	}
	
	public void apagar() {
		System.out.println("Apagando electrodomestico");
	}
}
