package ejercicio5dos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Heladera heladera = new Heladera();
		Cafetera cafetera = new Cafetera();
		Televisor televisor = new Televisor();
		ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList<Electrodomestico>();
		listaElectrodomesticos.add(heladera);
		listaElectrodomesticos.add(televisor);
		listaElectrodomesticos.add(cafetera);
		for(Electrodomestico electrodomestico: listaElectrodomesticos) {
			electrodomestico.encender();
		}
	}

}
