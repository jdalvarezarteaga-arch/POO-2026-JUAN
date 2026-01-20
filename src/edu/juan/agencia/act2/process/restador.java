package edu.juan.agencia.act2.process;

/**
 * Clase encargada de realizar operaciones basadas en la resta.
 * Incluye resta, división, módulo, raíz y logaritmo.
 */
public class restador {

    /**
     * Este método recibe 2 operandos enteros y devuelve una resta
     * @param op1 primer operando
     * @param op2 segundo operando
     * @return resultado de la resta
     */
    public int restar(int op1, int op2) {
        return op1 - op2;
    }

    /**
     * Este método divide dos números enteros usando solo resta
     * @param op1 dividendo
     * @param op2 divisor
     * @return cociente o -1 si el divisor es 0
     */
    public int dividir(int op1, int op2) {
        if (op2 == 0) return -1;

        boolean negativo = false;
        if (op1 < 0) {
            op1 = -op1;
            negativo = true;
        }
        if (op2 < 0) {
            op2 = -op2;
            negativo = !negativo;
        }

        int contador = 0;
        while (op1 >= op2) {
            op1 = restar(op1, op2);
            contador++;
        }

        return negativo ? -contador : contador;
    }

    /**
     * Este método calcula el residuo de una división
     * @param op1 dividendo
     * @param op2 divisor
     * @return residuo o -1 si el divisor es 0
     */
    public int modulo(int op1, int op2) {
        if (op2 == 0) return -1;

        int cociente = dividir(op1, op2);
        return restar(op1, cociente * op2);
    }

    /**
     * Este método calcula la raíz cuadrada usando restas sucesivas
     * @param numero valor al que se le calcula la raíz
     * @return raíz cuadrada entera o -1 si es negativo
     */
    public int raiz(int numero) {
        if (numero < 0) return -1;

        int impar = 1;
        int contador = 0;

        while (numero >= impar) {
            numero = restar(numero, impar);
            impar = restar(impar, -2);
            contador++;
        }
        return contador;
    }

    /**
     * Este método calcula el logaritmo base 10 usando división
     * @param numero número al que se le calcula el logaritmo
     * @return logaritmo base 10 entero o -1 si el número es inválido
     */
    public int logaritmo(int numero) {
        if (numero <= 0) return -1;

        int contador = 0;
        while (numero >= 10) {
            numero = dividir(numero, 10);
            contador++;
        }
        return contador;
    }
}
