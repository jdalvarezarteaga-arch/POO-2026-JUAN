package edu.juan.agencia.Calculadora2.process;

/**
 * Clase encargada de calcular la raíz entera.
 */
public class Raiz extends Operacion {

    @Override
    public int ejecutar(int indice, int radicando) {
        int resultado = 0;

        while (Math.pow(resultado + 1, indice) <= radicando) {
            resultado++;
        }

        return resultado;
    }
}