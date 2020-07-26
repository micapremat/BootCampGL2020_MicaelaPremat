package ejercicio7;

public interface Persona {
	public void hablar();
	public void dormir();
	public default void come() {
		System.out.println("las personas comen");
	}
}
