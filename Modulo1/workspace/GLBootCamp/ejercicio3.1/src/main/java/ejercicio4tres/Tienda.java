package ejercicio4tres;

public class Tienda {

	public static void main(String[] args) {
		int compra = 400;
		double descuento;
		if (compra == 300) {
			descuento = compra*0.20;
			System.out.println("El descuento es de: "+ String.valueOf(descuento));
		}else if (compra >= 350) {
			descuento = compra*0.25;
			System.out.println("El descuento es de: "+ String.valueOf(descuento));
		}else {
			System.out.println("Sin descuentos, el total es: " + String.valueOf(compra));
		}

	}

}
