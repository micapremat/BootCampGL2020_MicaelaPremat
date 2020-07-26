package ejercicio7;

public class Perro implements Animal{

	public void dormir() {
		System.out.println("Zzz");
	}

	public void sonidoAnimal() {
		System.out.println("El perro hace guau guau");
	}

	public void come(String perro) {
		Animal.super.come(perro);
	}
	

	
}
