package com.sanitas.calculadora.service;

import com.sanitas.calculadora.model.Operacion;

public interface ICalculadoraService {

	/**
	 * Realiza la operación sumar.
	 * @param operacion
	 * @return Operacion
	 */
	Operacion sumar(Operacion operacion);

	/**
	 * Realiza la operación restar.
	 * @param operacion
	 * @return Operacion
	 */
	Operacion restar(Operacion operacion);


}