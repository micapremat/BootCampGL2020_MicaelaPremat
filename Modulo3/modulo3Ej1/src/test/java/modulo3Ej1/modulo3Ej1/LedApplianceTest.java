package modulo3Ej1.modulo3Ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LedApplianceTest {
	
	private LedAppliance ledAppliance;
	@BeforeEach 
	void setUp() {
		ledAppliance = new LedAppliance();
	}
	
	@Test
	void turnOnTest() {
		ledAppliance.turnOn();
		//System.out.println(ledAppliance.getPower());
		assertEquals(400,ledAppliance.turnOn());
	}

}
