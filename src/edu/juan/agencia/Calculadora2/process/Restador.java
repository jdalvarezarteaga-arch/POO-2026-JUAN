package edu.juan.agencia.Calculadora2.process;


/**
 * Clase encargada de realizar la resta.
 */
public class Restador extends Operacion {

    @Override
    public int ejecutar(int op1, int op2) {
        return op1 - op2;
    }
}