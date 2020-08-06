package modulo3Ej1.modulo3Ej1;

public class ElectricalOven extends ElectricalAppliance{
	//Crear una clase ElectricalOven que herede de ElectricalAppliance y al ejecutar TurnOn consuma 75 puntos de power. 
	
	//La clase ElectricalOven tiene un atributo LedApplance y un método TurnLed que consuma 100 power al ElectricalOven.


	LedAppliance ledAppliance;
	
	public int turnOn() {
		//System.out.println(super.getPower()-75);
		super.setPower(super.getPower()-75);
		return this.getPower();
	}
	
	public int turnLed() {
		super.setPower(super.getPower()-100);
		
		return super.getPower();
	}

}
