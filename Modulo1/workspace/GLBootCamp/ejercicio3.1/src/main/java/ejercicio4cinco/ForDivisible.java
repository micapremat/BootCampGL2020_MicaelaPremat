package ejercicio4cinco;

public class ForDivisible {

	public static void main(String[] args) {
		int contador = 0;
		for (int i=0; i<=10000; i++) {
			if((i % 20) == 0) {
				contador++;
			}
		}
		System.out.println("La cantidad de numeros de 0 a 10000 divisibles por 20 es: " + contador);

	}

}
