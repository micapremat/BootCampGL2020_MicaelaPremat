/**
 * 
 */
package mockito.example.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import Exception.ZeroDivisionException;
import mockito.example.services.impl.CalculatorServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
	@InjectMocks
	private CalculatorServiceImpl calculatorServiceImpl;
	
	@Mock
	private BasicOperationsService basicOperationsService;
	
	@Mock
	private DataService dataService;
	
	private static int[] listOfNumbers;
	
	@BeforeAll
	static void setUp() {
		listOfNumbers = new int[] {1,2,3,4,5};
	}
	
	@Test
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,22,152})
	void calculateisOddTest(int input) {
		assertTrue(calculatorServiceImpl.isOdd(input));
	}
	
	
	@Test
	void calculateSumTest() {
		Mockito.when(basicOperationsService.add(2, 2)).thenReturn(4.0);
		assertEquals(4.0, calculatorServiceImpl.calculateSum(2, 2));
		verify(basicOperationsService).add(2,2);
	}
	
	@Test
	void printResultTest() {
		Mockito.when(basicOperationsService.add(2, 2)).thenReturn(4.0);
		assertEquals("El resultado es: 4.0", calculatorServiceImpl.printResult(4.0));
	}
	
	@Test
	void calculateSubstractionTest() {
		Mockito.when(basicOperationsService.subtract(2, 2)).thenReturn(0.0);
		assertEquals(0.0, calculatorServiceImpl.calculateSubstraction(2, 2));
		verify(basicOperationsService).subtract(2, 2);
	}
	
	@Test
	void calculateDivisionTest() {
		Mockito.when(basicOperationsService.divide(10,5)).thenReturn(2.0);
		assertEquals(2.0, calculatorServiceImpl.calculateDivision(10, 5));
		verify(basicOperationsService).divide(10,5);
	}
	
	@Test
	void calculateMultiplicationTest() {
		Mockito.when(basicOperationsService.multiply(2, 2)).thenReturn(4.0);
		assertEquals(4.0, calculatorServiceImpl.calculateMultiplication(2, 2));
		verify(basicOperationsService).multiply(2, 2);
	}
	
	@Test
	void calculateAverageTest() {
		Mockito.when(dataService.getListOfNumbers()).thenReturn(listOfNumbers);
		assertEquals(3.0, calculatorServiceImpl.calculateAverage());
	}
	
	@Test
	void calculateAverageNullPointerExceptionTest() {
		Mockito.when(dataService.getListOfNumbers()).thenReturn(null);
		assertThrows(NullPointerException.class, () -> {
			calculatorServiceImpl.calculateAverage();
		});
	}

	@Test
	void calculateDivisionZeroDivisionExceptionTest() {
		assertThrows(ZeroDivisionException.class, () -> {
			calculatorServiceImpl.calculateDivision(10, 0);
		});
		verify(basicOperationsService, never()).divide(10, 0);
	}
	
	@Test
	void addSpyTest() {
		
	}
}
