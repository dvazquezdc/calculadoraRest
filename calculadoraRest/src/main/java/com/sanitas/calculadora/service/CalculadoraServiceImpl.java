/**
 * 
 */
package com.sanitas.calculadora.service;

import org.springframework.stereotype.Service;

import com.sanitas.calculadora.model.Operacion;

/**
 * @author dvazquez
 * 
 *         Servicio operaciones calculadora
 *
 */

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {

	/**
	 * Realiza la operacion de sumar.
	 * 
	 * @param operacion
	 * @return operacion
	 */
	@Override
	public Operacion sumar(Operacion operacion) {
		operacion.setOperacion("sumar");

		operacion.setResultado(operacion.getOperador1().add(operacion.getOperador2()));

		return operacion;

	}

	/**
	 * Realiza la operacion de restar.
	 * 
	 * @param operacion
	 * @return operacion
	 */
	@Override
	public Operacion restar(Operacion operacion) {

		operacion.setOperacion("restar");
		operacion.setResultado(operacion.getOperador1().subtract(operacion.getOperador2()).setScale(2));

		return operacion;

	}

}
