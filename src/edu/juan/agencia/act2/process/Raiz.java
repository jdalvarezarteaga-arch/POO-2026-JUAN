package edu.juan.agencia.act2.process;

/**
 * Clase encargada de calcular raíces de índice entero.
 */
public class Raiz {

    /**
     * Calcula la raíz n-ésima entera.
     * @throws ArithmeticException si el número es negativo o el índice inválido
     */
    public int raiz(int numero, int indice) {
        if (numero < 0 || indice <= 0) {
            throw new ArithmeticException("Valores inválidos");
        }

        int resultado = 0;
        while (Math.pow(resultado, indice) <= numero) {
            resultado++;
        }

        return resultado - 1;
    }
}
