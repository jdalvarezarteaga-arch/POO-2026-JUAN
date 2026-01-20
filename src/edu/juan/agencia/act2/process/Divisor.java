package edu.juan.agencia.act2.process;

/**
 * Clase encargada de realizar divisiones.
 */
public class Divisor {

    /**
     * Divide dos números enteros.
     * @throws ArithmeticException si el divisor es 0
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        int cociente = 0;
        int resto = Math.abs(a);

        while (resto >= Math.abs(b)) {
            resto -= Math.abs(b);
            cociente++;
        }

        return (a < 0 ^ b < 0) ? -cociente : cociente;
    }
}
