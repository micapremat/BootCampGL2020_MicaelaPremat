package modulo3Ej1.modulo3Ej1;

public class ElectricalAppliance {
	//Crear una clase ElectricalAppliance, con el atributo power(con valor 500) y un método TurnOn que consuma 50 puntos de power. 

	private int power = 500;
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}
	
	public int turnOn() {
		this.power = this.power - 50;
		return this.power;
	}
}
