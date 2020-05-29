package com.sanitas.calculadora;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sanitas.calculadora.model.Operacion;
import com.sanitas.calculadora.service.ICalculadoraService;

@SpringBootTest
class CalculadoraRestApplicationTests {

	@Autowired
	ICalculadoraService servicio;
	
	/**
	 * Test Sumar.
	 */
	@Test
	@DisplayName("Test Suma dos números")
	void testSumar() {
		Operacion operacion = new Operacion("sumar", new BigDecimal("3"), new BigDecimal("5"),null);
		servicio.sumar(operacion);
		assertTrue(operacion.getResultado() != null);
	}
	
	/**
	 * Test Restar.
	 */
	@Test
	@DisplayName("Test Resta dos números")
	void testRestar() {
		Operacion operacion = new Operacion("restar", new BigDecimal("3"), new BigDecimal("1"),null);
		servicio.restar(operacion);
		assertTrue(operacion.getResultado() != null);
	}

}
