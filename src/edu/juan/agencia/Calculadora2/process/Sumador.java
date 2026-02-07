package edu.juan.agencia.Calculadora2.process;


/**
 * Clase que se encargada de realizar la suma.
 **/
public class Sumador extends Operacion {

    @Override
    public int ejecutar(int op1, int op2) {
        return op1 + op2;
    }
}
