package edu.juan.agencia.ui;

import edu.juan.agencia.process.AgenciaService;
import java.util.Scanner;

/**
 *
 * Esta clase representa la interfaz de usuario por consola (CLI).
 * Se encarga de mostrar el menú principal y recibir las opciones del usuario.
 */
public class CLI {

    /**
     *
     * Scanner utilizado para la entrada de datos del usuario
     */
    static Scanner sc = new Scanner(System.in);

    /**
     *
     * Este método inicia el menú principal del sistema.
     * Controla la navegación y las opciones disponibles.
     * @return
     */
    public static void iniciar() {

        int opcion = 0;

        do {
            System.out.println("\n===== AGENCIA DE AUTOS =====");
            System.out.println("1. Comprar auto");
            System.out.println("2. Ver ticket");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("❌ Solo números");
                sc.next();
                continue;
            }

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    AgenciaService.comprarAuto(sc);
                    break;
                case 2:
                    AgenciaService.verTicket();
                    break;
                case 3:
                    System.out.println("Gracias por su visita 🚗");
                    break;
                default:
                    System.out.println("❌ Opción inválida");
            }

        } while (opcion != 3);
    }
}
