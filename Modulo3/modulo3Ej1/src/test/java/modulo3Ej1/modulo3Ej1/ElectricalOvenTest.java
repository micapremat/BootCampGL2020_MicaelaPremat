package modulo3Ej1.modulo3Ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ElectricalOvenTest {
	
	private ElectricalOven electricalOven;
	@BeforeEach 
	void setUp() {
		electricalOven = new ElectricalOven();
	}
	
	@Test
	void turnOnTest() {
		electricalOven.turnOn();
		System.out.println(electricalOven.getPower());
		assertEquals(425,electricalOven.getPower());
	}
	
	@Test
	void turnLedTest() {
		electricalOven.turnLed();
		System.out.println(electricalOven.getPower());
		assertEquals(400,electricalOven.getPower());
	}

}
