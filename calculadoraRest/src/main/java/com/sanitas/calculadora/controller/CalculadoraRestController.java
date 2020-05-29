/**
 * 
 */
package com.sanitas.calculadora.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculadora.model.Operacion;
import com.sanitas.calculadora.service.ICalculadoraService;

import io.corp.calculator.TracerImpl;

/**
 * @author dvazquez
 *
 */
@RestController
@RequestMapping("/")
public class CalculadoraRestController {

	@Autowired
	ICalculadoraService servicio;

	@RequestMapping(value = "/Calculadora/sumar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Operacion> sumar(@RequestBody @Validated Operacion operacion) {
		
		ResponseEntity<Operacion> responseEntity;
		TracerImpl traza = new TracerImpl();
		
		Operacion opResponse =servicio.sumar(operacion);
		
		if (opResponse != null) {
			responseEntity = new ResponseEntity<>(opResponse, HttpStatus.OK);
			traza.trace(opResponse);
		} else {
			responseEntity = new ResponseEntity<>(operacion, HttpStatus.INTERNAL_SERVER_ERROR);
			traza.trace(opResponse);
		}
		return responseEntity;

	}

	@RequestMapping(value = "/Calculadora/restar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Operacion> restar(@RequestBody @Validated Operacion operacion) {
		
		ResponseEntity<Operacion> responseEntity;
		TracerImpl traza = new TracerImpl();
		
		Operacion opResponse =servicio.restar(operacion);
		
		if (opResponse != null) {
			responseEntity = new ResponseEntity<>(opResponse, HttpStatus.OK);
			traza.trace(opResponse);
			
		} else {
			responseEntity = new ResponseEntity<>(operacion, HttpStatus.INTERNAL_SERVER_ERROR);
			traza.trace(opResponse);
		}
		return responseEntity;
	}

}
