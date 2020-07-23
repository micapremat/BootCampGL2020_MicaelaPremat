package ejercicio5;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	Electrodomestico electrodomestico = new Electrodomestico();
    	Heladera heladera = new Heladera();
    	electrodomestico.apagar();
    	electrodomestico.encender();
    	electrodomestico.marca = "marca";
    	System.out.println(electrodomestico.marca);
    	heladera.apagar();
    	heladera.encender();
    	heladera.extraerElemento("banana");
    	heladera.guardarElemento("tomate");
    }
}
