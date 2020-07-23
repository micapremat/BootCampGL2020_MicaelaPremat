package ejercicio5tres;

public class Main {

	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.setNombre("Gatito");
		gato.setPatas(4);
		System.out.println("El gato se llama: "+ gato.getNombre() + " y tiene: " + gato.getPatas() + " patas" );

	}

}
