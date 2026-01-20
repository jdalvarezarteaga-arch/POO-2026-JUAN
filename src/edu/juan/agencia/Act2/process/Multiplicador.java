package edu.juan.agencia.Act2.process;

/**
 * Clase encargada de realizar operaciones basadas en la multiplicación.
 */
public class Multiplicador {

    /**
     * Multiplica dos números usando sumas sucesivas.
     */
    public int multiplicar(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }
}
