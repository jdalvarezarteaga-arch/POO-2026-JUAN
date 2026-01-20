package edu.juan.agencia.act2.ui;

import java.util.Scanner;
import edu.juan.agencia.act2.process.*;

/**
 * Clase encargada de la interacción con el usuario.
 * Muestra el menú y captura las opciones desde consola.
 */
public class CLI {

    /**
     * Método que inicia la ejecución de la calculadora
     * y controla el flujo del programa.
     */
    public static void iniciar() {

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        Sumador sumador = new Sumador();
        Restador restador = new Restador();
        Multiplicador multiplicador = new Multiplicador();
        Divisor divisor = new Divisor();
        Modulo modulo = new Modulo();
        Potenciador potenciador = new Potenciador();
        Raiz raiz = new Raiz();
        Logaritmo logaritmo = new Logaritmo();

        while (opcion != 0) {

            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Raíz");
            System.out.println("8. Logaritmo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Solo se permiten números");
                scanner.next();
                continue;
            }

            opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("Programa terminado");
                continue;
            }

            if (opcion < 0 || opcion > 8) {
                System.out.println("Opción inválida");
                continue;
            }

            System.out.print("num 1: ");
            int a = scanner.nextInt();

            System.out.print("num 2: ");
            int b = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + sumador.sumar(a, b));
                        break;
                    case 2:
                        System.out.println("Resultado: " + restador.restar(a, b));
                        break;
                    case 3:
                        System.out.println("Resultado: " + multiplicador.multiplicar(a, b));
                        break;
                    case 4:
                        System.out.println("Resultado: " + divisor.dividir(a, b));
                        break;
                    case 5:
                        System.out.println("Resultado: " + modulo.modulo(a, b));
                        break;
                    case 6:
                        System.out.println("Resultado: " + potenciador.potencia(a, b));
                        break;
                    case 7:
                        System.out.println("Resultado: " + raiz.raiz(a, b));
                        break;
                    case 8:
                        System.out.println("Resultado: " + logaritmo.logaritmo(a, b));
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
