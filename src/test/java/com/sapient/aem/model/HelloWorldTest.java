package com.sapient.aem.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName(value = "This is a sample test")
class HelloWorldTest {
	private HelloWorld helloWorld=null;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all test methods");
	}

	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all test methods");
	}

	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test method");
		helloWorld= new HelloWorld();
	}

	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each test method");
		helloWorld=null;
	}

	@Disabled
	@Test
	void testSayHello() {		
		assertEquals("Hello World!",helloWorld.sayHello());
	}
	
	@Disabled
	@Test
	void testSayNoHello() {		
		assertNotEquals("No Hello World!",helloWorld.sayHello());
	}
	
	@DisplayName(value = "Test method to test string ends with i")
	@ParameterizedTest
	@ValueSource(strings = {"cali","mali","dani","venu"})
	void testEndsWith(String str) {
		assertTrue(str.endsWith("i"));
	}

}
