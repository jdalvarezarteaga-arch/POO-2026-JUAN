package edu.juan.agencia.Calculadora2.process;

/**
 * Clase que se encargada de realizar la división usando restas.
 */
public class Divisor extends Operacion {

    @Override
    public int ejecutar(int op1, int op2) {
        if (op2 == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }

        int cociente = 0;
        int resto = op1;

        while (resto >= op2) {
            resto -= op2;
            cociente++;
        }

        return cociente;
    }
}
