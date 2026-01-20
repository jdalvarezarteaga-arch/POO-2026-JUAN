package edu.juan.agencia.act2.ui;

import java.util.Scanner;
import edu.juan.agencia.act2.process.sumador;
import edu.juan.agencia.act2.process.restador;

/**
 * Clase encargada de toda la interacción con el usuario por consola.
 */
public class CLI {

    private final sumador suma;
    private final restador resta;
    private final Scanner scanner;

    /**
     * Constructor de la clase CLI
     */
    public CLI() {
        suma = new sumador();
        resta = new restador();
        scanner = new Scanner(System.in);
    }

    /**
     * Inicia el menú principal de la calculadora
     */
    public void iniciar() {
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA SIMPLE ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Módulo");
            System.out.println("7. Raíz cuadrada");
            System.out.println("8. Logaritmo base 10");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("👋 Programa terminado");
                break;
            }

            if (opcion < 0 || opcion > 8) {
                System.out.println("❌ Opción no válida");
                continue;
            }

            System.out.print("Ingresa el primer número: ");
            int a = scanner.nextInt();

            int b = 0;
            if (opcion != 7 && opcion != 8) {
                System.out.print("Ingresa el segundo número: ");
                b = scanner.nextInt();
            }

            ejecutarOperacion(opcion, a, b);

        } while (true);
    }

    /**
     * Ejecuta la operación seleccionada por el usuario
     * @param opcion opción elegida
     * @param a primer operando
     * @param b segundo operando
     */
    private void ejecutarOperacion(int opcion, int a, int b) {
        int resultado;

        switch (opcion) {
            case 1:
                resultado = suma.sumar(a, b);
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = resta.restar(a, b);
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = suma.multiplicar(a, b);
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                resultado = resta.dividir(a, b);
                if (resultado == -1) {
                    System.out.println("❌ No se puede dividir entre 0");
                } else {
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 5:
                resultado = suma.potencia(a, b);
                if (resultado == -1) {
                    System.out.println("❌ Exponente inválido");
                } else {
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 6:
                resultado = resta.modulo(a, b);
                if (resultado == -1) {
                    System.out.println("❌ No se puede calcular módulo entre 0");
                } else {
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 7:
                resultado = resta.raiz(a);
                if (resultado == -1) {
                    System.out.println("❌ No existe raíz de números negativos");
                } else {
                    System.out.println("Resultado: " + resultado);
                }
                break;

            case 8:
                resultado = resta.logaritmo(a);
                if (resultado == -1) {
                    System.out.println("❌ Logaritmo no válido");
                } else {
                    System.out.println("Resultado: " + resultado);
                }
                break;
        }
    }
}
