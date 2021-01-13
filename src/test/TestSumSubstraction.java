package test;

import logic.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSumSubstraction {
	
	@Test
	public void testSumSubstraction() {
		Calculator a = new Calculator();
		int b = 1, c = 2;
		assertEquals(a.sum(b,c), b+c);
	}

	@Test
	public void testSubstraction() {
		Calculator a = new Calculator();
		int b = 1, c = 2;
		assertEquals(a.substraction(b,c), b-c);
	}
}