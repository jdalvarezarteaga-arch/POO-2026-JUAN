package edu.juan.agencia.act2.process;

/**
 * Clase encargada de realizar operaciones basadas en la suma.
 * Incluye suma, multiplicación y potencia.
 */
public class Sumador {

    /**
     * Este método recibe 2 operandos enteros y devuelve una suma
     * @param op1 primer operando
     * @param op2 segundo operando
     * @return resultado de la suma
     */
    public int sumar(int op1, int op2) {
        return op1 + op2;
    }

    /**
     * Este método multiplica dos números enteros usando únicamente sumas
     * @param op1 primer operando
     * @param op2 segundo operando
     * @return resultado de la multiplicación
     */
    public int multiplicar(int op1, int op2) {
        int resultado = 0;
        boolean negativo = false;

        if (op2 < 0) {
            op2 = -op2;
            negativo = true;
        }

        for (int i = 0; i < op2; i++) {
            resultado = sumar(resultado, op1);
        }

        return negativo ? -resultado : resultado;
    }

    /**
     * Este método calcula la potencia usando multiplicación
     * (la multiplicación se basa en suma)
     * @param base número base
     * @param exponente número de veces que se multiplica
     * @return resultado de la potencia
     */
    public int potencia(int base, int exponente) {
        if (exponente < 0) return -1;

        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = multiplicar(resultado, base);
        }
        return resultado;
    }
}
