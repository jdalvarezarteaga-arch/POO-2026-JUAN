package edu.juan.agencia.Calculadora2.ui;

import edu.juan.agencia.Calculadora2.process.*;
import java.util.Scanner;


public class CLI {

    private static final Scanner scanner = new Scanner(System.in);


    public static void iniciar() {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Opción: ");

            if (opcion == 0) {
                System.out.println("El Programa a terminado");
                break;
            }

            int op1 = leerEntero("Ingrese el primer número: ");
            int op2 = leerEntero("Ingrese el segundo número: ");

            try {
                switch (opcion) {
                    case 1: {
                        Operacion op = new Sumador();
                        System.out.println("Resultado: " + op.ejecutar(op1, op2));
                        break;
                    }
                    case 2: {
                        Operacion op = new Restador();
                        System.out.println("Resultado: " + op.ejecutar(op1, op2));
                        break;
                    }
                    case 3: {
                        Operacion op = new Multiplicador();
                        System.out.println("Resultado: " + op.ejecutar(op1, op2));
                        break;
                    }
                    case 4: {
                        Operacion op = new Divisor();
                        System.out.println("Resultado: " + op.ejecutar(op1, op2));
                        break;
                    }
                    case 5: {
                        Operacion op = new Modulo();
                        System.out.println("Resultado: " + op.ejecutar(op1, op2));
                        break;
                    }
                    case 6: {
                        Operacion op = new Potenciador();
                        System.out.println("Resultado: " + op.ejecutar(op1, op2));
                        break;
                    }
                    case 7: {
                        Operacion op = new Raiz();
                        System.out.println("Resultado: " + op.ejecutar(op1, op2));
                        break;
                    }
                    case 8: {
                        Operacion op = new Logaritmo();
                        System.out.println("Resultado: " + op.ejecutar(op1, op2));
                        break;
                    }
                    default:
                        System.out.println("Opción inválida");
                }
            } catch (RuntimeException ex) {
                System.out.println("Error: " + ex.getMessage());
            }

        } while (true);
    }


    private static void mostrarMenu() {
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
    }


    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Entrada inválida, ingrese un número");
                scanner.next();
            }
        }
    }
}
