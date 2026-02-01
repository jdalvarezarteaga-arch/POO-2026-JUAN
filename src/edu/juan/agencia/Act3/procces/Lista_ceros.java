package edu.juan.agencia.Act3.procces;

/**
 * Utilidades para operar sobre arreglos de enteros.
 *
 * <p>Proporciona métodos para mover los ceros al final de un arreglo
 * y para contar los números pares en un arreglo.</p>
 */
public class Lista_ceros {

    /**
     * Mueve todos los ceros del arreglo proporcionado hacia el final,
     * manteniendo el orden relativo de los elementos distintos de cero.
     *
     * <p>Si el parámetro {@code numeros} es {@code null} retorna {@code null}.</p>
     *
     * @param numeros el arreglo de enteros a procesar; puede ser {@code null}
     * @return el mismo arreglo modificado con los ceros al final, o {@code null}
     *         si el parámetro de entrada es {@code null}
     */
    public int[] moverceros ( int[] numeros){
        if (numeros == null) return null;

        int posicion = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                numeros[posicion] = numeros[i];
                posicion++;
            }
        }
        while (posicion < numeros.length) {
            numeros[posicion] = 0;
            posicion++;
        }
        return numeros;
    }

    /**
     * Cuenta cuántos números pares hay en el arreglo.
     *
     * <p>Si {@code numeros} es {@code null} se lanzará una
     * {@link NullPointerException} al intentar iterar el arreglo.</p>
     *
     * @param numeros el arreglo de enteros a evaluar; no debe ser {@code null}
     * @return la cantidad de elementos pares en el arreglo
     * @throws NullPointerException si {@code numeros} es {@code null}
     */
    public int contarpares ( int[] numeros){
        int contador = 0;
        for (int n : numeros) {
            if (n % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
