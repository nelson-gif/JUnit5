package com.laserAnts.ejemploJUnit;

import org.junit.jupiter.api.Assertions;

import java.util.*;

import org.junit.jupiter.api.*;

public class AppTest {
	
	User user;
	
	@BeforeEach //@BeforeAll, @AfterAll
	public void setup() {
		user = new User(1, "Felipe");
	}
	
	@DisplayName("Validacion respuesta un caracter")
	@Test
	public void validateSingleValue(){
		String result = App.returnGrades(35);
		
		Assertions.assertEquals(result.length(), 1);
		Assertions.assertEquals(user.getName(), "Felipe");
		List<Integer> lista = new ArrayList<>();
		Assertions.assertTrue(lista.add(1));
		
	}
	
	@DisplayName("Validacion respuesta es F")
	@Test
	public void validateGetAnF() {
		String result = App.returnGrades(59);
		
		Assertions.assertEquals(result, "F");
	}
	
	@DisplayName("Validacion respuesta es D")
	@Test
	public void validateGetAnD() {
		String result = App.returnGrades(69);
		
		Assertions.assertEquals(result, "D");
	}
	
	@DisplayName("Validacion respuesta es C")
	@Test
	public void validateGetAnC() {
		String result = App.returnGrades(79);
		
		Assertions.assertEquals(result, "C");
	}
	
	@DisplayName("Validacion respuesta es B")
	@Test
	public void validateGetAnB() {
		String result = App.returnGrades(89);
		
		Assertions.assertEquals(result, "B");
	}
	
	@DisplayName("Validacion respuesta es A")
	@Test
	public void validateGetAnA() {
		String result = App.returnGrades(99);
		
		Assertions.assertEquals(result, "A");
	}
	
	@DisplayName("Validacion respuesta es vacia")
	@Test
	public void validateGetEmpty() {
		String result = App.returnGrades(200);
		
		Assertions.assertEquals(result, "");
	}

}
