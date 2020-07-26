package ejercicio7;

public interface Animal {
	public void dormir();
	public void sonidoAnimal();
	default void come(String perro) {
		System.out.println(perro + " se alimenta");
	}
	public static void camina(String perro) {
		System.out.println(perro + " camina");
	};
	
}
