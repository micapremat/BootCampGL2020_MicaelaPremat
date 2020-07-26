package ejercicio7;

public class Hombre implements Animal, Persona{
	public void dormir() {
		System.out.println("El hombre duerme muchas horas");
	}

	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonido de animal");
	}

	public void come(String perro) {
		Animal.super.come(perro);
	}
	public void hablar() {
		System.out.println("Las personas hablan mucho");
	}
	public static void main( String[] args ){
		 Hombre hombre = new Hombre();
		 hombre.dormir();
		 hombre.hablar();
		 hombre.sonidoAnimal();
	}

}
