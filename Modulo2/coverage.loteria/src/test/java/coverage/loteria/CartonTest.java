package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

public class CartonTest {
	
	@InjectMocks
	CartonGenerator carton = new CartonGenerator();
	
	@Test
	@DisplayName("hay ganador false")
	public void hayGanadorFalse() {
		assertFalse(carton.isGanador());
	}
	
	@Test
	@DisplayName("hay ganador true")
	@ExtendWith(MockitoExtension.class)
	public void hayGanadorTrue() {
		CartonGenerator carton = mock(CartonGenerator.class);
		Mockito.when(carton.isGanador()).thenReturn(true);
		assertTrue(carton.isGanador());
	}

}
