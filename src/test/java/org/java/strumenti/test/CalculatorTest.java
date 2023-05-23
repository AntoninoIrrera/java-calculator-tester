package org.java.strumenti.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.java.strumenti.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	
	@Test
	public void addTest() {
		
		final float num1 = 10;
		final float num2 = 20;
		final float risultatoAtteso = 30;
		
		final Calculator c = new Calculator();
	
		final float risultatoFinale = c.add(num1,num2);
		
		assertEquals(risultatoAtteso, risultatoFinale);
		
	}
	
	@Test
	public void subtractTest() {
		
		final float num1 = 20;
		final float num2 = 10;
		final float risultatoAtteso = 10;
		
		final Calculator c = new Calculator();
	
		final float risultatoFinale = c.subtract(num1,num2);
		
		assertEquals(risultatoAtteso, risultatoFinale);
		
	}
	
	
	@Test
	public void divideTest() {
		
		final float num1 = 20;
		final float num2 = 10;
		final float risultatoAtteso = 2;
		
		final Calculator c = new Calculator();
	
		final float risultatoFinale = c.divide(num1,num2);
		
		assertEquals(risultatoAtteso, risultatoFinale);
		
	}
	
	
	@Test
	public void multiplyTest() {
		
		final float num1 = 10;
		final float num2 = 20;
		final float risultatoAtteso = 200;
		
		final Calculator c = new Calculator();
	
		final float risultatoFinale = c.multiply(num1,num2);
		
		assertEquals(risultatoAtteso, risultatoFinale);
		
	}
	
	
}
