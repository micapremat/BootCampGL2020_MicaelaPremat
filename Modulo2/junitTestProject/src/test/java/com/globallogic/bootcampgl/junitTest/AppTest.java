package com.globallogic.bootcampgl.junitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class AppTest {
	String var1 = "variable1";
	String var2 = "variable1";
	String var3 = "variable3";
	App app = new App();
	long var4 = 1;
	
	@AfterEach
	public void finalize() {
		System.out.println("finalizo");
	}
	
	@Test
	void Test() {
		assertEquals("Test","Test");
	}
/*
	@Test
	@DisplayName("Variables")
	void testVariables() {
		assertEquals(var1,var2,var3);
	}*/
	/*
	@Test
	@DisplayName("Comparacion true")
	void testComparacionTrue() {
		assertTrue(25 > 12);
	}
	
	@Test
	@DisplayName("Comparacion false")
	void testComparacionFalse() {
		assertFalse(25 > 27);
	}
	
	@Test
	@DisplayName("Null")
	void testNull() {
		assertNull(var4);
	}
	
	@Test
	void testSumar() {
		assertEquals(4,app.sumar(2,2));
	}
	
	@Test
	void testSumarFalse() {		
		assertFalse("El resultado esta mal: ",3 != app.sumar(2, 2));
	}*/
	
	@Test
	void testBooleanTrue() {		
		assertTrue("Esta variable no es true: ",app.iterador(4));
	}
	
	@Test
	void testBooleanFalse() {		
		assertTrue("Esta variable no es false: ",app.iterador(2));
	}
	
}
