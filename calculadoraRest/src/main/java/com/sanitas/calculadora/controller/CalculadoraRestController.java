/**
 * 
 */
package com.sanitas.calculadora.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculadora.model.Operacion;

/**
 * @author dvazquez
 *
 */
@RestController
@RequestMapping("/")
public class CalculadoraRestController {


	@RequestMapping(value = "/Calculadora/sumar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Operacion> sumar(@RequestBody @Validated Operacion Operacion) {
		
		//llamada servicio
		//tratar respuesta
		//respuesta
		return new ResponseEntity<>(Operacion, HttpStatus.OK);

	}

	@RequestMapping(value = "/Calculadora/restar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Operacion> restar(@RequestBody @Validated Operacion Operacion) {
		
		//llamada servicio
		//tratar respuesta
		//respuesta
		return new ResponseEntity<>(Operacion, HttpStatus.OK);

	}

}
