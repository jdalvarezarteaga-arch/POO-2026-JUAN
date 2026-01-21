package edu.juan.agencia.Act2.process;

/**
 * Clase encargada de realizar potencias.
 */
public class Potenciador {

    /**
     * Calcula la potencia usando multiplicaciones sucesivas.
     */
    public int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
