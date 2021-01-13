package test;

import logic.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDivisionMultiplication {
	
	@Test
	public void testDivisionMultiplication() {
		Calculator a = new Calculator();
		int b = 1, c = 2;
		assertEquals(a.division(b,c), b/c);
	}
	
	@Test
	public void testMultiplication() {
		Calculator a = new Calculator();
		int b = 1, c = 2;
		assertEquals(a.multiplication(b,c), b*c);
	}
}
