package modulo3Ej1.modulo3Ej1;

public class LedAppliance {
	//Crear una tercer clase LedAppliance con el metodo TurnOn (que no herede de ElectricalAppliance) y que consuma 100 power.

	ElectricalAppliance electricalAppliance;
	
	public LedAppliance() {
		electricalAppliance = new ElectricalAppliance();
	}
	public int turnOn() {
		//System.out.println(super.getPower()-75);
		electricalAppliance.turnOn();
		return electricalAppliance.getPower();
	}
	
	
}
