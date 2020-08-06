package modulo3Ej1.modulo3Ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ElectricalaApplianceTest {
	private ElectricalAppliance electricalAppliance;
	@BeforeEach 
	void setUp() {
		electricalAppliance = new ElectricalAppliance();
	}
	
	@Test
	void turnOnTest() {
		electricalAppliance.setPower(500);
		electricalAppliance.turnOn();
		System.out.println(electricalAppliance.getPower());
		assertEquals(450,electricalAppliance.getPower());
	}
}
