package edu.juan.agencia.Calculadora2.process;

/**
 * Clase encargada de realizar la multiplicación usando sumas.
 */
public class Multiplicador extends Operacion {

    @Override
    public int ejecutar(int op1, int op2) {
        int resultado = 0;

        for (int i = 0; i < op2; i++) {
            resultado += op1;
        }

        return resultado;
    }
}
