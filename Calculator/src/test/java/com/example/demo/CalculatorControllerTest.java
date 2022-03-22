package com.example.demo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CalculatorControllerTest {

	private calculatorController sut;

	@Before
	public void setUp() {
		sut = new calculatorController();
	}

	@Test
	public void testAddSuccess() throws IOException {
		Double actual = sut.addition(10.0, 10.0);
		Double expected = 20.0;

		assertEquals(actual, expected);
	}

	@Test
	public void testAddFail() throws IOException {
		Double actual = sut.addition(10.0, 10.0);
		Double expected = 200.0;

		assertNotEquals(actual, expected);
	}

	
	@Test
	public void testSubSuccess() throws IOException {
		Double actual = sut.subtraction(10.0, 10.0);
		Double expected = 0.0;

		assertEquals(actual, expected);
	}

	@Test
	public void testSubFail() throws IOException {
		Double actual = sut.subtraction(10.0, 10.0);
		Double expected = 200.0;

		assertNotEquals(actual, expected);
	}
	
	@Test
	public void testMultiSuccess() throws IOException {
		Double actual = sut.multiplication(10.0, 10.0);
		Double expected = 100.0;

		assertEquals(actual, expected);
	}
	
	@Test
	public void testMultiFail() throws IOException {
		Double actual = sut.subtraction(10.0, 10.0);
		Double expected = 200.0;

		assertNotEquals(actual, expected);
	}

	@Test
	public void testDivSuccess() throws IOException {
		Double actual = sut.division(10.0, 10.0);
		Double expected = 1.0;

		assertEquals(actual, expected);
	}
	
	@Test
	public void testDivFail() throws IOException {
		Double actual = sut.subtraction(10.0, 10.0);
		Double expected = 200.0;

		assertNotEquals(actual, expected);
	}

}
