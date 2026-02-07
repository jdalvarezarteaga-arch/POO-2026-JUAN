package edu.juan.agencia.Calculadora2.process;

/**
 * Clase que se encargada de calcular el logaritmo entero con base variable.
 **/
public class Logaritmo extends Operacion {

    @Override
    public int ejecutar(int base, int argumento) {
        if (base <= 1 || argumento <= 0) {
            throw new ArithmeticException("Valores inválidos");
        }

        int resultado = 0;
        int valor = argumento;

        while (valor >= base) {
            valor /= base;
            resultado++;
        }

        return resultado;
    }
}
