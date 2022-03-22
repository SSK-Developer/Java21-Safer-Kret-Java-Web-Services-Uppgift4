package com.example.demo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CalculatorEndpointTest {

	private String sut;

	@Before
	public void setUp() throws Exception {
		sut = "http://localhost:8080";
	}

	@Test
	public void testAddServiceSuccess() throws IOException {
		String testData1 = "10.0";
		String testData2 = "10.0";
		String expected = "20.0";
		String notExpected = expected + " not match";

		String url = sut + "/add";
		String params = "?number1=" + testData1 + "&" + "number2=" + testData2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
	
	@Test
	public void testSubServiceSuccess() throws IOException {
		String testData1 = "10.0";
		String testData2 = "10.0";
		String expected = "0.0";
		String notExpected = expected + " not match";

		String url = sut + "/sub";
		String params = "?number1=" + testData1 + "&" + "number2=" + testData2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
	
	@Test
	public void testMultiServiceSuccess() throws IOException {
		String testData1 = "10.0";
		String testData2 = "10.0";
		String expected = "100.0";
		String notExpected = expected + " not match";

		String url = sut + "/multi";
		String params = "?number1=" + testData1 + "&" + "number2=" + testData2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
	
	@Test
	public void testDivServiceSuccess() throws IOException {
		String testData1 = "10.0";
		String testData2 = "10.0";
		String expected = "1.0";
		String notExpected = expected + " not match";

		String url = sut + "/div";
		String params = "?number1=" + testData1 + "&" + "number2=" + testData2;
		String query = url + params;
		String actual = httpHelper.UrlResponse(query, "get", null);
		
		assertEquals(actual, expected);
		assertNotEquals(actual, notExpected);
	}
}