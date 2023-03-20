package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private static Calculator objCalculatorTest;
	
	@BeforeAll
	public static void setUp() {
		objCalculatorTest= new Calculator();
	}
	
	@Test
	void testCase1() {
		double result = objCalculatorTest.multiplication(80, 3);
		
		assertTrue( result == 240);
	}
	
	@Test
	void testCase2() {
		double resultSum = objCalculatorTest.sum(150, 180);
		double resultDivision = objCalculatorTest.division(resultSum, 3);
		
		assertTrue(resultDivision == 110);
	}
	
	@Test
	void testCase3() {
		double resultSubstract = objCalculatorTest.substract(90, 50);
		double resultMultiplication = objCalculatorTest.multiplication(resultSubstract, 15);
		
		assertFalse(resultMultiplication == 605);
		//assertTrue(resultMultiplication != 605);
	}

	@Test
	void testCase4() {
		double resultSum = objCalculatorTest.sum(70, 40);
		double resultMultiplication = objCalculatorTest.multiplication(resultSum, 25);
		
		assertFalse(resultMultiplication == 2700);
		//assertTrue(resultMultiplication != 2700);
	}
}
