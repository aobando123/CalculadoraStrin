package cr.ac.ucenfotec.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.ucenfotec.kata.logica.CalculadoraHileras;

public class CalculadoraHilerasTest {
	
	CalculadoraHileras calc = new CalculadoraHileras();

	@Test
	public void testEmptyString() throws Exception {
		assertEquals(0, calc.add(""));
	}

	@Test
	public void testSumaSimple() throws Exception {
		assertEquals(6, calc.add("0,1:2.3"));
		assertEquals(1, calc.add("0,1"));
	}
	
//	@Test (expected = Exception.class)
//	public void testErrorNumeroParametros3() throws Exception {
//		assertEquals(4, calc.add("1,2,3,4")); 
//	}
	
	@Test 
	public void testUnNumero() throws Exception {
		assertEquals(1, calc.add("1"));
		assertEquals(3, calc.add("1,2"));
	}

	@Test (expected = NumberFormatException.class)
	public void separadores() throws Exception {
		assertEquals(1, calc.add("0[1"));
	}

}
