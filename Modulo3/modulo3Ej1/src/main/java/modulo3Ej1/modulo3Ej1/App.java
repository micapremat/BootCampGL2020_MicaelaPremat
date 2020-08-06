package modulo3Ej1.modulo3Ej1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Agregar en Main: Una instancia de  ElectricalOven que al comenzar imprima su energía inicial (power), ejecutar TurnOn, imprimir power, ejecutar TurnLed e imprimir su energía.
    	//(Debería terminar con 325 de power).

    	ElectricalOven electricalOven = new ElectricalOven();
    	System.out.println(electricalOven.getPower());
    	electricalOven.turnOn();
    	System.out.println(electricalOven.getPower());
    	electricalOven.turnLed();
    	System.out.println(electricalOven.getPower());
    }
}
