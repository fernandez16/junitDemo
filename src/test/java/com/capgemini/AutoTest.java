package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutoTest {

	@Test
	void testAuto() {
//		given
		Auto miAuto = new Auto("Ford", "Azul", 2.0);

//		when

//		then
		assertNotNull(miAuto);
	}

	@Test
	void testImprimirInfo() {
//		given
		Auto miAuto = new Auto("Ford", "Azul", 2.0);

//		when
		String actual = miAuto.getColor();
		String expected = new String(actual);

//		then
		assertEquals(expected, actual);
	}

	@Test
	void testSubirPotenciaMotor() {
//		given
		Auto miAuto = new Auto("Ford", "Azul", 2.0);
		
//		when
		miAuto.subirPotenciaMotor(1.5);
		double expected = miAuto.getMotor();
		double actual = 3.5;
		
//		then
		assertEquals(expected, actual);

	}

}
