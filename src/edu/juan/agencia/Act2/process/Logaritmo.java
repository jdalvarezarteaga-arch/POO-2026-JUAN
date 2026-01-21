package edu.juan.agencia.Act2.process;

/**
 * Clase encargada de calcular logaritmos con base entera.
 */
public class Logaritmo {

    /**
     * Calcula el logaritmo entero.
     * @throws ArithmeticException si los valores son inválidos
     */
    public int logaritmo(int numero, int base) {
        if (numero <= 0 || base <= 1) {
            throw new ArithmeticException("Valores inválidos");
        }

        int resultado = 0;
        while (numero >= base) {
            numero /= base;
            resultado++;
        }

        return resultado;
    }
}
