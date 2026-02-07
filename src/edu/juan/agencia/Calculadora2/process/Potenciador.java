package edu.juan.agencia.Calculadora2.process;

/**
 * Clase encargada de calcular la potencia.
 */
public class Potenciador extends Operacion {

    @Override
    public int ejecutar(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}