package edu.juan.agencia.Calculadora2.process;


/**
 * Clase abstracta base para todas las operaciones matemáticas.
 * Define el método que deben implementar las clases hijas.
 */
public abstract class Operacion {

    /**
     * Ejecuta la operación matemática.
     *
     * @param op1 primer operando
     * @param op2 segundo operando
     * @return resultado de la operación
     */
    public abstract int ejecutar(int op1, int op2);
}
