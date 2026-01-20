package edu.juan.agencia.act2;

import edu.juan.agencia.act2.ui.CLI;

/**
 * Clase Main.
 * Es el único punto de entrada de la aplicación.
 */
public class Main {

    /**
     * Método principal del programa
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.iniciar();
    }
}
