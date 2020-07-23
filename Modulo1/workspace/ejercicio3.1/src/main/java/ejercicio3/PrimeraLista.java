package ejercicio3;

import java.util.ArrayList;

public class PrimeraLista {
	
	public static void main(String[] args) {
		ArrayList<String> letters = new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		for (String elem: letters) {
			System.out.println(elem);
		}
		System.out.println("cantidad de elementos de la lista: " +letters.size());
		letters.add(0,"X");
		for (String elem: letters) {
			System.out.println(elem);
		}

	}

}
