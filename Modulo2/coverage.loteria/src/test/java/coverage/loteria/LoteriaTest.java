package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)
public class LoteriaTest {
	
	
	@Test
	void whenJugada() {
		Loteria loteria = new Loteria(100,1000, new CartonGenerator());
		assertFalse(loteria.hayGanadorUnico());
		assertFalse(loteria.hayCuadrupleGanador());
		assertEquals(1000,loteria.getBoletos());
		assertEquals(100,loteria.getPozo());
		assertEquals(0,loteria.getGanadores());
		
		loteria.jugada();
		
		assertEquals(0,loteria.getGanadores());
		assertFalse(loteria.hayGanadorUnico());
		assertFalse(loteria.hayCuadrupleGanador());
		assertEquals(1000,loteria.getBoletos());
		assertEquals(100,loteria.getPozo());
	}
	
	@Mock
	CartonGenerator cartonGenerator;
	
	@Test
	void whenJugadaPreparada() {
		Mockito.when(cartonGenerator.isGanador()).thenReturn(true,false);
		Loteria loteria = new Loteria(100,1000, cartonGenerator);
		
		loteria.jugada();

		assertTrue(loteria.hayGanadorUnico());
		assertFalse(loteria.hayCuadrupleGanador());
		
	}
	
	@InjectMocks
	CartonGenerator cartonGeneratorInject;
	
	@Mock
	Random rand;
	
	@Test
	void whenJugadaExcepcional() {
		Mockito.when(rand.nextInt()).thenReturn(1,1,1,1,0);
		Loteria loteria = new Loteria(100,1000, cartonGeneratorInject);
		
		loteria.jugada();

		assertFalse(loteria.hayGanadorUnico());
		assertTrue(loteria.hayCuadrupleGanador());
	}
	
	/*
	@Test
	@DisplayName("Obtener pozo")
	public void pozo() {
		assertEquals(loteria.getPozo(),0f);
	}
	
	@Test
	@DisplayName("Obtener boletos")
	public void boletos() {
		assertEquals(loteria.getBoletos(),0);
	}
	
	@Test
	@DisplayName("Obtener ganadores")
	public void ganadores() {
		assertEquals(loteria.getGanadores(),0);
	}
	
	@Test
	@DisplayName("Obtener hay unico ganador")
	@ExtendWith(MockitoExtension.class)
	public void ganadorUnicoFalse() {
		Loteria loteria = new Loteria(1f,3,carton);
		assertFalse(loteria.hayGanadorUnico());
	}
	
	@Test
	@DisplayName("Obtener hay unico ganador true")
	@ExtendWith(MockitoExtension.class)
	public void ganadorUnicoTrue() {
		Loteria loteria = new Loteria(1f,1,carton);
		Mockito.when(carton.isGanador()).thenReturn(true);
		loteria.jugada();
		assertTrue(loteria.hayGanadorUnico());
	}
	
	
	@Test
	@DisplayName("Obtener hay cuadriple ganador")
	public void hayCuadrupleGanadorFalse() {
		assertFalse(loteria.hayCuadrupleGanador());
	}
	
	@Test
	@DisplayName("Obtener hay cuadriple ganador true")
	@ExtendWith(MockitoExtension.class)
	public void hayCuadrupleGanadorTrue() {
		Loteria loteria = new Loteria(1f,4,cartonGenerator);
		Mockito.when(cartonGenerator.isGanador()).thenReturn(true);
		loteria.jugada();
		assertTrue(loteria.hayCuadrupleGanador());
	}
	
	@Test
	@DisplayName("Jugada")
	@ExtendWith(MockitoExtension.class)
	public void jugada() {
		Loteria loteria = new Loteria(1f,3,cartonGenerator);
		assertFalse(cartonGenerator.isGanador());
		loteria.jugada();
	}
	
	@Test
	@DisplayName("Jugada1")
	@ExtendWith(MockitoExtension.class)
	public void jugada1() {
		Loteria loteria = new Loteria(1f,3,cartonGenerator);
		//assertFalse(cartonGenerator.isGanador());
		Mockito.when(cartonGenerator.isGanador()).thenReturn(true);
		assertTrue(cartonGenerator.isGanador());
		loteria.jugada();
	}*/
	

}
