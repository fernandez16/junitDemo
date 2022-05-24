package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
//		given
		Calculator calculator = new Calculator();
		int firstNum = 2;
		int secondNum = 5;

//		when
		int actual = calculator.add(firstNum, secondNum);
//		int expected = 5;
		int expected = 7;

//		then
		assertEquals(expected, actual);
	}
	
	@Test
	void testSubtract() {
//		given
		Calculator calculator = new Calculator();
		int firstNum = 5;
		int secondNum = 2;

//		when
		int actual = calculator.subtract(firstNum, secondNum);
//		int expected = -3;
		int expected = 3;

//		then
		assertEquals(expected, actual);
	}

}
